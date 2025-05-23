package leetCode;

public class NumberOfSteps1342 {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while(num!=0){
            if(num%2==0){
                num = num / 2;
                steps++;
            } else {
                num = num - 1;
                steps++;
            }
        }
        return steps;
    }
}
