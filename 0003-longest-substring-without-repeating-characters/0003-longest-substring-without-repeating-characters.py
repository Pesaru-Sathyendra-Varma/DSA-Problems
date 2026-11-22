class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        r=""
        maximum=0
        for i in s:
            if i not in r:
                r+=i
                maximum=max(maximum,len(r))
            else:
                r=r[r.index(i)+1:]
                r+=i
                maximum=max(maximum,len(r))
        return maximum
        