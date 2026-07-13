//Single liked list implementation with insert at last, first, mid and position with display function and switch case menu

import java.util.Scanner;

public class SingleLinkedList {
    Node head=null;
    Node tail=null;
    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        int data, pos, ch;
        Scanner s = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("1.insertLast\n2.InsertFirst\n3.InsertMid\n4.InsertPosition");
            System.out.println("5.display\n6.deleteLast\n7.DeleteFirst\n8.DeleteMid\n9.DeletePos\n10.Exit");
            ch=s.nextInt();
            switch (ch) {
                case 1:
                    data=s.nextInt();
                    sl.insert(data);                    
                    break;
                case 2:
                    data=s.nextInt();
                    sl.insertAtFirst(data);
                    break;
                case 3:
                    data=s.nextInt();
                    sl.insertAtMid(data);                    
                    break;
                case 4:
                    data=s.nextInt();
                    pos=s.nextInt();
                    sl.insertAtPos(data, pos);                    
                    break;
                case 5:
                    sl.display();
                    System.out.println();
                    break;
            
                default:
                    break;
            }
        }
        // sl.insert(10);
        // sl.insert(20);
        // sl.insert(30);
        // sl.insert(40);
        // sl.insert(50);
        // sl.insertAtFirst(5);
        // sl.insertAtMid(60);
        // sl.insertAtMid(90);
        // System.out.println();
        // sl.display();
        // System.out.println();
        // sl.insertAtPos(25, 5);
        // sl.display();

    
    }
    private void insertAtPos(int data, int pos) {
        Node newNode=new Node(data);
        if(pos==1){
        newNode.next=head;
        head=newNode;
        return;
       }
       int count=1;
       Node temp=head;
       while(temp.next!=null && count<pos-1){
        temp=temp.next;
        count++;
       }
       if(temp.next==null){
        temp.next=newNode;
        return;
       }
       Node karuna=temp.next;
       newNode.next=karuna;
       temp.next=newNode;

    }
    private void insertAtMid(int data) {
        if(head==null || head.next==null){
            insert(data);
            return;
        }
        Node newNode= new Node(data);
        Node pre=null, slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next=slow;
        pre.next=newNode;
    }
    private void insertAtFirst(int data) {
        if(head==null){
            insert(data);
            return;
        }
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    private void display() {
        if(head==null){
            System.out.println("List is empty..");
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    private  void insert(int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
