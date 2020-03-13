/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke_thua;

/**
 *
 * @author MyPC
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
        System.out.println("Construced a Circle with Cylinder()");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Construced a Circle with Cylinder(height)");
    }

    public Cylinder(double height ,double radius) {
        super(radius);
        this.height = height;
        System.out.println("Construced a Circle with Cylinder(height , radius)");
    }

    public Cylinder(double height ,double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Construced a Circle with Cylinder(height , radius,color)");
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*getRadius()*height + 2*super.getArea(); //To change body of generated methods, choose Tools | Templates.
    }
    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString(){
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
    
}

