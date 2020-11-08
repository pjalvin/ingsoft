package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.PersonDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.model.Person;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonBl {
    private PersonDao personDao;
    private TransactionDao transactionDao;

    @Autowired
    public PersonBl(PersonDao personDao, TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
        this.personDao=personDao;
    }

    public Person findPersonById(Integer userId) {
        return personDao.findByPersonId(userId);
    }

    public Person create(Person person, Transaction transaction){
        person.setTransaction(transaction);
        personDao.createPerson(person);
        return person;
    }
    public Person update(Person person, Transaction transaction){
        person.setTransaction(transaction);
        personDao.updatePerson(person);
        int personId=transactionDao.getLastInsertId();
        person.setIdPerson(personId);
        return person;
    }
}