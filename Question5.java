import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    int n,maxCount = 0, mode = 0, count = 0;
    int numbers[] = {1,2,2,3,4};
    for (int i=0; i < numbers.length; i++){
      count = 0;
      for (int j = 0; j < numbers.length; j++){
        if (numbers[i] == numbers[j]{
          count++;
        }
      }
      if (count > maxCount){
        mode = numbers[i];
        maxCount = count;
      }
    }
    
    System.out.println("The mode is: " +mode);
  }
}
