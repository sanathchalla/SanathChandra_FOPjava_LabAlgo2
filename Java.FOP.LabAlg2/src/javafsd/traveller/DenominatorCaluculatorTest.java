package javafsd.traveller;

public class DenominatorCaluculatorTest {
	
	public static void main(String args[]) {
		
		
		test1(new int[] {60, 5, 12, 78, 25}, 128);
		
	}
	static void test1(int[] denominations, int AmounttobePaid) {
		System.out.println("-----------------");
		
		DenominatorCalculator caluculator = new DenominatorCalculator(denominations, AmounttobePaid);
		
		caluculator.calculate();
	}

}
