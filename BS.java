
public class BS {

public static void main (String[] args) {
	
	int [] a = {7,5,2,4,3,1,8,6,10,9};
	for (int i=0; i<a.length; i++)
	{
		for (int j=1; j<a.length-i; j++)
		{
			if (a[j]<a[j-1])
			{
				int temp =a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}

	for (int ele:a)
	{
		System.out.print(ele+" ");
	}
}

}