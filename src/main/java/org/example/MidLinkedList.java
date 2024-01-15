package org.example;

public class MidLinkedList {

    public static class ListNode{
        public int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
        }

    }

    public  static  ListNode  findMid(ListNode head){

        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null&& fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;

        }
        return  slow;


    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next =new ListNode(3);

        ListNode mid = findMid(head);
        System.out.println(mid.data);
//        System.out.println(head);


    }

}
