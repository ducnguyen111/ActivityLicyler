package com.devandroid.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapterr extends RecyclerView.Adapter<Adapterr.ViewHoler> {
    private Context context;
    private List<User> list;

    public Adapterr(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new ViewHoler(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        User user=list.get(position);
        holder.ten.setText(user.getName());
        holder.tuoi.setText(user.getTuoi()+"");
        holder.email.setText(user.getEmail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        TextView ten,tuoi,email;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            ten=itemView.findViewById(R.id.item_ten);
            tuoi=itemView.findViewById(R.id.item_tuoi);
            email=itemView.findViewById(R.id.item_email);
        }
    }
}
