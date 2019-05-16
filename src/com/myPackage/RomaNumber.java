package com.myPackage;

public class RomaNumber {

	public static boolean containdouble(char a,char b,String rom[])
	{
		String str=""+a+b;
		for(int i=0;i<rom.length;i++)
		{
			if(str.equals(rom[i]))
			{
				return true;
			}
		}
		return false;
	}
	public static int getindex(char a,String rom[])
	{
		
		
		String str=""+a;
		for(int i=0;i<rom.length;i++)
		{
			if(str.equals(rom[i]))return i;
		}
		
		return -1;
	}
	public static int getindex(char a,char b,String rom[])
	{
		int index=-1;
		String str=""+a+b;
		for(int i=0;i<rom.length;i++)
		{
			if(str.equals(rom[i]))return i;
		}
		
		return 0;
	}
	 public static int intToRoman(String str) {
		 
	         char ch[]=str.toCharArray();
	         
	         String romachar[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
			 int romavalue[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
			
			 int index=0;
			 
			 int num=0;
			 while(index<ch.length-1)
			 {
				 if(containdouble(ch[index], ch[index+1], romachar))
				 {
					int n= getindex(ch[index], ch[index+1], romachar);
					num+=romavalue[n];
					index+=2;
				 }
				 else
				 {
					 int n=getindex(ch[index],romachar);
					 num+=romavalue[n];
					 index++;
				 }
			 }
			if(index==ch.length-1)
			{
				int n=getindex(ch[index],romachar);
				 num+=romavalue[n];
			}
		 
		 
		 return num;
		 ///
		 ///1-3999
		 ///
		/* String romachar[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		 int romavalue[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		 StringBuilder sb=new StringBuilder();
		int index=-1;
		for(int i=0;i<13;i++)
		 {
			index++;
			 while(num>=romavalue[index])
			 {
				 num-=romavalue[index];
				 sb.append(romachar[index]);
			 }
			 
	    }
		 return sb.toString();*/
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(intToRoman("V"));
	}

}
