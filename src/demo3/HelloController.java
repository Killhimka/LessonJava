package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textFeeld;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        String cityName = textFeeld.getText();
        List<City> list = init();
        String lat = "", lon = "";
        for (City c: list){
            if(c.getName().equals(cityName)){
                lat = c.getLat();
                lon = c.getLon();
                break;
            }
        }
        URL url = new URL(
                "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=71c96f4bb2d19d04e134aa2b72afde9c"
        );
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(url.openStream()));
        String str = bufferedReader.readLine();
        JSONObject jsonObject = new JSONObject(str);

        /*str = String.valueOf(jsonObject.get("main"));*/

        JSONObject jsonObject1 = (JSONObject) jsonObject.get("main");

        String temp = String.valueOf(jsonObject1.get("temp"));
        String feelTemp = String.valueOf(jsonObject1.get("feels_like"));
        String minTemp = String.valueOf(jsonObject1.get("temp_min"));
        String maxTemp = String.valueOf(jsonObject1.get("temp_max"));

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Current temp is "+(Math.round(Double.valueOf(temp)-273))+"\n");
        stringBuilder.append("Temp fells like "+(Math.round(Double.valueOf(feelTemp)-273))+"\n");
        stringBuilder.append("Min temp is "+(Math.round(Double.valueOf(minTemp)-273))+"\n");
        stringBuilder.append("Current temp is "+(Math.round(Double.valueOf(maxTemp)-273))+"\n");
        welcomeText.setText(stringBuilder.toString());
    }
    private List<City> init(){
        List<City> list = new ArrayList<>();
        list.add(new City("Minsk","53.893009","27.567444"));
        list.add(new City("Grodno","53.669353","23.813131"));
        list.add(new City("Brest","52.097622","23.734051"));
        list.add(new City("Gomel","53.893009","27.567444"));
        list.add(new City("Mogilev","53.9007159","30.3313598"));
        list.add(new City("Vitebsk","53.893009","27.567444"));
        return list;
    }
}