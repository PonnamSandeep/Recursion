package arrays1;

import java.util.ArrayList;

public class SearchinArray {

	public static void main(String[] args) {
		int[] arr = { 12, 43, 18, 23, 23, 21 };
		System.out.println(find1(arr, 23, 0));
		System.out.println(findIndex(arr, 23, 0));
		System.out.println(findIndexLast(arr, 23, arr.length - 1));
		findAllIndex(arr, 23, 0);
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println(findAllIndex1(arr, 23, 0, list1));
		System.out.println(findAllIndex2(arr, 23, 0));

	}

	static boolean find1(int[] arr, int target, int index) {
		if (index == arr.length) {
			return false;
		}
		return arr[index] == target || find1(arr, target, index + 1);
	}

	static int findIndex(int[] arr, int target, int index) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		}
		return findIndex(arr, target, index + 1);
	}

	static int findIndexLast(int[] arr, int target, int index) {
		if (index == -1) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		}
		return findIndex(arr, target, index - 1);
	}

	static ArrayList<Integer> list = new ArrayList<>();

	static void findAllIndex(int[] arr, int target, int index) {
		if (index == arr.length) {
			return;
		}
		if (arr[index] == target) {
			list.add(index);
		}
		findAllIndex(arr, target, index + 1);
	}

	// returning list
	static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list1) {
		if (index == arr.length) {
			return list1;
		}
		if (arr[index] == target) {
			list1.add(index);
		}
		return findAllIndex1(arr, target, index + 1, list1);
	}

	// declaring list inside body
	static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
		ArrayList<Integer> list2 = new ArrayList<>();
		if (index == arr.length) {
			return list2;
		}
		if (arr[index] == target) {
			list2.add(index);
		}
		ArrayList<Integer> ansersfromBelow = findAllIndex2(arr, target, index + 1);
		list2.addAll(ansersfromBelow);
		return list2;
	}
}
