package subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		List<List<Integer>> ans= subset(arr);
//		System.out.println(ans);   //to get all answers as one list
		for(List<Integer> list: ans) {
			System.out.println(list);
		}
		
		int[] arr1= {1,2,2};
		List<List<Integer>> ans1= subsetWithDuplicates(arr1);
//		System.out.println(ans);   //to get all answers as one list
		for(List<Integer> list1: ans1) {
			System.out.println(list1);
		}
	}
	
	static List<List<Integer>> subset(int[] arr){
		
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for(int num : arr) {
			int size=outer.size();	
			for(int i=0;i<size;i++) {
				List<Integer> internal= new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}	
		return outer;
	}
	
static List<List<Integer>> subsetWithDuplicates(int[] arr1){
	    Arrays.sort(arr1);
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		int start=0;
		int end=0;
		for(int i=0;i<arr1.length;i++) {
			start=0;
//			if my current nd previous element is same then s=e+1
			if(i>0&&arr1[i]==arr1[i-1]) {
				start=end+1;
			}
			end=outer.size()-1;
			int size=outer.size();	
			for(int j=start;j<size;j++) {
				List<Integer> internal= new ArrayList<>(outer.get(j));
				internal.add(arr1[i]);
				outer.add(internal);
			}
		}	
		return outer;
	}
}

