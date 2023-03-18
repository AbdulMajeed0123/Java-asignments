
public class SelectionSort {

	public static void main(String[] args) {
		
		int arr [] = { 9,7,6,4,3,1,2,5,8};
		int n= arr.length;
		
		System.out.println("Unsorted Array : ");
		for ( int i=0; i<n; i++) {
			System.out.print(arr[i]+" " );
		}

		for (int i=0; i<n-1; i++) {
			int min_idx = i;
			for (int j=i+1; j<n; j++) {
				 if ( arr[min_idx] >arr[j])
				 min_idx = j;
			}
			 int temp = arr[min_idx];
			 arr[min_idx]= arr[i];
			 arr[i]=temp;
		}
		
		System.out.println();
		System.out.println("Sorted Array : ");
		for ( int i=0; i<n; i++) {
			System.out.print(arr[i]+" " );
		}
	}
	

}
