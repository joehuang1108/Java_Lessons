public class Main {
    // Class Attributes
    final double pi = 3.14;
    static int x = 5;
    int y = 7;

    // Constructors - initialize methods
    // This a constructor method 
    // Constructor method is called whenever an object of the class is made
    public Main(int num){
        x = num;
    }

    public Main(String name){
        System.out.println("Hi my name is " + name);
    }

    // Task #1: Make a method that changes X by +1
    public final void plusOne(){
        x += 1;
    }

    // Class Method
    public void helloWorld(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // Task #2: Create an object of Main class and access all the methods
        // Call helloWorld
        // Call plusOne
        // {ClassName} {objectName} = new {ConstructorMethod}
        Main obj = new Main(5);
        obj.helloWorld();
        obj.x += 1;
        System.out.println(obj.x);

        Main obj2 = new Main("Joe");
        System.out.println(obj2.x);
    }

    // MODIFIERS
    // Access Modifiers     - controls the access level
    // Non-Access Modifiers - do not control access level but provides funct.

    // Access Modifiers 
    // public - This class is accessible by any other class
    // private - This code is only accessible within the declared class
    // protected - This code is only accessible within the same subclasses

    // Non-Access Modifiers
    // final - Attribute/Method cannot be modified
    // static - this attribute/method belongs to the class and not the object

    // Encapsulation
}
