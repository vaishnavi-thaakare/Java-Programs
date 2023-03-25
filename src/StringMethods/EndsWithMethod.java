package StringMethods;

public class EndsWithMethod {
	public static void main(String[] args) {
		System.out.println(" Ends with method");
		String statement=" I got job in accenture";
		System.out.println("Does sentence conatain word accenture as last word  :"+ statement.endsWith("accenture"));
		System.out.println("Does sentence conatin letter e in last word  : " +statement.endsWith("e"));
		System.out.println("Does sentence conatin word ture in last word  : " +statement.endsWith("ture"));
		System.out.println("Does senetnce contain the word ob in last word  : "+statement.endsWith("job"));
	}

}
