package StarPatternDemo;

public class StarPattern4 {
	public static void main (String[] args) {
		System.out.println(" Star Pattern");
		for (int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
				
			}
			for (int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}}}
/* Output
 ****
  ***
   **
    *
*/