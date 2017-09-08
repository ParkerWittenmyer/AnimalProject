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
public class MammalClass extends AnimalClass{
    double bodyTemp;
    
    public MammalClass(String name, double bodyTemp)
    {
        super(name);
        this.bodyTemp = bodyTemp;
    }
}
