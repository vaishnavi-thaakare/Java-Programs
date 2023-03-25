package SplitMethodOfString;

import java.util.Arrays;

public class SplitMethodUsingLetter {
	public static void main(String[] args) {
		System.out.println(" split method using letter");
		String sentence1= "We're Ridiculously Committed! Welcome";
		System.out.println(sentence1);
		String newArray[]=sentence1.split("W");
		System.out.println(Arrays.toString(newArray));
		for (int i=0;i<newArray.length;i++) {
			System.out.println( newArray[i]);
		}
	}

}
