package StringMethods;
import java.util.Arrays;
public class ToCgarArray {
	public static void main (String[] args) {
		System.out.println(" toCharArray Method");
		String color="Orange";
		char a[]=color.toCharArray();
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
