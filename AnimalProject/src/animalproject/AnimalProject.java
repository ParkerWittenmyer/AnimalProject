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
        
        OstrichClass Ostrich = new OstrichClass("Tyler", 6.6); //In feet
        
        PenguinClass Penguin = new PenguinClass("Zach", 2.5); //In feet
        
        EagleClass Eagle = new EagleClass("Anthony", 7.5); //In feet
        
        //~~~~~
        
        DolphinClass Dolphin = new DolphinClass("Trevin", 97); //In fahrenheit
        
        LionClass Lion = new LionClass("Israel", 100.5); //In fahrenheit
        
        BatClass Bat = new BatClass("Caleb", 102); //In fahrenheit
        
        //~~~~~
        
        SharkClass Shark = new SharkClass("Aiden", true); //Some species are, some aren't
        
        BassClass Bass = new BassClass("John", true); //Bass are both (anadromous)
        
        FlyingFishClass FlyingFish = new FlyingFishClass("AG", false);
        
        
        
        ArrayList Animals = new ArrayList<>();
        Animals.add(Ostrich.name);
        Animals.add(Penguin.name);
        Animals.add(Eagle.name);
        Animals.add(Dolphin.name);
        Animals.add(Lion.name);
        Animals.add(Bat.name);
        Animals.add(Shark.name);
        Animals.add(Bass.name);
        Animals.add(FlyingFish.name);
        System.out.println("Animals: " + Animals);
        
        ArrayList Birds = new ArrayList<>();
        Birds.add(Ostrich.name);
        Birds.add(Penguin.name);
        Birds.add(Eagle.name);
        System.out.println("Birds: " + Birds);
        
        ArrayList Mammals = new ArrayList<>();
        Mammals.add(Dolphin.name);
        Mammals.add(Lion.name);
        Mammals.add(Bat.name);
        System.out.println("Mammals" + Mammals);
        
        ArrayList Fish = new ArrayList<>();
        Fish.add(Shark.name);
        Fish.add(Bass.name);
        Fish.add(FlyingFish.name);
        System.out.println("Fish: " + Fish);
        
        ArrayList Flyers = new ArrayList<>();
        Flyers.add(Eagle.name);
        Flyers.add(Bat.name);
        Flyers.add(FlyingFish.name);
        System.out.println("Flyers: " + Flyers);
        
        ArrayList Walkers = new ArrayList<>();
        Walkers.add(Ostrich.name);
        Walkers.add(Penguin.name);
        Walkers.add(Eagle.name);
        Walkers.add(Lion.name);
        System.out.println("Walkers: " + Walkers);
        
        ArrayList Swimmers = new ArrayList<>();
        Swimmers.add(Ostrich.name);
        Swimmers.add(Penguin.name);
        Swimmers.add(Dolphin.name);
        Swimmers.add(Shark.name);
        Swimmers.add(Bass.name);
        Swimmers.add(FlyingFish.name);
        System.out.println("Swimmers: " + Swimmers);
        
        ArrayList SoundMakers = new ArrayList<>();
        SoundMakers.add(Ostrich.name);
        SoundMakers.add(Penguin.name);
        SoundMakers.add(Eagle.name);
        SoundMakers.add(Dolphin.name);
        SoundMakers.add(Lion.name);
        SoundMakers.add(Bat.name);
        System.out.println("Sound Makers: " + SoundMakers);
    }
    
}
