package JavaProgramsDemo;

public class NumberPatternDemo5 {
	public static void main (String[] args) {
		System.out.println(" Number Pattern ");
		for (int i=4;i>=1;i--) {
			for (int j=4;j>=i;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}

// Output
 Number Pattern 
4 
4 3 
4 3 2 
4 3 2 1 

