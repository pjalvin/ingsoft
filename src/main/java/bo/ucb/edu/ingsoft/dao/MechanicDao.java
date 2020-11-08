package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.model.Mechanic;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MechanicDao {
    public Mechanic mechanics();

    public Mechanic mechanicContact();
}
