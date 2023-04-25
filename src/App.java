import java.util.Arrays;

public class App {

  public static void main(String[] args) {


    // creating new arrays
    double[] lotteryNums = new double[5];
    double[] lotteryNums2 = { 1, 2, 4, 5, 6 };

    System.out.println(lotteryNums2[2]);

    // assinging new value to index 2
    lotteryNums2[2] = 40;
    System.out.println(lotteryNums2[2]);

    //iteration
    for(int i = 0; i < lotteryNums2.length; i++){
      System.out.println(lotteryNums2[i]);
    }
    System.out.println();

    //for each loop
    for(double j : lotteryNums2){
      System.out.println(j);
    }
    System.out.println();


    //using streams
    Arrays.stream(lotteryNums2).forEach(System.out::println);

    
  }
}