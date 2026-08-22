class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();

       for(String word : strs){
        char[] ch = word.toCharArray(); // ['tea'] >> ['t', 'e', 'a']
        Arrays.sort(ch); // ['a','e','t']
        String key = new String(ch); //'aet'


        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(word); // map.get(aet)
       }
       return new ArrayList<>(map.values());
    }
}





