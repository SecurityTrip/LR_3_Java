package functions;

public class LinkedList {
    private double valueX, valueY;
    private int index;
    private LinkedList head, nextNode;

    public double getValueX() {
        return valueX;
    }

    public void setValueX(double valueX) {
        this.valueX = valueX;
    }

    public double getValueY() {
        return valueY;
    }

    public void setValueY(double valueY) {
        this.valueY = valueY;
    }

    public LinkedList getHead() {
        return head;
    }

    public void setHead(LinkedList head) {
        this.head = head;
    }

    public LinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedList nextNode) {
        this.nextNode = nextNode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
