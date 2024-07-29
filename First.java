// public class First {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
// }


// Pattern
// public class First{
//     public static void main(String[] args){
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// }


// Variables in java   => By default variable store in memory with some value based on type =>
//  int - 0, object- null, float - 0.0, string - ""
// public class First{
//     public static void main(String[] args){
//         int a = 20;
//         int b = 12;
//         int sum = a + b;
//         System.out.println(sum);
//         int diff = b - a;
//         System.out.println(diff);
//         int mul = a*b;
//         System.out.println(mul);
        
//     }
// }



//Input from user

// we need to import this package 
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value a");
//         int a = sc.nextInt();
//         System.out.println("Enter the value b");
//         int b = sc.nextInt();
//         System.out.println("sum of a and b is");
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }


//Conditional Statement
// public class First{
//     public static void main(String[] args){
//         //we need to take input from user
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the age");
//         int age = sc.nextInt();
//         if(age > 18){
//             System.out.println("You are eligible to vote");
//         }
//         else{
//             System.out.println("You are not eligible to vote");
//         }

//     }
// }


//Lopps 
// public class First{
//     public static void main(String[] args){
//         // for(int i = 0; i < 10; i=i+1){
//         //     System.out.println(i);
//         // }

//         // While Loops
//         // int i = 0;
//         // while(i < 10){
//         //     System.out.println(i);
//         //     i = i + 1;
//         // }

//         // do-while => if the condition is true or false it will execute one time compulsory
//         // int i =0; 
//         // do { 
//         //     System.out.println(i);
//         //     i = i + 1;
//         // } while (i<10);
//     }
// }



//Functions
public class First{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        String name = "Prince";
        printMyName(name);
    }
}