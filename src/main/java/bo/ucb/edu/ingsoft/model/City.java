package bo.ucb.edu.ingsoft.model;

public class City {
    private Integer idCity;
    private String city;

    public City() {

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

    @Override
    public String toString() {
        return "City{" +
                "IdCity=" + idCity +
                ", city='" + city + '\'' +
                '}';
    }
}
