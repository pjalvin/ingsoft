package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.model.ImagePublication;
import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.model.Publication;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PublicationDao {
    public void create(Publication publication);
    public void update(Publication publication);
    public void delete(Publication publication);
    public void createImagePublication(List<ImagePublication> imagePublications);

    public List<PublicationSimpleRequest> publications1(PublicationRequest publicationRequest, Integer i, Integer n);

    public List<PublicationSimpleRequest> publications(Integer pagi);

}
