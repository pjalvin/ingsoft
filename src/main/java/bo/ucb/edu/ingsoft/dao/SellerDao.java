package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Seller;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerDao {
    public Seller findBySellerId(Integer sellerId);
    public void createSeller(Seller seller);
    public void updateSeller(Seller seller);
}
