package JavaProgramsDemo;

public class NumberpatternDemo6 {
	public static void main (String[] args) {
		System.out.println(" Number Pattern  ");
		for (int i=1;i<=4;i++) {
			for (int j=i;j>=1;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

// Output
 Number Pattern  
1 
2 1 
3 2 1 
4 3 2 1 

