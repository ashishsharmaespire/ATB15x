package ex_25_ENUM;

public enum Env {
    Dev("dev.com"),
    QA("qa.com"),
    UAT("Uat.com"),
    Prod("Pord.com");

    private String baseurl;

    Env(String baseurl)
    {
        this.baseurl = baseurl;

    }
    public  String getBaseurl()
    {

        return this.baseurl;
    }

}
