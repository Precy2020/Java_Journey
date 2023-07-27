package classwork;

public class MethodThatReturnsUniqueCharacters {
    public static void main(String[] args) {

        System.out.println(returns_special_characters("dhk+=wol"));
    }

    public static boolean returns_special_characters(String string) {
        String character = "+-_*#%$!@&";
        for (int index = 0; index < string.length() - 1; index++) {
            for (int index2 = 0; index2 < character.length() - 1; index2++) {
                if (string.charAt(index) == character.charAt(index2)) return true;
            }
        }
        return false;
    }
}
