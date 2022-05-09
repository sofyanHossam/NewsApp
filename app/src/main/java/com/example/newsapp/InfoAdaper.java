package com.example.newsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.model.Article;
import com.squareup.picasso.Picasso;

import java.util.List;

public class InfoAdaper  {
    private TextView tvName;
    private TextView tvDesc;
    private ImageView ivPhoto;

    public TextView getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = tvName;
    }

    public TextView getTvDesc() {
        return tvDesc;
    }

    public void setTvDesc(TextView tvDesc) {
        this.tvDesc = tvDesc;
    }

    public ImageView getIvPhoto() {
        return ivPhoto;
    }

    public void setIvPhoto(ImageView ivPhoto) {
        this.ivPhoto = ivPhoto;
    }
}
