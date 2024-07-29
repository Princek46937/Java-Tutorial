

// Bubble sort
// public class Sorting{

//     public static void printNumber(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[] = {5,8,3,2,1};

//         //bubble sort =>  Heavy Element at the last => Compare the two adjacent element
//         for(int i=0; i<arr.length-1; i++){
//             //one element is sorted
//             for(int j=0; j<arr.length-i-1; j++){
//                 //check current index element is > next index elemet
//                 if(arr[j] > arr[j+1]){
//                     //swap the value
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printNumber(arr);
//     }
// }





//Selection Sort
// public class Sorting{

//     public static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {64,25,12,22,11};

//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[smallest] > arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }
// }


//Insertion sort
// public class Sorting{

//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,8,3,1,2};

//         //insertion sort 
//         //outer loop => start from second element
//         for(int i=1; i<arr.length; i++){
//             //initialize the current value
//             int current = arr[i];
//             int j = i-1;
//             while(j >=0 && arr[j] > current){
//                 arr[j+1] = arr[j]; //it shift to the right
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }


