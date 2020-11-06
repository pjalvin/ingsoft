package bo.ucb.edu.ingsoft.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionDao {
    public Integer getLastInsertId();
}
