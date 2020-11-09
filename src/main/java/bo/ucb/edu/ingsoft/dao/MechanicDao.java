package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.MechanicContactRequest;
import bo.ucb.edu.ingsoft.dto.MechanicSimpleRequest;
import bo.ucb.edu.ingsoft.dto.QualifyMechanicRequest;
import bo.ucb.edu.ingsoft.model.Mechanic;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MechanicDao {

    public List<MechanicSimpleRequest> mechanics();

    public MechanicContactRequest mechanicContact(Integer idMechanic);

    public void qualifyMechanic(QualifyMechanicRequest qualifyMechanicRequest);

    public Mechanic stars (Integer idMechanic);

    public void starsValue(Mechanic mechanic);

}
