package SplitMethodOfString;

import java.util.Arrays;

public class SplitByUsingDot {
	public static void main(String[] args) {
		System.out.println(" Split method using dot");
		String slogan=" I.got.the.job.in.accenture";
		String dividedWord[]=slogan.split("\\.");
		System.out.println(Arrays.toString(dividedWord));
		System.out.println();
		for (int i=0;i<dividedWord.length;i++) {
			System.out.println(dividedWord[i]);
		}
	}

}
// Output


 Split method using dot
[ I, got, the, job, in, company]

 I
got
the
job
in
company


