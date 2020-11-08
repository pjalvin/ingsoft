package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PublicationBl;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.model.Publication;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/publications")
public class PublicationApi {
    private  PublicationBl publicationBl;
    @Autowired
    public PublicationApi(PublicationBl publicationBl) {
        this.publicationBl = publicationBl;
    }

    /*
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PublicationRequest SerchPublicatio(@RequestBody PublicationRequest publicationRequest){
        return publicationBl.Serchpublication(publicationRequest);
    }
*/

    /*
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Publication ViewListPublication(HttpServletRequest request){
        return publicationBl.findContacById();
    }
    */

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public PublicationRequest ViewListPublication(@RequestBody String Buscar){
        return publicationBl.publicationBuscar(Buscar);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)

    public PublicationRequest create(@RequestBody PublicationRequest publicationRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        publicationBl.create(publicationRequest,transaction);
        return publicationRequest;
    }




}
