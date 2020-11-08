package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.MechanicContactRequest;
import bo.ucb.edu.ingsoft.dto.MechanicSimpleRequest;
import bo.ucb.edu.ingsoft.model.Mechanic;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MechanicDao {

    public MechanicSimpleRequest mechanics();

    public MechanicContactRequest mechanicContact(Integer idMechanic);
}
