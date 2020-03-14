package bills;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppController implements Initializable {

    @FXML
    private BorderPane borderPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void close(MouseEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void checksPageOpen(MouseEvent event) {
        lodPage("/views/checkPage");
    }

    @FXML
    private void billesPageOpen(MouseEvent event) {
        lodPage("/views/billsPage");
    }

    @FXML
    private void reportPageOpen(MouseEvent event) {
        lodPage("/views/reportPage");
    }

    private void lodPage(String page) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderPane.setCenter(root);
    }

    @FXML
    private void fullScreen(MouseEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.setFullScreen(true);
    }

    @FXML
    private void minimiz(MouseEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.setIconified(true);
    }

}
