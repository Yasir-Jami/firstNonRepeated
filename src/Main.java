public class Main {
    private static void firstNonRepeated(String s) {
        String s1; // First non-repeated character, if one exists
        String prev;
        String[] sList = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            s1 = s.substring(i, i+1).toLowerCase();
            if (i > 0) {
                prev = s.substring(i-1, i).toLowerCase();
                if (s1.equals(prev)) {
                    sList[i-1] = null;
                    continue;
                }
            }
            sList[i] = s1;
        }
        s1 = "";

        for (String value : sList) {
            if (value != null) {
                s1 = value;
                break;
            }
        }
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String a = "hello";
        String b = "aabcc";
        String c = "aabbcc";

        firstNonRepeated(a);
        firstNonRepeated(b);
        firstNonRepeated(c);
    }
}