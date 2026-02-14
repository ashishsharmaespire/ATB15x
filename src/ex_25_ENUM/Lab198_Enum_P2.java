package ex_25_ENUM;

import javax.xml.transform.Source;
import java.util.logging.SocketHandler;

public class Lab198_Enum_P2 {

    public static void main(String[] args) {

        Day today = Day.mon;

        switch (today)
        {
            case mon -> System.out.println("MOday");
            case fri -> System.out.println("Friday");




        }
        System.out.println(Api_urls.valueOf("google"));
    }
}
