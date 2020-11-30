package bo.ucb.edu.ingsoft.dto;

public class ImagePath {
    private String path;

    public ImagePath() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ImagePath{" +
                "path='" + path + '\'' +
                '}';
    }
}
