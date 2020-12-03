package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MechanicDao;
import bo.ucb.edu.ingsoft.dao.StarDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.MechanicSimpleRequest;
import bo.ucb.edu.ingsoft.dto.QualifyMechanicRequest;
import bo.ucb.edu.ingsoft.model.Mechanic;
import bo.ucb.edu.ingsoft.model.Star;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicBl {
    private MechanicDao mechanicDao;
    private StarDao starDao;
    private TransactionDao transactionDao;

    @Autowired
    public MechanicBl(MechanicDao mechanicDao, StarDao starDao, TransactionDao transactionDao) {
        this.mechanicDao = mechanicDao;
        this.starDao = starDao;
        this.transactionDao = transactionDao;
    }

    public List<MechanicSimpleRequest> mechanics(){
        List<MechanicSimpleRequest> mechanic=mechanicDao.mechanics();
        return mechanic;
    }


    public QualifyMechanicRequest qualifyMechanic(QualifyMechanicRequest qualifyMechanicRequest, Transaction transaction){

        Star star = new Star();
        UserUtil userUtil=new UserUtil();
        star.setIdUser(userUtil.getIdUser());
        star.setIdMechanic(qualifyMechanicRequest.getIdMechanic());
        star.setScore(qualifyMechanicRequest.getScore());
        star.setTransaction(transaction);
        starDao.createStar(star);

        Mechanic mechanic = new Mechanic();

        mechanic.setStars(qualifyMechanicRequest.getScore());
        mechanic.setIdMechanic(qualifyMechanicRequest.getIdMechanic());
        mechanicDao.starsValue(mechanic);
        return qualifyMechanicRequest;
    }
}
