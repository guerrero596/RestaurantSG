package com.facci.restaurantsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivitySG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sg);
    }
    public void click1(View v){
        Toast.makeText(MainActivitySG.this,"Pescado Apanado",Toast.LENGTH_SHORT).Show();
    }
    public void click2(View v){
        Toast.makeText(MainActivitySG.this,"creme brulee",Toast.LENGTH_SHORT).Show();
    }
    public void click3(View v){
        Toast.makeText(MainActivitySG.this,"Sopa de Pollo",Toast.LENGTH_SHORT).Show();
    }
    public void click4(View v){
        Toast.makeText(MainActivitySG.this,"Pescado Apanado",Toast.LENGTH_SHORT).Show();
    }
    public void click5(View v){
        Toast.makeText(MainActivitySG.this,"Pollo a la Plancha",Toast.LENGTH_SHORT).Show();
    }
    public void click6(View v){
        Toast.makeText(MainActivitySG.this,"Desayunos",Toast.LENGTH_SHORT).Show();
    }
    public void click7(View v){
        Toast.makeText(MainActivitySG.this,"Chuleta",Toast.LENGTH_SHORT).Show();
    }
}
