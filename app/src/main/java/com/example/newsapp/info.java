package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newsapp.model.Article;
import com.example.newsapp.model.NewsResponse;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class info extends AppCompatActivity {
TextView m,s,a;
ImageView imageView;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        m=(TextView)findViewById(R.id.M_tv);
        s=(TextView)findViewById(R.id.S_tv);
        a=(TextView)findViewById(R.id.a_tv);
        imageView=(ImageView) findViewById(R.id.img);


  if(getIntent()!=null)
  {
      Article article =(Article)getIntent().getSerializableExtra("data");
      m.setText(article.getTitle());
      s.setText(article.getDescription());
      a.setText(article.getAuthor());
      Picasso.with(imageView.getContext()).load(article.getUrlToImage()).into(imageView);

  }
    }

}