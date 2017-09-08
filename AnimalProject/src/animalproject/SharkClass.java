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
public class SharkClass extends FishClass implements ISwim{

    public SharkClass(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
    
}
