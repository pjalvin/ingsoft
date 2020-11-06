package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.SellerDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.model.Person;
import bo.ucb.edu.ingsoft.model.Publication;
import bo.ucb.edu.ingsoft.model.Seller;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerBl {
    private SellerDao sellerDao;
    private User user = new User();
    private Person person=new Person();
    private TransactionDao transactionDao;

    @Autowired
    public SellerBl(SellerDao sellerDao,TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
        this.sellerDao = sellerDao;
    }

    public Seller findSellerById(Integer sellerId) {
        return  sellerDao.findBySellerId(sellerId);
    }

}
