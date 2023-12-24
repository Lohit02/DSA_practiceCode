package w3Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG{

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }

}
    static class Solution {
        String longestCommonPrefix(String arr[], int n) {
            // code here
            String res = arr[0];
            for (int i = 0; i < n; i++) {
                res = findCommon(res, arr[i]);

            }
            if (res.length() != 0) {
                return res;
            } else {
                return "-1";
            }
        }

        public static String findCommon(String up, String p) {
            int l = Math.min(up.length(), p.length());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < l; i++) {
                if (up.charAt(i) == p.charAt(i)) {
                    sb.append(p.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
