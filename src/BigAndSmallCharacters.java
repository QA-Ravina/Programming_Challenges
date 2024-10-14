public class BigAndSmallCharacters {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculation of big and small letters in a string\n");

        String message = "WelcomeToMyCodingWorld";
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);

            // In the ASCII table:The uppercase English letters are represented by the numbers 65 to 90.

            if(ch >= 65 && ch <= 90 ){
                upperCase++;
            } else {
                lowerCase++;
            }
        }
        System.out.println("Upper case letters are : " + upperCase);
        System.out.println("Lower case letters are: " + lowerCase);
    }
}
