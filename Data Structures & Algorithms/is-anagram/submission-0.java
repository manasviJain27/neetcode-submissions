class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            if(mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            } if (mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i), mapT.get(t.charAt(i)) + 1);
            } if(!mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i), 1);
            } if (!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i), 1);
            }
        }
        System.out.println(mapS.toString());
        System.out.println(mapT.toString());
        return mapS.equals(mapT);
    }
}
