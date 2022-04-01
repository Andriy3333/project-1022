package com.example.project1022mac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class RunGame extends AppCompatActivity {
    String guess;
    EditText guessInput;
    Button guessButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);

        guessInput = (EditText) findViewById(R.id.guessInput);
        guessButton = (Button) findViewById(R.id.guessButton);

        TextView HigherLowerTextView = (TextView) findViewById(R.id.HigherLower);
        TextView DescriptionTextView = (TextView) findViewById(R.id.description);

        DescriptionTextView.setText(String.format("Guess the number between 0 and %d", 5));

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess = guessInput.getText().toString().toString();
                HigherLowerTextView.setText("Higher");

            }
        });


    }
}
