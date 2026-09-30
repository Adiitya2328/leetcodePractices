class Solution {

    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
        boolean valid = false;
        boolean invalid = false;
            int num = i;
            while (num!= 0) {
                int digit = num % 10;
                num = num/ 10;
                if(digit==3||digit==4||digit==7){
                    invalid=true;
                    break;
                }
                if (digit == 2||digit ==5|| digit == 6 || digit == 9) {
                    valid = true;
                }
                
            }
            if (!invalid && valid) {
                    count++;
                }

        }
        return count;
    }
}