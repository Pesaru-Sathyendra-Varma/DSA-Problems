class Solution {
    public int gcdOfOddEvenSums(int n) {
        int o=n*n;
        int e=n*(n+1);
        while(e!=0){
            int t=e;
            e=o%e;
            o=t;
        }
        return o;
    }
}