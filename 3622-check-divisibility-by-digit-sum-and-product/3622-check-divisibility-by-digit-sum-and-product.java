class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int o=n;
        while(n!=0){
            int last=n%10;
            sum+=last;
            p*=last;
            n/=10;
        }
        int t=sum+p;
        if(o % t == 0) return true;
        return false;
    }
}