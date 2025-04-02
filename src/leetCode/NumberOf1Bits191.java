package leetCode;

public class NumberOf1Bits191 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
}
