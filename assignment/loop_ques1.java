package assignment;

public class loop_ques1 {

	public static void main(String[] args) {
		
		for (int i=0;i<9; i++)
		{
			for (int j=0;j<12; j++)
			{
				if (j==1  
						|| j==3 ||j== 11 || (j-i) == 3
						)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0 ; j<6; j++)
			{
				if ( j==1 || j>0  &&( i==0 || i==4 || i==8))
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0 ; j<=8; j++)
			{
				if (j==1 && i<8  || j == 8 &&i<8   || i==8 &&j<8 && j>1 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0 ; j<=8; j++)
			{
				if (j==1 || j== 8 && i<4 && i>0 || i==0  &&j<8 && j>0 || i==4  && j<8 && j>0 || i-j==2 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0 ; j<=8; j++)
			{
				if (j==1 && i<8  && i>0 || j == 8 &&i<8  && i>0 || i==8 &&j<8 && j>1 || i==0 &&j<8 && j>1 )
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0 ; j<=10 ; j++)
			{
				if (  j==1 ||j==10 || i+1== j && j<9)
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
