package LearningOops2;

public class Vehicals {
    public String name;
    private String color;
    protected int maxSped;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Vehical name " + name + " Color " + color + " Speed " + maxSped);

    }
}
