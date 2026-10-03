package exercise02;

public class PaymentRuleEngine {
    public static void main(String[] args) {
        String transactionId = "TXN-98422";
        double transactionAmount = 2500.00;
        String paymentMethod = "CREDIT_CARD";
        int fraudScore = 25;
        double dailyLimit = 3000.00;

        double feeRate = switch (paymentMethod) {
            case "PIX" -> 0.0;
            case "DEBIT_CARD" -> 0.015;
            case "CREDIT_CARD" -> 0.035;
            default -> -1.0; // Indicates unknown/invalid method
        };

        String status;
        String rejectionReason = "NONE";

        if (transactionAmount <= 0 || feeRate < 0) {
            status = "INVALID";
            rejectionReason = "Invalid amount or unsupported payment method";
        } else if (fraudScore >= 70) {
            status = "REJECTED";
            rejectionReason = "High fraud risk detected";
        } else if (transactionAmount > dailyLimit) {
            status = "REJECTED";
            rejectionReason = "Transaction exceeds daily limit";
        } else {
            status = "APPROVED";
        }

        if (status.equals("APPROVED")) {
            double retainedAmount = transactionAmount * feeRate;
            double netPayoutAmount = transactionAmount - retainedAmount;
            System.out.printf("Transaction Id: %s | Gross: %.2f | Fee (%.1f%%): $%.2f | Net Payout: $%.2f | Approved: %s%n",
                    transactionId, transactionAmount, feeRate * 100, retainedAmount, netPayoutAmount, status);
        } else {
            System.out.printf("Transaction Id: %s | Status: %s | Rejection Reason: %s%n",
                    transactionId, status, rejectionReason);
        }
    }
}

