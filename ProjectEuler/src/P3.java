//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n=600851475143L ;
		int lastFactor,factor;
		if (n % 2 == 0)
		{
			lastFactor=2;
			n/=2;
			while(n%2==0)
			{
				 n/=2;
			}
		}
		else
			lastFactor=1;
		factor=3;
		long maxFactor= (long)Math.sqrt(n);
		while (n>1 && factor<=maxFactor)
		{
			if (n%factor==0)
					 n/= factor;
					lastFactor=factor;
					while (n%factor==0)
					{
						n /= factor;
					}
					maxFactor=(long)Math.sqrt( n);
			factor += 2;
		}
				
		if (n==1)
			System.out.println(lastFactor);
		 else
			 System.out.println(n);
		
	}

}
//OUTPUT :- 6857
