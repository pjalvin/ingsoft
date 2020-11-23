package bo.ucb.edu.ingsoft.dto;

public class MechanicSimpleRequest {
    private Integer idMechanic;
    private String location;
    private String shopName;
    private Integer stars;
    private String shopPhoneNumber;

    public MechanicSimpleRequest() {
    }

    public Integer getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(Integer idMechanic) {
        this.idMechanic = idMechanic;
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

    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }

    @Override
    public String toString() {
        return "MechanicSimpleRequest{" +
                "idMechanic=" + idMechanic +
                ", location='" + location + '\'' +
                ", shopName='" + shopName + '\'' +
                ", stars=" + stars +
                ", shopPhoneNumber='" + shopPhoneNumber + '\'' +
                '}';
    }
}
