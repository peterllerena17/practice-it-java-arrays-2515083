import java.util.Arrays;

public class Reverse {

  /*
   * Create a program that reverses an array in place
   * 
   * Keep in mind it says in place so a new array cannot be created
   */

   public static void reverse(int[] arr){

    // 1,2,3,4
    // 4,2,3,1
    // 4,3,2,1

    for(int i = 0; i < arr.length / 2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
   }


   public static void main(String[] args) {
    int[] arr = new int[] {};
    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();

    int[] arr2 = new int[] {1};
    System.out.println(Arrays.toString(arr2));
    reverse(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();

    int[] arr3 = new int[] {1,2,3,4,5};
    System.out.println(Arrays.toString(arr3));
    reverse(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();
    
   }

  
}
