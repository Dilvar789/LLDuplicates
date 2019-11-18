import java.util.*;
public class RemoveDuplicatesFromLL 
{
	static Node head;
	public static class Node
	{
	    int data;
	    Node next;
		Node(int d)
		{
			data=d;
		}
	}
	public  RemoveDuplicatesFromLL insert(RemoveDuplicatesFromLL li,int data) 
	{
		Node newNode=new Node(data);
		newNode.next=null;
		
		if(head == null)
		{
			head=newNode;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	 public RemoveDuplicatesFromLL deleteDuplicates(RemoveDuplicatesFromLL head) {
		    Set<Integer> set = new HashSet<>();
		    RemoveDuplicatesFromLL pre = null;
		    RemoveDuplicatesFromLL fakeHead = head;
		    while(fakeHead != null){
		        if(!set.add(fakeHead.val)){
		            pre.next = fakeHead.next;
		        } 
		        else
		        {
		            pre = fakeHead;
		        }
		        fakeHead = fakeHead.next;
		    }
		    return head;
		   }    
	public static void main(String[] args) 
	{
		RemoveDuplicatesFromLL li=new RemoveDuplicatesFromLL();
		   li.insert(li, 10);
		   li.insert(li, 20);
		   li.insert(li, 30);
		   li.insert(li, 40); 
		   li.RemoveDuplicatesFromLL(head);
	}
}
