class Solution {
    public boolean isAnagram(String s, String t) {
        //Optimal Solution
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26]; //initialize an empty array representing the number of characters in the alphabet with each value being 0
        for(int i = 0; i < s.length(); i++){
            //converting char to integer and then going into that index and adding 1 to it if s has that character
            count[s.charAt(i) - 'a']++;
            //converting char to integer in string t and then removing 1 from the count array at that index
            count[t.charAt(i) - 'a']--;
        }
    System.out.println(Arrays.toString(count));
//looping through the count array and checking if each entry in the array is equal to 0 and if it is then it is an anagram
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;

    }
}
