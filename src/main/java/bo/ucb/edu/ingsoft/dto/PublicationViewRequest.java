package bo.ucb.edu.ingsoft.dto;

import java.util.List;

public class PublicationViewRequest {

    private String title;
    private String description;
    private double price;
    private String brand;//id
    private Integer idBrand;
    private Integer model;
    private String licensePlate;
    private String Color;//id
    private Integer idColor;
    private String motor;
    private String phoneNumber;

    private Integer doorNumber;
    private Integer idSeller;
    private String City; // id
    private Integer idCity;
    private List<ImagePublicationRequest> images;

    public PublicationViewRequest() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getColor() {
        return Color;
    }

    public String getMotor() {
        return motor;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public Integer getIdSeller() {
        return idSeller;
    }

    public String getCity() {
        return City;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setIdSeller(Integer idSeller) {
        this.idSeller = idSeller;
    }

    public void setCity(String city) {
        City = city;
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

    public List<ImagePublicationRequest> getImages() {
        return images;
    }

    public void setImages(List<ImagePublicationRequest> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "PublicationViewRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", idBrand=" + idBrand +
                ", model=" + model +
                ", licensePlate='" + licensePlate + '\'' +
                ", Color='" + Color + '\'' +
                ", idColor=" + idColor +
                ", motor='" + motor + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doorNumber=" + doorNumber +
                ", idSeller=" + idSeller +
                ", City='" + City + '\'' +
                ", idCity=" + idCity +
                ", images=" + images +
                '}';
    }
}
