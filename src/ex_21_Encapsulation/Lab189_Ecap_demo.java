package ex_21_Encapsulation;

public class Lab189_Ecap_demo {
    public static void main(String[] args) {

        Good l = new Good("ashish", "1234");

        System.out.println(l.getPassword());

        l.setPassword("1212");

        System.out.println(l.getPassword());
    }
}

class Good {

    private String username;
    private String password;

    public Good(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
