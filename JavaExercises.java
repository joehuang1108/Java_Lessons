
import java.util.Arrays;



public class JavaExercises {
    public static void main(String[] args) {
        final int arr[] = {10, 300, 45, 90, 9800};
        JavaMethods methodObj = new JavaMethods();
        methodObj.RemoveDuplicates();
        
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
        int [] answer = new int[array.length]; // {1, 0, 0....}
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
    
}