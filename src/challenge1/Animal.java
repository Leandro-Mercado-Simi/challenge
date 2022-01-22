/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1;

/**
 *
 * @author Usuario
 */
public class Animal {
    
    protected String animalSpecies;
    protected String name;
    protected int numberOfLegs;
    protected String gender;

    public Animal() {
        this.animalSpecies = "";
        this.name = "";
        this.numberOfLegs = 0;
        this.gender = "";
    }

    public Animal(String animalSpecies, String name, int numberOfLegs, String gender) {
        this.animalSpecies = animalSpecies;
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.gender = gender;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void ShowDetail(){
        System.out.println("Animal specie: " + this.getAnimalSpecies());
        System.out.println("Name: " + this.getName());
        System.out.println("Number of legs: " + this.getNumberOfLegs());
        System.out.println("Gender: " + this.getGender());
    }
    
}
