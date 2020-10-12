package stepdefinition;

public class Demo {

	public static void main(String[] args) {
	
Demo d=new Demo();
d.things(1, 5);
d.things(1,3,5,6);
	}
public void things(int... abd) 
{
	for (int i : abd) {
		System.out.println(i);
	}
}
public void dothings(char ch,int... abd) 
{
	for (int i : abd) {
		System.out.println(i);
	}
}
}
