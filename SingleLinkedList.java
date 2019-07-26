/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Ken
 */
public class SingleLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }
    
    public static SingleLinkedList insert(SingleLinkedList list, int data){
        Node new_node = new Node(data); 
        new_node.next = null; 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    }
    
    public static void printList(SingleLinkedList list){
        Node currNode = list.head;
        System.out.print("\nLinkedList : ");
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }
    
    public static SingleLinkedList deleteByKey(SingleLinkedList list, int key){
        Node currNode = list.head, prev = null;
        if (currNode != null && currNode.data == key){
            list.head = currNode.next;
            System.out.println(key + "Found and Deleted");
            return list;
        }
        
        while (currNode !=null && currNode.data != key){
            prev = currNode;
            currNode = currNode.next;
        }
        
        if (currNode != null){
            prev.next = currNode.next;
            System.out.println(key + "Found and Deleted");
        }
        
        if (currNode == null){
            System.out.println(key + "Not Found");
        }
        return list;
    }
    
    public static SingleLinkedList deleteAtPosition(SingleLinkedList list, int index){
        Node currNode = list.head, prev = null; 
          if (index == 0 && currNode != null) { 
            list.head = currNode.next; 
            System.out.println(index + "Position Element Deleted"); 
            return list; 
        } 
        int counter = 0;
        while (currNode != null) { 
              if (counter == index) { 
                prev.next = currNode.next; 
                System.out.println(index + "Position Element Deleted"); 
                break; 
            } 
            else { 
                prev = currNode; 
                currNode = currNode.next; 
                counter++; 
            } 
        }
        if (currNode == null){
            System.out.println(index + "Position Element not Found");
        }
        return list;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        
        printList(list);
        deleteByKey(list, 1);
        
        printList(list);
        deleteByKey(list, 4);
        
        printList(list);
        deleteByKey(list, 10);
        
        printList(list);
        deleteAtPosition(list, 0);
        
        printList(list);
        deleteAtPosition(list, 2);
        
        printList(list);
        deleteAtPosition(list, 6);
    }
    
}
