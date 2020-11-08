package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.ImagePublication;
import bo.ucb.edu.ingsoft.model.Publication;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PublicationDao {
    public void create(Publication publication);
    public Publication findByContactId();
    public void createImagePublication(List<ImagePublication> imagePublications);
}
