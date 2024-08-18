// Create a simple calculator program that takes in two operand 
// and one operator using classes 
// 1. Class named Calculator (constructor method)
// 2. 4 class methods (add, sub, mul, div)
// 3. Create an object of that class and use each of those methods

public class Calculator{
    public static void main(String[] args) {
        // create an object
        // call one of the methods 

    }
}


class CalculatorProgram{
    int num1;  // class attributes
    int num2;  // class attributes
    public CalculatorProgram(int num1, int num2){
        this.num1 = num1;   // this. ensures that im updating 
        this.num2 = num2;   // the class attributes, not parameter
    }
    public int add(){
        return 5;
    }
}

// added comment

// 1 1 0 1
// 1 1 1 1
// 0 0 1 0 // xor ^
// 1 1 1 1 // or  |
// 1 1 0 1 // and &
