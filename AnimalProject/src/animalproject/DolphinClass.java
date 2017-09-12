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
public class DolphinClass extends MammalClass implements ISwim, IMakeSound{

    public DolphinClass(String name, double bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void swim() {
        System.out.println("Swim");    
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
    
}
