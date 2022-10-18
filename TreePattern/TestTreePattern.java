
package BinarySearch.TreePattern;

public class TestTreePattern {

	
public static void main(String[] args) {
	
int[] a = {6,8,13};
		
int[]b = {14,19,21};
		
int[]c = {15,22,23};


int D[][] = new int[3][3];

D[0] = a;

D[1] = b;

D[2] = c;
 


String s = "";

for (int i = 0; i < D.length; i++) {
	
s+= "\n";

for (int j = 0; j < D[0].length; j++) {
		
s+= D[i][j] + " ";
	}
}

System.out.println(s);

String arr = "";

int[] r = BinaryTreePattern.binarySearchTreePattern(D, 8);

for(int i = 0; i < r.length; i ++){
	
arr += r[i] + " "; }

System.out.println("\n"+arr); }

}
