class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> mp =new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Character>sc=new ArrayList<>(mp.keySet());
         Collections.sort(sc, (a,b) -> mp.get(b)-mp.get(a));

         StringBuilder result =new StringBuilder();
         for(char c:sc){
            result.append(String.valueOf(c).repeat(mp.get(c)));
         }
         return result.toString();
    }
}