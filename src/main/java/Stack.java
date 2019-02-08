import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Stack {

    Node topNode = null;

    public void push(Object object) {
        Node incomingNode = new Node();

        incomingNode.data = object;
        incomingNode.previousNode = topNode;
        topNode = incomingNode;
    }

    public Boolean isEmpty() {
        return isNull(topNode);
    }

    public Object peek() {
        return nonNull(topNode) ? topNode.data : null;
    }

    public Object pop() {
        if (isNull(topNode)) {
            return null;
        }

        Node poppedNode = topNode;
        topNode = topNode.previousNode;

        return poppedNode.data;
    }

    public Integer size() {
        Integer size = 0;
        Node currentNode = topNode;

        while (nonNull(currentNode)) {
            currentNode = currentNode.previousNode;
            size++;
        }

        return size;
    }
}