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
public class OstrichClass extends BirdClass implements IWalk, ISwim, IMakeSound{

    public OstrichClass(String name, double wingspan) {
        super(name, wingspan);
    }

    @Override
    public void walk() {
        System.out.println("Walk");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void makeSound() {
        System.out.println("Woo");
    }
    
}
