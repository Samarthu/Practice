import java.util.*;
class setMatrixZero{
	static  void print(int a[][],int n,int m)
	{
		for (int i=0;i< n ;i++ ) {
			for (int j= 0;j< m ; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void setMatrixZeroFun(int a[][],int n,int m)
	{
		int col0=1;
		for (int i = 0;i<n ;i++ ) {
			if(a[i][0] == 0) col0 =0;
			for (int j = 1;j< m ; j++) {
					if(a[i][j] ==  0) {
						a[i][0] = a[0][j] = 0;
       			     }		
		    }			
		}

		for (int i = n-1;i>= 0 ;i-- ) {
			for (int j = m-1 ;j >= 1;j-- ) {
				if(a[i][0] == 0 || a[0][j] == 0)
				{
					a[i][j] = 0;
				}
				
			}
			if(col0==0) a[i][0] = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0 ;i<n ; i++) {
			for (int j=0;j<m ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		setMatrixZeroFun(a,n,m);
		print(a,n,m);
	}
}