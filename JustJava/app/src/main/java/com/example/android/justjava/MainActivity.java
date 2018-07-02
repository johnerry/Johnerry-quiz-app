package com.example.android.justjava;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

import java.text.NumberFormat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    int quantity = 2;

    public void decrement(View view) {
        if (quantity != 1) {
            quantity = quantity - 1;
        } else {
            Toast.makeText(MainActivity.this, "Minimum order quantity reached", Toast.LENGTH_SHORT).show();
        }
        display(quantity);
    }

    public void increment(View view) {
        if (quantity <= 99) {
            quantity = quantity + 1;
        } else {
            Toast.makeText(MainActivity.this, "Maximum order quantity reached", Toast.LENGTH_SHORT).show();
        }
        display(quantity);
    }

    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void order(View view) {
        EditText textField = (EditText) findViewById(R.id.text_field);
        String textValue = textField.getText().toString();

        CheckBox whippedCream = (CheckBox) findViewById(R.id.whipped_cream);
        boolean hasWhippedCream = whippedCream.isChecked();

        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean hasChocolate = chocolate.isChecked();

        int creamPrice = 0;
        int chocolatePrice = 0;

        if (hasWhippedCream) {
            creamPrice = quantity;
        }
        if (hasChocolate) {
            chocolatePrice = quantity * 2;
        }

        int price = (quantity * 5) + creamPrice + chocolatePrice;

        String priceMessage = "Name: " + textValue;
        priceMessage += "\nAdd Whipped Cream = " + hasWhippedCream;
        priceMessage += "\nAdd Chocolate = " + hasChocolate;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\n" + getString(R.string.thank_you);
//        displayMessage(priceMessage);
        String subject = "Order summary";
        String addresses = "fashanutosin@gmail.com";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:")); // only email apps should handle this
        emailIntent.putExtra(Intent.EXTRA_EMAIL, addresses);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }
}