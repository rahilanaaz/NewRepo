
public class SumOfArray {

	public static void main(String[] args) {
		
		int numbers[] = new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		int sum = 0;
		
		//System.out.println(numbers[4]);
		
		for(int i=0; i<=numbers.length-1; i++)
		{
			sum = sum + numbers[i];
		}
		
		System.out.println("The sum of array elements is: " +sum);
	}

}
