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
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("radius is " +cy1.getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getColor()
                + ", Base are is " + cy1.getArea()
                + ", Volume is " + cy1.getVolume());
        
                Cylinder cy2 = new Cylinder(5.2 , 2.0);
        System.out.println("radius is " +cy2.getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Base are is " + cy2.getArea()
                + ", Volume is " + cy2.getVolume());
    }

}

