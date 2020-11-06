package bo.ucb.edu.ingsoft.model;

public class Brand {
    private Integer Idbrand;
    private String brand;
    private Integer status;

    public Brand(Integer idbrand, String brand, Integer status) {
        Idbrand = idbrand;
        this.brand = brand;
        this.status = status;
    }

    public Integer getIdbrand() {
        return Idbrand;
    }

    public void setIdbrand(Integer idbrand) {
        Idbrand = idbrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "brand{" +
                "Idbrand=" + Idbrand +
                ", brand='" + brand + '\'' +
                ", status=" + status +
                '}';
    }
}
