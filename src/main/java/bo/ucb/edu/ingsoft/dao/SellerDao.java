package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.PublicationRequest;
import bo.ucb.edu.ingsoft.dto.PublicationSimpleRequest;
import bo.ucb.edu.ingsoft.dto.SellerRequest;
import bo.ucb.edu.ingsoft.model.Seller;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellerDao {
    public SellerRequest findBySellerId(Integer sellerId);
    public void createSeller(Seller seller);
    public void updateSeller(Seller seller);
    public void updateImage(Seller seller);
    public List<PublicationSimpleRequest> publications(Integer idSeller,Integer i,Integer n);

}
