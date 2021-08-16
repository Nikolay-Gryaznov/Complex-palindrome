import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sbSrcStr= new StringBuilder(s);
        int iCount = sbSrcStr.length();
        for (int i = 0; i < iCount; i++) {
            if (sbSrcStr.toString().equals(sbSrcStr.reverse().toString()))
                break;
            else
                sbSrcStr.reverse();
            sbSrcStr.insert(iCount, sbSrcStr.substring(i, i+1));
        }
        System.out.println(sbSrcStr.toString());
    }

}