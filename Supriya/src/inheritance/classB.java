package inheritance;

public class classB extends classA
{
	Double price=1000.12;
	
	void method2()
	{
		System.out.println("method2 running");
		
		method1();
		System.out.println(toolname);
		
		}

	public static void main(String[] args) {
		
		classB obj=new classB();
		obj.method1();
		obj.method2();
		
		
		classA ref=new classB();
		ref.method1();
	}

   
	
     
	
	
	}
