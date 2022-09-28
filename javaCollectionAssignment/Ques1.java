/*
 
 	1) Write Java code to define List . 
 	Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

 */

package javaCollectionAssignment;

import java.util.*;

public class Ques1 {

	public static void main(String[] args) 
	{
		List<Float> list = new ArrayList<Float>();
		list.add(7.9f);
		list.add(8.5f);
		list.add(10.0f);
		list.add(13.2f);
		list.add(11.45f);
		
		float sum = listSum(list);
		System.out.println("Sum of Element is : " + sum);

	}
	
	public static float listSum(List<Float> list) 
	{
		float sum = 0;
		
		Iterator<Float> iter = list.iterator();
		while(iter.hasNext()) 
		{
			sum += iter.next();
		}
		return sum;
	}

}


