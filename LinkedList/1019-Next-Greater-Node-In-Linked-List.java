// Ques: You are given the head of a linked list with n nodes.

// For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.

// Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.

// Code:

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int size = size(head);
        int[] arr = new int[size];
        int ans = 0;
        int idx = 0;
        while(head!=null){
            if(head.val<ans){
                arr[idx] = ans;
                idx++;
                head = head.next;
            }
            else{
                arr[idx] = getAt(head);
                idx++;
                head = head.next;
            }
        } 
        return arr;
    }
    int getAt(ListNode head){
        ListNode temp = head;
        int ans = head.val;
        head = head.next;
        while(head!=null){
            if(head.val>ans){
                return (head.val);
            }
            head = head.next;
        }
        return 0;
    }
    int size(ListNode head){
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
}
