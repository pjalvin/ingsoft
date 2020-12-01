package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.PersonDao;
import bo.ucb.edu.ingsoft.dao.SellerDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.model.*;
import bo.ucb.edu.ingsoft.util.StorageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SellerBl {
    private SellerDao sellerDao;
    private PersonDao personDao;
    private UserDao userDao;
    private TransactionDao transactionDao;

    @Autowired
    public SellerBl(SellerDao sellerDao,UserDao userDao, PersonDao personDao, TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
        this.userDao=userDao;
        this.personDao=personDao;
        this.sellerDao = sellerDao;
    }

    public SellerRequest findSellerById(Integer sellerId) {
        return  sellerDao.findBySellerId(sellerId);
    }

    public SellerRequest create(SellerRequest sellerRequest, Transaction transaction){

        Seller seller = new Seller();
        Person person = new Person();
        User user =new User();
        user.setPassword(sellerRequest.getPassword());
        user.setEmail(sellerRequest.getEmail());
        user.setTransaction(transaction);
        person.setFirstName(sellerRequest.getFirstName());
        person.setLastName(sellerRequest.getLastName());
        person.setPhoneNumber(sellerRequest.getPhoneNumber());
        person.setTransaction(transaction);
        userDao.createUser(user);
        int userId=transactionDao.getLastInsertId();
        personDao.createPerson(person);
        int personId=transactionDao.getLastInsertId();
        seller.setImagePath(sellerRequest.getImagePath());
        seller.setIdPerson(personId);
        seller.setIdUser(userId);
        seller.setTransaction(transaction);
        sellerDao.createSeller(seller);
        int sellerId=transactionDao.getLastInsertId();
        sellerRequest.setIdSeller(sellerId);
        sellerRequest.setIdUser(userId);
        sellerRequest.setIdPerson(personId);
        seller.setIdUser(sellerId);
        return sellerRequest;
    }
    public SellerRequest update(SellerRequest sellerRequest, Transaction transaction){
        Seller seller = new Seller();
        Person person = new Person();
        User user =new User();
        user.setPassword(sellerRequest.getPassword());
        user.setEmail(sellerRequest.getEmail());
        user.setIdUser(sellerRequest.getIdUser());
        user.setTransaction(transaction);

        userDao.updateUser(user);

        person.setFirstName(sellerRequest.getFirstName());
        person.setLastName(sellerRequest.getLastName());
        person.setPhoneNumber(sellerRequest.getPhoneNumber());
        person.setIdPerson(sellerRequest.getIdPerson());
        person.setTransaction(transaction);

        personDao.updatePerson(person);

        seller.setIdSeller(sellerRequest.getIdSeller());
        seller.setIdUser(sellerRequest.getIdUser());
        seller.setIdPerson(sellerRequest.getIdPerson());
        seller.setImagePath(sellerRequest.getImagePath());
        seller.setTransaction(transaction);

        sellerDao.updateSeller(seller);

        return sellerRequest;
    }

    public void uploadImages(MultipartFile images, Integer idSeller, Transaction transaction){
        StorageUtil storageUtil= new StorageUtil();
        String nombre=storageUtil.upload(images,"imageSeller");
        Seller seller =new Seller();
        seller.setIdSeller(idSeller);
        seller.setImagePath(nombre);
        sellerDao.updateImage(seller);
    }

    public List<PublicationSimpleRequest> publications(Integer idSeller,Integer i,Integer n){
        List<PublicationSimpleRequest> publications=sellerDao.publications(idSeller,i,n);
        return publications;
    }
}