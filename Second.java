import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // Make an object of Mammals Class + call breathe method
        // Make an object of Dog Class + call leg method + call breathe method
        // Make an object of Cat Class + call breathe method

        // Mammals mammalObj = new Mammals();
        // mammalObj.breathe();
        
        Dog dogObj = new Dog();
        dogObj.legs();
        dogObj.breathe();   // calling from mammals class

        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter your grade level: ");

        // String name = objScanner.nextLine();
        int grade = objScanner.nextInt();
        System.out.println(grade);

        // Switch CASE
        switch(grade){
            case 9:
                // do something
                System.out.println("You're a freshman");
                break;
            case 10:
                // do something
                System.out.println("You're a sophomore");
                break;
            case 11:
                // do something
                System.out.println("You're a junior");
                break;
            case 12:
                // do something
                System.out.println("You're a senior");
                break;
            default:
                System.out.println("You don't belong here");
                break;
            
        }

        // Cats catObj = new Cats();
        // catObj.breathe();   // calling from cats class
        // catObj.legs();      // calling from dog class
    }
}

// Mammals --> Dog --> Cats

// Abstract class only allows you to access the class through (inheritance or polymorphism)
// Security --> to hide details and only show the important details 

abstract class Mammals{  // parent class
    public void breathe(){
        System.out.println("This animal breathes");
    }
    class InnerMammals{
        public void eat(){
            System.out.println("This animal eats");
        }
    }
}

// Inheritance class
class Dog extends Mammals{
    public void legs(){
        System.out.println("This animal has 4 legs");
    }
}

// Polymorphism -- Modify preexisting functionalities
class Cats extends Dog{
    public void breathe(){
        System.out.println("This animal meows");
    }
}




