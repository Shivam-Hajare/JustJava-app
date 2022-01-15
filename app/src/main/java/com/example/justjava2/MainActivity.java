package com.example.justjava2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int quantity=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        int price=quantity*5;
        String priceMessage="Total: Rs."+ price;
        priceMessage=priceMessage+"\nThank You!";
        displayMessage(priceMessage);
    }
    public void display(int number)
    {
        TextView quantityTextView;
        quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText((""+number));
    }

    public void increment(View view)
    {
        quantity=quantity+1;
        display(quantity);

    }
    public  void decrement(View view)
    {
        quantity=quantity-1;
        if(quantity<0)
        {
            quantity=0;
        }
        display(quantity);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
