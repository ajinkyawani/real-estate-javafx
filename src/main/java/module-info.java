module com.mycompany.awani1_6617_hw3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.awani1_6617_hw3 to javafx.fxml;
    exports com.mycompany.awani1_6617_hw3;
}