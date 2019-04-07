package servises;

import module.Banks;
import module.Model;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {
    private Controller controller;
    @Before
    public void setUp() throws Exception {
        controller = new Controller();
    }

    @Test
    public void returnSwed() {
        controller.setPurchase("машина") ;
        controller.setEarlyRepayment("да");
        controller.setCreditLineIncrease("да");

        Banks result = controller.goodadvise();
        assertEquals(Banks.SWED, result);
    }
    @Test
    public void returnSwedtoo() {
        controller.setPurchase("квартира") ;
        controller.setEarlyRepayment("нет");
        controller.setCreditLineIncrease("нет");

        Banks result = controller.goodadvise();
        assertEquals(Banks.SWED, result);
    }
    @Test
    public void returnPriv() {
        controller.setPurchase("машина") ;
        controller.setEarlyRepayment("нет");
        controller.setCreditLineIncrease("да");

        Banks result = controller.goodadvise();
        assertEquals(Banks.PRIVAT, result);
    }
    @Test
    public void returnPrivtoo() {
        controller.setPurchase("квартира") ;
        controller.setEarlyRepayment("да");
        controller.setCreditLineIncrease("нет");

        Banks result = controller.goodadvise();
        assertEquals(Banks.PRIVAT, result);
    }
    @Test
    public void returnMono() {
        controller.setPurchase("машина") ;
        controller.setEarlyRepayment("да");
        controller.setCreditLineIncrease("нет");

        Banks result = controller.goodadvise();
        assertEquals(Banks.MONO, result);
    }
    @Test
    public void returnMonotoo() {
        controller.setPurchase("квартира") ;
        controller.setEarlyRepayment("нет");
        controller.setCreditLineIncrease("да");

        Banks result = controller.goodadvise();
        assertEquals(Banks.MONO, result);
    }
    @Test
    public void returnIbox() {
        controller.setPurchase("машина") ;
        controller.setEarlyRepayment("нет");
        controller.setCreditLineIncrease("нет");

        Banks result = controller.goodadvise();
        assertEquals(Banks.IBOX, result);
    }
    @Test
    public void returnIboxtoo() {
        controller.setPurchase("квартира") ;
        controller.setEarlyRepayment("да");
        controller.setCreditLineIncrease("да");

        Banks result = controller.goodadvise();
        assertEquals(Banks.IBOX, result);
    }
}