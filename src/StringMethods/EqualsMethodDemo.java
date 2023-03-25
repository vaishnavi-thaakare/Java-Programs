package StringMethods;

public class EqualsMethodDemo {
	public static void main (String[] args) {
		System.out.println("Equal and equalIgnoreCase Method ");
		String country1="India";
		String country2="INDIA";
		String country3="India";
		System.out.println(country1.equals(country3));
		System.out.println(country1.equals(country2));
		System.out.println(country1.equalsIgnoreCase(country2));
	}

}

