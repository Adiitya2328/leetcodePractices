class Solution {
    public double angleClock(int hour, int minutes) {
        double diff = Math.abs(30*hour - 5.5*minutes);
        double other = Math.abs(360-diff);

        return Math.min(diff , other);
    }
}