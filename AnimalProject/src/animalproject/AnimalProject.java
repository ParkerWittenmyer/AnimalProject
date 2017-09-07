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
        
        String name;
        
        /* Each animal has to actually have it's own class,
        not each animal being an example of a class */
        
        
        BirdClass Ostrich = new BirdClass();
        Ostrich.wingspan = 6.6; //In feet
        
        BirdClass Penguin = new BirdClass();
        Penguin.wingspan = 2.5; //In feet
        
        BirdClass Eagle = new BirdClass();
        Eagle.wingspan = 7.5;
        
        
        MammalClass Dolphin = new MammalClass();
        Dolphin.bodyTemp = 97; //In fahrenheit
        
        MammalClass Lion = new MammalClass();
        Lion.bodyTemp = 100.5;
        
        MammalClass Bat = new MammalClass();
        Bat.bodyTemp = 102;
        
        
        FishClass Shark = new FishClass();
        Shark.isSaltWater = true; //Some species are, some aren't
        
        FishClass Bass = new FishClass();
        Bass.isSaltWater = true; //Bass are both (anadromous)
        
        FishClass FlyingFish = new FishClass();
        FlyingFish.isSaltWater = false;
        
        
        
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
        Swimmers.add(Penguin);
        Swimmers.add(Dolphin);
        Swimmers.add(Shark);
        Swimmers.add(Bass);
        Swimmers.add(FlyingFish);
        
        ArrayList SoundMakers = new ArrayList<>();
        SoundMakers.addAll(Animals);
        
    }
    
}
