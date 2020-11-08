package bo.ucb.edu.ingsoft.bl;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBl {
    private UserDao userDao;
    private TransactionDao transactionDao;

    @Autowired
    public UserBl(UserDao userDao, TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
        this.userDao=userDao;
    }

    public User findUserById(Integer userId) {
        return  userDao.findByUserId(userId);
    }

    public User create(User user, Transaction transaction){
        user.setTransaction(transaction);
        userDao.createUser(user);
        return user;
    }
    public User update(User user, Transaction transaction){
        user.setTransaction(transaction);
        userDao.updateUser(user);
        int userId=transactionDao.getLastInsertId();
        user.setIdUser(userId);
        return user;
    }
}