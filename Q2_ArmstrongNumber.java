public class Q2_ArmstrongNumber {
    public static void main(String[] args) {

        int n = 153;
        int temp = n;
        int digits = 0;
        int sum = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        while (temp != 0) {
            int d = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * d;
            }
            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}