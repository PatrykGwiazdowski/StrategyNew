package List;

/**
 * Node class for one direcional list
 */

public class Node<E> implements Interfaces.Node<E>{
    private E data;
    private Node nextNode;

    public Node(E data,Node nextNode){
        this.data=data;
        this.nextNode=nextNode;
    }

    public Node() {

    }

    public E getData() {
        return data;
    }


    public void setData(E data) {
        this.data=data;
    }


    public Node getNextNode() {
        return nextNode;
    }


    public void setNextNode(Node nextNode) {
        this.nextNode= nextNode;
    }


}
