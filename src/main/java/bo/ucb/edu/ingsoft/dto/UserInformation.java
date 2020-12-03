package bo.ucb.edu.ingsoft.dto;

public class UserInformation {
    private Integer idUser;
    private Integer idSeller;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public UserInformation() {
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "idUser=" + idUser +
                ", idSeller=" + idSeller +
                '}';
    }
}
