public class assignment1
{	//method for converting binary number to octal number
	int binaryToOctal(int binum)
	{
		int temp=0;
		int decimalnum=0;
		int flag=1;
		int octnum=0;
		//number is first converted to decimal
		while(binum!=0)
		{
			temp=binum%10;
			decimalnum=decimalnum+temp*flag;
			binum=binum/10;
		
			flag=flag*2;
		}
		
		temp=0;
		flag=1;
		//number is converted to octal
		while(decimalnum>0)
		{ 
		temp=decimalnum%8;
		octnum=octnum+temp*flag;
		decimalnum=decimalnum/8;
		flag=flag*10;
		}
		
		return octnum;
			
		}


}