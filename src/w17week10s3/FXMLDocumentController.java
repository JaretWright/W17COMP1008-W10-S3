/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17week10s3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author jwright
 */
public class FXMLDocumentController implements Initializable {
    
    //Set up the instance variables for the CheckBox demo
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    @FXML private CheckBox cheeseCheckBox;
    @FXML private Button  orderButton;
    
    //Setup of the ChoiceBox
    @FXML private ChoiceBox<String> choiceBox;
    @FXML private Button choiceBoxButton;
    @FXML private Label choiceBoxOutputLabel;
    
    
    /**
     * This method works with the CheckBox elements
     */
    public void orderPizzaButtonPushed()
    {
        String order = "Order includes:";
        
        if (pineappleCheckBox.isSelected())
            order += String.format("%npineapple");
        
        if (baconCheckBox.isSelected())
            order += String.format("%nbacon");
        
        if (cheeseCheckBox.isSelected())
            order += String.format("%ncheese");
        
        this.pizzaOrderLabel.setText(order);
    }

    
    /**
     * This method is called when the button below the choice box is pushed
     */
    public void choiceBoxButtonPushed()
    {
        this.choiceBoxOutputLabel.setText(this.choiceBox.getValue().toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.pizzaOrderLabel.setText("");
        this.choiceBoxOutputLabel.setText("");
        
        //setup the ChoiceBox with fruit
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges", "pears", "strawberries");
//        choiceBox.setValue("apples");
    }    
    
}
