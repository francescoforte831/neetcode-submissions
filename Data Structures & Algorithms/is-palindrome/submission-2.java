class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int front = 0;
        int back = s.length() - 1;
        while (back > front) {
            System.out.println(s.charAt(front) + " " + s.charAt(back) + " \n");
            if (!Character.isLetterOrDigit(s.charAt(front))) {
                System.out.println(s.charAt(front) + "\n");
                front++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(back))) {
                System.out.println(s.charAt(back) + "\n");
                back--;
                continue;
            }
            if (s.charAt(front) != s.charAt(back)) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
