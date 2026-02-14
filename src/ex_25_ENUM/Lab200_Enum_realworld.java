package ex_25_ENUM;

public class Lab200_Enum_realworld {
    public static void main(String[] args) {
        System.out.println(locators.page_input_email.getLocator());
    }

}
enum locators{
    page_input_email("asasass"),
    page_input_passwrod("12121"),
    page_button("btn");

    private String locator;
    locators (String locator)
    {

        this.locator =locator;
    }

    String getLocator(){

        return this.locator;
    }


}
