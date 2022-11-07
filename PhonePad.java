package subset.permutations;

import java.util.ArrayList;

public class PhonePad {

	public static void main(String[] args) {
		combinations("","12");
		
		System.out.println(combos("","12"));
	}
	
	static void combinations(String p, String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digits = up.charAt(0)-'0';  //this will convert '2' into 2
		for(int index=(digits-1)*3;index<=(3*digits)-1;index++) {
			char ch=(char) ('a'+index);
			combinations(p+ch,up.substring(1));
		}
		
		
	}
	
	static ArrayList<String> combos(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		int digits = up.charAt(0)-'0';  //this will convert '2' into 2
		ArrayList<String> list = new ArrayList<String>();
		for(int index=(digits-1)*3;index<=(3*digits)-1;index++) {
			char ch=(char) ('a'+index);
			list.addAll(combos(p+ch,up.substring(1)));
		}
		return list;	
	}

}
