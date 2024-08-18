// Name of class must match Java file
public class Hello{
    public static void main(String[] args){
        // System.out.println("Hello World");

        // Variable types
        // string, int, float, double, char, boolean
        // 1111 1111 --> 2147483647 + 1 --> overflow
        // int and float hold up to 8 bits 
        // double hold up to 16 bits
        // type cast --> converting a variable type to another
        int x = 5;  
        double z = (double)x;    
        double y = 3.5; 
        // 'a' != "a"
        String sample_string = "a"; // String is 8 bits 
        char sample_char = 'a';     // char is 1 bit 
        boolean correct1 = true;
        boolean correct2 = false;

        // Operators
        // + - * / %
        System.out.println(x);
        System.out.print(x);
        --x;    // decrement before the x takes place
        x--;    // decrement after x take place
        System.out.println(x);

        // Comparators 
        // and - true and true --> True
        // and - true and false --> False
        // or - at least one is true
        if (correct1 && correct2){
            System.out.println("Correct");
        }
        else if (correct1) {
            System.out.println(correct1);
        }
        else{
            System.out.println("Not correct");
        }

        // binary and or operator - & | 
        // 1 & 0 --> 0
        // 1 | 0 --> 1
        // 1001 | 1000 --> 1001
        // 1001 & 1000 --> 1000

        // Loops
        // for(starting_index; ending condition; increment){

        // }

        // Print all the odd numbers from 0-10
        // for(int i = 0; i <= 2; i++){
        //     System.out.println();
        //     for(int j = 0; j < 3; j++){
        //         System.out.print(1 + " ");
        //     }
        // }

        // while(condition){

        // }
        // int i = 0;
        // while(i < 3){
        //     System.out.println();
        //     int j = 0;
        //     while(j < 3){
        //         System.out.print(1);
        //         j++;
        //     }
        //     i++;
        // }

        // 1 1 1
        // 1 1 1
        // 1 1 1

        // BUILT-IN FUNCTIONS
        // Strings

        String sampleTxt = "This is a sentence!";
        int lengthOfTxt = sampleTxt.length();
        String sampleTxtLower = sampleTxt.toLowerCase();
        String sampleTxtUpper = sampleTxt.toUpperCase();
        int sampleTxtIndex = sampleTxt.indexOf("!");
        

        System.out.println(lengthOfTxt);
        System.out.println(sampleTxtLower);
        System.out.println(sampleTxtUpper);
        System.out.println(sampleTxtIndex);

        // MATH FUNCTIONS
        int maxNumber = Math.max(5, 10);
        int minNumber = Math.min(5, 10);
        int absNumber = Math.abs(-62);
        double sqrtNumber = Math.sqrt(64);
        int randonNumber = (int)(Math.random() * 100); // 0 to 1
        
        System.out.println(maxNumber);
        System.out.println(minNumber);
        System.out.println(absNumber);
        System.out.println(sqrtNumber);
        System.out.println(randonNumber);


        // SAMPLE EXERCISE
        // GIVEN A STRING: PRINT the reversed string but skip letter 'l'
        // Input: Hello
        // Outout: oeH
        String input = "Hello";
        String output = "";
        

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != 'l')
                output = input.charAt(i) + output; 
            else
                continue;
        }
        System.out.println(output);


        // Arrays 
        // in Python: numArray = []
        // Array of int numbers
        String[] stringArray = {"hello", "bye", "welcome"};
        int[] numArray = {10, 20, 30, 40, 50, 60, 70};

        // to get length of array
        int arrayLength = stringArray.length;
        stringArray[0] = "NotHello";

        System.out.println(stringArray[0]);
        System.out.println(numArray[1]);
        System.out.println(arrayLength);

        // EXERCISE: calculate the sum of numArray as well as the average
        // Additional info: Print smallest and largest number in array
        // Output: "The sum is XXX"
        //         "The avg is YYY"
        //         "The smallest number is X"
        //         "The largest number is Y"
        int sum = 0;
        int length = numArray.length;
        int avg; 

        for(int i = 0; i < numArray.length; i++){
            sum += numArray[i];
        }

        avg = sum / length;
        System.out.println("The sum is " + sum);
        System.out.println("The avg is " + avg);

        // 2-D Arrays
        
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6, 7}};

        int twoDArrayLength = twoDArray.length;

        // System.out.println(twoDArrayLength);
        // System.out.println(twoDArray[0][2]);

        // for(int i = 0; i < twoDArray.length; i++){
        //     for(int j = 0; j < twoDArray[i].length; j++){
        //         System.out.println(twoDArray[i][j]);
        //     }
        // }

        // Calling method here 
        System.out.println(helloWorld("Joe", 9));
        helloWorld(9);

    }

    // METHODS - Function
    // A block of code that is only ran once when called
    // Scope - a block of code that belongs within a method 
    public static String helloWorld(String fname, int age){
        String statement = fname + " is " + age;
        return statement;
    }

    // Method overloading
    public static void helloWorld(int age){
        int statement = age;
        System.out.println(statement);
    }

    // Exercise: Create two methods, both called math()
    // one does addition
    // while the other subtraction

}

// this is a comment

// Java is a compiler language
// Python is a interpreter language


// HANDWRITTEN CODE --> COMPILER --> MACHINE CODE (1/0)s --> EXECUTE
