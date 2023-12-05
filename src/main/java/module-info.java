module com.example.ctdl {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ctdl to javafx.fxml;
    exports com.example.ctdl;

    opens hw6_22001624_latrungnghia.ex3 to javafx.fxml;
    exports hw6_22001624_latrungnghia.ex3;

    opens hw7_22001624_latrungnghia.ex2 to javafx.fxml;
    exports hw7_22001624_latrungnghia.ex2;
}