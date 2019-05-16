package com.myPackage;

public class MyArea {

	public static int myArea(int height[])
	{
		/*int MAXWATER=0;
		for(int i=0;i<height.length-1;i++)
		{
			int tempArea=0;
			for(int j=i+1;j<height.length;j++)
			{
				tempArea=(j-i)*Math.min(height[i], height[j]);
				if(tempArea>MAXWATER)MAXWATER=tempArea;
			}
		}
	
		return MAXWATER;*/
		
		int pre=0;
		int tai=height.length-1;
		int MAX=0;
		int tem=0;
		while(pre<tai)
		{
			tem=(tai-pre)*Math.min(height[pre], height[tai]);
			if(MAX<tem)
			{
				MAX=tem;
			}
			if(height[pre]<height[tai])
			{
				pre++;
			}
			else
			{
				tai--;
			}
			
		}
		
		return MAX;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,8,6,2,5,4,8,3,7};
		System.out.println(myArea(arr));
	}

}
