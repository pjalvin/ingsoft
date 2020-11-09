package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PublicationBl;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/publications/List")
public class PaginationPublicationApi {
    private PublicationBl publicationBl;

    @Autowired
    public PaginationPublicationApi(PublicationBl publicationBl) {
        this.publicationBl = publicationBl;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<PublicationRequest> ListPublications(){
        //ArrayList<PublicationRequest> publicationRequests=new ArrayList<>();
        return publicationBl.ListPublicationss();
    }


}
