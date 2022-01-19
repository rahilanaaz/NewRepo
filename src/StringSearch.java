
public class StringSearch {

	public static void main(String[] args) {
		
		String array[] = {"apple", "banana", "strawberry", "peach"};
		
		String s = "apple";
		for(int i=0; i<=array.length-1; i++)
		{
			if(array[i]==s) {
				System.out.println(array[i] + " is present in the array at index: " +i);
			}
			
			}
		}

	}


