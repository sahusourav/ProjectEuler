/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
					a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product a*b*c.
*/
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int sum=1000;
			for (int a = 1; a < sum; a++) 
			
				for (int b = a + 1; b < sum; b++) 
				{
					int c = sum - a - b;
					if (a * a + b * b == c * c) 
						System.out.println(a*b*c);
					
				}
			
	}

}
//OUTPUT :- 31875000

