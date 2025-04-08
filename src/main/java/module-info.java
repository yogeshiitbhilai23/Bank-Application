module org.example.bankapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.bankapplication to javafx.fxml;
    exports org.example.bankapplication;
    exports org.example.bankapplication.Controllers;
    exports org.example.bankapplication.Controllers.Admin;
    exports org.example.bankapplication.Controllers.Client;
    exports org.example.bankapplication.Models;
    exports org.example.bankapplication.Views;
}