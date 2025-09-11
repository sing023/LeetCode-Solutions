class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String,List<Integer>> names = new HashMap<>();
        for(int i=0; i<keyName.length; i++) {
            String[] time = keyTime[i].split(":");
            int minutes= Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
            
            // List<Integer> times  = new ArrayList<>();
            // if (names.containsKey(keyName[i])) {
            //     times = names.get(keyName[i]);
            // }
            // times.add(minutes);
            // names.put(keyName[i],times);
            names.computeIfAbsent(keyName[i], k->new ArrayList<>()).add(minutes);
        }

        List<String> answer = new ArrayList<>();
        for(String name: names.keySet()) {
            List<Integer> times = names.get(name);
            Collections.sort(times);

            for(int i=0; i<times.size()-2; i++) {
                if (times.get(i+2)-times.get(i)<=60) {
                    answer.add(name);
                    break;
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}