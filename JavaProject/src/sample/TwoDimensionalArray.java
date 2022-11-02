package sample;

public class TwoDimensionalArray 
{

	public static void main(String[] args) 
	 {
       int arr[][]=new int[3][2];
	   arr[0][0]=90;
	   arr[0][1]=45;
	   arr[1][0]=34;
	   arr[1][1]=85;
	   arr[2][0]=23;
	   arr[2][1]=14;
	   
	  int arr1[][]= {{2,5},{4,7},{9,5}};
	  
	  for(int  i=0;i<arr1.length;i++)
	  {
		  for(int j=0;j<arr1[i].length;j++)
		  {
			  System.out.print(arr1[i][j]+" ");
		  }
		  System.out.println();
	  }
	  System.out.println("Enhanced for loop");
	  for(int i[]:arr1)
	  {
		  for(int  j:i) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
}
}

