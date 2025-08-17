import javax.swing.*;

public class PalindromeGUI {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            JOptionPane.showMessageDialog(null, input + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, input + " is not a palindrome.");
        }
    }
}
