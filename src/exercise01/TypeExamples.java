package exercise01;

public class TypeExamples {
    public static void main(String[] args) {
        String projectName = "OrderManagement";
        int majorVersion = 1;
        double processingFeeRate = 0.025;
        boolean isActive = true;

        // Semantic interpolation/formatting
        System.out.printf("Project: %s | Version: %d | Fee Rate: %.2f%% | Active: %b%n",
                projectName, majorVersion, processingFeeRate * 100, isActive);
    }
}