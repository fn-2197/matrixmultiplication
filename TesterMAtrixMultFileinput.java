import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class TesterMAtrixMultFileinput {

	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
		int a[][] = new int [3][4];
		int b[][] =new int [4][2];
		
		
Scanner sf = new Scanner(new File("E:\\test.txt"));
int s[] = new int [1000];
int maxIndx = -1;
while(sf.hasNext()){
	maxIndx++;
	s[maxIndx] = sf.nextInt();
}
sf.close();

int v = 0;
for(int i = 0; i <= a.length-1; i++){
	for(int ii = 0; ii <= a[0].length-1; ii++){
		a[i][ii] = s[v];
		v++;
	}
}            
for(int i = 0; i <= b.length-1; i++){
	for(int ii = 0; ii <= b[0].length-1; ii++){
		b[i][ii] = s[v];
		v++;
	}
}  


for(int rowa = 0; rowa < a.length; rowa++)
{
	for(int colb = 0; colb < a[rowa].length; colb++)
	{
		System.out.print(a[rowa][colb] + "\t");
	}
	System.out.println(" ");}
for(int rowa = 0; rowa < b.length; rowa++)
{
	for(int colb = 0; colb < b[rowa].length; colb++)
	{
		System.out.print(b[rowa][colb] + "\t");
	}
	System.out.println(" ");}
int c[][] = MatrixMult.mult(a, b);
for(int rowa = 0; rowa < c.length; rowa++)
{
	for(int colb = 0; colb < c[rowa].length; colb++)
	{
		System.out.print(c[rowa][colb] + "\t");
	}
	System.out.println(" ");
}








}
	
}
