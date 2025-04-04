import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instantiate the  matrixMultiplication class to use into methods
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to matrix multiplication");
        // input the array 1 rows
        System.out.println("How many Array 1 rows");
        String input = scanner.next();
        //check if the inputs are valid
        if(!matrixMultiplication.isInputValid(input)){
            System.out.println("Invalid input");
            return;
        }
        int rows = Integer.parseInt(input);
        System.out.println("How many Array 1 columns");
        input = scanner.next();
        if(!matrixMultiplication.isInputValid(input)){
            System.out.println("Invalid input");
            return;
        }
        int cols1 = Integer.parseInt(input);
        int[][] array1 = new int[rows][cols1];
        System.out.println("Enter array 2 Columns");
        input = scanner.next();
        if(!matrixMultiplication.isInputValid(input)){
            System.out.println("Invalid input");
            return;
        }
        int cols2 = Integer.parseInt(input);
        int[][] array2 = new int[cols1][cols2];
        System.out.println("Input elements in first array");
        //Input elements in the arrays
        matrixMultiplication.populateArray(array1);
        System.out.println("Input elements in second array");
        matrixMultiplication.populateArray(array2);
        //multiply the arrays
        int[][] multipliedArray = matrixMultiplication.multiplyArrays(array1,array2);
        //print the result in the console
        matrixMultiplication.printArray(multipliedArray);
    }
}
