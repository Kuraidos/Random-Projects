import java.util.Iterator;
import java.util.LinkedList;


public class Main
{
    public static void main(String[] args)
    {
        ListNode l1= new ListNode(9,new ListNode(9,new ListNode(1)));
        ListNode l2= new ListNode(1);
        ListNode l3= addTwoNumbers(l1,l2);

        boolean foundNull=false;
        while (!foundNull)
        {
            System.out.println(l3.val);
            if(l3.next==null)
            {
                foundNull=true;
            }
            else
            {
                l3=l3.next;
            }
        }

    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2)
    {
        ListNode list1=l1;
        ListNode list2=l2;

        int num1=0;
        int num2=0;
        int carry=0;


        ListNode result= new ListNode();
        ListNode working = result;

        while(list1!=null || list2 !=null)
        {
            working.next = new ListNode();
            working=working.next;
            if(list1!=null)
            {
                num1 = list1.val;
                list1=list1.next;
            }
            else
            {
                num1=0;
            }
            if(list2!=null)
            {
                num2 = list2.val;
                list2=list2.next;
            }
            else
            {
                num2=0;
            }
            if(num1+num2+carry>9)
            {
                working.val=num1+num2+carry-10;
                carry=1;
            }
            else
            {
                working.val=num1+num2+carry;
                carry=0;
            }

        }
        if(carry==1)
        {
            working.next = new ListNode();
            working=working.next;
            working.val=carry;
        }


        return result.next;
    }


}
