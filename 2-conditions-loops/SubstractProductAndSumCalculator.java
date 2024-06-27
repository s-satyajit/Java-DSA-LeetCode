class Solution {
    public int SubstractProductAndSum(int n) {
        int sum=0; int prod=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            prod=prod*rem;
            n/=10;
        }
        return prod-sum;
    }
}

public class SubstractProductAndSumCalculator {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.SubstractProductAndSum(343);
        System.out.println(result);
    }

}