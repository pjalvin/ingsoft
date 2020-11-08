package bo.ucb.edu.ingsoft.model;

public class Seller {
    private Integer  idSeller;
    private Integer idPerson;
    private Integer idUser;
    private Integer status;
    private String imagePath;
    private Transaction transaction;

    public Seller() {

    }

    public Integer getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "idSeller=" + idSeller +
                ", idPerson=" + idPerson +
                ", idUser=" + idUser +
                ", status=" + status +
                ", imagePath='" + imagePath + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}
