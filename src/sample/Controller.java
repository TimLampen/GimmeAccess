package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Controller {
    @FXML private Label output;
    @FXML private Label ip;
    @FXML private Label username;
    InetAddress inetAddress;
    public void pressInit(ActionEvent event){
        try {
            inetAddress = InetAddress.getLocalHost();
            ip.setText((inetAddress.getLocalHost() + "").split("/")[1]);
            username.setText(inetAddress.getHostName());
        }catch(UnknownHostException e){
            e.printStackTrace();
            output.setText(e.getMessage());
        }
        String words =
                "*******************************\n" +
                "Initiating script....\n" +
                "Found ip and username\n" +
                "*******************************";
        output.setText(words);
    }
}
