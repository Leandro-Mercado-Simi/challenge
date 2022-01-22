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
public class GiantTortoise extends Animal{
    
    private int currentAge;

    public GiantTortoise() {
    }

    public GiantTortoise(int currentAge, String animalSpecies, String name, int numberOfLegs, String gender) {
        super(animalSpecies, name, numberOfLegs, gender);
        this.currentAge = currentAge;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }
    
    public void RangeAge(){
        
        if (this.currentAge < 50) {
            System.out.println(this.name + " is a young tortoise");
        }else if(this.currentAge >= 50 && this.currentAge < 100){
            System.out.println(this.name + " is a middle age tortoise");
        }else if(this.currentAge >= 100){
            System.out.println(this.name + " is an old tortoise");
        }else{
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
        System.out.println("Current age: " + this.getCurrentAge());
    }
    
    
}
