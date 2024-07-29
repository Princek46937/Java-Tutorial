
import java.util.Scanner;



// //CALCULATOR

// //char operation = sc.next().charAt(0)
// //This lines means 
// // sc.next() => it takes next input token from user
// // .charAt(0) => it takes first character of the token and starting with 0 index
// // char is used it assign to the first character of sting


// public class Typical{
//     public static void main(String[] args) {

//         //We need to take input by using this Scanner object this is coming from pakages 
//         Scanner sc = new Scanner(System.in);

//         //Enter the value a
//         System.out.println("Enter the value of a");
        
//         double a = sc.nextDouble();  // double => used to long range integer and decimal value

//         //Enter the value b
//         System.out.println("Enter the value of b");
//         double b = sc.nextDouble();

//         //search for operation we performed
//         System.out.println("Enter the operation you want to perform (/,*,+,-)");
//         char operation = sc.next().charAt(0);

//         // System.out.println(operation);

//         double result;

//         if(operation == '+'){
//             result = a + b;
//             System.out.println(result);
//         }
//         else if(operation == '-'){
//             result = a - b;
//             System.out.println(result);
//         }
//         else if(operation == '*'){
//             result = a*b;
//             System.out.println(result);
//         }
//         else if(operation == '/'){
//             result = a/b;
//             System.out.println(result);
//         }
//         else{
//             System.out.println("Invalid Operation");
//         }
//     }
// }

//PATTERN QUESTION

//Print the pattern 
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// public class Typical{
//     public static void main(String[] args) {
       
//         //Outer loop
//         for(int i=1; i<=4; i++){
//             //Inner loop
//             for(int j=1; j<=4; j++){
//                 System.out.print(" * ");
//             }
//             System.out.println(" * ");
//         }

//     }
// }


//Print the Pattern

// ****
// *  *
// *  *
// ****
 
// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         for(int i=1; i<=4; i++){
//             //inner loop
//             for(int j=1; j<=4; j++){
//                 if(i==1 || j==1 || i==4 || j==4){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(" ");
//     }
// }
// }


//Print the Pattern => Half Pyramid
// *
// **
// ***
// ****


// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         for(int i=1; i<=4; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//     }
// }
// }


// 5. Print the patter
// ****
// ***
// **
// *

// public class Typical{
//     public static void main(String[] args) {
//         //oute loop i => 4 to 1 => opposite
//         for(int i=4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }


// 6. Print the Pattern
//    *
//   **
//  ***
// **** 

// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         for(int i=1; i<=4; i++){
//             //inner loop => space print
//             for(int j=1; j<=4-i; j++){
//                 System.out.print(" ");
//             }
//             //inner loop => star print
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//     }
// }
// }


// 7. Print the Pattern with number
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// 8.Print 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         for(int i=5; i>=1; i--){
//             //inner loop => space print
//             for(int j=1; j<=5-i; j++){
//                 System.out.print("");
//             }
//             //inner loop => number print
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//9. Print
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         int number = 1;
//         for(int i=1; i<=5; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }


// public class Typical{
//     public static void main(String[] args) {
//         //outer loop
//         for(int i=1; i<=5; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 int sum = i+j;
//                 if(sum % 2 == 0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//Factorial of the number
public class Typical{
   
    public static void calculateFactorial(int n){
        
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        //loop
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
            
        }
        System.out.println("Factoial of the Number" + n + factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number n");
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}
