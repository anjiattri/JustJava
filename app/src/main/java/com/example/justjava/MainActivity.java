
package com.example.android.justjava;
import android.os.Bundle;
import java.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
/**
 This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int numberOfCoffee=2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage="Total Price:"+ " " +numberOfCoffee*5;
        priceMessage=priceMessage+"\n Thankyou!";
        displayMessage(priceMessage);
    }
    public void increment(View view) {
        numberOfCoffee=numberOfCoffee+1;
        display(numberOfCoffee);

    }
    public void decrement(View view) {

        numberOfCoffee=numberOfCoffee-1;
        display(numberOfCoffee);

    }
    /**

     This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    /**

     * This method displays the given text on the screen.

     */

    private void displayMessage(String message) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);

        priceTextView.setText(message);

    }
}