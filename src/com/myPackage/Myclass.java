package com.myPackage;

import java.util.ArrayDeque;
import java.util.Queue;

public class Myclass {

	 public int myAtoi(String str) {
	        
		 if(str.length()==0)
		 {
			 return 0;
		 }
		 char ch[]=str.toCharArray();
		 
		 int num=0;
		 boolean Ispostive=true;
		boolean Oreadyhas=false;
		boolean isfirstZero=true;
		int index=0;
		while(index<ch.length)
		{
			if(ch[index]==' ')
			{
				index++;
				continue;
			}
			else
			{
				break;
			}
		}
		 for(int i=index;i<ch.length;i++)
		 {
			 if(ch[i]==' ')
			 {
				 break;
			 }
			/* if(ch[i]=='0'&&isfirstZero&&num==0)
			 {
				 continue;
			 }*/
			 
			 if(ch[i]=='-')
			 {
				 if(Oreadyhas==true)
				 {
					 break;
				 }
				Ispostive=false;
				Oreadyhas=true;
				continue;
			 }else if(ch[i]=='+')
			 {
				 if(Oreadyhas==true)
				 {
					 break;
				 }
				 Ispostive=true;
				 Oreadyhas=true;
				 continue;
			 }//-2019
			  if(ch[i]<='9'&&ch[i]>='0')
			 {
				  try
				  {
					  isfirstZero=false;
					  Oreadyhas=true;
				  int mul=Math.multiplyExact(num, 10);
				  num=Math.addExact(mul, ch[i]-48);
			///	num=num*10+ch[i]-48;
				  }catch(ArithmeticException e)
				  {
					  if(Ispostive)
					  {
						  return Integer.MAX_VALUE;
					  }
					  return Integer.MIN_VALUE;
				  }
			 }else
			 {
				 break;
			 }
		 }
		 if(Ispostive)
		 {
			 return num;
		 }
		 return num*(-1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myclass m=new Myclass();
        int i=m.myAtoi("0-5");
	    System.out.println(i);
	   
	}

}
