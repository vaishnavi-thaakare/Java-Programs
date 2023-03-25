package StringMethodBigProgram;

public class tofindCharacterAtOddOrEvenPosition {
	public static void main (String[] args) {
		System.out.println(" Progarm To find the character at odd and even position");
		String flowerName="Sunflower";
		for (int i=0;i<=flowerName.length()-1;i++) {
			//System.out.println(flowerName.charAt(i));
			if (i%2==0) {
				System.out.println("Even position : " + flowerName.charAt(i));
			}
			/*if (i%2!=0) {
				System.out.println("Odd Position :" + flowerName.charAt(i));
			}
			*/
		}
	}

}
