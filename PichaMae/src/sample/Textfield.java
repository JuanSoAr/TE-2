package sample;// Java program to create a textfield and add it to stage
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.*;
import java.util.ArrayList;

public class Textfield extends Application {
    public void start(Stage s) {
        s.setTitle("creating TextField");
        TextField b = new TextField();
        VBox r = new VBox();
        Button boton = new Button("Aceptar");
        Lector lector = new Lector();
        r.getChildren().add(b);
        r.getChildren().add(boton);
        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                leerRuta(b.getText(), lector, r);
                b.setText("");
            }
        });
        Scene sc = new Scene(r, 400, 400);
        s.setScene(sc);
        s.show();
    }
    public void leerRuta(String ruta, Lector lector, VBox r){
        ArrayList<String> list = lector.leer(ruta);
        if (list!= null){
            for(int i=0; i< list.size(); i++){
                Label label1 = new Label(list.get(i));
                r.getChildren().add(label1);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo");
        }
    }
    public static void main(String args[])
    {
        launch(args);
    }
}

