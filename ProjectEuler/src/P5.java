//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long ans=2520;
		
		for(long i=11;i<=20;i++)
		{
			ans=lcm(ans,i);
		}
		System.out.println(ans);
	}
	
	 static long gcd(long a, long b) 
	    { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    } 
	 
	 static long lcm(long a,long b)
	 {
		 return (a*b)/gcd(a,b);
	 }

}
//OUTPUT :- 232792560
