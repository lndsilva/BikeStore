package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class MenuPrincipalActivity extends AppCompatActivity {
    MaterialCardView cardBicicletas, cardHorarios,
            cardEquipamentos, cardReservas,
            cardAcessorios, cardCategorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        cardBicicletas = findViewById(R.id.cardBicicletas);
        cardAcessorios = findViewById(R.id.cardAcessorios);
        cardEquipamentos = findViewById(R.id.cardEquipamentos);
        cardCategorias = findViewById(R.id.cardCategorias);
        cardReservas = findViewById(R.id.cardReservas);
        cardHorarios = findViewById(R.id.cardHorarios);

        cardBicicletas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BicicletasActivity.class));
                finish();
            }
        });

    }
}