class Solution {
    class Node{
        int count;
        char c;
        Node(int count, char c) {
            this.count = count;
            this.c = c;
        }
    }
    public String frequencySort(String s) {
        PriorityQueue<Node> heap = new PriorityQueue<>(
            (a,b) -> b.count - a.count
        );
        Map<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        map.forEach( (c,count)-> {
            heap.offer(new Node(count,c));
        });
        StringBuilder answ = new StringBuilder();
        while(heap.size()>0) {
            Node obj = heap.poll();
            for(int i=0; i<obj.count; i++) {
                answ.append(obj.c);
            }
        }
        return answ.toString();
    }
}