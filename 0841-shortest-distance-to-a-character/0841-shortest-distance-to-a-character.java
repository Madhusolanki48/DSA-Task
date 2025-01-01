class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) continue;
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n-1; i++) {
            if (distance[i] == Integer.MAX_VALUE) continue;
            else distance[i + 1] = Math.min(distance[i+1], distance[i] + 1);
        }
        for (int i = n-1; i > 0; i--) {
            distance[i-1] = Math.min(distance[i-1], distance[i] + 1);
        }
        return distance; 
    }
}