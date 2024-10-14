public class dice {

    int roll(){
        double random = Math.random() * 6;
        return (int)Math.ceil(random);
    }


    //Simulate a dice roll using Math.random() and display the outcome 1 to 6
    public static void main(String[] args) {
        dice dice = new dice();
        for (int i = 0; i <10; i++){
            System.out.println(dice.roll());
        }
    }
}
