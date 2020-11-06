package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Publication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublicationDao {
    public void create(Publication publication);
    public Publication findByContactId(Integer publicationId);
}
