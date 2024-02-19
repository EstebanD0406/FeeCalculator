package org.example;

public class ChildFeeStrategy {
    static final double CHILD_PRICE_BASE = 100;

    public static double calculateChildFee(Visitor visitor, TicketType ticketType, double fee) {
        if (visitor.getAge() <= 14) {
            if (TicketType.HALF_DAY == ticketType) {
                fee = CHILD_PRICE_BASE * 0.2;
            } else if (TicketType.FULL_DAY == ticketType) {
                fee = CHILD_PRICE_BASE * 0.5;
            }
        }
        return fee;
    }
}