
//     public static void towerOfHanoi(int n, String s, String h, String d){

//         //base case
//         if(n == 1){
//             System.out.println("Disk are Movoed " +  " from " + n + " to " + s + " to  " + d);
//             return;
//         }
//             towerOfHanoi(n-1, s, d, h);
//             System.out.println("Disk are Movoed " +  " from " + n + " to " + s + " to " + d);
//             towerOfHanoi(n-1, h, s, d);
            

//     }
//     public static void main(String args[]){
//         int n = 3;
//         towerOfHanoi(n, "S", "H", "D");

//     }
// }



//2. Print the reverse string "abcd"

// public class Recursion2{

//     public static void printReverse(String str, int index){

//         //base case
//         if(index == 0){
//             System.out.println(str.charAt(index));
//             return;
//         }

//         System.out.println(str.charAt(index));
//         printReverse(str, index-1);

//     }
    
//     public static void main(String[] args) {
//         printReverse("Prince", 5);
//     }
// }


//print 1st and last occurence of the string
// public class Recursion2{
//     public static int first = -1;
//     public static int last = -1;
    
//     public static void printOccurence(String str, int index, char element){

//         if(index == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         //initialize the 1st and last element

//          char currentCharacter = str.charAt(index);

//         if(currentCharacter == element){
//             if(first == -1){
//                 first = index;

//             }
//             else{
//                 last = index;
//             }
//         }
//         printOccurence(str, index+1, element);

//     }

//     public static void main(String[] args) {
//        String str = "abaacdae";
//     //    printOccurence(str, 0, "a");
//     System.out.println(printOccurence(str, 0, "a"));
//     }
// }



//Print the sorted array(strictly increasing array)

// public class Recursion2{

//     public static Boolean isSorted(int arr[], int index){


//         if(index == arr.length-1){
//             return true;
//         }
        
//         //check the current index is less than from next element index
//         if(arr[index] >= arr[index+1]){
//             //check for next unsorted element and return from there
//             return false;
//         }
//         return isSorted(arr, index+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,2,3};
//         System.out.println(isSorted(arr, 0));
//     }
// }



//Move all x to the end of the String
// public class Recursion2{

//     public static void moveAllX(String str, int index, int count, String newString){

//         //base case
//         if(index == str.length()){
//            for(int i=0; i<count; i++){
//             newString += 'x'; 
//            }
//            System.out.println(newString);
//            return;
//         }

//         //currChar of the string
//         char currChar = str.charAt(index);

//         if(currChar == 'x'){
//             count++;
//             moveAllX(str, index+1, count, newString);
//         }
//         else{
//             newString += currChar;
//             moveAllX(str, index+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, " ");
//     }
// }



//Remove Duplicates from String
// public class Recursion2{

//     //map variable => constant 
//     public static boolean map[] = new boolean[26];

//     public static void removeDuplicates(String str, int index, String newString){

//         //base case
//         if(index == str.length()){
//             System.out.println(newString);
//             return;
//         }

//         //find the currChar at specified index
//         char currChar = str.charAt(index);

//         if(map[currChar - 'a']){
//             removeDuplicates(str, index+1, newString);
//         }
//         else{
//             newString += currChar;
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, index+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDuplicates(str, 0, " ");
//     }
// }


//Subsequences of the String
// public class Recursion2{

//     public static void subsequences(String str, int index, String newString){

//         if(index == str.length()){
//             System.out.println(newString);
//             return;
//         }

//         char currChar = str.charAt(index);

//         //choice
//         subsequences(str, index+1, newString+currChar);
//         //not choice
//         subsequences(str, index+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "aaa";
//         subsequences(str, 0, "");
//     }
// }



//UnSubsequences of String 
// public class Recursion2{

//     public static void subsequences(String str, int index, String newString, HashSet<String> set){

//         //base case
//         if(index == str.length()){
//             if(set.contains(newString)){
//                 return;
//             }
//             else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }

//         char currChar = str.charAt(index);
//         //choice
//         subsequences(str, index+1, newString+currChar, set);
//         //not choice
//         subsequences(str, index+1, newString, set);
//     }
//     public static void main(String[] args) {
        
//         HashSet <String> set = new HashSet<>();
//         subsequences("aaa", 0, "", set);
//     }
// }



//Print keyPad combination
// public class Recursion2{

//     public static String map[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

//     public static void printCombination(String str, int index, String combination){

//         //base case
//         if(index == str.length()){
//             System.out.println(combination);
//             return;
//         }

//         //find the currChar
//         char currChar = str.charAt(index);
//         String mapping = map[currChar - '0'];     //mapping index

//         for(int i=0; i<mapping.length(); i++){
//             printCombination(str, index+1, combination+mapping.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         printCombination("2", 0, "");
//     }
// }


/**************************************Advanced Type Question *********************************************/
//Print Permutations of the string

// public class Recursion2{

//     public static void printPer(String str, String combination){

//         if(str.length() == 0){
//             System.out.println(combination);
//             return;
//         }

            //We will Iterate on every character and print
//         for(int i=0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             String newString = str.substring(0, i) + str.substring(i+1);

//             printPer(newString, combination+currChar);
//         }
//     }
//     public static void main(String[] args) {
//         printPer("ab", "");
//     }
// }



// public class Recursion2{
//     public static int countPaths(int i, int j, int n, int m){

//         //base case
//         if(i == n || j == m){
//             return 0;
//         }
//         if(i == n-1 && j == m-1){
//             return 1;
//         }

//         int down = countPaths(i+1, j, n, m);
//         int right = countPaths(i, j+1, n, m);

//         return down + right;
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         int m = 3;
//         System.out.println(countPaths(0, 0, n, m));
//     }
// }


//Place Tiles of size 1Xm and the size of the floor is nxm
// public class Recursion2{
//     public static int placeTiles(int n, int m){

//         if(n == m){
//             return 2;
//         }

//         if(n < m){
//             return 1;
//         }

//         //vertically
//         int vertically = placeTiles(n-m, m);

//         //horizontally
//         int horizontally = placeTiles(n-1, m);

//         return vertically + horizontally;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int m = 2;

//         System.out.println(placeTiles(n, m));
//     }
// }


//Find the number of ways in which you can invite n people to your party single or pair

public class Recursion2{
    public static int guestInvite(int n){

        if(n<=1){
            return 1;
        }

        //only single person
        int ways1 = guestInvite(n-1);
        
        //with pair => single * next person is coming
        int ways2 = (n-1) * guestInvite(n-2);

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(guestInvite(n));
    }
}