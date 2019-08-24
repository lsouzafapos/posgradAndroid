package com.example.posgrad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.posgrad.entities.User;
import com.example.posgrad.services.RetrofitService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView campo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo = findViewById(R.id.viewJSON);
        buscaDados();
    }

    private void buscaDados() {
        RetrofitService.getServico().getUsuarios().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                List<User> lista = response.body();
                for (User user : lista) {
                    //Aqui você insere o código para preencher o View e mostrar os dados na tela do dispositivo
                }
            }
            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {       }
        });
    }

}
