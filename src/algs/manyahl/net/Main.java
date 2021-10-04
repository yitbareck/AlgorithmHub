package algs.manyahl.net;

public class Main {
    public static int specialString(String str){
        int n = str.length();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = -1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    if ( (index == -1) || (j - index) == (index - i)) n++;
                } else if (index == -1) index = j;
                else break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(specialString("aabaabac"));
    }
}
