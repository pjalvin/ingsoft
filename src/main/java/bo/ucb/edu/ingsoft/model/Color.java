package bo.ucb.edu.ingsoft.model;

public class Color {
    private Integer IdColor;
    private String Color;

    public Color(Integer idColor, String color) {
        IdColor = idColor;
        Color = color;
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

    @Override
    public String toString() {
        return "Color{" +
                "IdColor=" + IdColor +
                ", Color='" + Color + '\'' +
                '}';
    }
}
