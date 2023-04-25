import java.util.Arrays;

public class Rotate {
  /*
   * Create a program that rotates the contents of an array to the right, returning a new array
   * 
   * Input: {1,2,3,4,5}
   * Output: {5,1,2,3,4}
   * 
   * Input: {5,1,2,3,4}
   * Output: {4,5,1,2,3}
   */


  public static Object[] rotateRight(Object[] arr){

    Object[] result = new Object[arr.length];
    for(int i = 0; i < arr.length; i++){
      result[(i+1) % result.length] = arr[i];
    }
    return result;
  }
  
  public static void main(String[] args) {

    Object[] arr = new Integer[] {1,2,3,4,5};

    System.out.println(Arrays.toString(arr));
    
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));

    
  }
  
}
