package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.dto.PublicationViewRequest;
import bo.ucb.edu.ingsoft.model.*;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PublicationDao {
    public void create(Publication publication);
    public void update(Publication publication);
    public void delete(Publication publication);
    public void createImagePublication(List<ImagePublication> imagePublications);
    public PublicationViewRequest publicationView(Integer idPublication);
    public List<PublicationSimpleRequest> publicationPaths(Integer idPublication);

    public List<PublicationSimpleRequest> publications(PublicationRequest publicationRequest, Integer i, Integer n);
    public List<Color> colors();
    public List<City> citys();
    public List<Brand> brands();

}
