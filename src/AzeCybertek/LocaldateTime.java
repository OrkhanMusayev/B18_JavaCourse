package AzeCybertek;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day28_DateTime.DateTime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaldateTime {
    public static void main(String[] args) {

        LocalDate birth = LocalDate.of(2020,06,20);

        System.out.println(birth);

    }
}
