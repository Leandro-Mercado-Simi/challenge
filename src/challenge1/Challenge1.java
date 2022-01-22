package challenge1;

import java.util.Scanner;

public class Challenge1 {

    public static Scanner s = new Scanner(System.in);

    public static void ZooInfo(Zoo zoo) {

        double opHour, clHour;

        System.out.print("Introduce the name of the Zoo: ");
        zoo.setName(s.nextLine());

        System.out.print("Introduce the city: ");
        zoo.setCity(s.nextLine());

        do {
            System.out.print("Introduce the opening time: ");
            opHour = s.nextDouble();

            System.out.print("Introduce the closing time: ");
            clHour = s.nextDouble();

        } while (!zoo.AddHours(opHour, clHour));

        System.out.println("---------------------------------------------" + "\n");
    }

    public static void Menu(Zoo zoo) {

        int election = 0;

        do {
            System.out.println("Select an option");
            System.out.println("1) Check animals amount" + "\n"
                    + "2) Add an animal" + "\n"
                    + "3) Remove an animal" + "\n"
                    + "4) See description of an animal" + "\n"
                    + "5) Calculate the admission price" + "\n"
                    + "6) See description of all animals" + "\n"
                    + "7) Exit");
            System.out.println("---------------------------------------------");

            election = s.nextInt();
            s.nextLine();
            System.out.println("Menu -> " + election);

            switch (election) {
                case 1:
                    zoo.AnimalsAmount(zoo.getAnimals());
                    System.out.println("---------------------------------------------" + "\n");
                    break;
                case 2:
                    AddAnimals(zoo);
                    System.out.println("---------------------------------------------" + "\n");
                    break;
                case 3:
                    RemoveAnimals(zoo);
                    System.out.println("---------------------------------------------" + "\n");
                    break;
                case 4:
                    AnimalDetail(zoo);
                    System.out.println("---------------------------------------------" + "\n");
                    break;
                case 5:
                    CalculatePrice();
                    System.out.println("---------------------------------------------" + "\n");
                    break;
                case 6:
                    AllDescriptions(zoo);
                    System.out.println("---------------------------------------------" + "\n");
                    break;
                case 7:
                    Exit();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);

    }

    public static void AddAnimals(Zoo zoo) {
        boolean flag = false;
        int select = 0;
        do {
            System.out.println("What specie of animal do you want to add?");
            System.out.println("1) Giraffe" + "\n"
                    + "2) Crocodile" + "\n"
                    + "3) Giant tortoise" + "\n"
                    + "4) Other");
            select = s.nextInt();
            s.nextLine();

            switch (select) {
                case 1:
                    Giraffe giraffe = new Giraffe();
                    giraffe.setAnimalSpecies("Giraffe");

                    System.out.print("Introduce the name: ");
                    giraffe.setName(s.nextLine());

                    System.out.print("Introduce the number of legs: ");
                    giraffe.setNumberOfLegs(s.nextInt());
                    s.nextLine();

                    System.out.print("Introduce the gender: ");
                    giraffe.setGender(s.nextLine());

                    System.out.print("Introduce the height: ");
                    giraffe.setHeight(s.nextDouble());

                    giraffe.CompareHeight();

                    zoo.getAnimals().add(giraffe);
                    flag = true;
                    break;
                case 2:
                    Crocodile crocodile = new Crocodile();
                    crocodile.setAnimalSpecies("Crocodile");

                    System.out.print("Introduce the name: ");
                    crocodile.setName(s.nextLine());

                    System.out.print("Introduce the number of legs: ");
                    crocodile.setNumberOfLegs(s.nextInt());
                    s.nextLine();

                    System.out.print("Introduce the gender: ");
                    crocodile.setGender(s.nextLine());

                    System.out.print("Introduce the number of teeth: ");
                    crocodile.setNumberOfTeeth(s.nextInt());
                    s.nextLine();

                    crocodile.FavouriteFood();

                    zoo.getAnimals().add(crocodile);
                    flag = true;
                    break;

                case 3:
                    GiantTortoise tortoise = new GiantTortoise();
                    tortoise.setAnimalSpecies("Giant Tortoise");

                    System.out.print("Introduce the name: ");
                    tortoise.setName(s.nextLine());

                    System.out.print("Introduce the number of legs: ");
                    tortoise.setNumberOfLegs(s.nextInt());
                    s.nextLine();

                    System.out.print("Introduce the gender: ");
                    tortoise.setGender(s.nextLine());

                    System.out.print("Introduce the current age: ");
                    tortoise.setCurrentAge(s.nextInt());
                    s.nextLine();

                    tortoise.RangeAge();

                    zoo.getAnimals().add(tortoise);
                    flag = true;
                    break;

                case 4:
                    Animal animal = new Animal();

                    System.out.print("Introduce the animal specie: ");
                    animal.setAnimalSpecies(s.nextLine());

                    System.out.print("Introduce the name: ");
                    animal.setName(s.nextLine());

                    System.out.print("Introduce the number of legs: ");
                    animal.setNumberOfLegs(s.nextInt());
                    s.nextLine();

                    System.out.print("Introduce the gender: ");
                    animal.setGender(s.nextLine());

                    zoo.getAnimals().add(animal);
                    flag = true;
                    break;
                default:
                    throw new AssertionError();
            }

            if (flag) {
                System.out.println("Animal added successfully!");
            } else {
                System.out.println("Oops, an error has occurred :(");
            }

        } while (flag == false);

    }

    public static void RemoveAnimals(Zoo zoo) {

        int cont = 0;
        int index = 0;
        System.out.println("List of animals: ");

        if (zoo.getAnimals().isEmpty()) {
            System.out.println("There isn't any animal yet");
        } else {
            for (Animal animal : zoo.getAnimals()) {
                cont++;
                System.out.println(cont + ") " + animal.getAnimalSpecies() + " -> " + animal.getName());
            }
            do {
                System.out.println("Please, introduce the index of the animal you want to remove");
                index = s.nextInt();

                if (index <= 0 || index > zoo.getAnimals().size()) {
                    System.out.println("Incorrect value, please try again");
                } else {
                    zoo.DeleteAnimals(index);
                    System.out.println("The animal was removed successfully");
                    break;
                }

            } while (true);

        }
    }

    public static void AnimalDetail(Zoo zoo) {

        int cont = 0;
        int index = 0;
        System.out.println("List of animals: ");

        if (zoo.getAnimals().isEmpty()) {
            System.out.println("There isn't any animal yet");
        } else {
            for (Animal animal : zoo.getAnimals()) {
                cont++;
                System.out.println(cont + ") " + animal.getAnimalSpecies() + " -> " + animal.getName());
            }

            do {
                System.out.println("Please, introduce the index to see the animals details");
                index = s.nextInt();

                if (index <= 0 || index > zoo.getAnimals().size()) {
                    System.out.println("Incorrect value, please try again");
                } else {
                    System.out.println("Details: ");
                    zoo.getAnimals().get(index - 1).ShowDetail();
                    System.out.println("---------------------------------------------");
                    break;
                }
            } while (true);
        }

    }

    public static void AllDescriptions(Zoo zoo) {

        System.out.println("List of animals: ");

        if (zoo.getAnimals().isEmpty()) {
            System.out.println("There isn't any animal yet");
        } else {
            for (Animal animal : zoo.getAnimals()) {
                System.out.println("---------------------------------------------");
                animal.ShowDetail();
                System.out.println("---------------------------------------------");
            }
        }

    }

    public static double CalculatePrice() {

        double price = 0;
        String day = "";

        do {
            System.out.print("Introduce a day of the week: ");
            day = s.nextLine();

            if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")) {
                price = 19.99;
                System.out.println("The admission price for " + day + " is: $ " + price);
                return price;
            } else if (day.equalsIgnoreCase("wednesday")) {
                price = 9.99;
                System.out.println("The admission price for " + day + " is: $ " + price);
                return price;
            } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
                price = 25.99;
                System.out.println("The admission price for " + day + " is: $ " + price);
                return price;
            } else {
                System.out.println("Please try again");
            }

        } while (true);

    }

    public static void Exit() {
        do {
            System.out.println("Are you sure you want to exit? Y/N");
            String op = s.next();
            if (op.equalsIgnoreCase("y") || op.equalsIgnoreCase("n")) {
                System.exit(0);
            } else {
                break;
            }
        } while (true);

    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        ZooInfo(zoo);
        Menu(zoo);
    }

}
