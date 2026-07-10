class Solution {
    public List<String> letterCombinations(String s) {
        int n = s.length();
        List<String> ans =new ArrayList<>();
        String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(n == 1){
            int n1 = s.charAt(0) - '0';
            for(int i=0;i<arr[n1].length();i++)
            ans.add(""+arr[n1].charAt(i));
        }else if(n == 2){
            int n1 = s.charAt(0) - '0';
            int n2 = s.charAt(1) - '0';
            for(int i=0;i<arr[n1].length();i++)
            for(int j=0;j<arr[n2].length();j++)
            ans.add(""+arr[n1].charAt(i)+""+arr[n2].charAt(j));

        }else if( n== 3){
            int n1 = s.charAt(0) - '0';
            int n2 = s.charAt(1) - '0';
            int n3 = s.charAt(2) - '0';
            for(int i=0;i<arr[n1].length();i++)
            for(int j=0;j<arr[n2].length();j++)
            for(int k=0;k<arr[n3].length();k++)
            ans.add(""+arr[n1].charAt(i)+""+arr[n2].charAt(j)+""+arr[n3].charAt(k));

        }else{
            int n1 = s.charAt(0) - '0';
            int n2 = s.charAt(1) - '0';
            int n3 = s.charAt(2) - '0';
            int n4 = s.charAt(3) - '0';
            for(int i=0;i<arr[n1].length();i++)
            for(int j=0;j<arr[n2].length();j++)
            for(int k=0;k<arr[n3].length();k++)
            for(int r=0;r<arr[n4].length();r++)
            ans.add(""+arr[n1].charAt(i)+""+arr[n2].charAt(j)+""+arr[n3].charAt(k)+""+arr[n4].charAt(r));

        }
        return ans;
    }
}