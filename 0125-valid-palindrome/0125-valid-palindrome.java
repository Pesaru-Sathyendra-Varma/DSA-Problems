class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')){
                
                rev += Character.toLowerCase(ch);
            }
        }
        int i=0;
        int j=rev.length()-1;
        while(i<j){
            if (rev.charAt(i)!=rev.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}