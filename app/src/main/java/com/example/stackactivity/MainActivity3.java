package com.example.stackactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    // обработка нажатия кнопки
    public void onClickC(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); // использование флага перемещения нужной активности на вершину стека
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // использование флага уничтожения всех активности кроме той которая требуется
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); // использование флага перехода к нужной активности без перемещения данной активности в стеке
        startActivity(intent);
    }
}