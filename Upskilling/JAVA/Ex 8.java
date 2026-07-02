class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 5 + 3 * 4;

        System.out.println("Result of 10 + 5 * 2 = " + result1);
        System.out.println("Result of (10 + 5) * 2 = " + result2);
        System.out.println("Result of 20 / 5 + 3 * 4 = " + result3);

        System.out.println("\nExplanation:");
        System.out.println("1. Multiplication (*) is performed before Addition (+).");
        System.out.println("2. Expressions inside brackets () are evaluated first.");
        System.out.println("3. Division (/) and Multiplication (*) have higher precedence than Addition (+).");
    }
}