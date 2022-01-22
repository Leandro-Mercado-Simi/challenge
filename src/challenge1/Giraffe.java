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
public class Giraffe extends Animal {

    private double height;

    public Giraffe() {

    }

    public Giraffe(double height, String animalSpecies, String name, int numberOfLegs, String gender) {
        super(animalSpecies, name, numberOfLegs, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void CompareHeight() {

        if (this.getGender().equalsIgnoreCase("male")) {
            if (this.height < 5.5) {
                System.out.println(this.name + " the giraffe is under the height average");
            } else if (this.height > 5.5) {
                System.out.println(this.name + " the giraffe is over the height average");
            } else {
                System.out.println(this.name + " the giraffe is in the height average");
            }
        } else if (this.getGender().equalsIgnoreCase("female")) {
            if (this.height < 4.6) {
                System.out.println(this.name + " the giraffe is under the height average");
            } else if (this.height > 4.6) {
                System.out.println(this.name + " the giraffe is over the height average");
            } else {
                System.out.println(this.name + " the giraffe is in the height average");
            }
        } else {
            System.out.println("An error has occurred");
        }
        
        System.out.println("---------------------------------------------");
    }
    
    @Override
    public void ShowDetail(){
        System.out.println("Animal specie: " + this.getAnimalSpecies());
        System.out.println("Name: " + this.getName());
        System.out.println("Number of legs: " + this.getNumberOfLegs());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Height: " + this.getHeight());
    }

}
