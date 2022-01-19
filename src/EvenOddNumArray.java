import java.util.ArrayList;

public class EvenOddNumArray {

	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		
		ArrayList <Integer>even = new ArrayList<Integer>();
		ArrayList <Integer>odd = new ArrayList<Integer>();
		
		for(int i: numbers) {
			if(i%2==0) {
				even.add(i);
			}
			else
			{
				odd.add(i);
			}
		}
		
		System.out.println("The even numbers in the array are: " +even);
		System.out.println("The odd numbers in the array are: " +odd);

	}

}
