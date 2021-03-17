package com.example.task_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private String[] inputCountryName, convertedCountryName;
    private Spinner inputSpinner, convertedSpinner;
    private Button convertorButton;
    private EditText inputEditText;
    private  TextView convertedTextView ;
    private  double input_Country_EditText_Double;
    private double result;
    private boolean inputFirstSelection =true;
    String inputEditTextString ;
    private String inputCountry, ConvertedCountry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkup();
        processing();

    }

    private  void  linkup()
    {
        inputCountryName = getResources().getStringArray(R.array.input_Country_Name);
        convertedCountryName = getResources().getStringArray(R.array.converted_Country_Name);

        inputSpinner = findViewById(R.id.input_spinner_ID);
        convertedSpinner = findViewById(R.id.converted_spinner_ID);

        inputEditText = findViewById(R.id.input_editText);

        convertorButton = findViewById(R.id.showConvertorID);

        convertedTextView = findViewById(R.id.resultTextView_ID);


        ArrayAdapter<String> inputAdapter = new ArrayAdapter<String>(this,R.layout.country_sample_view,R.id.input_Country_Sample_ID,inputCountryName);
        inputSpinner.setAdapter(inputAdapter);

        ArrayAdapter<String> convertedAdapter = new ArrayAdapter<>(this,R.layout.country_sample_view,R.id.converted_Country_Sample_ID,convertedCountryName);
        convertedSpinner.setAdapter(convertedAdapter);

    }


    private  void processing()
    {

        //listener add for input currency
        inputSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(inputFirstSelection==true)
                {
                    inputFirstSelection = false;
                }
                else
                    {

                    Toast.makeText(getApplicationContext(),inputCountryName[position]+" is selected for input currency",Toast.LENGTH_SHORT).show();
                    inputEditText.setText("");

                    }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //for converted currency
        convertedSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(inputFirstSelection==true)
                {
                    inputFirstSelection = false;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),convertedCountryName[position]+" is selected for convert",Toast.LENGTH_SHORT).show();
                    convertedTextView.setText(" ");


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        convertorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inputEditTextString = inputEditText.getText().toString();
                input_Country_EditText_Double = Double.parseDouble(inputEditTextString);

                inputCountry = inputSpinner.getSelectedItem().toString();
                ConvertedCountry = convertedSpinner.getSelectedItem().toString();


                if(inputCountry.equals("Bangladeshi Taka") && ConvertedCountry.equals("Kuwaiti Dinar") )
                {
                    result = input_Country_EditText_Double/279;
                    convertedTextView.setText(String.format("%.2f", result));

                }
                if(inputCountry.equals("Bangladeshi Taka") && ConvertedCountry.equals("United States Dollar") )
                {
                    result = input_Country_EditText_Double/85;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Bangladeshi Taka") && ConvertedCountry.equals("Euro") )
                {
                    result = input_Country_EditText_Double/103;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Bangladeshi Taka") && ConvertedCountry.equals("Japanese Yen  ") )
                {
                    result = input_Country_EditText_Double*1.22;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Kuwaiti Dinar") && ConvertedCountry.equals("Bangladeshi Taka") )
                {
                    result = input_Country_EditText_Double*279;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Kuwaiti Dinar") && ConvertedCountry.equals("United States Dollar") )
                {
                    result = input_Country_EditText_Double*3.29;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Kuwaiti Dinar") && ConvertedCountry.equals("Euro") )
                {
                    result = input_Country_EditText_Double*2.71;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Kuwaiti Dinar") && ConvertedCountry.equals("Japanese Yen") )
                {
                    result = input_Country_EditText_Double*339;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("United States Dollar") && ConvertedCountry.equals("Bangladeshi Taka") )
                {
                    result = input_Country_EditText_Double*85;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("United States Dollar") && ConvertedCountry.equals("Kuwaiti Dinar") )
                {
                    result = input_Country_EditText_Double*0.3;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("United States Dollar") && ConvertedCountry.equals("Euro") )
                {
                    result = input_Country_EditText_Double*0.83;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("United States Dollar") && ConvertedCountry.equals("Japanese Yen") )
                {
                    result = input_Country_EditText_Double*103;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Euro") && ConvertedCountry.equals("Bangladeshi Taka") )
                {
                    result = input_Country_EditText_Double*103;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Euro") && ConvertedCountry.equals("Kuwaiti Dinar") )
                {
                    result = input_Country_EditText_Double*0.37;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Euro") && ConvertedCountry.equals("United States Dollar") )
                {
                    result = input_Country_EditText_Double*1.21;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Euro") && ConvertedCountry.equals("Japanese Yen") )
                {
                    result = input_Country_EditText_Double*125;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Japanese Yen") && ConvertedCountry.equals("Bangladeshi Taka") )
                {
                    result = input_Country_EditText_Double*0.8;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Japanese Yen") && ConvertedCountry.equals("Kuwaiti Dinar") )
                {
                    result = input_Country_EditText_Double/339;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Japanese Yen") && ConvertedCountry.equals("United States Dollar") )
                {
                    result = input_Country_EditText_Double/103;
                    convertedTextView.setText(String.format("%.2f", result));

                }

                if(inputCountry.equals("Japanese Yen") && ConvertedCountry.equals("Euro") )
                {
                    result = input_Country_EditText_Double/125;
                    convertedTextView.setText(String.format("%.2f", result));

                }











            }
        });




    }






}
