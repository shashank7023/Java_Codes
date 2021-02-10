package implementation;

public class Node {
    // store element of sequence
    private int data;
    // refer to next node of sequences
    private Node next;
    // constructor , cerate a node with given data
    public Node(int data){
        this.data=data;
        next=null;
    }
    //gettrt and setter

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
