package bo.ucb.edu.ingsoft.dao;
import bo.ucb.edu.ingsoft.model.User;

public interface UserDao {
    public User findByUserId(Integer userId);
    public void create(User user);
}
