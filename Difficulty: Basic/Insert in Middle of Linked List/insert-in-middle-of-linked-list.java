//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        if (head == null) {
            return new Node(data);
        }

        Node newNode = new Node(data);
        Node temp = head;
        int size = 0;
        
        // Calculate the size of the linked list
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Find the middle position
        int mid = size % 2 == 0 ? size / 2 : size / 2 + 1;
        Node current = head;
        
        // Traverse to the node just before the middle position
        for (int i = 1; i < mid; i++) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}