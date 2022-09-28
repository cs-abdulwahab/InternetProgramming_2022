public class Palindrome {

    public static void main(String[] args) {
        System.out.println( isPalindrome("aBdebA") );
    }


    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int len = str.length() - 1;

        for (int i = 0 ; i< len ; i++ ){

            if (str.charAt(i) != str .charAt(len-i)){
                return  false;
            }

        }

        return true;
    }

    private static String reverse(String str) {


        return str;
    }


}
