package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        URL url = new URL(
                "https://api.openweathermap.org/data/2.5/weather?lat=53.669353&lon=23.813131&appid=71c96f4bb2d19d04e134aa2b72afde9c"
        );
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(url.openStream()));
        String str = bufferedReader.readLine();
        JSONObject jsonObject = new JSONObject(str);

        str = String.valueOf(jsonObject.get("main"));

        JSONObject jsonObject1 = (JSONObject) jsonObject.get("main");
        str = String.valueOf(jsonObject1.get("temp"));
        welcomeText.setText(str);
    }
}