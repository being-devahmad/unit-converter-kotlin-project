package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convert_feet_to_inch(view: View) {

        var etval = findViewById<EditText>(R.id.etValue);
        var value_str = etval.text.toString() ;
        var value_int = Integer.parseInt( value_str );
        var inches = value_int * 12 ;

        var output = findViewById<TextView>(R.id.tvOutput);

        var msg = value_str + " Feet = " +  inches.toString() + " Inches " ;

        output.setText( msg ) ;

    }

    fun convert_meter_to_feet(view: View) {
        var etval = findViewById<EditText>(R.id.etValue);
        var value_str = etval.text.toString() ;
        var value_int = Integer.parseInt( value_str );
        var inches = value_int * 3.3 ;

        var output = findViewById<TextView>(R.id.tvOutput);

        var msg = value_str + " Meter = " +  inches.toString() + " Feet " ;

        output.setText( msg ) ;
    }
}