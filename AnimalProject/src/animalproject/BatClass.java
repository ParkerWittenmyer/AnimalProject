/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

/**
 *
 * @author pwittenmyer
 */
public class BatClass extends MammalClass implements IFly, IMakeSound{

    public BatClass(String name, double bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void fly() {
        System.out.println("Fly");    
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }

    
    
}
