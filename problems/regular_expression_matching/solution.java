class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] cache = new Boolean[s.length()+1][p.length()+1];
        int i=0, j=0;
        return dfs(i,j,cache,s.toCharArray(),p.toCharArray());
    }

    private boolean dfs(int i,int j, Boolean[][] cache, char[] s, char[] p ) {

        if(cache[i][j] !=null) {
            return cache[i][j];
        }
        if(i>=s.length && j>=p.length) {
            return true;
        }
        if(j>=p.length) {
            return false;
        }
        
        boolean match = i<s.length && (s[i] == p[j] || p[j]=='.');
        if (j+1<p.length && p[j+1] == '*') {
            return cache[i][j]=(match && dfs(i+1,j,cache,s,p)) || dfs(i,j+2,cache,s,p);
            
        }

        if (match){
            return cache[i][j]=dfs(i+1,j+1,cache,s,p);
        }
        return false;

    }

    // without caching
    // private boolean dfs(int i,int j, Map<Integer,Integer> cache, char[] s, char[] p ) {
    //     if(i>=s.length && j>=p.length) {
    //         return true;
    //     }
    //     if(j>=p.length) {
    //         return false;
    //     }
        
    //     boolean match = i<s.length && (s[i] == p[j] || p[j]=='.');
    //     if (j+1<p.length && p[j+1] == '*') {
    //         return (match && dfs(i+1,j,cache,s,p)) || dfs(i,j+2,cache,s,p);
    //     }

    //     if (match){
    //         return dfs(i+1,j+1,cache,s,p);
    //     }
    //     return false;

    // }

}