/*
// Definition for a Node.
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
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        Map<Node, Node> map = new HashMap<>();
        map.put(node, new Node(node.val));

        while(!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Node neighbor: currentNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }

                map.get(currentNode).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);

    }
}