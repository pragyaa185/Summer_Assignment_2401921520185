
class MinStack {
    private class Node {
        int value;
        int currentMin;
        Node next;

        Node(int value, int currentMin, Node next) {
            this.value = value;
            this.currentMin = currentMin;
            this.next = next;
        }
    }

    private Node topNode;

    public MinStack() {
        topNode = null;
    }
    
    public void push(int val) {
        if (topNode == null) {
            topNode = new Node(val, val, null);
        } else {
            // New minimum check karo
            int updatedMin = val;
            if (topNode.currentMin < updatedMin) {
                updatedMin = topNode.currentMin;
            }
            topNode = new Node(val, updatedMin, topNode);
        }
    }
    
    public void pop() {
        if (topNode != null) {
            topNode = topNode.next;
        }
    }
    
    public int top() {
        return topNode.value;
    }
    
    public int getMin() {
        return topNode.currentMin;
    }
}