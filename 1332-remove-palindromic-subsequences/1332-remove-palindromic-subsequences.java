class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String rs = sb.toString();
        if(rs.equals(s)) return 1;
        return 2;
    }
}