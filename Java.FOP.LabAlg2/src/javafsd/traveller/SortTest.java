package javafsd.traveller;

import arrayrotater.DataStructureUtils;

public class SortTest {
	public static void main(String[] args) {
		test1();

		
	}
	static void test1() {
		int[] array = DataStructureUtils.generateRandomArray(4);
		
		DataStructureUtils.print(array);
		
		Sort sort = new Sort(array);
		sort.SortDesc();
		
		DataStructureUtils.print(array);
	}

}
