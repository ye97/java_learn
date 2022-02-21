import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indexs[]=new int[2];
        HashMap <Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                indexs[0]=hash.get(target-nums[i]);
                indexs[1]=i;
                return indexs;
            }
            hash.put(nums[i],i);
        }
        return indexs;
    }
}
Solution solution=new Solution();
int []sum=new int[2];
solution.twosum(solution,2);

