package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.model.Publication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublicationDao {
    public void create(Publication publication);
    public Publication findByContactId();

    public PublicationRequest PublicationSerch(String Buscar);
    public PublicationRequest searchPublication(PublicationRequest publicationRequest);
}
