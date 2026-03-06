import java.util.*;

class Solution {

    public boolean checkOnesSegment(String s) {

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                return false;
            }
        }

        return true;
    }
}

public class TestString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Solution obj = new Solution();
        boolean result = obj.checkOnesSegment(s);

        System.out.println(result);
    }
}