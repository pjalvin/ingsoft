package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.SellerDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.model.Person;
import bo.ucb.edu.ingsoft.model.Seller;
import bo.ucb.edu.ingsoft.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class SellerBl {
    private SellerDao sellerDao;
    private User user = new User();
    private Person person=new Person();
    private TransactionDao transactionDao;

    @Autowired
    public SellerBl(SellerDao sellerDao) {

        this.sellerDao = sellerDao;
        this.transactionDao = transactionDao;
    }

    public Seller findSellerById(Integer sellerId) {
        return  sellerDao.findBySellerId(sellerId);
    }

}
