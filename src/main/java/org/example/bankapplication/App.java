package org.example.bankapplication;

import javafx.application.Application;

import javafx.stage.Stage;
import org.example.bankapplication.Models.Model;


public class App extends Application {

    @Override
    public void start(Stage stage)  {

        Model.getInstance().getViewFactory().showLoginWindow();

    }
}
