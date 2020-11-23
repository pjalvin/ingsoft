package bo.ucb.edu.ingsoft.dto;

public class PublicationSimpleRequest {
    public Integer idPublication;
    public String imagePath;
    public String title;
    public Double price;

    public PublicationSimpleRequest() {
    }

    public Integer getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Integer idPublication) {
        this.idPublication = idPublication;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PublicationSimpleRequest{" +
                "idPublication=" + idPublication +
                ", imagePath='" + imagePath + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
