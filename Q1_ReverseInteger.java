public class Q1_ReverseInteger {
    public static void main(String[] args) {

        int n = -1234;
        long reversed = 0;
        int temp = Math.abs(n);

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if (reversed > Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            if (n < 0) {
                System.out.println(-reversed);
            } else {
                System.out.println(reversed);
            }
        }
    }
}