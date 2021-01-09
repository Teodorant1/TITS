package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    private Button downloaderOfCards;
    @FXML
    private Button BatchUpload;

    @FXML
    private TextField FileLocation;
    @FXML
    private TextArea Creator;
    @FXML
    private TextArea Destination;

    @FXML
    private Label cardfinal;

   // SqlMinion Sqlminion1 = new SqlMinion();
    RNGjesus Ron1 = new RNGjesus();


    @FXML
    private void handleAction (ActionEvent event) throws SQLException
    { //String stage1 = "Press Setup Decks to shuffle the decks";
      //String CardCreator = "Create New Card";
        if (downloaderOfCards.getText().contains("Setup"))
        {downloaderOfCards.setText("Create New Card");
         Ron1.preparedecks();}
    else if (downloaderOfCards.getText().equals("Create New Card"))
        {String y = Ron1.CreateCard();
        cardfinal.setText(y);}

    }

    @FXML
    private void uploadcards (ActionEvent event) throws SQLException, FileNotFoundException
    {  if (Destination.getText().equals("s"))
        { Ron1.Sqlminion1.comboSSS_BIG_insert(FileLocation.getText(),Creator.getText()); }
    else if (Destination.getText().equals("q"))
    {Ron1.Sqlminion1.comboQQQ_BIG_insert(FileLocation.getText(),Creator.getText());}
    }









    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
