public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String comp = strs[0];
        int indexMin = comp.length();
        int index = 0;

        for(int i = 1; i < strs.length; i++){
            while(index < Math.min(comp.length(), strs[i].length())
                    && comp.charAt(index) == strs[i].charAt(index)){
                index++;
            }
            if(index < indexMin) indexMin = index;
            index = 0;
        }

        return comp.substring(0, indexMin);
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
