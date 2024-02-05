public class access_modifiers {
    public static void main(String[] args) {
        BankDetails b1 = new BankDetails();
        b1.Username="RRY";
        // b1.password="RRY@2004";      //gives an error because password is private only 
    }                                   //accessible within the same class
}

class BankDetails{
    String Username;
    private String password;
}
