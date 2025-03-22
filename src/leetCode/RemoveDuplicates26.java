package leetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j<nums.length;j++) {
            if(nums[i] != nums[j]) {
                i++;
            }
        }
        return i+1;
    }
}
