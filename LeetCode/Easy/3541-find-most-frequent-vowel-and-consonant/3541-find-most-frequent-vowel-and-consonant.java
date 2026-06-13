class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character ,Integer> Vmap = new HashMap<>();
         HashMap<Character ,Integer> Cmap = new HashMap<>();

         for(int i = 0 ; i< s.length() ; i++){
            char c = s.charAt(i) ;
            if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                Vmap.put(c , Vmap.getOrDefault(c ,0) +1);
            }else{
                Cmap.put(c , Cmap.getOrDefault(c ,0) +1);
            }
         }
         int Vcount = 0 ; 
         int Ccount = 0;
         for(int freq : Vmap.values()){
            Vcount = Math.max(Vcount , freq);
         }
        for(int freq : Cmap.values()){
            Ccount = Math.max(Ccount , freq);
         } 
        return Vcount+Ccount; 
    }
}