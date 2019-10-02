package string.concept;

public class StringExample {

    public static void main(String[] args) {
	String s1 = "Pradeep";
	System.out.println(s1.hashCode()); //1342234603
	System.out.println(s1); //Pradeep
	System.out.println(s1+"Maurya");//PradeepMaurya
	System.out.println(s1);//Pradeep
	
	
	String s2 = s1+"Dss";
	System.out.println(s2);//PradeepDss
	
	String s3 = "Pradeep";
	System.out.println(s3.hashCode());//1342234603
	
	String s4 = new String("Pradeep");
	System.out.println(s4.hashCode());//1342234603
	

    }

}
