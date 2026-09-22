import javax.swing.JOptionPane;

public class Lab01_Ex2_2_6 {
    public static void main(String[] args) {
        String[] options = {
            "First Degree Equation: ax + b = 0",
            "System of First Degree Equations: a1x + b1y = c1, a2x + b2y = c2",
            "Second Degree Equation: ax^2 + bx + c = 0"
        };
        
        int choice = JOptionPane.showOptionDialog(
            null,
            "Choose the type of equation to solve:",
            "Equation Solver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]
        );
        switch (choice) {
            case 0: 
                String inputA = JOptionPane.showInputDialog("Enter coefficient a:");
                String inputB = JOptionPane.showInputDialog("Enter coefficient b:");
                double a = Double.parseDouble(inputA);
                double b = Double.parseDouble(inputB);
                solveFirstDegreeEquation(a, b);
                break;
            
            case 1: 
                String inputA1 = JOptionPane.showInputDialog("Enter coefficient a1:");
                String inputB1 = JOptionPane.showInputDialog("Enter coefficient b1:");
                String inputC1 = JOptionPane.showInputDialog("Enter constant c1:");
                String inputA2 = JOptionPane.showInputDialog("Enter coefficient a2:");
                String inputB2 = JOptionPane.showInputDialog("Enter coefficient b2:");
                String inputC2 = JOptionPane.showInputDialog("Enter constant c2:");
                double a1 = Double.parseDouble(inputA1);
                double b1 = Double.parseDouble(inputB1);
                double c1 = Double.parseDouble(inputC1);
                double a2 = Double.parseDouble(inputA2);
                double b2 = Double.parseDouble(inputB2);
                double c2 = Double.parseDouble(inputC2);
                solveSystemOfEquations(a1, b1, c1, a2, b2, c2);
                break;
            
            case 2:
                String inputA3 = JOptionPane.showInputDialog("Enter coefficient a:");
                String inputB3 = JOptionPane.showInputDialog("Enter coefficient b:");
                String inputC3 = JOptionPane.showInputDialog("Enter coefficient c:");
                double a3 = Double.parseDouble(inputA3);
                double b3 = Double.parseDouble(inputB3);
                double c3 = Double.parseDouble(inputC3);
                solveSecondDegreeEquation(a3, b3, c3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No option selected.");
        }
    }
    
    public static void solveFirstDegreeEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution.");
            }
        } else {
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, "The equation has one solution: x = " + solution);
        }
    }

    public static void solveSystemOfEquations(double a1, double b1, double c1, double a2, double b2, double c2) {
        double determinant = a1 * b2 - a2 * b1;
        if (determinant == 0) {
            if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solution.");
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            JOptionPane.showMessageDialog(null, String.format("The system has one solution: x = %.2f, y = %.2f", x, y));
        }
    }

    public static void solveSecondDegreeEquation(double a, double b, double c) {
        if (a == 0) {
            solveFirstDegreeEquation(b, c);
            return;
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            JOptionPane.showMessageDialog(null, "The equation has no real solutions.");
        } else if (discriminant == 0) {
            double solution = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "The equation has one real solution: x = " + solution);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            JOptionPane.showMessageDialog(null, String.format("The equation has two real solutions: x1 = %.2f, x2 = %.2f", root1, root2));
        }
    }
}
