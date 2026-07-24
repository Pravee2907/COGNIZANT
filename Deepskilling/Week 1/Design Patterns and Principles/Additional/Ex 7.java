public class Ex7 {

    static double findValue(double amount, double rate, int year) {

        if (year == 0) {
            return amount;
        }

        return findValue(amount, rate, year - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double amount = 10000;
        double rate = 0.10;
        int year = 3;

        double ans = findValue(amount, rate, year);

        System.out.println("Future Value = " + ans);
    }
}