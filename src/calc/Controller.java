package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

/**
 * Created by srabb on 2017-06-28.
 */


public class Controller  {

    @FXML private TextArea etScreen;
    private ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<String> operators = new ArrayList<>();
    private String value = "";
    private boolean start = true;
    private Calculator calculator = new Calculator();


    @FXML
    private void numberPressed(ActionEvent event) {
        if (start) {
            etScreen.setText("");
            start = false;
        }
        etScreen.appendText(((Button)event.getSource()).getText());
    }

    @FXML
    private void operatorPressed(ActionEvent event) {
        value = "";
        String operator = ((Button)event.getSource()).getText();
        if (operator.equals("=")) {
            start = true;
            value = calculator.calculate(etScreen.getText());
            etScreen.appendText("=" + value);
        } else {
            etScreen.appendText(operator);
        }
    }

    @FXML
    private void clearText(ActionEvent event) {
        etScreen.setText("");
        numbers.clear();
        operators.clear();
    }

}
