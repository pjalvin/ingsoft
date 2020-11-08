package bo.ucb.edu.ingsoft.dto;

public class MechanicContactRequest {
    private String shopName;
    private String shopPhoneNumber;

    public MechanicContactRequest() {
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPhoneNumber() {
        return shopPhoneNumber;
    }

    public void setShopPhoneNumber(String shopPhoneNumber) {
        this.shopPhoneNumber = shopPhoneNumber;
    }

    @Override
    public String toString() {
        return "MechanicContactRequest{" +
                "shopName='" + shopName + '\'' +
                ", shopPhoneNumber='" + shopPhoneNumber + '\'' +
                '}';
    }
}
