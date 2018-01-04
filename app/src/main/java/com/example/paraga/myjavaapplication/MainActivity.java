package com.example.paraga.myjavaapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Account account = new Account();
        account.deposite(100.25);

        account.withdraw(25.20);
        account.setCustomerName("Parag");
        account.setEmailAddress("laik07@gmail.com");

    }
}
