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
        ListNode temp=new ListNode(0);
        ListNode res=temp;

        while(list1!=null  &&  list2!=null){
            if(list1.val <= list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }

        }
        if(list1!=null){
            temp.next=list1;
        }else{
            temp.next=list2;
        }
        return res.next;
     
    
     }
      public ListNode mergeKLists(ListNode[] lists) {

       
        
        if(lists.length==0){
        return null;}

        ListNode ans=null;//ans=lists[0];
        for(int i=0;i<lists.length;i++){
            ans=mergeTwoLists(ans,lists[i]);
        }
        return ans;
      
      }
        
    }
    
     /** public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; i++) {
            ans = mergeTwoLists(ans, lists[i]);
        }
        return ans;
    }
}
*/ 
