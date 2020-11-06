package bo.ucb.edu.ingsoft.dto;

public class PublicationRequest {
    private int idPublication;
    private int idSeller;
    private int idBrand;
    private int idColor;
    private int idCity;
    private int model;
    private int doorNumber;
    private String licensePlate;
    private String description;
    private String motor;
    private double price;
    private boolean status;
    public PublicationRequest() {
    }

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public int getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PublicationRequest{" +
                "idPublication=" + idPublication +
                ", idSeller=" + idSeller +
                ", idBrand=" + idBrand +
                ", idColor=" + idColor +
                ", idCity=" + idCity +
                ", model=" + model +
                ", doorNumber=" + doorNumber +
                ", licensePlate='" + licensePlate + '\'' +
                ", description='" + description + '\'' +
                ", motor='" + motor + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
