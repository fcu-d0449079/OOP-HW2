package fcu.iecs.oop;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i ++) 
		{
			if(i%2==1)
			{
				System.out.println(i);
				continue;	
			}
		}
	}

}
