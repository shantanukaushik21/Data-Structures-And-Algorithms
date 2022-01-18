package leetcode;

public class MergeTwoSortedLists {
//	Leet Code 21. Merge Two Sorted Lists
}


 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return list1;
        if(list1==null && list2!=null)
            return list2;
        if(list1!=null && list2==null)
            return list1;
        ListNode head=new ListNode();
        ListNode tail=new ListNode();
        boolean flag =false;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                if(!flag){
                    head=list1;
                    tail=list1;
                    list1=list1.next;
                    flag=true;
                }else{
                    tail.next=list1;
                    list1=list1.next;
                    tail=tail.next;
                }
            }else if(list1.val>list2.val){
                if(!flag){
                    head=list2;
                    tail=list2;
                    list2=list2.next;
                    flag=true;
                }else{
                    tail.next=list2;
                    list2=list2.next;
                    tail=tail.next;
                }
            }else{
                if(!flag){
                    head=list1;
                    tail=list1;
                    list1=list1.next;
                    flag=true;
                }else{
                    tail.next=list1;
                    list1=list1.next;
                    tail=tail.next;
                    tail.next=list2;
                    list2=list2.next;
                    tail=tail.next;
                }
            }
        }
        while(list1!=null){
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }
        while(list2!=null){
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }
        return head;
    }
}