package javafsd.traveller;

public class DenominatorCalculator {
	private int[] denominations;
	private int AmounttobePaid;
	private boolean outcome;
	public DenominatorCalculator(int[] denominations, int AmounttobePaid) {
		this.denominations = denominations;
		this.AmounttobePaid = AmounttobePaid;
		this.outcome = false;

	}
	public  void calculate() {
		
		Sort sort = new Sort(denominations);
		sort.SortDesc();
		
		StringBuilder result = new StringBuilder();
		int tempAmount = AmounttobePaid;
		for (int index = 0; index < denominations.length; index++) {
			int denominationValue = denominations[index];
			
			int quotient = tempAmount / denominationValue;
			int remainder = tempAmount % denominationValue;
			
			if (quotient != 0) {
				
		
				
			} else {
				result.append(String.format("Denomination Value %d, denominationCount %d", denominationValue, quotient));
				result.append(System.getProperty("line.separator"));
				
				tempAmount = remainder;
			}
			if (remainder ==0) {
				this.outcome = true;
				break;
			}
			
		}
		
		if (outcome) {
			System.out.println("Succeess");
			System.out.println(result);
		}
		else {
			System.out.println("Fai;ure");
		}
	}

}
