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
public class LionClass extends MammalClass implements IWalk{

    public LionClass(String name, double bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void walk() {
        System.out.println("Walk");    
    }

    
    
}
