package assignment;

public class loop_ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14
				;
		for (int i=0;i<(n)/2; i++)
		{
			for (int j=0;j<n; j++)
			{
				if (j==0  || j==(n-1) || i==(n-1)/2 || i>=j || i+j >= n-1 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
