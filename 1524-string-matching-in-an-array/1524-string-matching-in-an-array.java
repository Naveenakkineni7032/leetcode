class Solution {
    public List<String> stringMatching(String[] words) {
          List<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words.length; j++) {
                if(i != j && words[i].indexOf(words[j]) != -1 && !ans.contains(words[j])) {
                    ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}