package page1;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;


/**
 * 两数相加
 *
 * @author yangren
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        l1.next = l1_2;
        ListNode l1_3 = new ListNode(3);
        l1_2.next = l1_3;

        ListNode l2 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        l2.next = l2_2;
        ListNode l2_3 = new ListNode(4);
        l2_2.next = l2_3;

//        ListNode l1 = new ListNode(9);
//
//        ListNode l2 = new ListNode(1);
//        ListNode l2_1 = new ListNode();
//        l2_1.val = 9;
//        l2.next = l2_1;
//        ListNode l2_2 = new ListNode();
//        l2_2.val = 9;
//        l2_1.next = l2_2;
//
//        ListNode l2_3 = new ListNode();
//        l2_3.val = 9;
//        l2_2.next = l2_3;
//
//        ListNode l2_4 = new ListNode();
//        l2_4.val = 9;
//        l2_3.next = l2_4;
//
//        ListNode l2_5 = new ListNode();
//        l2_5.val = 9;
//        l2_4.next = l2_5;
//
//        ListNode l2_6 = new ListNode();
//        l2_6.val = 9;
//        l2_5.next = l2_6;
//
//        ListNode l2_7 = new ListNode();
//        l2_7.val = 9;
//        l2_6.next = l2_7;
//
//        ListNode l2_8 = new ListNode();
//        l2_8.val = 9;
//        l2_7.next = l2_8;
//
//        ListNode l2_9 = new ListNode();
//        l2_9.val = 9;
//        l2_8.next = l2_9;

        ListNode listNode = addTwoNumbers(l1, l2);
        listNode = listNode.next;
        System.out.println(listNode);
    }

    /**
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        ListNode  p = listNode;
        int temp = 0;

        while (l1 != null || l2 != null) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int current = (a + b + temp) % 10;
            temp = (a + b + temp) / 10;
            ListNode currentNode = new ListNode(current);
            p.next = currentNode;
            p = currentNode;
        }
        return  listNode;
    }
}
