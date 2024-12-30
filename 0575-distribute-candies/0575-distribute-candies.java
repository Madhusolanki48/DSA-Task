class Solution{
public int distributeCandies(int[] candyType) {
    boolean[] type = new boolean[200001];
    int count = 0, max = candyType.length / 2;
    for(int candy: candyType) {
        int t = candy + 100000;
        if(!type[t]) {
            if(++count == max) return max;
            type[t] = true;
        }
    }
    return count;
}
}