package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
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
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_card_bicicleta,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtCardBike.setText(lstBicicletas.get(position).getTitulo());
        holder.imgCardBike.setImageResource(lstBicicletas.get(position).getImgBicicleta());
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
