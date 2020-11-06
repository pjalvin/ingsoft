package bo.ucb.edu.ingsoft.model;

public class Color {
    private Integer IdColor;
    private String Color;
    private Integer Status;

    public Color(Integer idColor, String color, Integer status) {
        IdColor = idColor;
        Color = color;
        Status = status;
    }

    public Integer getIdColor() {
        return IdColor;
    }

    public void setIdColor(Integer idColor) {
        IdColor = idColor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Color{" +
                "IdColor=" + IdColor +
                ", Color='" + Color + '\'' +
                ", Status=" + Status +
                '}';
    }
}
