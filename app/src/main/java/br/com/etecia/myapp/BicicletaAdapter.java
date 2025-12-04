package br.com.etecia.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BicicletaAdapter extends RecyclerView.Adapter<BicicletaAdapter.ViewHolder> {
    //variáveis globais
    private List<Bicicleta> lstBicicletas;
    private Context context;

    //criando o construtor com parâmetros


    public BicicletaAdapter(List<Bicicleta> lstBicicletas, Context context) {
        this.lstBicicletas = lstBicicletas;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lstBicicletas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgCardBike;
        TextView txtCardBike;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCardBike = itemView.findViewById(R.id.imgCardBike);
            txtCardBike = itemView.findViewById(R.id.txtCardBike);
        }
    }
}
