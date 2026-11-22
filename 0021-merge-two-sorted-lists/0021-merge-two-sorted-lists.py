# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: ListNode | None, list2: ListNode | None) -> ListNode | None:
        l1=list1
        l2=list2
        dummy=ListNode(None)
        tail=dummy
        while l1 is not None and l2 is not None:
            if l1.val>l2.val:
                tail.next=l2
                tail=tail.next
                l2=l2.next
            elif l1.val<l2.val:
                tail.next=l1
                tail=tail.next
                l1=l1.next
            elif l1.val==l2.val:
                tail.next=l1
                tail=tail.next
                l1=l1.next
        if l1 is not None:
            tail.next=l1
        if l2 is not None:
            tail.next=l2
        return dummy.next
        
           
        

        