import java.util.*;

class Solution {
    public String rankTeams(String[] votes) {
        if (votes.length == 0) {
            return "";
        }

        Map<Character, int[]> teamVotes = new HashMap<>();

        for (String vote : votes) {
            for (int j = 0; j < vote.length(); j++) {
                teamVotes.putIfAbsent(vote.charAt(j), new int[vote.length()]);
                teamVotes.get(vote.charAt(j))[j]++;
            }
        }

        List<Character> teams = new ArrayList<>(teamVotes.keySet());
        teams.sort((team1, team2) -> {
            int[] votes1 = teamVotes.get(team1);
            int[] votes2 = teamVotes.get(team2);

            for (int i = 0; i < votes[0].length(); i++) {
                if (votes1[i] != votes2[i]) {
                    return votes2[i] - votes1[i];
                }
            }
            return team1 - team2;
        });

        StringBuilder result = new StringBuilder();
        for (char team : teams) {
            result.append(team);
        }

        return result.toString();
    }
}
