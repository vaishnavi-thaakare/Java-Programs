package StringMethods;

public class CompareToDemo {
	
	public static void main (String[] args) {
		System.out.println("String method - compareTo()");
		String name1="Vaishnavi";
		String name2="Thakare";
		String name5="vaishnavi";
		String firstName="vaishnavi";
		System.out.println(" 1] The comparsion of "+ name1 +" with "+ name5 +" is " +name1.compareTo(name5));
		System.out.println(" 2] comparision of  " +name1 +" with "+ name2 +" is " +name1.compareTo(name2));   // v is greater than t by 2 place
		System.out.println(name1.compareTo(name5));
		int name6=name5.charAt(0);
		int name3=name1.charAt(0);
		int name4=name2.charAt(0);
		System.out.println(name6);
	System.out.println(" 3] substraction of "+ name1 +" and " + name5 +" is "+ (name3-name6));
		
		
		System.out.println(name3);
        System.out.println(name4);
		
	}

}
