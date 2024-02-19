package org.example;

public class AdultFeeStrategy {
    static final double ADULT_PRICE_BASE = 100;

    public static double calculateAdultFee(Visitor visitor, TicketType ticketType, double fee) {
        if (visitor.getAge() > 14) {
            if (TicketType.HALF_DAY == ticketType) {
                fee = ADULT_PRICE_BASE * 0.6;
            } else if (TicketType.FULL_DAY == ticketType) {
                fee = ADULT_PRICE_BASE * 1.2;
            }
        }
        return fee;
    }
}