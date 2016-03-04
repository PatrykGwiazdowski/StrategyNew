package TwoWayList;

/**
 * Created by INV-6179 on 04.03.2016.
 */
public class Node<E> implements Interfaces.Node<E> {
    private E data;
    private Node nextNode;
    private Node previousNode;
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
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
}
