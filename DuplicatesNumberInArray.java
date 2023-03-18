
public class DuplicatesNumberInArray {

	public static void main(String[] args) {
		
		
		int arr [] = new int [] { 1, 2,3,4,5,2,4,5,6,6,3,1,9,7};
		System.out.println("The duplicates numbers in the array are:"); 
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j]); 
}
}}}