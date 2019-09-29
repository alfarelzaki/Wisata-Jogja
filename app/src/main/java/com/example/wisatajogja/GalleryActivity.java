package com.example.wisatajogja;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    ImageView imgPreviewWisata;
    TextView tvNamaWisata, tvLokasiWisata, tvDetailWisata;
    ArrayList<Wisata> listWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        listWisata.addAll(DataWisata.getListData());
        imgPreviewWisata = findViewById(R.id.photoWisata);
        tvNamaWisata = findViewById(R.id.titleWisata);
        tvLokasiWisata = findViewById(R.id.descriptionLokasi);
        tvDetailWisata = findViewById(R.id.description);

        getSupportActionBar().setTitle("Detail Wisata");

        respondIntent();
    }

    private void respondIntent() {
        if (getIntent().hasExtra("idWisata")) {
            int id = getIntent().getIntExtra("idWisata", 0);
            tvNamaWisata.setText(listWisata.get(id).getNama());
            tvLokasiWisata.setText(listWisata.get(id).getLokasi());
            tvDetailWisata.setText(listWisata.get(id).getDetail());
            Glide.with(this)
                    .asDrawable()
                    .load(listWisata.get(id).getFoto())
                    .into(imgPreviewWisata);
        }
    }


}
