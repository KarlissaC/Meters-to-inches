package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
      1m = 39.3701in
     */

     private Button convertButton;
     private EditText metereditText;
     private TextView resulttextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        metereditText = (EditText) findViewById(R.id.meterseditText);
        resulttextView = (TextView) findViewById(R.id.resulttextView);

        convertButton = (Button) findViewById(R.id.convertButtonID);

        convertButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v){
             //Conversion logic
              double multipler = 39.37;
              double result = 0.0;

              double meterValue = Double.parseDouble(metereditText.getText().toString());
              result = meterValue*multipler;

              resulttextView.setText(Double.toString(result) + "inches");





            }
        } );








    }
}
