package paymoney;

public class TargetDeterminatorTest {
	

		public static void main(String[] args) {
			
			test(new int[] {20, 12, 31}, 19);
			test(new int[] {100}, 101);		
		}
		
		static void test(int[] transactions, int dailyTarget) {
			
			System.out.println("----------------------");
			TargetDeterminator determinator 
				= new TargetDeterminator(transactions, dailyTarget);
			determinator.determine();
		}
	}


