class Solution {
    public String encode(List<String> strs) {
        StringBuilder resultString = new StringBuilder();

        for (String s : strs) {
            resultString.append(Integer.valueOf(s.length())).append("#").append(s);
        }

        return resultString.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> strs = new ArrayList<>();
        while (i < str.length()) {
            String number = "";
            while (str.charAt(i) != '#') {
                number = number + str.charAt(i);
                i++;
            }
            int stringLength = Integer.valueOf(number);
            strs.add(str.substring(i + 1, i + 1 + stringLength));
            i += 1 + stringLength;
        }

        return strs;
    }
}
