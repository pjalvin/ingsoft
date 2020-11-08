package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.model.Seller;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellerDao {
    public Seller findBySellerId(Integer sellerId);
    public void createSeller(Seller seller);
    public void updateSeller(Seller seller);
    public List<PublicationRequest> publications(Integer idUsuario);
}
