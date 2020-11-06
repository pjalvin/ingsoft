package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.PublicationDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.model.Publication;
import bo.ucb.edu.ingsoft.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicationBl {
    private PublicationDao publicationDao;
    private TransactionDao transactionDao;

    @Autowired
    public PublicationBl(PublicationDao publicationDao,TransactionDao transactionDao) {
        this.publicationDao = publicationDao;
        this.transactionDao = transactionDao;
    }
     public PublicationRequest create(PublicationRequest publicationRequest, Transaction transaction){

        Publication publication=new Publication();
        publication.setDescription(publicationRequest.getDescription());
        publication.setDoorNumber(publicationRequest.getDoorNumber());
        publication.setIdBrand(publicationRequest.getIdBrand());
        publication.setIdCity(publicationRequest.getIdCity());
        publication.setIdColor(publicationRequest.getIdColor());
        publication.setIdSeller(publicationRequest.getIdSeller());
        publication.setLicensePlate(publicationRequest.getLicensePlate());
        publication.setModel(publicationRequest.getModel());
        publication.setMotor(publicationRequest.getMotor());
        publication.setModel(publicationRequest.getModel());
        publication.setPrice(publicationRequest.getPrice());
        publication.setStatus(publicationRequest.getStatus());
        publication.setTransaction(transaction);
        publicationDao.create(publication);
        int publicationId=transactionDao.getLastInsertId();
        publicationRequest.setIdPublication(publicationId);
        return publicationRequest;
     }

    public Publication findContacById() {
        return  publicationDao.findByContactId();
    }
}
