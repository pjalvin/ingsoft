package bo.ucb.edu.ingsoft.util;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.crypto.SecretKey;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.ucb.edu.ingsoft.dto.UserInformation;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

public class JWTAuthorizationFilter extends OncePerRequestFilter {

    private final String HEADER = "Authorization";
    private final String PREFIX = "Bearer ";
    String secretKey = "mySecretKey12345678913245678913245678913245687912312312312312312312313123123123123123123123123123213123123123123123123123";
    SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        try {
            if (existeJWTToken(request, response)) {
                var jwt = validateToken(request);
                if (jwt.getBody() != null) {
                    System.out.println("1");
                    setUpSpringAuthentication(jwt);
                } else {
                    System.out.println("2");
                    SecurityContextHolder.clearContext();
                }
            } else {
                System.out.println("3");
                SecurityContextHolder.clearContext();
            }
            chain.doFilter(request, response);
        } catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException e) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            ((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, e.getMessage());
            return;
        }
    }

    private Jwt validateToken(HttpServletRequest request) {
        String jwtToken = request.getHeader(HEADER).replace(PREFIX, "");
        return Jwts.parserBuilder().setSigningKey(key).build().parse(jwtToken);
    }

    /**
     * Metodo para autenticarnos dentro del flujo de Spring
     *
     * @param jwt
     */
    private void setUpSpringAuthentication(Jwt jwt) {
        @SuppressWarnings("unchecked")
        Claims claims = (Claims) jwt.getBody();
        List<String> authorities =  (List) claims.get("authorities");
        System.out.println(claims);
        UserInformation userInformation=new UserInformation();
        userInformation.setIdUser(Integer.parseInt(jwt.getHeader().get("idUser").toString()));
        if(jwt.getHeader().get("idSeller")!=null)
        userInformation.setIdSeller(Integer.parseInt(jwt.getHeader().get("idSeller").toString()));
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(claims.getSubject(), userInformation,
                authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
        SecurityContextHolder.getContext().setAuthentication(auth);

    }

    private boolean existeJWTToken(HttpServletRequest request, HttpServletResponse res) {
        String authenticationHeader = request.getHeader(HEADER);
        if (authenticationHeader == null || !authenticationHeader.startsWith(PREFIX))
            return false;
        return true;
    }

}