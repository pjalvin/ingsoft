package bo.ucb.edu.ingsoft.util;

import bo.ucb.edu.ingsoft.dto.UserRequest;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class JWTUtil {
    public String getJWTToken(UserRequest userRequest) {
        String secretKey = "mySecretKey12345678913245678913245678913245687912312312312312312312313123123123123123123123123123213123123123123123123123";
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder().

                setHeaderParam("idUser",userRequest.getIdUser()).
                        setHeaderParam("idSeller",userRequest.getIdSeller())
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60000*60*24)).signWith(key).compact();

        return "Bearer " + token;
    }
}
