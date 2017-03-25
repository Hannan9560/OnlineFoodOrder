package com.brishty.onlinefoodorder;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Spinner mSpinner;
    private int year, month, day, hour, minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSpinner = (Spinner) findViewById(R.id.myArea);

        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.area_name
        ,android.R.layout.simple_spinner_item);

        mSpinner.setAdapter(adapter);
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String area = mSpinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, area, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void selectFood(View view) {
        switch (view.getId()){
            case R.id.chk_chicken:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_Pizza:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_beef:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_Biriany:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_drinks:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_beefbiriany:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_jouce:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_noodls:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.chk_tehari:
                if(((CheckBox)view).isChecked()){
                    Toast.makeText(this, ((CheckBox)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void selectpayment(View view) {
        switch (view.getId()){
            case R.id.Cash_on_Delivery:
                if(((RadioButton)view).isChecked()){
                    Toast.makeText(this, ((RadioButton)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.online:
                if(((RadioButton)view).isChecked()){
                    Toast.makeText(this, ((RadioButton)view).getText().toString(), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void setdate(View view) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(this, dateListener, year, month, day);
        dpd.show();
    }
    private DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
            Toast.makeText(MainActivity.this, "Year: "+year, Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "Month: "+(month+1), Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "Day: "+day, Toast.LENGTH_SHORT).show();
        }
    };

    public void settime(View view) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        hour = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);


        TimePickerDialog tpd = new TimePickerDialog(this, timeListener, hour, minute, true);
        tpd.show();
    }
    private TimePickerDialog.OnTimeSetListener timeListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
            Toast.makeText(MainActivity.this, "House: "+year, Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "Minut: "+(month+1), Toast.LENGTH_SHORT).show();
        }
    };


}
