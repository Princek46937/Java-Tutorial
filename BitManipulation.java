
import java.util.Scanner;



        // Get Bit
        /*
         1. bitMask
         2. Operation AND
         */


        // int n = 5; //0101
        // int position = 3; //0011
        // int bitMask = 1<<position;

        // if((bitMask & n) == 0){
        //     System.out.println("Bit was Zero");
        // }
        // else{
        //     System.out.println("Bit was One");
        // }


        //Set Bit
        /*
         1. bitMask
         2. Operation OR |
         */
        // int n = 5;
        // int position = 1;

        // int bitMask = 1<<position;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //Clear Bit
        /*
         1. bitMask
         2. Operation AND with N0T
         */
        // int n = 5;
        // int position = 2;
        // int bitMask = 1<<position;

        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);


        //Update Bit
        /*
         1. Bit : 1 => set bit
         2. Bit : 0 => Clear Bit
         */
        // Scanner sc = new Scanner(System.in);
        // int operation = sc.nextInt();
        // //opeartion 1 : set bit   operation 0 : clear bit
        // int n = 5;
        // int position = 1;

        // if(operation == 1){
        //     //set bit
        //     int bitMask = 1<<position;
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // }
        // else{
        //     int bitMask = 1<<position;
        //     int notBitMask = ~(bitMask);

        //     int newNumber = notBitMask & n;
        //     System.out.println(newNumber);
        // }


