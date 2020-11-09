package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Star;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StarDao {
    public void createStar(Star star);

    public Integer size(Integer idMechanic);
}
