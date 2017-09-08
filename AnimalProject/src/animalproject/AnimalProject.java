/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import java.util.ArrayList;

/**
 *
 * @author pwittenmyer
 */
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OstrichClass Ostrich = new OstrichClass("", 6.6); //In feet
        
        PenguinClass Penguin = new PenguinClass("", 2.5); //In feet
        
        EagleClass Eagle = new EagleClass("", 7.5); //In feet
        
        //~~~~~
        
        DolphinClass Dolphin = new DolphinClass("", 97); //In fahrenheit
        
        LionClass Lion = new LionClass("", 100.5); //In fahrenheit
        
        BatClass Bat = new BatClass("", 102); //In fahrenheit
        
        //~~~~~
        
        SharkClass Shark = new SharkClass("", true); //Some species are, some aren't
        
        BassClass Bass = new BassClass("", true); //Bass are both (anadromous)
        
        FlyingFishClass FlyingFish = new FlyingFishClass("", false);
        
        
        
        ArrayList Animals = new ArrayList<>();
        Animals.add(Ostrich);
        Animals.add(Penguin);
        Animals.add(Eagle);
        Animals.add(Dolphin);
        Animals.add(Lion);
        Animals.add(Bat);
        Animals.add(Shark);
        Animals.add(Bass);
        Animals.add(FlyingFish);
        
        ArrayList Birds = new ArrayList<>();
        Birds.add(Ostrich);
        Birds.add(Penguin);
        Birds.add(Eagle);
        
        ArrayList Mammals = new ArrayList<>();
        Mammals.add(Dolphin);
        Mammals.add(Lion);
        Mammals.add(Bat);
        
        ArrayList Fishes = new ArrayList<>();
        Fishes.add(Shark);
        Fishes.add(Bass);
        Fishes.add(FlyingFish);
        
        ArrayList Flyers = new ArrayList<>();
        Flyers.add(Eagle);
        Flyers.add(Bat);
        Flyers.add(FlyingFish);
        
        ArrayList Walkers = new ArrayList<>();
        Walkers.add(Ostrich);
        Walkers.add(Penguin);
        Walkers.add(Eagle);
        Walkers.add(Lion);
        
        ArrayList Swimmers = new ArrayList<>();
        Swimmers.add(Ostrich);
        Swimmers.add(Penguin);
        Swimmers.add(Dolphin);
        Swimmers.add(Shark);
        Swimmers.add(Bass);
        Swimmers.add(FlyingFish);
        
        ArrayList SoundMakers = new ArrayList<>();
        SoundMakers.addAll(Animals);
        
    }
    
}
