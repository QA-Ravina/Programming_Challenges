public class StringManipulation {
    //concatenate and convert :Take 2 strings, concatenate them,
    // and convert the result to upeercase
    public static void main(String[] args) {
        String firstName = "Ravina";
        String lastname = "Arora";
        String fullname = firstName.concat(" ").concat(lastname);
        System.out.println(fullname.toUpperCase());

    }
}
