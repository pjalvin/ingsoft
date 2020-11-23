package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PublicationBl;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.util.StorageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/image")
public class ImageApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(MechanicApi.class);
    private PublicationBl publicationBl;
    @Autowired
    public ImageApi(PublicationBl publicationBl) {
        this.publicationBl = publicationBl;
    }



    @RequestMapping(path="/{path}/{name}" ,method = RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] getImage(@PathVariable("path") String path, @PathVariable("name") String name){
        System.out.println(path);
        StorageUtil storageUtil=new StorageUtil();
        byte[] image=storageUtil.get(path,name);
        return image;
    }
}
