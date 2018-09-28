package com.example.kayaya.kasa_ki;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ActivityProvincias extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesquisa_provincia);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(myToolbar);

        //Spinner
        Spinner spinner_municipio = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<CharSequence> adapter_municipio = ArrayAdapter.createFromResource(this,
                R.array.municipios_luanda, android.R.layout.simple_spinner_item);
        //ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
        //        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cities));
        //specify that adapter has drop down list
        adapter_municipio.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //set spinner to the adapter, to show the data into the spinner
        spinner_municipio.setAdapter(adapter_municipio);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.rgb(103, 55, 155));
        }
    }
    //Setting up the Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:

                return true;

            case R.id.action_upload:

                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        //spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
