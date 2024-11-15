package com.example.tescikkupka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tekstPytanie;
    private TextView tekstPunkty;
    private TextView tekstBrawo;

    private ImageButton przycisk1;
    private ImageButton przycisk2;
    private ImageButton przycisk3;
    private ImageButton przycisk4;

    private ImageButton przycisk5;
    private ImageButton przycisk6;

    private Button klikSprawdz;
    private Button klikZakoncz;
    private Button klikDodaj;

    private int liczbaPunktow = 10;
    private int licznikDziecko = 0;
    private int licznikWaz = 0;
    private int licznikPszczola = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tekstPytanie = findViewById(R.id.textView);
        tekstPunkty = findViewById(R.id.textView2);
        tekstBrawo = findViewById(R.id.textView3);

        tekstPunkty.setText("Liczba punktów: " + String.valueOf(liczbaPunktow));

        przycisk1 = findViewById(R.id.imageButton3);
        przycisk2 = findViewById(R.id.imageButton4);
        przycisk3 = findViewById(R.id.imageButton5);
        przycisk4 = findViewById(R.id.imageButton6);

        przycisk5 = findViewById(R.id.imageButton7);
        przycisk6 = findViewById(R.id.imageButton8);

        przycisk5.setVisibility(View.INVISIBLE);
        przycisk6.setVisibility(View.INVISIBLE);

        klikSprawdz = findViewById(R.id.button);
        klikZakoncz = findViewById(R.id.button2);
        klikDodaj = findViewById(R.id.button3);

        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk1.setImageResource(R.drawable.dzieciak);
                licznikDziecko++;
            }
        });

        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk2.setImageResource(R.drawable.waz);
                licznikWaz++;
            }
        });

        przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk3.setImageResource(R.drawable.waz);
                licznikWaz++;
            }
        });

        przycisk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk4.setImageResource(R.drawable.dzieciak);
                licznikDziecko++;
            }
        });

        klikSprawdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(licznikDziecko == 2 || licznikWaz == 2 || licznikPszczola == 2){
                    tekstBrawo.setText("BRAWO!");

                    licznikWaz = 0;
                    licznikDziecko = 0;
                    licznikPszczola = 0;
                }
                else{
                    liczbaPunktow--;
                    przycisk1.setImageResource(R.drawable.reczniki);
                    przycisk2.setImageResource(R.drawable.reczniki);
                    przycisk3.setImageResource(R.drawable.reczniki);
                    przycisk4.setImageResource(R.drawable.reczniki);
                    przycisk5.setImageResource(R.drawable.reczniki);
                    przycisk6.setImageResource(R.drawable.reczniki);

                    tekstPunkty.setText("Liczba punktów: " + String.valueOf(liczbaPunktow));

                    licznikWaz = 0;
                    licznikDziecko = 0;
                    licznikPszczola = 0;

                    tekstBrawo.setText("UPS!");
                }
            }
        });

        klikZakoncz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tekstPytanie.setText("Zakończono z liczbą punktów: " + String.valueOf(liczbaPunktow));

                przycisk1.setVisibility(View.INVISIBLE);
                przycisk2.setVisibility(View.INVISIBLE);
                przycisk3.setVisibility(View.INVISIBLE);
                przycisk4.setVisibility(View.INVISIBLE);
                przycisk5.setVisibility(View.INVISIBLE);
                przycisk6.setVisibility(View.INVISIBLE);

                klikSprawdz.setVisibility(View.INVISIBLE);
                klikZakoncz.setVisibility(View.INVISIBLE);
                klikDodaj.setVisibility(View.INVISIBLE);

                tekstPunkty.setVisibility(View.INVISIBLE);
                tekstBrawo.setVisibility(View.INVISIBLE);
            }
        });

        klikDodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk5.setVisibility(View.VISIBLE);
                przycisk6.setVisibility(View.VISIBLE);

                klikDodaj.setVisibility(View.INVISIBLE);
            }
        });

        przycisk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk5.setImageResource(R.drawable.pszczola);
                licznikPszczola++;
            }
        });

        przycisk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                przycisk6.setImageResource(R.drawable.pszczola);
                licznikPszczola++;
            }
        });


    }
}