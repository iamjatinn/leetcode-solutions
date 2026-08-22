class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int total = 0;
        int og = n;
        while(n!=0){
            int temp = n%10;
            sum += temp;
            product *= temp;
            n = n/10;
        }


        if(og % (sum+product) == 0)  return true;
        else return false;
    }
}