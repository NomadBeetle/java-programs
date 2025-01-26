class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> alt = new ArrayList<>();
        int maxalt = 0;
        int highalt = 0;
        alt.add(maxalt);
        for (int i = 0; i < gain.length; i++){
            maxalt = alt.get(i) + gain[i];
            alt.add(maxalt);
        }

        for (int i = 0; i < alt.size(); i++){
            if (alt.get(i) > highalt){
                highalt = alt.get(i);
            }
        }

        return highalt;

    }
}