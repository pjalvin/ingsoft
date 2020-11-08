package bo.ucb.edu.ingsoft.api;
import bo.ucb.edu.ingsoft.bl.PersonBl;
import bo.ucb.edu.ingsoft.model.Person;
import bo.ucb.edu.ingsoft.model.Transaction;
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
@RequestMapping(value = "/person")
public class PersonApi {
    private PersonBl personBl;
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonApi.class);
    @Autowired
    public PersonApi(PersonBl personBl){
        this.personBl = personBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@RequestBody Person person, HttpServletRequest request) {
        return personBl.findPersonById(person.getIdPerson());
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        personBl.create(person,transaction);
        return person;
    }
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        personBl.update(person,transaction);
        return person;
    }
}