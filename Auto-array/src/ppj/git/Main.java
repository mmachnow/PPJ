package ppj.git;
/**
 *<h1>An array auto-filling with int values by "for" loop - homework for PPJ</h1>
 * @author Michal Machnowski
 * @version v.0.98
 * @since 2019-10-10
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* In "public static void main" the "main" body (Java method) of a program is stored.
		 * "public" stands for an access modifier, "static" will make the method relate to itself
		 * "void" is a modifier which provides a method without any values.
		 * "String[] args" configures the "main" method
		 * to use an array of Strings. In Java the "[]" operator generally denotes
		 * usage of an array of some kind.
		 */
		int[] n = new int[6];
		/* "int[]" declares demand for an int array
		 * "new int[6]" defines the size of array. 6 rows in this case.
		 */
        for (int i = 0; i <=5; i++){
            /* This will continue filling an array with values
             * between and including 0 and 5.
             * "i++" will add "1" to the value with each iteration.
             */
            for(int j = 0; j <= i; j++)
            	/* This is to fill an array with numbers from 0 to the one defined
            	 * as a maximum value in an outer loop of the current iteration.
            	 */
            {
            	if (j == 0)
                   System.out.print("" + j);
                   /* If the value of j equals 0 it will print
                    * nothing ("") with j itself added - in this case a 0.
                    */
                   else
                    System.out.print(", " + j); 
              /* If original "if" is not true the "j" value will be printed 
               * proceded by a "comma and a space".
               */
              /* System.out.print((j == 0 ? "" : ", ") + j);
               * Found on Stack Overflow - this is a short form of above if/else.
               */
            }
           System.out.println();
           /*This will print nothing due to empty parentheses ("()"),
           but it will start a new line for each loop due to "println" method. 
           This helps to arrange values in a half-pyramid shape.*/
        }
    }
}
