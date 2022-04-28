package com.company;
import java.util.HashMap;

public class Main {

    public static void main(String[] args)
    {
        ListNode val1=new ListNode(3);
        ListNode val2=new ListNode(2);
        ListNode val3=new ListNode(0);
        ListNode val4=new ListNode(-4);
        val1.next=val2;
        val2.next=val3;
        val3.next=val4;
        val4.next=val2;
        System.out.println(hasCycle(val1));
        System.out.println(val1.next);
        System.out.println(val2.next);
        System.out.println(val3.next);

    }
    public static boolean hasCycle(ListNode head)
    {
        if(head.next==null || head==head.next)
        {
            return false;
        }
        HashMap<ListNode,ListNode > nodes = new HashMap<ListNode, ListNode>();

        ListNode tempValue=head;
        while (true)
        {
            if(tempValue.next==null)
            {
                return false;
            }
            else if(nodes.containsValue(tempValue))
            {
                return true;
            }
            else
            {
                nodes.put(tempValue,tempValue);
                tempValue=tempValue.next;
            }
        }
    }

    static class ListNode
    {
        int val;
      ListNode next;
      ListNode(int x)
      {
         val = x;
         next = null;
      }
   }

}
