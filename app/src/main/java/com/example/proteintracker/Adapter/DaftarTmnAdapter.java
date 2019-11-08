package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.DaftarTeman;
import com.example.proteintracker.R;

import java.util.ArrayList;

public class DaftarTmnAdapter extends RecyclerView.Adapter<DaftarTmnAdapter.ViewHolder> {

    ArrayList<DaftarTeman>DaftarTmnArraylist;
    public DaftarTmnAdapter(ArrayList<DaftarTeman> daftartemanArraylist) {
        DaftarTmnArraylist = daftartemanArraylist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup  parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_teman,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder Teman, int Position) {
        Teman.txtTmn.setText(DaftarTmnArraylist.get(Position).getNama());
        Teman.txtNim.setText(DaftarTmnArraylist.get(Position).getNim());
        Teman.txtCita.setText(DaftarTmnArraylist.get(Position).getCita2());
        Teman.txtHobby.setText(DaftarTmnArraylist.get(Position).getHobby());
        Teman.txtMoto.setText(DaftarTmnArraylist.get(Position).getMotohidup());
        Teman.txtgender.setText(DaftarTmnArraylist.get(Position).getGender());
        Teman.img1.setImageResource(DaftarTmnArraylist.get(Position).getImg());
    }

    @Override
    public int getItemCount() {

        return (DaftarTmnArraylist !=null) ? DaftarTmnArraylist.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTmn,txtNim,txtCita,txtHobby,txtMoto,txtgender;
        private ImageView img1;

        public ViewHolder(View view){
            super(view);
            txtTmn = view.findViewById(R.id.txt_tmn);
            txtNim = view.findViewById(R.id.txt_nim_tmn);
            txtCita = view.findViewById(R.id.txt_cita_cita_tmn);
            txtHobby = view.findViewById(R.id.txt_hobby_tmn);
            txtMoto = view.findViewById(R.id.txt_moto_tmn);
            txtgender = view.findViewById(R.id.txt_Gender);
            img1 =view.findViewById(R.id.imageView2);

        }
    }
}
