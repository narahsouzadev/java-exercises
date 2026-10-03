package exercise02.examples;

public class PaymentMethod {
    public static void main(String[] args) {
        String paymentMethod = "CREDIT_CARD";

        double feeRate = switch (paymentMethod) {
            case "PIX" -> 0.0;
            case "DEBIT_CARD" -> 0.015;
            case "CREDIT_CARD" -> 0.035;
            default -> -1.0; // Indica metodo desconhecido/inválido
        };
    }
}
