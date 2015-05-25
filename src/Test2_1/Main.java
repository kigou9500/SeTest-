package Test2_1;

public class Main 
{
    public static void main(String[] args)
    {
    	String[] a = {"1", "2", "3"};
    	String[] b = {"a", "b", "c"};
    	String total = makeString(a, b);
    	System.out.println(total);
    	
	}
    public static String makeString(String[] a, String[] b){
		String message = "";
		
		for(int num=0;num < a.length;num++)
		{
			message += a[num] + b[num];
		}
		
    	return message;
	}
    
}