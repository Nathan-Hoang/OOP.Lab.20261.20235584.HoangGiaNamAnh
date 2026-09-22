import javax.swing.JOptionPane;

public class Lab01_Ex2_2_5 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        if (num2 == 0) {
            quotient = Double.NaN; // Handle division by zero
            String message = String.format("Sum: %.2f\nDifference: %.2f\nProduct: %.2f\nQuotient: %.2f (division by zero)",
                                        sum, difference, product, quotient);
            JOptionPane.showMessageDialog(null, message);
        }

        else {
        String message = String.format("Sum: %.2f\nDifference: %.2f\nProduct: %.2f\nQuotient: %.2f",
                                        sum, difference, product, quotient);
            JOptionPane.showMessageDialog(null, message);
        }
    }
}