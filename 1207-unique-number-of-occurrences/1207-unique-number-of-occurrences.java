class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int frq : map.values()){
            if(set.contains(frq))   return false;
            set.add(frq);
        }
        return true;
    }
}