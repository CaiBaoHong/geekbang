package org.geekbang.algs.day04;

/**
 * 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class Question_21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode pointer = head;
        while (l1 != null && l2 != null) {
            if (l1.val<l2.val){
                pointer.next = l1;
                l1 = l1.next;
            }else{
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }
        pointer.next = l1 == null ? l2 : l1;
        return head.next;
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        // linkedList1: 1, 2 ,4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        // linkedList2: 1, 3 ,4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        // print result
        ListNode result = mergeTwoLists(l1, l2);
        System.out.println("结果：");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
