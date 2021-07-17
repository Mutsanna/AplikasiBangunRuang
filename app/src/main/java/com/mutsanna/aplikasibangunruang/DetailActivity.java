package com.mutsanna.aplikasibangunruang;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_IMAGE = "extra_image";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_RUMUS = "extra_rumus";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        TextView txNamaBangunRuangRecived = findViewById(R.id.tx_namabangunruang);
        ImageView imgBangunRuangRecived = findViewById(R.id.img_imgbangunruang);
        TextView txDetailRecived =  findViewById(R.id.tx_detailbangunruang);
        TextView txRumusRecived = findViewById(R.id.tx_rumusbangunruang);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        Integer image = getIntent().getIntExtra(EXTRA_IMAGE , 0);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String rumus = getIntent().getStringExtra(EXTRA_RUMUS);

        txNamaBangunRuangRecived.setText(name);
        txDetailRecived.setText(detail);
        imgBangunRuangRecived.setImageDrawable(getDrawable(image));
        txRumusRecived.setText(rumus);



    }
}
