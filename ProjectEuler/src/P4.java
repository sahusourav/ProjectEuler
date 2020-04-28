//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0,a=0,i,j;
		for(i=999;i>=100;i--)
		{
			for(j=999;j>=100;j--)
			{
				a=i*j;
				if(palindrome(a))
				{
					max=Math.max(max,a);
					break;
				}
			}
			
		}
		System.out.println(max);
	}
	
	static boolean palindrome(int n)
	{
		int sum=0,temp=n;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		
		return (sum==temp);
	}

}
//OUTPUT :- 906609
