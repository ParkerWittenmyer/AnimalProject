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
public class EagleClass extends BirdClass implements IFly{
    
    public EagleClass(String name, double wingspan) {
        super(name, wingspan);
    }

    @Override
    public void fly() {
        System.out.println("Fly");    
    }

    
    
}
