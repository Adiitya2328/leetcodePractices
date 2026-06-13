class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[] > res = new ArrayList<>();
        boolean insert = false;

        int s = newInterval[0];
        int e = newInterval[1];
        for(int i = 0 ; i<intervals.length ; i++){
            int s1 = intervals[i][0];
            int e1 = intervals[i][1];

            if(!insert && e1 < s){
                res.add(intervals[i]);
            }

            else if(s1 <=e){
                s = Math.min(s , s1);
                e = Math.max(e , e1);
            }

            else{
                if(!insert) {
                    res.add(new int[] {s , e});
                    insert = true;
                }
                res.add(intervals[i]);
            }
        }
        if(!insert) {
                    res.add(new int[] {s , e});
        }
        return res.toArray(new int[res.size()][]);
    }
}