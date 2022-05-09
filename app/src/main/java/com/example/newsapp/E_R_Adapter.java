package com.example.newsapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.List;

import com.example.newsapp.model.Article;

public class E_R_Adapter extends RecyclerView.Adapter<E_R_Adapter.PlayerViewHolder> {


    private List<Article> list;
    private OnPlayerItemClickListener listener;

    public E_R_Adapter(List<Article> list,OnPlayerItemClickListener listener) {
        this.list = list;
       this.listener=listener;
    }


    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlayerViewHolder holder, final int position) {
        final Article current = list.get(position);
        holder.tvName.setText(current.getTitle());
//        holder.tvDesc.setText(current.getDescription());
        //   holder.ivPhoto.setBackgroundResource(current.getImage());
        Picasso.with(holder.itemView.getContext()).load(current.getUrlToImage()).into(holder.ivPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listener.OnItemClick(position);
                Intent intent =new Intent(holder.itemView.getContext(),info.class);
                intent.putExtra("data",(Serializable)current );
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }
    public interface OnPlayerItemClickListener{
        void OnItemClick(int position);
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    static class PlayerViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private TextView tvDesc;
        private ImageView ivPhoto;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_player_name);
            ivPhoto = itemView.findViewById(R.id.iv_photo);
        }
    }
}
