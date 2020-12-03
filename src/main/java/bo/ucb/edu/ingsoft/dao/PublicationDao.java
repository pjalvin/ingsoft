package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.ImagePublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.dto.PublicationViewRequest;
import bo.ucb.edu.ingsoft.model.*;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PublicationDao {
    public void create(Publication publication);
    public void update(Publication publication);
    public void delete(Publication publication);
    public void createImagePublication(List<bo.ucb.edu.ingsoft.model.ImagePublication> imagePublications);
    public void deleteImagePublication(ImagePublication image);
    public PublicationViewRequest publicationView(Integer idPublication);
    public List<ImagePublicationRequest> publicationPaths(Integer idPublication);

    public List<PublicationSimpleRequest> publications(PublicationRequest publicationRequest, Integer i, Integer n,Integer sellerId);
    public List<Color> colors();
    public List<City> cities();
    public List<Brand> brands();

}
