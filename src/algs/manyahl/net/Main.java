package algs.manyahl.net;

public class Main {
    public static int tapeEquilibrium(int[] A){
        int N = A.length;
        int result=Integer.MAX_VALUE;
        int leftSum = A[0];
        int rightSum = 0;
        for(int i=1;i<N;i++)    rightSum+=A[i];
        int diff=Math.abs(leftSum-rightSum);
        if(diff<result) result=diff;
        for(int i = 1;i < N -1;i++){
            leftSum+=A[i];
            rightSum-=A[i];
            diff=Math.abs(leftSum-rightSum);
            if(diff<result) result=diff;
        }
        return result;
    }
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
