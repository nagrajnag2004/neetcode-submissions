class Solution {
    public String mergeAlternately(String word1, String word2) {

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        int a = 0;
        int b = 0;

        char[] ch = new char[ch1.length + ch2.length];

        int i = 0;

        while (a < ch1.length && b < ch2.length) {
            ch[i] = ch1[a];
            i++;
            a++;

            ch[i] = ch2[b];
            i++;
            b++;
        }

        while (a < ch1.length) {
            ch[i] = ch1[a];
            i++;
            a++;
        }

        while (b < ch2.length) {
            ch[i] = ch2[b];
            i++;
            b++;
        }

        return new String(ch);
    }
}