package com.linkeddlist;

//Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
//
//        Example:
//
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4

public class MergeTwoSortedLists {
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode current_node = node;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current_node.next = l1;
                l1 = l1.next;
            }else{
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }

        if( l1 != null){
            current_node.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current_node.next = l2;
            l2 = l2.next;
        }
        return node.next;
    }
}
