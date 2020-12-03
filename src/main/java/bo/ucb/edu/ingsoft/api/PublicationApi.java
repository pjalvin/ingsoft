package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PublicationBl;
import bo.ucb.edu.ingsoft.dto.ImagePublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.dto.PublicationViewRequest;
import bo.ucb.edu.ingsoft.model.Brand;
import bo.ucb.edu.ingsoft.model.City;
import bo.ucb.edu.ingsoft.model.Color;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import bo.ucb.edu.ingsoft.util.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/publications")
public class PublicationApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(MechanicApi.class);
    private  PublicationBl publicationBl;
    @Autowired
    public PublicationApi(PublicationBl publicationBl) {
        this.publicationBl = publicationBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PublicationSimpleRequest> SearchPublication(@RequestParam(required = false) Integer idPublication,
                                                             @RequestParam(required = true) Integer i,
                                                             @RequestParam(required = true) Integer n,
                                                             @RequestParam(required = false) Integer idColor,
                                                             @RequestParam(required = false) Integer model,
                                                             @RequestParam(required = false) Integer idBrand,
                                                             @RequestParam(required = false) Integer doorNumber,
                                                             @RequestParam(required = false) Integer idCity,
                                                             @RequestParam(required = false) String title
    ){
        return publicationBl.publications(idPublication,i,n,idColor,model,idBrand,doorNumber,idCity,title);
    }

    @RequestMapping(path = "idd", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PublicationViewRequest SearchPublication(@RequestParam Integer idPublication){
        return publicationBl.publicationsView(idPublication);
    }

    /*@RequestMapping(path = "paths", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PublicationSimpleRequest> PathsPublication(@RequestParam Integer idPublication){
        return publicationBl.publicationsPaths(idPublication);
    }*/

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

    public PublicationRequest create(@RequestBody PublicationRequest publicationRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        UserUtil userUtil=new UserUtil();
        publicationRequest.setIdSeller(userUtil.getIdSeller());
        publicationBl.create(publicationRequest,transaction);
        return publicationRequest;
    }
    @RequestMapping(path="images" ,method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String uploadImages(@RequestParam MultipartFile[] images,@RequestParam Integer idPublication, HttpServletRequest request){
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        publicationBl.uploadImages(images,idPublication,transaction);
        return "Imagenes subidas correctamente";
    }
    @RequestMapping(path="images" ,method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteImages( @RequestBody List<ImagePublicationRequest> imagesDelete,HttpServletRequest request){
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        publicationBl.deleteImages(imagesDelete,transaction);
        return "Imagenes eliminadas correctamente";
    }
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String delete(@RequestParam Integer idPublication, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        publicationBl.delete(idPublication,transaction);
        return "Publicacion eliminada";
    }
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public PublicationRequest update(@RequestBody PublicationRequest publicationRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        publicationBl.update(publicationRequest,transaction);
        return publicationRequest;
    }
    @RequestMapping(path = "colors", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Color> getColors(){
        return publicationBl.getColors();
    }
    @RequestMapping(path = "brands", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Brand> getBrands(){
        return publicationBl.getBrands();
    }
    @RequestMapping(path = "cities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<City> getCities(){
        return publicationBl.getCities();
    }
}
