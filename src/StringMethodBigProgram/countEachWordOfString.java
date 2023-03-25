package StringMethodBigProgram;

import java.util.Arrays;

public class countEachWordOfString {
	public static void main (String[] args) {
		System.out.println("Count each word of string");
		String sentence="I Love Java Programming";
		System.out.println(sentence.length());
		String[] word=sentence.split(" ");
		System.out.println(Arrays.toString(word));
	/*	for (String k:word) {
			System.out.println(k.length());
		}*/
		for (int i=0;i<word.length;i++) {
			System.out.println(word[i].length());
		}
		
		
		
		
	}

}
