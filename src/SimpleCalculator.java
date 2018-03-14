
import javax.swing.JOptionPane;

public class SimpleCalculator {
	static Double nid;
	static Double n2d;
	static Double a;
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog(null, "What is the first number");

		// 1. Get 2 numbers from the user and convert them to integer.
		 nid = Double.parseDouble(n1);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "", "Pop-up Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Multiply", "Divid", "Add", "Subtract" }, null);
		String n2 = JOptionPane.showInputDialog(null, "What is the second number");
System.out.println(operation);
		// 1. Get 2 numbers from the user and convert them to integer.
		 n2d = Double.parseDouble(n2);
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
	if (operation==0) {
		JOptionPane.showMessageDialog(null, M(nid,n2d));
	}
 else if (operation==1) {
	 JOptionPane.showMessageDialog(null, D(nid,n2d));
	}else if (operation==2) {
		JOptionPane.showMessageDialog(null, A(nid,n2d));
	}else if (operation==3) {
		JOptionPane.showMessageDialog(null, S(nid,n2d));
	}
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static Double M(Double n8,Double n9) {
	return	 n8 * n9;

	}

	static Double D(Double n8,Double n9) {
		return n8 / n9;
	}

	static Double A(Double n8,Double n9) {
		return n8 + n9;
	}

	static Double S(Double n8,Double n9) {
		return n8 - n9;
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}