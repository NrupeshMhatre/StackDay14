package stackprogram;

public class CreateQueue {
	public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    public void append(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

   
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
    	CreateQueue queue = new CreateQueue();
        queue.append(70);
        queue.append(30);
        queue.append(56);

        queue.display();
    }


}

