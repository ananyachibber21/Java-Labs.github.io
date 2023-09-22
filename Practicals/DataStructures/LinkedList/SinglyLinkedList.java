class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;
    public LinkedList()
    {
        this.head = null;
    }
    public void insert(int data)
    {
        if(head == null)
        {
            head = new Node(data);
        }
        else{
            Node ptr = head;
            Node temp = new Node(data);
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next = temp;
        }
    }

    public void show()
    {
        Node ptr = head;
        while(ptr.next!=null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
        System.out.println(ptr.data);
    }
}

public class SinglyLinkedList
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(45);
        l.insert(60);
        l.show();
    }
}
