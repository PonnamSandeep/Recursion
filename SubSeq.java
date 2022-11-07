package subset;

import java.util.ArrayList;

public class SubSeq {

	public static void main(String[] args) {
		subSeq("","abc");
		System.out.println(subseq("","abc"));
		subSeqAsci("","abc");
		System.out.println(subseqAsci("","abc"));
		

	}
	
	static void subSeq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		subSeq(p+ch,up.substring(1));
		subSeq(p,up.substring(1));
	}
	
	
	//making as a list
	static ArrayList<String> subseq(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> left=subseq(p+ch,up.substring(1));
		ArrayList<String> right=subseq(p,up.substring(1));
		left.addAll(right);
		return left;
	}
	
	static void subSeqAsci(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		subSeqAsci(p+ch,up.substring(1));
		subSeqAsci(p,up.substring(1));
		subSeqAsci(p+(ch+0),up.substring(1));
	}
	
	static ArrayList<String> subseqAsci(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> first=subseqAsci(p+ch,up.substring(1));
		ArrayList<String> second=subseqAsci(p,up.substring(1));
		ArrayList<String> third=subseqAsci(p+(ch+0),up.substring(1));
		first.addAll(second);
		first.addAll(third);
		return first;
	}
	
}
