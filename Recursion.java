
public class Recursion {

	public static void main(String[] args) {
		
//		f1(10);
//	}
//	
//	public static void f1(int i)
//	{
//		System.out.println(i);
//		if(i>0)
//			f1(i-1);
//	}
	
	
	int result = fact(10);
	System.out.println(result);
	}
	
	public static int fact(int i)
	{
		if(i!=0)
			return i * fact(i-1);
		
		return 1;
	}
	
	// 5! = 5 * 4 * 3 * 2 * 1
	// 5! = 5 * 4!

}
