package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("first = " + first);

        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        int index = 2;
        Node getNode = getNode(first, index);
        System.out.println("getNode = " + getNode);

        add(first, "D");
        System.out.println("first = " + first);
        add(first, "E");
        System.out.println("first = " + first);
        add(first, "F");
        System.out.println("first = " + first);
    }

    private static void add(Node inputNode, String param) {
        Node lastNode = getLastNode(inputNode);
        lastNode.next = new Node(param);
    }

    private static Node getNode(Node inputNode, int index) {
        Node node = inputNode;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static Node getLastNode(Node inputNode) {
        Node node = inputNode;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    private static void printAll(Node inputNode) {
        Node node = inputNode;
        while (node != null) {
            System.out.println("x.item = " + node.item);
            node= node.next;
        }
    }
}
