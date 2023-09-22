
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
    public void insert(int data) // Insertion in the front
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

    public void insertAtBeg(int data) //Insert At the end
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

    public int delBeg() //Delete value at the beginning
    {
        int temp = this.head.data;
        if (head.next != null) {
            this.head = this.head.next;
        }
        return temp;

    }

    public void delEnd() //Delete value from the end 
    {
        Node ptr = this.head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    public int delInBetween(int val) //Delete value in between the list
    {
        Node ptr = this.head;
        while (ptr.data != val) {
            ptr = ptr.next;
        }
        Node ptr1 = ptr.next;
        Node ptr2 = ptr1.next;
        int temp = ptr1.data;
        ptr.next = ptr2;
        return temp;
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

public class SinglyLinkedListDeletion
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(45);
        l.insert(60);
        l.insertAtBeg(30);
        l.insertInBetween(50, 45);
        l.delEnd();
        l.show();
    }
}

