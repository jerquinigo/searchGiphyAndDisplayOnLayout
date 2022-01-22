package com.project.inputwithapipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    //android
    public EditText inputField;
    public Button submitButton;
    public LinearLayout linLayout;
    public OkHttpClient httpClient = new OkHttpClient();
    //java
    public ObjectMapper dataMapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = (EditText) findViewById(R.id.inputField);
        submitButton = (Button) findViewById(R.id.submitButton);


        submitButton.setOnClickListener(new View.OnClickListener() {
             OkHttpClient httpClient;
            @Override
            public void onClick(View view) {
                if(!inputField.getText().equals("")) {
                    OkHttpClient http = this.httpClient;
                    Request request = new Request.Builder()
                            .url("https://api.giphy.com/v1/gifs/search?api_key=&q="+ inputField.getText() +"&limit=10")
                            .build();
                    System.out.println("here in the text field ");
                }
            }
        });

    }
}