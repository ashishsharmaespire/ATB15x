package ex_17_OOPs;

public class LoginPage {

    String email;
    public LoginPage(String email,String password)
    {

        this.email = email;
        this.password=password;

    }

    String password;


    public LoginPage(String email, String password, String submitButton) {
        this.email = email;

        this.submitButton = submitButton;
    }

    String submitButton;




}
