package com.example.recipeapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private List<FoodModel> FoodList;
    private Context context;

    public FoodAdapter(List<FoodModel> FoodList, Context context) {
        this.FoodList = FoodList;
        this.context = context;
    }


    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        FoodModel FoodModel = FoodList.get(position);
        holder.A_food_name.setText(FoodModel.getTitle());
        Picasso.get().load(FoodModel.getImage()).into(holder.A_food_img);


    }

    @Override
    public int getItemCount() {
        return FoodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //define view objects
        CardView A_cv1;
        TextView A_food_name;
        ImageView A_food_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            A_cv1 = itemView.findViewById(R.id.cv1);
            A_food_name = itemView.findViewById(R.id.food_name);
            A_food_img = itemView.findViewById(R.id.food_img);

        }
    }
}
