package exercise01;

public class TransactionAudit {
    public static void main(String[] args) {
        String transactionId = "TXN-98421";
        long customerId = 105423L;
        double transactionAmount = 1499.90;
        double feeRate = 0.03;
        boolean isApproved = true;

        double retainedAmount = transactionAmount * feeRate;
        double netPayoutAmount = transactionAmount - retainedAmount;

        System.out.printf("Transaction Id: %s | Customer Id = %d | Gross: %.2f | Fee (%.1f%%): $%.2f | Net Payout: $%.2f | Approved: %b%n",
                transactionId, customerId, transactionAmount, feeRate * 100, retainedAmount, netPayoutAmount, isApproved);
    }
}
