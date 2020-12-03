package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    public UserRequest findByEmail(String email);
}
