//Find the sum of all the even-valued terms in the Fibonacci sequence
//which do not exceed four million.

public class P2 {

	static int limit=4000000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,a=1,b=1,c=a+b;
				while (c<limit)
				{
					sum+=c;
					a=b+c;
					b=c+a;
					c=a+b;
				}
		System.out.println(sum);
	}

}
//OUTPUT :- 4613732
