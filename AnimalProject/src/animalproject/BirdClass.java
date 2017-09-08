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
public class BirdClass extends AnimalClass{
    double wingspan;
    
    public BirdClass(String name, double wingspan)
    {
        super(name);
        this.wingspan = wingspan;
    }
    
}
