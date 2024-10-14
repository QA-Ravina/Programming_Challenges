public class ArrayToString {
    // Take an array of words and concatenate them into a single  string using StringBuilder

    public static void main(String[] args) {
        String[] arr = new String[] {"This", "is" , "the", "best", "course", "on", "internet"
        };
        StringBuilder sb = new StringBuilder();
        for (String str: arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
