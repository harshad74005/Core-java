package Java8.LambdaExpression;

public interface Demo1 {

//	which interface contain only one abstract method this is not implementing so this interface is frunctional interface
	void add(int a,int b);
	boolean equals(Object o);
	int hashcode();
	
//	function interface contain multiple default and static methods but abstract want only one 
	default void substract(int a,int b)
	{
		int c = a-b;
		System.out.println("substract : "+c);
	}
	static void divide()
	{
		System.out.println("i am static method");
	}
}
