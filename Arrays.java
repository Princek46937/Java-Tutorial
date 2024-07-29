
import java.util.*;

// public class Array {
//     public static void main(String[] args) {

//         //Array 1st Type
//         // int marks[] = new int[4];

//         //2nd type
//         int marks[] = {10,20,30,40};
        
        

//         for(int i=0; i<=4; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }



//create the array of user takes an input 
// public class Arrays{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();   // we need to tell the size of element

//         System.out.println("Enter the Number:");
//         int numbers[] = new int[size];

//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

        
       
//         for(int i=0; i<numbers.length; i++){
//             System.out.println(numbers[i]);
//         }

//     }
// }


//takes a array as input from user and search for number x and print the index where x is occur

// public class Arrays{

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();

//         int number[] = new int[size];

//         System.out.println("Enter the Element");

//         for(int i=0; i<size; i++){
//             number[i] = sc.nextInt();
//         }

//         System.out.println("Enter the Searching Number");
//         int x = sc.nextInt();

//         for(int i=0; i<size; i++){
//             if(number[i] == x){
//                 System.out.println("Number at Index " + i);
//             }
//         }



//     }
// }




/*********************************************** 2D Array  ****************************************/



// public class Arrays{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter the columns");
//         int columns = sc.nextInt();

//         int number[][] = new int[rows][columns];

//         System.out.println("Enter the rows and columns");

//         //input 
//         //outer loop => rows
//         for(int i=0; i<rows; i++){
//             //inner loop => columns
//             for(int j=0; j<columns; j++){
//                 number[i][j] = sc.nextInt();
//             }
//         }


//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }


public class Arrays{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the Columns");
        int columns = sc.nextInt();

        int number[][] = new int[rows][columns];

        System.out.println("Enter the rows and columns");

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Searching Number");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(number[i][j] == x){
                    System.out.println("Element at (" + i + ", " + j + ") has value: " + number[i][j]);
                }
            }
        }
    }
}