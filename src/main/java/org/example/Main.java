package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        ListNode reversed = reverse(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversed);
    }

    public static  void printLinkedList(ListNode head){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.value+" ");
            current= current.next;
        }
        System.out.println();
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while(current!=null){
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        return prev;
    }


}