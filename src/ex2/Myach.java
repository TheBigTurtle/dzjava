package ex2;

public class Myach {
    private double radius;
    private String color;

    public Myach(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Myach{" +
                "color='" + color + '\'' +
                '}';
    }

    void printMyachInfo(){
        System.out.println(radius);
        System.out.println(color);
    }
}
