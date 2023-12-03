/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectsexs;

/**
 *
 * @author amand
 */
public class Car {
    String make;
    String model;
    int numWheels;
    String colour;
    
    public void drive (double direction) {
        System.out.println(String.format("The %s %s id driving at %f degrees", colour, make, direction));
        System.out.printf("The %s %s id driving at %f degrees", colour, make, direction);
        
    }
    
    
    
}
