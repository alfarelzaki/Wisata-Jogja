package com.example.wisatajogja;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder> {
    private ArrayList<Wisata> listWisata;

    public ListWisataAdapter(ArrayList<Wisata> listWisata) {
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wisata, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Wisata wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisata.getFoto())
                .apply(new RequestOptions().override(75, 75))
                .into(holder.imgPreviewWisata);
        holder.tvNamaWisata.setText(wisata.getNama());
        holder.tvLokasiWisata.setText(wisata.getLokasi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), GalleryActivity.class);
                intent.putExtra("idWisata", listWisata.get(position).getId());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPreviewWisata;
        TextView tvNamaWisata, tvLokasiWisata;
        RelativeLayout parentLayout;
        private int id;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPreviewWisata = itemView.findViewById(R.id.img_item_wisata);
            tvNamaWisata = itemView.findViewById(R.id.tv_wisataName);
            tvLokasiWisata = itemView.findViewById(R.id.tv_wisataLocation);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
