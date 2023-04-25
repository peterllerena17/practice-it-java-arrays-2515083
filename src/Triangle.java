public class Triangle {
  /*
   * Create a program that displays a right traingle with the contents of an array
   * 
   * Input: {1,2,3,4}         
   * Output: 
   * 1
   * 12
   * 123
   * 1234
   * 
   * 
   * Input: {A,B,C}
   * Output:
   * A
   * AB
   * ABC
   * 
   * Input: {1}
   * Output: 1
   *
   */
  public static void printTriangle(Object[] arr){

    for(int row = 0; row < arr.length; row++){
      for(int col = 0; col <= row; col++){
        System.out.print(arr[col]);
      }
      System.out.println();
    }
    System.out.println();
  }





  public static void main(String[] args) {

    printTriangle(new Integer[] {1,2,3,4});
    printTriangle(new Character[] {'A', 'B', 'C', 'D', 'E'});
    printTriangle(new String[] {});
    printTriangle(new String[] {"Hello"});
    printTriangle(new String[] {"Hello", "There", "Friend"});

    
  }
  
}
