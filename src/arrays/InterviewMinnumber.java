package arrays;

public class InterviewMinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [] []= {{2,4,5},{3,0,7},{1,2,9}};
		int min= abc[0] [0];
		int mincolounm = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i] [j];
					mincolounm = j;
					
				}
			}
				
		}
		int max=abc[0][mincolounm];
		int k = 0;
		while(k<3)
		{
			if(abc[k][mincolounm]>max)
			{
				max=abc[k][mincolounm];
			}
			k++;	
		}
		
		System.out.println(max);

	}

}
