package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MechanicDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.MechanicContactRequest;
import bo.ucb.edu.ingsoft.dto.MechanicSimpleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicBl {
    private MechanicDao mechanicDao;
    private TransactionDao transactionDao;

    @Autowired
    public MechanicBl(MechanicDao mechanicDao, TransactionDao transactionDao) {
        this.mechanicDao = mechanicDao;
        this.transactionDao = transactionDao;
    }

    public List<MechanicSimpleRequest> mechanics(){
        List<MechanicSimpleRequest> mechanic=mechanicDao.mechanics();
        return mechanic;
    }

    public MechanicContactRequest mechanicContact(Integer idMechanic) {
        return mechanicDao.mechanicContact(1);
    }
}
