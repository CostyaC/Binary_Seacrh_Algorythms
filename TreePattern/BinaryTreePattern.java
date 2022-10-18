package BinarySearch.TreePattern;

public class BinaryTreePattern {
	
public static int [] binarySearchTreePattern(int [][] matrix, int key){
	
//===== 1st Step : Starting from lowest row and and leftmost column ========
	
int i = 0;

int j = 2;

// ========= ============== ===================

int[] result = new int[2]; // in this variable are stored the indices by row and column

//======== While the row index and column index are inside the boundaries of the matrix the following statement will be executed

while(i < matrix.length && j < matrix[0].length){
	
if(matrix[i][j] == key){
	
	result[0] = i;
	
	result[1] = j;

return result;  // if matrix of row index and column index are equal with key then return the indices
	
} else if(key < matrix[i][j]) {
	
	j--;
	
  } else {
	  
	i++;
	  
	  
  }

}

return null;

}

}
	
	
	

