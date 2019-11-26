
public class ArrayPrinter {
	static int[] sloeber = new int [5];
	
	public static void main (String[]args) {
		ArrayPrinter toets = new ArrayPrinter();
		sloeber[1] = 2;
		sloeber[2] = 5;
		sloeber[3] = 3;
		sloeber[4] = 8;
		sloeber[5] = 9;
		toets.printarray();
		
		
		
	}
	public void printarray() {
		for (int i = 0; i < sloeber.length; i++) {
			System.out.println(sloeber[i]);
		}
		
	}
}
