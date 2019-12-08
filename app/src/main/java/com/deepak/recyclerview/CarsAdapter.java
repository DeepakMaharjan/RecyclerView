package com.deepak.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarsViewHolders> {


    List<Cars> carsList;
    Context context;

    public CarsAdapter(Context context, List<Cars> carsList){
        this.context = context;
        this.carsList = carsList;
    }

    @NonNull
    @Override
    public CarsViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_cars,parent,false);
        return new CarsViewHolders(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsViewHolders holder, int position) {
        final Cars cars = carsList.get(position);
        holder.imgProfile.setImageResource(cars.getImage());
        holder.tvName.setText(cars.getName());
        holder.tvBrand.setText(cars.getBrand());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, CarDetails.class);

                intent.putExtra("image", cars.getImage());
                intent.putExtra("name",cars.getName());
                intent.putExtra("brand",cars.getBrand());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }

    public class CarsViewHolders extends RecyclerView.ViewHolder{

        ImageView imgProfile;
        TextView tvName, tvBrand;

        public CarsViewHolders(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgCars);
            tvName = itemView.findViewById(R.id.tvName);
            tvBrand = itemView.findViewById(R.id.tvBrand);
        }
    }
}
