import java.util.*; 
 
public class DoubleLinkedList { 
    class Node { 
        int data; 
        Node previous; 
        Node next; 
 
        public Node(int data) { 
            this.data = data; 
        } 
    } 
 
    Node head, tail = null; 
 
    public void addNode(int data) { 
        Node newNode = new Node(data); 
        if (head == null) { 
            head = tail = newNode; 
            head.previous = null; 
        } else { 
            tail.next = newNode; 
            newNode.previous = tail; 
            tail = newNode; 
            tail.next = null; 
        } 
    } 
 
    public void deleteFromList(int n) { 
        if (head == null) { 
            return; 
        } else { 
            Node current = head; 
            for (int i = 1; i < n; i++) { 
                current = current.next; 
            } 
            if (current == head) { 
                head = current.next; 
                if (head != null) { 
                    head.previous = null; 
                } 
            } else if (current == tail) { 
                tail = tail.previous; 
                if (tail != null) { 
                    tail.next = null; 
                } 
            } else { 
                current.previous.next = current.next; 
                current.next.previous = current.previous; 
            } 
            current = null; 
        } 
    } 
 
    public void display() { 
        Node current = head; 
        if (head == null) { 
            System.out.println("List is empty"); 
            return; 
        } 
        System.out.println("Node of double linklist is : "); 
        while (current != null) { 
            System.out.println(current.data + ""); 
            current = current.next; 
        } 
    } 
 
    public static void main(String[] args) { 
        DoubleLinkedList dList = new DoubleLinkedList(); 
 
        Scanner obj = new Scanner(System.in); 
        int p; 
        p = 4; // Initialize p to some value 
        do { 
            System.out.println("Enter the choice \n 1.Create\t2.Deletion\n3.Display\t4.Exit"); 
            int m = obj.nextInt(); 
 
            switch (m) { 
                case 1: 
                    System.out.println("Enter the data"); 
                    int i = obj.nextInt(); 
                    dList.addNode(i); 
                    break; 
                case 2: 
                    System.out.println("Enter the position of data"); 
                    int c = obj.nextInt(); 
                    dList.deleteFromList(c); 
                    break; 
                case 3: 
                    System.out.println("Double lik list : "); 
                    dList.display(); 
                    break; 
                case 4: 
                    System.out.println("Exiting the loop"); 
                    p = 0; 
                    break;     
                default: 
                    System.out.println("Invalid input"); 
                    break; 
            } 
        } while (p == 4); // Corrected loop condition 
    } 
} 