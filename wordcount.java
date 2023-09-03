package com.example.lab1923;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;



public class wordcount extends AppCompatActivity {
    
    private EditText editTextGuess;
    private TextView textViewHint;
    private TextView textViewAttempts;
    private Button buttonSubmitGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicui);

        editTextGuess = findViewById(R.id.editTextGuess);
        textViewHint = findViewById(R.id.textViewHint);
        textViewAttempts = findViewById(R.id.textViewAttempts);
        buttonSubmitGuess = findViewById(R.id.buttonSubmitGuess);


        buttonSubmitGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String sentence = editTextGuess.getText().toString();
                    checkGuess(sentence);
                } catch (NumberFormatException e) {
                    Toast.makeText(wordcount.this, "Please enter a Sentence", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void checkGuess(String sentence) {

        // Split the input string into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Count the number of words
        int wordCount = words.length;
        textViewHint.setText("Number of words in the string: " + wordCount);
        ;
    }
}
