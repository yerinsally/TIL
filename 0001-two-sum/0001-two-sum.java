class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int num1 = -1;
        int num2 = -1;
        for(int i=0; i<nums.length; i++){
            num1 = nums[i];
            for(int j=i+1; j<nums.length; j++){
                num2 = nums[j];
                if(num1+num2==target){
                    answer[0]=i;
                    answer[1]=j;
                }
            }
            
        }
        return answer;
    }
}