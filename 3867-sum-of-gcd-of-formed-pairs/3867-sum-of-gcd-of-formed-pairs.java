class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            prefixGcd[i] = gcd(nums[i], max);
        }

        
        

        Arrays.sort(prefixGcd);
        int i = 0;
        int j = nums.length-1;
        long sum = 0;
        while(i<j){
            sum += gcd(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }

        return sum;





        
    }

    public static int gcd(int a, int b){
        if(b == 0)  return a;
        else{
            return gcd(b, a%b);
        }
    }
}