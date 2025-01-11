package com.sandeep.Collections.Vectors;

import java.util.Vector;

public class VectorGenerics {

	public static void main(String[] args) {
		Vector<Integer> v1= new Vector<>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(7);
		int sum=0;
		for(int i:v1)
		{
			sum+=i;
		}
		System.out.println(sum);
//		Vector<Integer> copy()
		{
			
		}
	}

}
