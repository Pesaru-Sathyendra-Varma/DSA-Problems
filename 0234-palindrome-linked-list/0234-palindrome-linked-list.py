# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: ListNode | None) -> bool:
        
            values=[]
            temp=head
            while temp:
                values.append(temp.val)
                temp=temp.next
        
            return values==values[::-1]
        