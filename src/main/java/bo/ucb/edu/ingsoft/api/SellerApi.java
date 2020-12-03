package bo.ucb.edu.ingsoft.api;
import bo.ucb.edu.ingsoft.bl.SellerBl;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.model.Seller;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import bo.ucb.edu.ingsoft.util.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/seller")
public class SellerApi {
    private SellerBl sellerBl;
    private static final Logger LOGGER = LoggerFactory.getLogger(SellerApi.class);
    @Autowired
    public SellerApi(SellerBl sellerBl){
        this.sellerBl = sellerBl;
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerRequest findById( HttpServletRequest request) {
        UserUtil userUtil=new UserUtil();
        Integer sellerId=userUtil.getIdSeller();
        return sellerBl.findSellerById(sellerId);
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerRequest create(@RequestBody SellerRequest sellerRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        sellerBl.create(sellerRequest,transaction);
        return sellerRequest;
    }
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerRequest update(@RequestBody SellerRequest sellerRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        sellerBl.update(sellerRequest,transaction);
        return sellerRequest;
    }

    @RequestMapping(path="/image",method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String uploadImages(@RequestParam MultipartFile images, @RequestParam Integer idSeller, HttpServletRequest request){
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        sellerBl.uploadImages(images,idSeller,transaction);
        return "Imagenes subidas correctamente";
    }

    @RequestMapping(path="/publications",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PublicationSimpleRequest> publications(@RequestParam(required = true) Integer i,
                                                       @RequestParam(required = true) Integer n,
                                                       HttpServletRequest request) {
        Integer idSeller=1;
        List<PublicationSimpleRequest> pubSeller=sellerBl.publications(idSeller,i,n);
        return pubSeller;
    }

}