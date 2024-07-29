

//     public static int calculateAverage(int a, int b, int c){

//         return  (a + b + c)/3;
        
//     }

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int average = calculateAverage(a, b, c);
//         System.out.println("Average of The Number a b and c is "  + average);
//     }
// }


//2. Write the function to print the sum of all odd numbers from 1 to n

// public class FunQues{

//     public static int sumOfOddNumber(int n){

//         int num = 0;
//         for(int i=1; i<=n; i++){
//             if(i%2 != 0){         // it means remainder should not be 0 then it odd !=0
//                 num = num + i;    // if i is odd then it add to num
//             }
//         }
//         return num;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n + sumOfOddNumber(n) );
//     }
// }


//3.write a function which takes two number and return greater of those two

// public class FunQues{

//     public static int getGreater(int a, int b){

//         if(a>b){
//             //if a is greater is will exit from here
//             return a;
//         }
//         else{
//             // if not it will come in else and restrn b
//             return b;
//         }
//     }

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = sc.nextInt(); 
        
//         // int num = getGreater(n, m);

//         System.out.println("greater Number Between " + n + " and " + m + " is " +getGreater(m, m));
//     }
// }


// 4. Write a function which takes radius as input and return circumference of circle

// public class FunQues{

//     public static double circumferenceOfCircle(int r){
//         return 2 * 3.14 * r;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter The Radius");
//         int r = sc.nextInt();

//         double circumferenceCircle = circumferenceOfCircle(r);   //double => any number integer aor decimal
//         System.out.println("Circumference of Circle is " + circumferenceCircle);

//     }
// }


//write the function where check if the person is eligible or not 

// public class FunQues{

//     public static int personEligibleOrNot(int n){

//         if(n>18){
//             System.out.println("Person is Eligible");
//         }
//         else{
//             System.out.println("Not eligible");
//         }
//         return n;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         personEligibleOrNot(n);
        
//     }
// }


//write an infinite loop using do while condition
// public class FunQues{

//     public static void main(String[] args) {
//         do { 
//             System.out.println("This is Infinite Lopp \n");
//         } while (true);
        
//     }
// }


//Write a program to enter the number till the user wants and at the end it should display the count of positive,negative 
// and zero
// import java.util.*;

// public class FunQues{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         //user want next number yes or no
//         String choice;
//         do { 
//             System.out.println("Enter the Number");
//             int n = scanner.nextInt();

//             if(n>0){
//                 positiveCount++;
//             }
//             else if(n<0){
//                 negativeCount++;
//             }
//             else{
//                 zeroCount++;
//             }
//             System.out.println("User Want Another Number yes or no");
//             choice = scanner.next();
//         } while (choice.equalsIgnoreCase("no")); //user put yes loop continues and put no loop terminates


//         System.out.println("Poaitive Number" + positiveCount);
//         System.out.println("Negative Number" + negativeCount);
//         System.out.println("Zero Number" + zeroCount);


//         scanner.close();
//     }
// }

// 8. two numbers are entered by the user x and n write the function to find the value of one number raised to the power of another
// public class FunQues{
    
//     public static double powerOfNumber(int x, int n){
//          return Math.pow(x, n);  //power of number 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int x = sc.nextInt();
//         int n = sc.nextInt();

//         double powerNumber = powerOfNumber(x, n);
//         System.out.println(powerNumber);
//     }
// }


// 9. write the function that calculates the greatest common division of 2 numbers

// public class FunQues{
//     public static int greatesCommonDivision(int a, int b){
//         while(b != 0){   
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

        
//         System.out.println(greatesCommonDivision(num1, num2));
//     }
// }
