package bo.ucb.edu.ingsoft.dto;

public class PublicationRequest {
    private Integer idPublication;
    private Integer idSeller;
    private Integer idBrand;
    private Integer idColor;
    private Integer idCity;
    private String title;
    private Integer model;
    private Integer doorNumber;
    private String licensePlate;
    private String description;
    private String motor;
    private double price;
    private boolean status;

    public PublicationRequest() {
    }

    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    public Integer getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public Integer getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "PublicationRequest{" +
                "idPublication=" + idPublication +
                ", idSeller=" + idSeller +
                ", idBrand=" + idBrand +
                ", idColor=" + idColor +
                ", idCity=" + idCity +
                ", titulo='" + title + '\'' +
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
