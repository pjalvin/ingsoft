package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.LoginBl;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class LoginApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(MechanicApi.class);
    private LoginBl loginBl;
    @Autowired
    public LoginApi(LoginBl loginBl) {
        this.loginBl = loginBl;
    }

    @RequestMapping(path="signup",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRequest SignUp(@RequestBody UserRequest userRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil = new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);

        return loginBl.SignUp(userRequest,transaction);
    }
    @RequestMapping(path="signin",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRequest SignIn(@RequestBody UserRequest userRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil = new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);

        return loginBl.SignIn(userRequest,transaction);
    }
}
