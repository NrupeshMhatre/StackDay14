package stackprogram;

public class PeakandPop {
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

    
    public void push(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
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

   
    public void pop() {
        Node current = head;
        while (current != null) {
                if (current == head) {
                    head = head.next;
                    current = head;
                }
        }
    }

    
    public int peak(){
        Node current1 = head;
            return current1.data;
    }

    public static void main(String[] args) {
    	PeakandPop  list = new PeakandPop();
        list.push(70);
        list.push(30);
        list.push(56);

        list.display();
        System.out.println("Peak Element is = "+list.peak());
        list.pop();
        list.display();
    }

}

