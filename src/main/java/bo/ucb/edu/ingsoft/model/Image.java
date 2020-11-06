package bo.ucb.edu.ingsoft.model;

public class Image {
    private Integer IdImagePublication;
    private Integer IdPublication;
    private String path;
    private Integer Status;

    public Image(Integer idImagePublication, Integer idPublication, String path, Integer status) {
        IdImagePublication = idImagePublication;
        IdPublication = idPublication;
        this.path = path;
        Status = status;
    }

    public Integer getIdImagePublication() {
        return IdImagePublication;
    }

    public void setIdImagePublication(Integer idImagePublication) {
        IdImagePublication = idImagePublication;
    }

    public Integer getIdPublication() {
        return IdPublication;
    }

    public void setIdPublication(Integer idPublication) {
        IdPublication = idPublication;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Image{" +
                "IdImagePublication=" + IdImagePublication +
                ", IdPublication=" + IdPublication +
                ", path='" + path + '\'' +
                ", Status=" + Status +
                '}';
    }
}
