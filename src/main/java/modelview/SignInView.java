
package modelview;

import com.mycompany.mvvmexample.App;
import viewmodel.AccessDataViewModel;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.mycompany.mvvmexample.FirestoreContext;
import com.mycompany.mvvmexample.FirestoreContext;
import com.mycompany.mvvmexample.FirestoreContext;
import com.mycompany.mvvmexample.FirestoreContext;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.Person;

/**
 *
 * @author jonat
 */
public class SignInView {
    
    @FXML
    private TextField passTxt;

    @FXML
    private TextField userTxt;

    @FXML
    void signInUser(ActionEvent event) throws IOException {
        App.setRoot("MenuView.fxml");
    }

    @FXML
    void switchToReg(ActionEvent event) throws IOException {
         App.setRoot("SignUpView.fxml");
    }
    
    
}
