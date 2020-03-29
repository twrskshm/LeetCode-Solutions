public class ExcelSheetColumnNumber {
    public static int titleToNumber(final String s) {
        int powerOfTwentySix = s.length() - 1, result = 0;

        for (int i = 0; i < s.length(); i++, powerOfTwentySix--)
            result += Math.pow(26, powerOfTwentySix) * value(s.charAt(i));

        return result;
    }

    public static int value(final char character) {
        return (int) character - 64;
    }
}
