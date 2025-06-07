/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.grupo_07;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class MainViewController implements Initializable {

    @FXML
    private void onCreatePersonContact() throws IOException {
        App.tipoContactoSeleccionado = "persona";
        App.setRoot("secondary");
    }

    @FXML
    private void onCreateCompanyContact() throws IOException {
        App.tipoContactoSeleccionado = "empresa";
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}
