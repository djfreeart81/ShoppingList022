package com.guillaumegonnet.shoppinglist022;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ShoppingItem extends AppCompatActivity {

    public static final String LOG_TAG = ShoppingItem.class.getSimpleName();
    public static final String SHOPPING_ITEM = "com.guillaumegonnet.twoactivities.extra.ITEMSELECTED";
    private String itemSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_item);
    }

    public void AddItemToShoppingList(View view) {
        switch (view.getId()) {
            case R.id.button1_shoppingitem:
                itemSelected= getString(R.string.item1_shopping_item);
                break;

            case R.id.button2_shoppingitem:
                itemSelected=getString(R.string.item2_shopping_item);
                break;
            case R.id.button3_shoppingitem:
                itemSelected=getString(R.string.item3_shopping_item);
                break;
            case R.id.button4_shoppingitem:
                itemSelected=getString(R.string.item4_shopping_item);
                break;
            case R.id.button5_shoppingitem:
                itemSelected=getString(R.string.item5_shopping_item);
                break;
            case R.id.button6_shoppingitem:
                itemSelected=getString(R.string.item6_shopping_item);
                break;
            case R.id.button7_shoppingitem:
                itemSelected=getString(R.string.item7_shopping_item);
                break;
            case R.id.button8_shoppingitem:
                itemSelected=getString(R.string.item8_shopping_item);
                break;
            case R.id.button9_shoppingitem:
                itemSelected=getString(R.string.item9_shopping_item);
                break;
            case R.id.button10_shoppingitem:
                itemSelected=getString(R.string.item10_shopping_item);
                break;
            case R.id.button11_shoppingitem:
                itemSelected=getString(R.string.item11_shopping_item);
                break;
        }
        Log.d(LOG_TAG,"itemSelected is "+itemSelected);

        Intent returnIntent = new Intent();
        returnIntent.putExtra(SHOPPING_ITEM,itemSelected);
        setResult(RESULT_OK,returnIntent);
        finish();

    }
}
