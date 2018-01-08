package com.apkglobal.retrofitir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.apkglobal.retrofitir.retrofit_fetch.FetchActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
EditText et_name,et_email,et_phn;
Button btn_submit,btn_show;
private static final String ROOT_URL="http://example.com/";//in this http address your server's root directory address
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=(EditText)findViewById(R.id.et_name);
        et_email=(EditText)findViewById(R.id.et_email);
        et_phn=(EditText) findViewById(R.id.et_phn);
        btn_submit=(Button)findViewById(R.id.btn_submit);
        btn_show=(Button)findViewById(R.id.btn_show);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, FetchActivity.class);
                startActivity(i);
            }
        });
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertUser();
            }
        });

    }

    private void insertUser() {

        RestAdapter adapter=new RestAdapter.Builder()
                .setEndpoint(ROOT_URL)
                .build();
        RegisterAPI api=adapter.create(RegisterAPI.class);
        api.insertUser(
                et_name.getText().toString(),
                et_email.getText().toString(),
                et_phn.getText().toString(),
                new Callback<Response>() {
                    @Override
                    public void success(Response response, Response response2) {
                        BufferedReader reader=null;
                        String output="Insertion is ok using retrofit";
                        et_email.setText("");
                        et_name.setText("");
                        et_phn.setText("");
                        try{
                            reader=new BufferedReader(new InputStreamReader(response.getBody().in()));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Toast.makeText(MainActivity.this, output, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }


}
