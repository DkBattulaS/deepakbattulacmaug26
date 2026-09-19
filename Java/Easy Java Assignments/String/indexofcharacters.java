public class indexofcharacters {
    static String str = "The quick brown fox jumps over the lazy dog";
    static String lower = str.toLowerCase();

    public static void main(String[] args) {

        // Array to store index of each alphabet
        int[] index = new int[26];

        for (char ch = 'a'; ch <= 'z'; ch++) {
            index[ch - 'a'] = lower.indexOf(ch);
            System.out.print(ch + " ");
        }


        System.out.println();

        for (int i : index) {
            System.out.print(i + " ");
        }
    }
}