import java.util.Arrays;

public class MoveZeroes{

  /* Create an algo that moves all the zeros in a given array to the end in place

    Input: [1,0,1,1,1,0,0,0,1]
    Output: [1,1,1,1,1,0,0,0,0]

   */

   public static void moveZeros(int[] arr){
    int count = 0;

    for(int i = 0; i < arr.length; i++){
      if(arr[i] != 0){
        arr[count] = arr[i];
        count++;
      }
    }
    while(count < arr.length){
      arr[count] = 0;
      count++;
    }
   
   }

   public static void main(String[] args) {
    int[] arr = new int[] {1, 1, 0, 0, 0, 1, 0};
    System.out.println(Arrays.toString(arr));
    moveZeros(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();
   }

}