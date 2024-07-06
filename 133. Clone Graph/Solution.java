import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public Node cloneGraph(Node node) {
        return copyNode(node, new HashMap<Integer, Node>());
    }

    private Node copyNode(Node node, HashMap<Integer, Node> valuesAdded) {
        if (node == null) return node;
        Node nodeCopy = new Node(node.val);
        valuesAdded.put(nodeCopy.val, nodeCopy);
        for (Node neighbor : node.neighbors) {
            if (valuesAdded.containsKey(nodeCopy.val) && valuesAdded.get(neighbor.val) != null)
                nodeCopy.neighbors.add(valuesAdded.get(neighbor.val));
            else nodeCopy.neighbors.add(copyNode(neighbor, valuesAdded));
        }
        return nodeCopy;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
