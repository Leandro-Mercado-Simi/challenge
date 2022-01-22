package challenge1;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Zoo {

    private String name;
    private String city;
    private double[] operatingHours = new double[2];
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(String name, String city, double[] operatingHours) {
        this.name = name;
        this.city = city;
        this.operatingHours = operatingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double[] getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double[] operatingHours) {
        this.operatingHours = operatingHours;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    /*-----------------------------------------------------------------------*/
    
    public boolean AddHours(double opHour, double clHour) {
        boolean flag;
        if ((opHour >= 0.0 && opHour <= 23.59) && (clHour >= 0.0 && clHour <= 23.59)) {
            this.getOperatingHours()[0] = opHour;
            this.getOperatingHours()[1] = clHour;
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public void AnimalsAmount(ArrayList<Animal> animals) {
        int amount = this.animals.size();
        System.out.println("The current animals amount is: " + amount);
    }
    
    public void DeleteAnimals(int index){
        
        this.getAnimals().remove(index-1);
        
        
    }
    
}
