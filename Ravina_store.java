/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ravina_store;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Ravina_store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      while (true) {
          JOptionPane.showMessageDialog(null,"Marie Pang Pagwapa shop");
            // Input customer name
            String customerName = JOptionPane.showInputDialog("Enter your name:");

            // Display product options with prices
            String[] products = {"Lipstick - P100.0", "Mascara - P150.0", "Foundation - P200.0", "Eyeshadow - P100.0", "Blush - P100.0"};
            int selectedProduct = JOptionPane.showOptionDialog(
                    null,
                    "Select a product:",
                    "Product Selection",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    products,
                    products[0]
            );

            // Set product prices
            double[] productPrices = {100.0, 150.0, 200.0, 100.0, 100.0};
            double selectedProductPrice = productPrices[selectedProduct];

            // Input quantity
            int quantity = 0;
            while (true) {
                try {
                    String quantityString = JOptionPane.showInputDialog("Enter the quantity:");
                    quantity = Integer.parseInt(quantityString);
                    if (quantity > 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a positive number.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }

            // Input cash
            double cashInput = 0.0;
            while (true) {
                try {
                    String cashInputString = JOptionPane.showInputDialog("Enter cash amount:");
                    cashInput = Double.parseDouble(cashInputString);
                    if (cashInput >= selectedProductPrice * quantity) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient cash. Please enter a larger amount.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }

            // Calculate total price and change
            double totalPrice = selectedProductPrice * quantity;
            double change = cashInput - totalPrice;

            // Display receipt
            String receipt = "Customer: " + customerName + "\nProduct: " + products[selectedProduct] +
                    "\nQuantity: " + quantity + "\nTotal Price: P" + totalPrice + "\nCash: P" + cashInput +
                    "\nChange: P" + change;
            JOptionPane.showMessageDialog(null, receipt, "Receipt", JOptionPane.INFORMATION_MESSAGE);

            // Ask if the user wants to make another purchase
            int option = JOptionPane.showConfirmDialog(null, "Do you want to make another purchase?", "Continue",
                    JOptionPane.YES_NO_OPTION);
            if (option != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}