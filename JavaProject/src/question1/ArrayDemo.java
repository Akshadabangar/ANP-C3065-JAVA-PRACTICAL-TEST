
package question1;

public class ArrayDemo 
{
	public void  manipulateIntegerArray (int arr[])
	{											
	for(int  i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+5);
		}
	}	
	
public static void main(String[] args) {
	
	//method call
	int arr[]=new int [5];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	
	
	ArrayDemo obj = new ArrayDemo();  
	obj.manipulateIntegerArray(arr);
}
}

