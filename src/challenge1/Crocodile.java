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
public class Crocodile extends Animal {

    private int numberOfTeeth;

    public Crocodile() {
    }

    public Crocodile(int numberOfTeeth, String animalSpecies, String name, int numberOfLegs, String gender) {
        super(animalSpecies, name, numberOfLegs, gender);
        this.numberOfTeeth = numberOfTeeth;
    }

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    public void FavouriteFood() {
        System.out.println("Crocodiles favourite food: ");
        System.out.println("When crocodiles are young they feed of frogs, little fishes and crabs. " + "\n"
                + "When they grow, they eat other reptiles, birds, and mammals that reach the edges to drink water.");

        System.out.println("---------------------------------------------");
    }

    @Override
    public void ShowDetail() {
        System.out.println("Animal specie: " + this.getAnimalSpecies());
        System.out.println("Name: " + this.getName());
        System.out.println("Number of legs: " + this.getNumberOfLegs());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Number of teeth: " + this.getNumberOfTeeth());
    }
}
