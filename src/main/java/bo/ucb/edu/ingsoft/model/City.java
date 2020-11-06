package bo.ucb.edu.ingsoft.model;

public class City {
    private Integer idCity;
    private String city;
    private Integer status;
    private Transaction transaction;

    public City() {
        transaction = new Transaction();
    }
    public City(Transaction transaction) {
        this.transaction = transaction;
    }
    public Integer getIdCity() {
        return idCity;
    }
    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "City{" +
                "IdCity=" + idCity +
                ", city='" + city + '\'' +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
