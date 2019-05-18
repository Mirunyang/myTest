package com.myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tri {

	 public List<List<Integer>> threeSum(int[] nums) {
	        
		 List<List<Integer>>list=new ArrayList<>();
		 
		 int num=0;
		 if(nums.length<=3)
		 {
			 List<Integer>l=new ArrayList<>();
			 for(int i:nums)
			 {
				 num+=i;
				 l.add(i);
			 }
			 if(num==0)
			 {
				
			list.add(l);
				 return list;
			 }else
			 {
				 return null;
			 }
		 }
		 else
		 {
			 List<Integer>l=new ArrayList<>();
			 for(int i=0;i<nums.length-2;i++)
			 {
				 for(int j=i+1;j<nums.length-1;j++)
				 {
					 for(int k=j+1;k<nums.length;k++)
					 {
						 if(nums[i]+nums[j]+nums[k]==0)
						 {
							 l.add(nums[i]);
							 l.add(nums[j]);
							 l.add(nums[k]);
							 list.add(l);
						 }
					 }
				 }
			 }
			 
			 return list;
		 }
		 

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]= {-1,0,1,2,-1,-4};
		Tri t=new Tri();
		List<List<Integer>>ts=t.threeSum(nums);
		for(Iterator<List<Integer>>i=ts.iterator();i.hasNext();)
		{
			for(Iterator<Integer>it=i.next().iterator();it.hasNext();)
			{
				System.out.print(it.next().intValue()+" ");
			}
			System.out.println();
		}
	}

}
