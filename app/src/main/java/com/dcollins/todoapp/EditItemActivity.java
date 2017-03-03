package com.dcollins.todoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etUpdateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String text = getIntent().getStringExtra("text");
        int position = getIntent().getIntExtra("position", 0);

        etUpdateText = (EditText) findViewById(R.id.etUpdateText);
        etUpdateText.append(text); // Used append() instead of setText(), so that the cursor will be at the end of the string

        // Show the keyboard when the view is visible
        if(etUpdateText.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
}
