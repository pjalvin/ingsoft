package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PublicationBl;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
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
    public PublicationRequest SearchPublication1(@RequestBody PublicationRequest publicationRequest){
        return publicationBl.Searchpublication1(publicationRequest);
    }


    @RequestMapping(path="/search",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PublicationRequest SearchPublication(@RequestParam String Buscar){
        return publicationBl.publicationSearch(Buscar);
    }

    @RequestMapping(path="/list",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PublicationSimpleRequest> publications(HttpServletRequest request) {
        Integer idPublication=1;
        List<PublicationSimpleRequest> publications=publicationBl.ListPublicationss(idPublication);
        return publications;
    }


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

    public PublicationRequest create(@RequestBody PublicationRequest publicationRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
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
}
