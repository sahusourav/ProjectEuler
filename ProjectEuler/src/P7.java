//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10,001st prime number?
public class P7 {

	static int limit = 10001;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ctr=0,num=1  ;
		while(ctr < limit)
		{
			num++;
			if(isPrime(num))
				ctr++;
			
		}
		System.out.println(num);
	}
	
	static boolean isPrime(long n)
	{
		if(n<2)
			return false;
		
		if(n==2)
			return true;
		
		for(int i=2;i<Math.sqrt(n)+1;i++)
		{
			if(n%i==0)
				return false;
		}
		
		return true;
	}

}
//OUTPUT :- 104743
