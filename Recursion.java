

//     public static void printNumber(int n){

//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNumber(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;

//         printNumber(n);
//     }
// }


//Print Number from 1 to 5
// public class Recursion{

//     public static void printNum(int n){

//         if(n >=6){
//             return;
//         }
//         System.out.println(n);
//         //inner function do rest of the work
//         printNum(n + 1);
//     }
//     public static void main(String[] args) {
//         int n = 1;

//         printNum(n);

//     }
// }


//Print sum of first n Natural Number
// public class Recursion{

//     public static void printSum(int i, int n, int sum){

//         //base case
//         if(i == n){
//             sum = sum + i;
//             System.out.println(sum);
//             return;
//         }
//         sum = sum + i;
//         printSum(i+1, n, sum);
//     }

//     //main function
//     public static void main(String[] args) {
//         printSum(1, 6, 0);  //work done
//     }
// }


//Print the factorial of the number
// public class Recursion{

//     public static int printfactorial(int n){

//         if(n == 1 || n == 0){
//             return 1;
//         }
//         else{
//             int factorial_nm1 = printfactorial(n-1);
//             int factorial = n * factorial_nm1;
//             return factorial;  
//         }
//     }
//     public static void main(String[] args) {

//         System.out.println(printfactorial(3));
//     }
// }


//Print the fibinacci series from 1 to n

//using iteration 
// public class Recursion{
//     public static void main(String args[]){

//         //no of terms define
//         int n = 10;
//         //initialize the first term and second term
//         int firstTerm = 0;
//         int secondTerm = 1;

//         for(int i = 0; i<=n; i++){
//             System.out.println(firstTerm + " ");

//             int nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;
//         }

//     }
// }


//Using Recursion
// public class Recursion{

//     public static void printfib(int firstTerm, int secondTerm, int n){

//         if( n == 0){
//             return;
//         }
//         int nextTerm = firstTerm + secondTerm;
//         System.out.println(nextTerm);
//         printfib(secondTerm, nextTerm, n-1);

//     }

//     public static void main(String[] args) {
//         int firstTerm = 0;
//         int secondTerm = 1;
//         System.out.println(firstTerm);
//         System.out.println(secondTerm);

//         int n = 10;

//         //2 term is already print
//         printfib(firstTerm, secondTerm, n-2);
//     }
// }


//Prince x^n (Stack Height => n)
//Stack Height = currently number of element stored in stack 

// public class Recursion{

//     public static int calculatePower(int x, int n){

//         //base case
//         if(n == 0){
//             return 1;
//         }
//         if(x == 0){
//             return 0;
//         }

//         int Xpnm1 = calculatePower(x, n-1);
//         int xPower = x * Xpnm1;
//         return xPower;
//     }
//     public static void main(String args[]){
//         System.out.println(calculatePower(2, 5));
//     }
// }


//Print x^n (Stack Height = logn)
public class Recursion {

    public static int calculatePower(int x, int n){

        //Base case
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        //check if n is even
        if(n % 2 == 0){
            return calculatePower(x, n/2) * calculatePower(x, n/2) ;
        }
        else{
            //check if x is odd
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }

    public static void main(String args[]){

        //Given
        int x = 2;
        int n = 5;
        int ans = calculatePower(x, n);
        System.out.println("power is " + ans);
    }
}