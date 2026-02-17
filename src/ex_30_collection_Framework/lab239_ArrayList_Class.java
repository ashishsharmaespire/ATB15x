package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class lab239_ArrayList_Class {
    public static void main(String[] args) {

        APIAutomation appwvo = new APIAutomation("app.wro.com","https");
        APIAutomation katlonstu = new APIAutomation("katlon","https");
        APIAutomation ttbank = new APIAutomation("tt bank","https");

        List<APIAutomation> apiAutomationList = new ArrayList<>();

        apiAutomationList.add(appwvo);
        apiAutomationList.add(katlonstu);
        apiAutomationList.add(appwvo);

        appwvo.printdetails();
        katlonstu.printdetails();
        ttbank.printdetails();

    }

}

class APIAutomation
{
    private String appName;
    private String urls;

    public APIAutomation(String appName, String urls) {
        this.appName = appName;
        this.urls = urls;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;


    }

    public  void printdetails()

    {

        System.out.println("Information" + this.appName+ this.urls);


    }
}