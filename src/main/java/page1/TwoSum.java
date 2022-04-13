package page1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数相加
 * @author yangren
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        result = towSumMap(nums,target);
        System.out.println(Arrays.toString(result));
    }

    /**
     * 双重循环暴力解法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0;i<nums.length;i++){
            for (int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return  result;
                }
            }
        }

        return result;
    }

    /**
     * 通过map的方式
     * @param nums
     * @param target
     * @return
     */
    public static int[] towSumMap(int[] nums,int target){
        // 解题逻辑，尽量减少双重循环，通过list,map等存储数据，减少复杂度
        int[] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = hashMap.get(target-nums[i]);
                return result;
            }
            hashMap.put(nums[i],i);
        }
        return  result;
    }
}
