import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    double height = 1.7;
    int weight = 58;
    double BMI = weight / (height * height);
      System.out.print(BMI);
  }
}
