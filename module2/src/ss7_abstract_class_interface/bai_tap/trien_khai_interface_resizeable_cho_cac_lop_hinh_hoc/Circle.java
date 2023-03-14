package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import java.util.Scanner;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString()+"\n Area = "+getArea() +"\n Perimeter = "+getPerimeter();
    }

    public void resize(double percent) {
        this.radius = radius + radius * percent / 100;
    }

}
