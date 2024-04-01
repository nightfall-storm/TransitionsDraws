package com.example.interface_graphique_b;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isFirstImageVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ImageButton from the layout
        ImageButton button = findViewById(R.id.button);

        // Set a click listener to toggle between images
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleImages(button);
            }
        });
    }

    private void toggleImages(ImageButton button) {
        TransitionDrawable transitionDrawable = (TransitionDrawable) button.getDrawable();
        if (isFirstImageVisible == false) {
            transitionDrawable.startTransition(500);

        }
        if (isFirstImageVisible) {
            transitionDrawable.startTransition(500);
        } else {
            transitionDrawable.reverseTransition(500);
        }

        isFirstImageVisible = !isFirstImageVisible;
    }
}
