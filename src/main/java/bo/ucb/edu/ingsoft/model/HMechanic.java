package bo.ucb.edu.ingsoft.model;

public class HMechanic {
    private Integer idHMechanic;
    private Integer idMechanic;
    private Integer idPerson;
    private Integer idCity;
    private String location;
    private String shopName;
    private Integer stars;
    private Integer starsCount;
    private Integer status;
    private Transaction transaction;

    public HMechanic(Transaction transaction) {
        this.transaction = transaction;
    }

    public Integer getIdHMechanic() {
        return idHMechanic;
    }

    public void setIdHMechanic(Integer idHMechanic) {
        this.idHMechanic = idHMechanic;
    }

    public Integer getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(Integer idMechanic) {
        this.idMechanic = idMechanic;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getStarsCount() {
        return starsCount;
    }

    public void setStarsCount(Integer starsCount) {
        this.starsCount = starsCount;
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
        return "HMechanic{" +
                "idHMechanic=" + idHMechanic +
                ", idMechanic=" + idMechanic +
                ", idPerson=" + idPerson +
                ", idCity=" + idCity +
                ", location='" + location + '\'' +
                ", shopName='" + shopName + '\'' +
                ", stars=" + stars +
                ", starsCount=" + starsCount +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
