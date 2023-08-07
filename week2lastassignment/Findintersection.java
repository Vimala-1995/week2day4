package week2lastassignment;

import java.util.ArrayList;
import java.util.List;
public class Findintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		List<Integer> list3=new ArrayList<Integer>();
		for(int i=0;i<=list1.size()-1;i++) {
			int value1=list1.get(i);
			for(int j=0;j<=list1.size()-1;j++)	{
			int value2=list2.get(j);
			if(value1==value2)
			{
			System.out.println(value2);
			list3.add(value2);	
			
			}
			}
			System.out.println("The intersected values are"+list3);
		}
	}
	
}

	