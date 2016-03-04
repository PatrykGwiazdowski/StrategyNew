package List;

/**
 * Created by INV-6179 on 03.03.2016.
 */
public class List<E> extends AbstractClasses.List<E> {
    Node<E> head;

    public List(){
        head=new Node();
        size=0;
    }
    /**
     * Adds element to end of the List
     * @param o Element to be added
     */
    public void addElement(E o) {
        if(size==0){
            head.setData(o);
        }else{

            Node<E> tmpNode=head;
            while (tmpNode.getNextNode()!=null){
                tmpNode=tmpNode.getNextNode();                //interate to end of the list
            }
            tmpNode.setNextNode(new Node(o,null));
        }
        size++;
    }

    /**
     * Removes element at specified index in List
     * @param index Index of element to be Removed
     */
    public void removeElement(int index) {
        if(index==0){
            removeFirst();
        }
        if(index>0){
            Node tmpNode=getNode(index-1);
            tmpNode.setNextNode(tmpNode.getNextNode().getNextNode());
            size--;
        }
    }


    /**
     * Removes firs element of List
     */
    public void removeFirst(){
        Node tmpNode=head;
        tmpNode.setNextNode(head);
        size--;
    }

    /**
     * Remove all elements from List. After Calling this list size is 0
     */
    public void clear() {
        /*Node tmpNode=head;
        for(int i=0;i<size;i++){

        }*/
        head=null;
        size=0;
    }

    /**
     * return true if list is empty
     * @return true  if list is empty
     */
    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }

        return false;
    }

    /**
     * checks if List contains specified elements
     * @param o List element to check
     * @return  true if list contains specified element
     */

    public boolean contains(E o) {
        Node tmpNode=head;
        for(int i=0;i<size;i++){
            if(tmpNode.getNextNode().equals(o)){
                return true;
            }
            tmpNode=tmpNode.getNextNode();
        }
        return false;
    }


    /**
     * returns List Item at specified index
     * @param index index of element to return
     * @return  List item at specified index
     */
    @Override
    public E get(int index) {                                   //TODO something is wrong here
        return (E) getNode(index).getData();                      //List element at specified index
    }


    /**
     * replaces value at specified index of list
     * @param index index of element to replace
     * @param o Element that will be added to specified index
     */
    @Override
    public void set(int index, E o) {
        Node tmpNode=head;
        for(int i=0;i<index;i++){       //iterate to specified node
            tmpNode=tmpNode.getNextNode();
        }
        tmpNode.setData(o);                  //switch current List Element with given as parameter
    }


    /**
     *
     * Returns node of list at specified index
     * @param index index of node
     * @return node at given index of list
     */
    private Node getNode(int index) {
        Node tmpNode=head;
        for(int i=0;i<index;i++){           //iterate through all nodes to specified index
            tmpNode=tmpNode.getNextNode();
        }
        return tmpNode;             //node at specified index
    }

}
