import java.util.*;
class dungen_Game{
	static int  getMinStrength(int a[][],int b[][],int n,int m,int max,int min[],int ja[])
	{

		int fn = max = max+1;
		for(int i = 0;i<n;i++)
		{
		   max= max - min[i] + b[i][ja[i]];
		}
		if(max ==1)
		{
			return fn;
		}
		return -1;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m  = sc.nextInt();
		 int a[][] = new int[n][m];
		 int b[][] = new int[n][m];
		 int min [] = new int[n];
		 int ja[] = new int[m];
		 for (int i = 0;i<n ;i++ ){
		 	for (int j=0;j<m ;j++ ) {
		 		a[i][j] = sc.nextInt();	    
		 	}
		 }
		 for (int i = 0;i<n ;i++ ){
		 	int mi = Integer.MAX_VALUE;
		 	int ji = 0;
		 	for (int j=0;j<m ;j++ ) {
		 		
		 		    if(a[i][j] < mi) 
		 			{
		 				mi = a[i][j];
		 				ji =j;
		 			}
		 	}
		 	min[i] = mi;
		 	ja[i]=ji;

		 }

		 for (int i = 0;i<n ;i++){
		 	for (int j=0;j<m ;j++ ) {
		 		b[i][j] = sc.nextInt();		
		 	}
		 }
		 int max = 0;
		 for( int ai : min)
		 {
		 	if(max < ai)
		 	{
		 		max = ai;
		 	}
		 }

		 int ans = getMinStrength(a,b,n,m,max,min,ja);
		 System.out.println(ans);
	}
}