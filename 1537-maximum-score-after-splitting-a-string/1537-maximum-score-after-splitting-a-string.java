class Solution {
    public int maxScore(String s) {
        int res=0;
        for(int i=1;i<s.length();i++){
            String left=s.substring(0,i);
            String right=s.substring(i);
            res=Math.max(res,help(left,'0')+help(right,'1'));
        }
        return res;
    }
    public int help(String s,char target){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                count++;
            }
        }
        return count;
    }
}