package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.model.Publication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/list")
public class PublicationApi {
    private  Publication publication;

    public PublicationApi(Publication publication) {
        this.publication = publication;
    }
}
