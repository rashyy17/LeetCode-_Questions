class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (hs.containsKey(ch) == false) {
                hs.put(ch, 1);
            } else {
                hs.put(ch, hs.get(ch) + 1);
            }
        }
        for (char ch : t.toCharArray()) {
            if (hs.containsKey(ch) == true) {
                hs.put(ch, hs.get(ch) - 1);
            } else {
                return false;
            }
        }
        Boolean b = false;
        for (Integer v : hs.values()) {
            if (v == 0) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        if (b == true) {
            return true;
        } else
            return false;
    }
}
