class P9Primenumber{
	public static void main(String args[])
	{
		int num,i,flag=0;
		num=Integer.parseInt(args[0]);
		if(num==1 || num==2)
		{
			System.out.println("Given "+num+" number is prime number");
		}
		else{
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println("Given "+num+" number is not prime number");
			}
			else
			{
				System.out.println("Given "+num+" number is prime number");
			}
		}
	}
}