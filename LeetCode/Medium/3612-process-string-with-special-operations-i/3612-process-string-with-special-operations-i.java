class Solution {

    public String REV(String str) {
        char[] arr = str.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }

    public String REM(String st) {
        int n = st.length();

        if (n == 0) {
            return "";
        }

        String res = "";

        for (int i = 0; i < n - 1; i++) {
            res += st.charAt(i);
        }

        return res;
    }

    public String processStr(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '#') {
                res = res + res;
            }
            else if (s.charAt(i) == '%') {
                res = REV(res);
            }
            else if (s.charAt(i) == '*') {
                res = REM(res);
            }
            else {
                res += s.charAt(i);
            }
        }

        return res;
    }
}