package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MechanicDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.model.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;

public class MechanicBl {
    private MechanicDao mechanicDao;
    private TransactionDao transactionDao;

    @Autowired
    public MechanicBl(MechanicDao mechanicDao, TransactionDao transactionDao) {
        this.mechanicDao = mechanicDao;
        this.transactionDao = transactionDao;
    }

    public Mechanic findMechanic(){
        return mechanicDao.findMechanic();
    }
}
