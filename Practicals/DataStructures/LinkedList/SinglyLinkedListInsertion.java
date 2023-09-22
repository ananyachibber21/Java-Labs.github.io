
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
    public void insert(int data) // Insertion at the end
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

    public void insertAtBeg(int data) //Insert in the beginning
    {
        Node temp = new Node(data);
        temp.next = this.head;
        this.head = temp;
    }

    public void insertInBetween(int data, int val) //Insert after some value
    {
        Node temp = new Node(data);
        Node ptr = this.head;
        while (ptr.data != val) {
            ptr = ptr.next;
        }
        Node ptr1 = ptr.next;
        ptr.next = temp;
        temp.next = ptr1;
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

public class SinglyLinkedListInsertion
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(45);
        l.insert(60);
        l.insertAtBeg(30);
        l.insertInBetween(50, 45);
        l.show();
    }
}

