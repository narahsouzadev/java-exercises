package exercise02.examples;

public class CreditValidator{
    public static void main(String[] args){
        double requestedAmount = 5000.00;
        double customerIncome = 4000.00;
        int creditScore = 720;
        boolean hasActiveRestriction = false;

        if (requestedAmount <= 0) {
            System.out.println("Status: REJECTED | Reason: Invalid requested amount.");
        } else if (hasActiveRestriction || creditScore < 500) {
            System.out.println("Status: REJECTED | Reason: High credit risk.");
        } else if (creditScore >= 700 && requestedAmount <= (customerIncome * 1.5)) {
            System.out.println("Status: APPROVED | Tier: Prime Rate.");
        } else {
            System.out.println("Status: MANUAL_REVIEW | Reason: Requires analyst approval.");
        }
    }
}