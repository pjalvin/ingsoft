package bo.ucb.edu.ingsoft.api;
import bo.ucb.edu.ingsoft.bl.UserBl;
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
public class UserApi {
    private UserBl userBl;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserApi.class);
    @Autowired
    public UserApi(UserBl userBl){
        this.userBl = userBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User findById(@RequestBody User user, HttpServletRequest request) {
        return userBl.findUserById(user.getIdUser());
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userBl.create(user,transaction);
        return user;
    }
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        userBl.update(user,transaction);
        return user;
    }
}