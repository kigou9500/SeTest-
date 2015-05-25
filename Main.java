package Test3_1;

public class Main 
{
    public static void main(String[] args)
    {
    	int first = 0;
    	int second = 1;
    	int loop = 100;
    	fitchCheck((long)first, (long)second, loop);
    	
    	
	}
    public static long fitchCheck(long a, long b, int loop){
    	long c = 0;
    	for(int i=2;i <= loop; i++){
    		c = a + b;
    		b = a;
    		a = c;
    		System.out.println(i+":"+c);
    	}
		return c;
	}
    
}