package bo.ucb.edu.ingsoft.api;
import bo.ucb.edu.ingsoft.bl.SellerBl;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.model.Seller;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

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
    public Seller findById(HttpServletRequest request) {
        return sellerBl.findSellerById(0);
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public SellerRequest create(@RequestBody SellerRequest sellerRequest, HttpServletRequest request) {
        TransactionUtil transactionUtil=new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        sellerBl.create(sellerRequest,transaction);
        return sellerRequest;
    }
}