package stepdefinition;

public class Sts {

	public static void main(String[] args) {
		
	boolean a=true;
	boolean b=false;
	if(!a &&(b=true)) {
		System.out.println("its valid");
	}
	System.out.println("b is "+b);


	if(!a &(b=true)) {
		System.out.println("its valid");
	}
	System.out.println("b is "+b);

}
}