package bo.ucb.edu.ingsoft.api;


import bo.ucb.edu.ingsoft.bl.MechanicBl;
import bo.ucb.edu.ingsoft.model.Mechanic;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import com.sun.net.httpserver.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

@RestController
@RequestMapping(value = "/mechanic")
public class MechanicApi {
    private MechanicBl mechanicBl;
    private TransactionUtil transactionUtil;

    private static final Logger LOGGER = LoggerFactory.getLogger(MechanicApi.class);

    @Autowired
    public MechanicApi(MechanicBl mechanicBl, TransactionUtil transactionUtil) {
        this.mechanicBl = mechanicBl;
        this.transactionUtil = transactionUtil;
    }

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Mechanic findMechanic(HttpServletRequest request){
        return mechanicBl.findMechanic();
    }

}
