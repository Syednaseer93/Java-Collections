package collections;

class Hello
{
	void show()
	{
		System.out.println("show");
	}
}
class B extends Hello
{
	void print()
	{
		System.out.println("print");
	}
}
public class Inh {

	public static void main(String[] args) {
B b=new B();
b.show();
b.print();
	}

}
