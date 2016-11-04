
public class MatrixMult {
public static int [][]c;
public static int ln;

public static int[][] mult(int a[][], int b[][]){
	
	if (a.length >= b.length && a[0].length >= b[0].length){
		c = new int [b.length][b[0].length];
		ln = a.length;
	}
	else if (a.length >= b.length && a[0].length < b[0].length){
		c = new int [b.length][a[0].length];
		ln = a.length;
	}
	else if (a.length < b.length && a[0].length >= b[0].length){
		c = new int [a.length][b[0].length];
		ln = b.length;
	}
	else{
		c = new int [a.length][a[0].length];
		ln = b.length;
	}
for(int i = 0; i < c[0].length; i++){
	for(int ii = 0; ii < c.length; ii++){
	int sum = 0;	
		for(int iii = 0; iii< a[0].length; iii++){
			sum += (a[ii][iii]*b[iii][i]);
		}
		c[ii][i] = sum;
	}
	
	
	
}



return c;
}}