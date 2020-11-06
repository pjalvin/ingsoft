package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Seller;

public interface SellerDao {
    public Seller findBySellerId(Integer sellerId);
    public void create(Seller seller);


}
