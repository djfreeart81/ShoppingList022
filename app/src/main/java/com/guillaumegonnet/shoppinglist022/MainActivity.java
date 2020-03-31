package com.guillaumegonnet.shoppinglist022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;

    int viewCount = 0;
    String[] itemList = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView[] viewList = new TextView[]{findViewById(R.id.item1_main),
                findViewById(R.id.item2_main),
                findViewById(R.id.item3_main),
                findViewById(R.id.item4_main),
                findViewById(R.id.item5_main),
                findViewById(R.id.item6_main),
                findViewById(R.id.item7_main),
                findViewById(R.id.item8_main),
                findViewById(R.id.item9_main),
                findViewById(R.id.item10_main)};

        if (savedInstanceState != null) {
            itemList = savedInstanceState.getStringArray("item list");
            viewCount = savedInstanceState.getInt("viewCount variable");
            for (int i = 0; i < itemList.length; i++) {
                if (itemList[i] != null) {
                    TextView view = viewList[i];
                    view.setText(itemList[i]);
                }
            }
        }
    }

    public void AddItem(View view) {

        Intent intent = new Intent(this, ShoppingItem.class);
        if (viewCount < 10) {
            startActivityForResult(intent, REQUEST_CODE);
        } else {
            Button button = findViewById(R.id.button_main);
            button.setEnabled(false);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView[] viewList = new TextView[]{findViewById(R.id.item1_main),
                findViewById(R.id.item2_main),
                findViewById(R.id.item3_main),
                findViewById(R.id.item4_main),
                findViewById(R.id.item5_main),
                findViewById(R.id.item6_main),
                findViewById(R.id.item7_main),
                findViewById(R.id.item8_main),
                findViewById(R.id.item9_main),
                findViewById(R.id.item10_main)};


        if (REQUEST_CODE == requestCode) {
            if (RESULT_OK == resultCode) {
                String itemToBeAdded = data.getStringExtra(ShoppingItem.SHOPPING_ITEM);
                TextView view = viewList[viewCount];
                itemList[viewCount] = itemToBeAdded;
                view.setText(itemToBeAdded);
                viewCount++;
            }
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putStringArray("item list", itemList);
        outState.putInt("viewCount variable", viewCount);
    }

}
