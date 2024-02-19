package org.example;

public class FeeCalculator {

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // calculate price for adults
        fee = AdultFeeStrategy.calculateAdultFee(visitor, ticketType, fee);

        // calculate price for children
        fee = ChildFeeStrategy.calculateChildFee(visitor, ticketType, fee);
        return fee;
    }

}
