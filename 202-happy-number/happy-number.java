class Solution {
    public boolean isHappy(int n) {
        if( n == 1)
            return true;
        while (n>0){
            if (n == 1)
                return true;
            if(n<=6)
                 return false;
            n = squres(n);
        }
        return false;
        }
        static int squres (int n){
            int res = 0;
            while (n>0){
                res+=(n%10)*(n%10);
                n/=10;
            }
            return res;
        }
    }
