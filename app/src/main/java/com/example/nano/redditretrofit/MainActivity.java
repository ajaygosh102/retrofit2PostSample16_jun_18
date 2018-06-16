package com.example.nano.redditretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String BASE_URL = "http://purplenode.in/sid-new/api/";
    Button button;
    TextView textView,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.text);
        textView2=(TextView)findViewById(R.id.text2);
        textView3=(TextView)findViewById(R.id.text3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String  username="ajay";

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                RedditApi redditAPI = retrofit.create(RedditApi.class);

                Call<Files> call = redditAPI.login("12345",username);

                call.enqueue(new Callback<Files>() {
                    @Override
                    public void onResponse(Call<Files> call, Response<Files> response) {
                        Toast.makeText(MainActivity.this, "yaah"+response.body().getStatus(), Toast.LENGTH_SHORT).show();
                        textView.setText(response.body().getStatus());
                        textView2.setText(response.body().getName());
                        textView3.setText(response.body().getPhone());
                    }

                    @Override
                    public void onFailure(Call<Files> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "error :(", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }


}
