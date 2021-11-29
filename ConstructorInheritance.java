class Base
{
	Base()
	{
		System.out.println("base class");
	}
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("derived class");
	}
}
class ConstructorInheritance
{
	public static void main(String []args)
	{
		Derived d= new Derived();
		
	}
}
