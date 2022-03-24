class amstrongnum
{
	public static void main(String args[])
	{
	  	int i=0,j,agnum=0,temp,temp2,sum,num2;
	   	int num=Integer.parseInt(args[0]);
	   	temp=num;
	   	num2=num;
	   	while(temp!=0)
	    	{
			temp/=10;
	     		i++;
	    	}
	   	while(num!=0)
	   	{
	    		sum=1; 
	    		temp2=num%10;
	     		for(j=1;j<=i;j++)
	       			sum=sum*temp2;
	     		agnum+=sum;
	     		num/=10;
	       
	    
	   	} 
	   	if(agnum==num2)
	   		System.out.println("yes given number "+num2+" is amstrong number");
	   	else
	   		System.out.println("no! given number "+num2+" is not an amstrong number");
	} 
}
	 
