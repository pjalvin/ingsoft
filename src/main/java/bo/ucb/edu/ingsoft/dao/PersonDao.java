package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Person;
import bo.ucb.edu.ingsoft.model.Seller;

public interface PersonDao {
    public Person findByPersonId(Integer personId);
    public void create(Person person);
}
