package bo.ucb.edu.ingsoft.api;


import bo.ucb.edu.ingsoft.bl.MechanicBl;
import bo.ucb.edu.ingsoft.dto.MechanicSimpleRequest;
import bo.ucb.edu.ingsoft.dto.QualifyMechanicRequest;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.dto.UserInformation;
import bo.ucb.edu.ingsoft.model.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import bo.ucb.edu.ingsoft.util.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/mechanic")
public class MechanicApi {
    private MechanicBl mechanicBl;
    private TransactionUtil transactionUtil;

    private static final Logger LOGGER = LoggerFactory.getLogger(MechanicApi.class);

    @Autowired
    public MechanicApi(MechanicBl mechanicBl) {
        this.mechanicBl = mechanicBl;
    }


    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MechanicSimpleRequest> mechanics(HttpServletRequest request) {
        List<MechanicSimpleRequest> mechanic=mechanicBl.mechanics();
        return mechanic;
    }

    @RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public QualifyMechanicRequest qualifyMechanic(@RequestBody QualifyMechanicRequest qualifyMechanicRequest ,HttpServletRequest request){
        TransactionUtil transactionUtil = new TransactionUtil();
        Transaction transaction = transactionUtil.createTransaction(request);
        return mechanicBl.qualifyMechanic(qualifyMechanicRequest,transaction);
    }
}
