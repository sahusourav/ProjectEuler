//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2000000;
		long sum=0;
		boolean []a=new boolean[num+1];
		for(int i = 0; i <= num; i++)
			a[i]=true;
		for(int i=2;i<=Math.sqrt(num);i++)
			for(int j=i;i*j<=num;j++)
				  a[i*j]=false;
		for(int i=2;i<=num;i++)
			if(a[i])
			  { 
				sum+=i;
			  }
		  System.out.println(sum);
	}

}
//OUTPUT :- 142913828922