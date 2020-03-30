package com.guillaumegonnet.shoppinglist022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void AddItem(View view) {

        Intent intent = new Intent(this,ShoppingItem.class);
        startActivityForResult(intent,REQUEST_CODE);
    }
}
