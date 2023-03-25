package SplitMethodOfString;

import java.util.Arrays;

public class SplittingByUsingWhiteSpace {
	public static void main(String[] args) {
		System.out.println(" Splitting by using white Space");
		String name1=" I am working in accenture as software developer";
		String part[]=name1.split(" ");
		System.out.println(Arrays.toString(part));
		System.out.println();
		for (String k:part) {
			System.out.println(k);
		}
		
	}

}
// Output
  Splitting by using white Space
[, I, am, working, in, company, as, software, tester]


I
am
working
in
company
as
software
tester

