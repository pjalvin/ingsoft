package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.MechanicDao;
import bo.ucb.edu.ingsoft.dao.StarDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.MechanicContactRequest;
import bo.ucb.edu.ingsoft.dto.MechanicSimpleRequest;
import bo.ucb.edu.ingsoft.dto.QualifyMechanicRequest;
import bo.ucb.edu.ingsoft.model.Mechanic;
import bo.ucb.edu.ingsoft.model.Star;
import bo.ucb.edu.ingsoft.model.Transaction;
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

    public MechanicContactRequest mechanicContact(Integer idMechanic) {
        return mechanicDao.mechanicContact(idMechanic);
    }

    public QualifyMechanicRequest qualifyMechanic(QualifyMechanicRequest qualifyMechanicRequest, Transaction transaction){

        Star star = new Star();

        star.setIdUser(qualifyMechanicRequest.getIdUser());
        star.setIdMechanic(qualifyMechanicRequest.getIdMechanic());
        star.setScore(qualifyMechanicRequest.getScore());
        star.setTransaction(transaction);
        starDao.createStar(star);

        int score = qualifyMechanicRequest.getScore();

        /*Mechanic mechanicStars = mechanicDao.stars(qualifyMechanicRequest.getIdMechanic());

        int oldStarsCount = mechanicStars.getStarsCount();
        int oldStars  = mechanicStars.getStars();

        int newStarsCount = oldStarsCount+1;

        int newStars = (oldStars*oldStarsCount+score)/newStarsCount;

        mechanicStars.setStarsCount(newStarsCount);
        mechanicStars.setStars(newStars);
        mechanicStars.setIdMechanic(qualifyMechanicRequest.getIdMechanic());*/

        Mechanic mechanic = new Mechanic();

        mechanic.setStars(qualifyMechanicRequest.getScore());
        mechanic.setIdMechanic(qualifyMechanicRequest.getIdMechanic());
        mechanicDao.starsValue(mechanic);
        return qualifyMechanicRequest;
    }
}
