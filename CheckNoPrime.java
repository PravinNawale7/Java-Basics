public class CheckNoPrime {
    void chekPrime(int num) {
        boolean flag = true;

        if (num <= 1) {
            flag = false;
        } else {

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println(num +" Number is prime");
        } else {
            System.out.println(num+" Number is not prime");
        }
    }

    public static void main(String[] args) {
        CheckNoPrime c = new CheckNoPrime();
        c.chekPrime(-1);
    }
}
