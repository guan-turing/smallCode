package cn.hand.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1;
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		//随机生成50个小于100的整数
		for(int i=0;i<50;i++) {
			list.add( (int) (Math.random()*100));
		}
		Collections.sort(list);
		for (int i=0;i<50;i++) {
			int num = list.get(i)/10;
			if(map.containsKey(num)) {
				list1 = map.get(num);
			}else {
				list1 = new LinkedList<Integer>();
				map.put(num,list1);
			}
			if(!list1.contains(num)) {
				list1.add(list.get(i));
			}
		}
		System.out.print("{");
		Set<Integer> k = map.keySet();
		for(int key:k) {
			if(key<k.size()-1) {
			List l = map.get(key);
			System.out.print(key+"=>"+l+",");
			}else {
				List l = map.get(key);
				System.out.println(key+"=>"+l+"}");
			}
		}
	}
}
