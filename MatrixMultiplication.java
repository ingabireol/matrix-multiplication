import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

    //function to multiply two arrays
    public int[][] multiplyArrays(int[][] array1,int[][] array2){
        //check if arrays are not empty
        if(array1 == null || array2 == null){
            System.out.println("Invalid arrays");
            return null;
        }
        //first chck if multiplication is possible by checkin if the two arrays are arbitrary
        if(array1[0].length != array2.length){
            System.out.println("Columns of array 1 must equal to Rows of array 2");
            return null;
        }
        int rows1 = array1.length;
        int cols1 = array1[0].length;

        int cols2 = array2[0].length;
        //declare the array to get the result of multiplication and initialize with size of array1 rows and
        // cols of array 2
        int[][] multipliedArray = new int[rows1][cols2];
        // create a nested loop to access the indices of the multiplied matrix
        for(int i = 0; i< rows1;i++){
            //loop to access the columns
            for(int j =0; j< cols2;j++ ){
                //initialize the current element to zero
                multipliedArray[i][j] = 0;
                for(int k =0; k < cols1;k++){
                    multipliedArray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        //return the multipied matrix
        return multipliedArray;
    }

    //create a function to populate data into arrays
    public int populateArray(int[][] array){

        //check if the array is valid and not null
        if(array == null || array.length ==0){
            System.out.println("Array is invalid");
            return -1;
        }
        int rows = array.length;
        int cols = array[0].length;

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< rows;i++){
            System.out.println("Input in "+i+"th row: ");
            for(int j = 0;j < cols; j++){
                String input = scanner.next();
                //check in all input are numbers
                if(!isInputValid(input)) {
                    System.out.println("Invalid input");
                    return -1;
                }
                array[i][j] = Integer.parseInt(input);
            }
        }
        return 1;
    }
    //create a function check if input characters are number using a regex
    public boolean isInputValid(String input){
        return input.matches("\\d+");
    }

    //function to print the array
    public void printArray(int[][] array){
        if(array == null) {
            System.out.println("Invalid array");
            return;
        }
        int cols = array[0].length;
        for (int[] ints : array) {
            System.out.print("| ");
            for (int j = 0; j < cols; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println("|");
        }
    }
}
