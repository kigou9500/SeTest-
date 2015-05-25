package Test03;

public class Main 
{
    public static void main(String[] args)
    {
    	int i = 0;
    	int t = 0;
    	int[] a = {1,2,3};
    	int total = checkCount(i, a, t);
    	System.out.println(total);
    	
	}
    public static int checkCount(int i, int[] a, int t) {
    	if(i < 3){
    		 t += a[i];
    		 i++;
    		 t = checkCount(i, a, t);
    	}
    	return t;
	}
}