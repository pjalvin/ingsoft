package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.PublicationDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.model.ImagePublication;
import bo.ucb.edu.ingsoft.model.Publication;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.StorageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PublicationBl {
    private PublicationDao publicationDao;
    private TransactionDao transactionDao;

    @Autowired
    public PublicationBl(PublicationDao publicationDao,TransactionDao transactionDao) {
        this.publicationDao = publicationDao;
        this.transactionDao = transactionDao;
    }


    public PublicationRequest Searchpublication(PublicationRequest publicationRequest){
        return publicationDao.searchPublication(publicationRequest);
    }

    public PublicationRequest publicationBuscar(String buscar){
        return publicationDao.PublicationSearch(buscar);
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
        publication.setTitle(publicationRequest.getTitle());
        publication.setModel(publicationRequest.getModel());
        publication.setMotor(publicationRequest.getMotor());
        publication.setModel(publicationRequest.getModel());
        publication.setPrice(publicationRequest.getPrice());
        publication.setStatus(publicationRequest.getStatus());
        publication.setTransaction(transaction);
        publication.setDatePublication(new Date());
        publicationDao.create(publication);
        Integer publicationId=transactionDao.getLastInsertId();
        publicationRequest.setIdPublication(publicationId);
        return publicationRequest;
     }

    public Publication findContacById() {
        return  publicationDao.findByContactId();
    }
    public void uploadImages(MultipartFile[] images,Integer idPublication,Transaction transaction){
        List<ImagePublication> imagePublications=new ArrayList<>();
        Arrays.asList(images).stream().forEach(image -> {
            StorageUtil storageUtil= new StorageUtil();
            String nombre=storageUtil.upload(image,"imagePublication");
            ImagePublication imagePublication= new ImagePublication();
            imagePublication.setPath(nombre);
            imagePublication.setIdPublication(idPublication);
            imagePublication.setTransaction(transaction);
            imagePublications.add(imagePublication);
        });
        System.out.println(imagePublications.get(0).getPath());
        publicationDao.createImagePublication(imagePublications);
    }
}
