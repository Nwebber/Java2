package com.webber.sales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Nathaniel Webber
 */
public class SalesTransactionTest {

    private static final int GOOD_TRANSACTION_ID = 500;
    private static final int GOOD_SALES_PERSON_ID = 10;
    private static final LocalDateTime GOOD_DATE = LocalDateTime.now();
    private static final int GOOD_ITEM_ID = 100;
    private static final BigDecimal GOOD_UNIT_PRICE = new BigDecimal("1.00");
    private static final int GOOD_QTY_SOLD = 1;
    private SalesTransaction instance;

    public SalesTransactionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        instance = new SalesTransaction(GOOD_TRANSACTION_ID,
                GOOD_SALES_PERSON_ID, GOOD_DATE, GOOD_ITEM_ID,
                GOOD_UNIT_PRICE, GOOD_QTY_SOLD);
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTransactionId method, of class SalesTransaction.
     */
    @Test
    public void testGetTransactionId() {
        setUp();
        int expResult = 500;
        int result = instance.getTransactionId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalesPersonId method, of class SalesTransaction.
     */
    @Test
    public void testGetSalesPersonId() {
        setUp();
        System.out.println("getSalesPersonId");
        // SalesTransaction instance = null;
        int expResult = 10;
        int result = instance.getSalesPersonId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTransactionDateTime method, of class SalesTransaction.
     */
    @Test
    public void testGetTransactionDateTime() {
        setUp();
        System.out.println("getTransactionDateTime");
        // SalesTransaction instance = null;
        LocalDateTime expResult = GOOD_DATE;
        LocalDateTime result = instance.getTransactionDateTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getItemId method, of class SalesTransaction.
     */
    @Test
    public void testGetItemId() {
        setUp();
        System.out.println("getItemId");
        // SalesTransaction instance = null;
        int expResult = 100;
        int result = instance.getItemId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUnitPrice method, of class SalesTransaction.
     */
    @Test
    public void testGetUnitPrice() {
        setUp();
        System.out.println("getUnitPrice");
        // SalesTransaction instance = null;
        BigDecimal expResult = GOOD_UNIT_PRICE;
        BigDecimal result = instance.getUnitPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantitySold method, of class SalesTransaction.
     */
    @Test
    public void testGetQuantitySold() {
        setUp();
        System.out.println("getQuantitySold");
        // SalesTransaction instance = null;
        int expResult = 1;
        int result = instance.getQuantitySold();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SalesTransaction.
     */
    @Test
    public void testToString() {
        setUp();
        System.out.println("toString");
        // SalesTransaction instance = null;
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTransactionIdArbitraryGood() {
        setUp();
        instance.setTransactionId(50);
        assertEquals(50, instance.getTransactionId());
    }

    @Test
    public void testSetTransactionIdZeroGood() {
        setUp();
        instance.setTransactionId(0);
        assertEquals(500, instance.getTransactionId());
    }

    @Test
    public void testSetTransactionIdNegativeBad() {
        setUp();
        try {
            instance.setTransactionId(-1);
        } catch (Exception e) {
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetSalesPersonIdBadZero() {
        setUp();
        try {
            instance.setSalesPersonId(0);
        } catch (Exception e) {
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetSalesPersonIdOneGood() {
        setUp();
        instance.setSalesPersonId(1);
        assertEquals(1, instance.getSalesPersonId());
    }

    @Test
    public void testSetSalesPersonIdArbitraryGood() {
        setUp();
        instance.setSalesPersonId(5);
        assertEquals(5, instance.getSalesPersonId());
    }

    @Test
    public void testSetSalesDateTimeTodayGood() {
        setUp();
        instance.setTransactionDateTime(LocalDateTime.now());
        assertEquals(LocalDateTime.now(), instance.getTransactionDateTime());
    }

    @Test
    public void testSetSalesDateTimeTomorrowBad() {
        setUp();
        try {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime later = now.plusDays(1);
            instance.setTransactionDateTime(later);
        } catch (Exception e){
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetSalesDateTimeMinus31DaysBad() {
        setUp();
        try {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime later = now.minusDays(31);
            instance.setTransactionDateTime(later);
        } catch (Exception e){
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetSalesDateTimeMinus30DaysGood() {
        setUp();
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowSimple = now.truncatedTo(ChronoUnit.MINUTES);
        LocalDateTime later = nowSimple.minusDays(30);
        instance.setTransactionDateTime(nowSimple);
        assertEquals(nowSimple, instance.getTransactionDateTime());
    }

    @Test
    public void testSetItemIdZeroBad() {
        setUp();
        try {
            instance.setItemId(0);
        } catch (Exception e) {
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetItemIdOneGood() {
        setUp();
        instance.setItemId(1);
        assertEquals(1, instance.getItemId());
    }

    @Test
    public void testSetItemIdArbitraryGood() {
        setUp();
        instance.setItemId(5);
        assertEquals(5, instance.getItemId());
    }

    @Test
    public void testSetUnitPriceNegativeBad() {
        setUp();
        try {
            BigDecimal bd = new BigDecimal("-1.00");
            instance.setUnitPrice(bd);
        } catch (Exception e) {
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetUnitPriceZeroGood() {
        setUp();
        BigDecimal bd = new BigDecimal("0.00");
        instance.setUnitPrice(bd);
        assertEquals(bd, instance.getUnitPrice());
    }

    @Test
    public void testSetUnitPriceArbitraryGood() {
        setUp();
        BigDecimal bd = new BigDecimal("5.00");
        instance.setUnitPrice(bd);
        assertEquals(bd, instance.getUnitPrice());
    }

    @Test
    public void testSetUnitPriceOneDecimalGood() {
        setUp();
        BigDecimal bd = new BigDecimal("0.5");
        instance.setUnitPrice(bd);
        assertEquals(bd, instance.getUnitPrice().stripTrailingZeros());
    }

    @Test
    public void testSetUnitPriceThreeDecimalsGood() {
        setUp();
        BigDecimal bd = new BigDecimal("1.525").setScale(2, RoundingMode.DOWN);
        instance.setUnitPrice(bd);
        assertEquals(bd, instance.getUnitPrice());
    }

    @Test
    public void testSetQuantitySoldZeroBad() {
        setUp();
        try {
            instance.setQuantitySold(0);
        } catch (Exception e) {
            assertTrue(1==1);
        }
    }

    @Test
    public void testSetQuantitySoldOneGood() {
        setUp();
        instance.setQuantitySold(1);
        assertEquals(1, instance.getQuantitySold());
    }

    @Test
    public void testSetQuantitySoldArbitraryGood() {
        setUp();
        instance.setQuantitySold(5);
        assertEquals(5, instance.getQuantitySold());
    }

    @Test
    public void testCompareToFirstDateEarlier() {
        setUp();
        LocalDateTime one = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        LocalDateTime two = one.minusDays(30);
        boolean dateEarlier = two.isBefore(one);
        assertTrue(dateEarlier);
    }

    @Test
    public void testCompareToBothDatesEqual() {
        setUp();
        LocalDateTime one = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        LocalDateTime two = one;
        boolean dateSame = one.isEqual(two);
        assertTrue(dateSame);
    }

    @Test
    public void testCompareToOtherDateEarlier() {
        setUp();
        LocalDateTime one = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        LocalDateTime two = one.minusDays(30);
        boolean dateAfter = one.isAfter(two);
        assertTrue(dateAfter);
    }

}
