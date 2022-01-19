
public class GreatestSmallestArray {

	public static void main(String[] args) {
		
		int numbers[] = {10,20,300,40,50,0};
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>max) {
				max=numbers[i];
			}
			else if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		
		System.out.println("The largest number in the array is: " +max);
		System.out.println("The smallest number in the array is: " +min);

	}

}
