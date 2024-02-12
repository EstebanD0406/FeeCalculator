package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeeCalculatorTest {

    @Test
    public void testCalculateFee_Adult_HalfDay() {
        Visitor adultVisitor = new Visitor(25);
        double fee = FeeCalculator.calculateFee(adultVisitor, TicketType.HALF_DAY);
        assertEquals(20, fee);
    }

    @Test
    public void testCalculateFee_Adult_FullDay() {
        Visitor adultVisitor = new Visitor(30);
        double fee = FeeCalculator.calculateFee(adultVisitor, TicketType.FULL_DAY);
        assertEquals(50, fee);
    }

    @Test
    public void testCalculateFee_Child_HalfDay() {
        Visitor childVisitor = new Visitor(10);
        double fee = FeeCalculator.calculateFee(childVisitor, TicketType.HALF_DAY);
        assertEquals(20, fee);
    }

    @Test
    public void testCalculateFee_Child_FullDay() {
        Visitor childVisitor = new Visitor(7);
        double fee = FeeCalculator.calculateFee(childVisitor, TicketType.FULL_DAY);
        assertEquals(50, fee);
    }
}
