
import java.util.Arrays;



public class JavaExercises {
    public static void main(String[] args) {
        final int arr[] = {10, 300, 45, 90, 9800};
        JavaMethods methodObj = new JavaMethods();
        methodObj.RemoveDuplicates();
        System.out.println(methodObj.isPrime(19));

        methodObj.getChange(5.00, 2.26);
        
    }
}

// This is to store all of our exercises to be ran
class JavaMethods{
    // Exercise #1: Write a method that finds the largest and smallest 
    // element in an array
    void minMaxNum(int[] arr){
        int answer[] = {10, 10};
    }

    // Exercises #2: Given a sorted array, remove all duplicates
    // and return the new modified array
    // {1, 1, 2, 2, 3, 4, 5, 5}
    // {1, 2, 3, 4, 5}

    void RemoveDuplicates(){
        int array[] = {1, 1, 2, 2, 3, 4, 5, 5};
        int [] answer = new int[array.length]; // {0, 0, 0....}
        int j = 0;

        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i + 1]){
                answer[j++] = array[i];
            }
        }
        answer[j++] = array[array.length-1];

        int[] uniqueArray = Arrays.copyOf(answer, j);
        System.out.println(Arrays.toString(uniqueArray));
    }

    // Exercises #3: Given a number, return true if the number is prime
    // else return false
    boolean isPrime(int num){
        int sample = 29;
        // check divisibility from 2 up to the sqrt of that number
        double sqrt = Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    // Exercises #4: Cash register change program
    // Given a specific amount, inputs a number, return the change
    // in numer of dollar bills, quarters, dimes, nickels, and pennies
    void getChange(double amountGiven, double cost){

        // WRITE CODE HERE
        // change = number of pennies in change
        int change = (int)Math.round(((amountGiven - cost)* 100));

        // 225 --> ones, rest of it 
        // 225 / 100 = ones 
        // 225 %= 100 = rest of it
        int ones = change / 100;
        change %= 100; 
        int quarters = change / 25;
        change %= 25;
        int dimes = change / 10;
        change %= 10;
        int nickels = change / 5;
        change %= 5;
        int pennies = change;

        if(ones > 0){
            System.out.println("Number of dollar bills: " + ones);
        }
        if(quarters > 0){
            System.out.println("Number of quarters: " + quarters);
        }
        if(dimes > 0){
            System.out.println("Number of dimes: " + dimes);
        }
        if(nickels > 0){
            System.out.println("Number of nickels: " + nickels);
        }
        if(pennies > 0){
            System.out.println("Number of pennies: " + pennies);
        }
    }
}
