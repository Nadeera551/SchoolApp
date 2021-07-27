import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StudentFormController {

    public TextField txtId;
    public TextField txtName;
    public TextField txtContact;
    public TextField txtAddress;
    public TextField txtSearch;
    public TableView tblStudents;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colAddress;

    public void btnSaveStudentOnAction(ActionEvent actionEvent) {
        Student s1= new Student(
                txtId.getText(),
                txtName.getText(),
                txtContact.getText(),
                txtAddress.getText()
        );
        System.out.println(s1);
    }

    public void btnDeleteStudentOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateStudentOnAction(ActionEvent actionEvent) {
    }
}
