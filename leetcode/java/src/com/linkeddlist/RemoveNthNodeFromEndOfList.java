package com.linkeddlist;

//Given a linked list, remove the n-th node from the end of list and return its head.
//
//        Example:
//
//        Given linked list: 1->2->3->4->5, and n = 2.
//
//        After removing the second node from the end, the linked list becomes 1->2->3->5.
//        Note:
//
//        Given n will always be valid.
//
//        Follow up:
//
//        Could you do this in one pass?

public class RemoveNthNodeFromEndOfList {
    private ListNode removeNthFromEnd(ListNode head, int n) {
        if( head == null || n < 0) return head;

        // Solution 1
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         int len = 0;
//         ListNode tmp = head;
//         while(tmp != null){
//             len++;
//             tmp = tmp.next;
//         }

//         len -= n;
//         tmp = dummy;
//         for(int i = 0; i < len ;i++ ){
//            tmp = tmp.next;
//         }

//         tmp.next = tmp.next.next;
//         return dummy.next;

        //Solution 2
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode a = dummy;
        ListNode b = dummy;

        for(int i = 0; i < n + 1; i++){
            a = a.next;
        }

        while(a != null){
            a = a.next;
            b = b.next;
        }

        b.next = b.next.next;
        return dummy.next;
    }
}

