// Find the sum of all the multiples of 3 or 5 below 1000.
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1000;
		int temp=(num-1)/3;
		int sumof3=3*(temp*(temp+1))/2;
		temp=(num-1)/5;
		int sumof5=5*(temp*(temp+1))/2;
		temp=(num-1)/15;
		int sumof15=15*(temp*(temp+1))/2;
		
		System.out.println(sumof3+sumof5-sumof15);
		
	}

}
//OUTPUT :- 233168
