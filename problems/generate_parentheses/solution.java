class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answ = new ArrayList<>();
        dfsGenerator(answ,new StringBuilder(),0,0,n);
        return answ;
    }

    private void dfsGenerator(List<String> l, StringBuilder sb, int openCount,int closeCount, int n) {
        if (sb.length()==n *2) {
            l.add(sb.toString());
            return;
        }
        if (openCount<n ) {
            sb.append('(');
            dfsGenerator(l,sb,openCount+1,closeCount,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if (closeCount<openCount) {// close relies on open u cant close without open 
            sb.append(')');
            dfsGenerator(l,sb,openCount,closeCount+1,n);
            sb.deleteCharAt(sb.length()-1);
        } 
          
    }

}