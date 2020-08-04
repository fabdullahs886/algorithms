package com.linkeddlist;

//Remove all elements from a linked list of integers that have value val.
//
//        Example:
//
//        Input:  1->2->6->3->4->5->6, val = 6
//        Output: 1->2->3->4->5

public class RemoveLinkedListElements {

    private ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode node = head;
        while(node != null && node.next != null){
            if(node.next != null && node.next.val == val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}
