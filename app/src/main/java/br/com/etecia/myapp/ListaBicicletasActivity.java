package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaBicicletasActivity extends AppCompatActivity {
    List<Bicicleta> lstBicicleta;
    RecyclerView listaBikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_bicicletas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //criando um array de dados
        lstBicicleta = new ArrayList<>();
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));
        lstBicicleta.add(new Bicicleta("Passeio",R.drawable.logo));

        //RecyclerView
        listaBikes = findViewById(R.id.listaBikes);

        BicicletaAdapter adapter = new BicicletaAdapter(lstBicicleta,ListaBicicletasActivity.this);

        //Liga o adaptador a lista
        listaBikes.setAdapter(adapter);

    }
}