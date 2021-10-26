package com.example.tugas_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GamesAdapter extends
        RecyclerView.Adapter<GamesAdapter.GamesViewHolder>{

    private ArrayList<Games> dataList;

    public GamesAdapter(ArrayList<Games> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public GamesAdapter.GamesViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_games, parent, false);
        return new GamesViewHolder(view);
    }

    public void onBindViewHolder(GamesViewHolder holder, int
            position) {
        holder.timg.setImageResource(dataList.get(position).getImg());
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtDev.setText(dataList.get(position).getDev());
        holder.txtTahun.setText(dataList.get(position).getTahun());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class GamesViewHolder extends
            RecyclerView.ViewHolder{
        private ImageView timg;
        private TextView txtJudul, txtDev, txtTahun;

        public GamesViewHolder(View itemView) {
            super(itemView);
            timg = (ImageView)
                    itemView.findViewById(R.id.img);
            txtJudul = (TextView)
                    itemView.findViewById(R.id.txt_judul);
            txtDev = (TextView)
                    itemView.findViewById(R.id.txt_dev);
            txtTahun = (TextView)
                    itemView.findViewById(R.id.txt_tahun);
        }
    }
}
