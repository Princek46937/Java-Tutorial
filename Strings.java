
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the name");
//         String name = sc.nextLine();
//         // System.out.println(name);

//         //Print all the letter one by one
//         for(int i=0; i<name.length(); i++){
//             System.out.println(name.charAt(i));       
//         }
//     }
// }


// public class Strings{
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);

//         // String name1 = sc.nextLine();

//         // String name2 = sc.nextLine();
        
//         //Concatenation  => add two string
//         // String sumOfTwoString = name1 + name2;
//         // System.out.println(sumOfTwoString);

//         //Compare of two string
//         // if(name1.compareTo(name2) == 0){
//         //     System.out.println("String are equal");
//         // }
//         // else{
//         //     System.out.println("String are not equal");
//         // }


//         //SubString
//         String str1 = "My name is Prince";
//         System.out.println(str1.substring(7,10));


//         //Strings are immutable => we can not changed once the string are store in memory
//     }
// }

import java.util.Scanner;

/***************************************** StringBuilder  ****************************************/

// public class Strings{
//     public static void main(String[] args) {

//         StringBuilder sb = new StringBuilder("Prince");
//         System.out.println(sb);

//         //find character at index 1
//         System.out.println(sb.charAt(1));

//         //set char at 1 index
//         sb.setCharAt(1, 'a');
//         System.out.println(sb);

//         //insert element at index
//         sb.insert(2, "n");
//         System.out.println(sb);
//     }
// }


//Reverse the String

// public class Strings{
//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("hello");

//         for(int i=0; i<str.length()/2; i++){
//             int front = i;
//             int back = str.length()-1-i; // total length-1-i(index at every place)
            
//             //find the character at that place using charAt() => specific index
//             char frontChar = str.charAt(front);
//             char backChar = str.charAt(back);
            
//             //set charcater 
//             str.setCharAt(front, backChar);
//             str.setCharAt(back, frontChar);   
//         }
//         System.out.println(str);
//     }
// }


//take the input string from user and reverse it
// public class Strings{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         System.out.println("Enter the Character");

//         for (int i = 0; i < str.length(); i++) {
//             System.out.print("Enter character " + (i + 1) + ": ");
//             char ch = sc.next().charAt(0);
//             System.out.println("You entered: " + ch);
//         }
//         sc.close();
//     }
// }