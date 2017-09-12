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
public class FishClass extends AnimalClass {
    boolean isSaltWater;
    
    public FishClass(String name, boolean isSaltWater)
    {
        super(name);
    }

    public boolean getIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }
    
}
