package bo.ucb.edu.ingsoft.dto;

public class ImagePublicationRequest {
    private int idImagePublication;
    private String path;

    public ImagePublicationRequest() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getIdImagePublication() {
        return idImagePublication;
    }

    public void setIdImagePublication(int idImagePublication) {
        this.idImagePublication = idImagePublication;
    }

    @Override
    public String toString() {
        return "ImagePublication{" +
                "idImagePublication=" + idImagePublication +
                ", path='" + path + '\'' +
                '}';
    }
}
