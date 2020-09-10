package edu.kcc.java.unittestexample;

import edu.kcc.java.unittestexample.sale.SaleItem;
import java.math.BigDecimal;

/**
 * The primary class for the Unit Test Example project.
 *
 * @author Bob Trapp
 */
public class UnitTestExample {

    /**
     * The main() method
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Testing methods...");
        try {
            SaleItem item = new SaleItem();
            int itemId = 1;
            item.setItemId(itemId);
            itemId = item.getItemId();
            String name = "";
            item.setItemName(name);
            name = item.getItemName();
            String description = "";
            item.setItemDescription(description);
            description = item.getItemDescription();
            BigDecimal unitPrice = new BigDecimal("1.00");
            item.setUnitPrice(unitPrice);
            unitPrice = item.getUnitPrice();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Testing complete.");
    }

}
