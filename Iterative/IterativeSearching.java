package BinarySearch.Iterative;

public class IterativeSearching {


	
public int Iterative(int A[], int n, int data)	{
	
int low = 0;

int high = n-1;

while( low <= high) {
	
int mid = low +(high - low)	/2;

//System.out.println(n);

if(A[mid] == data)
	
	return mid;

else if (A[mid] < data)
	
	low = mid +1;

else
	
	high = mid - 1;

}

return -1;

}
	
	
	
	
}	
	
	

