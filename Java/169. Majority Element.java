//169. Majority Element
// Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
// You may assume that the array is non-empty and the majority element always exist in the array.

public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        HashMap store = new HashMap();
        for(int i=0; i<len; i++) {
            if(true == store.containsKey(nums[i])) {
                int getval = (int)store.get(nums[i]);
                store.put(nums[i], getval+1);
                if (getval+1 > (len/2))
                    return nums[i];
            } else {
                store.put(nums[i],1);
            }
        }
        return -1;
    }
}
// Runtime: 31 ms
//space O(n)
//Time O(n)
// HashMap : https://www.tutorialspoint.com/java/java_hashmap_class.htm

//Some other awesome solutions:
public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
}
//Notes : there will atleast n/2 + 1 repeating n - (n/2 +1) others element
// for example 1,2,2,2  n = 4 majorityElement count = 2+1 =3 others elements =1

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
	  int len = nums.length;
	  return nums[len/2];
    }
}

//Some more
//https://discuss.leetcode.com/topic/17446/6-suggested-solutions-in-c-with-explanations
