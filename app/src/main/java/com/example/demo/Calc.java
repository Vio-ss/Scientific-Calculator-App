package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Calc<pubic> extends RecyclerView.Adapter<Calc.MyViewHolder> {
    Context context;
    ArrayList<MainActivity> mainActivity;
    public Calc(Context context, ArrayList<MainActivity> mainActivity) {
        this.context=context;
        this.mainActivity=mainActivity;
    }

    @NonNull
    @Override
    public Calc.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //To inflate layout, to give look to rows.
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_main,parent, false);
        return new Calc.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Assigning values to the views in main file, based on position of recycler view.
        holder.textView.setText((CharSequence) mainActivity.get(position));
        holder.editText.setText((CharSequence) mainActivity.get(position));
        holder.button29.setText((CharSequence) mainActivity.get(position));
        holder.button30.setText((CharSequence) mainActivity.get(position));
        holder.button31.setText((CharSequence) mainActivity.get(position));
        holder.button32.setText((CharSequence) mainActivity.get(position));
        holder.button33.setText((CharSequence) mainActivity.get(position));
        holder.button34.setText((CharSequence) mainActivity.get(position));
        holder.button35.setText((CharSequence) mainActivity.get(position));
        holder.button36.setText((CharSequence) mainActivity.get(position));
        holder.button37.setText((CharSequence) mainActivity.get(position));
        holder.button38.setText((CharSequence) mainActivity.get(position));
        holder.button39.setText((CharSequence) mainActivity.get(position));
        holder.button40.setText((CharSequence) mainActivity.get(position));
        holder.button41.setText((CharSequence) mainActivity.get(position));
        holder.button42.setText((CharSequence) mainActivity.get(position));
        holder.button43.setText((CharSequence) mainActivity.get(position));
        holder.button44.setText((CharSequence) mainActivity.get(position));
        holder.button45.setText((CharSequence) mainActivity.get(position));
        holder.button46.setText((CharSequence) mainActivity.get(position));
        holder.button47.setText((CharSequence) mainActivity.get(position));
    }

    @Override
    public int getItemCount() {
        //It lets recycler know the number of items you want to display.
        return mainActivity.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        EditText editText;
        Button button29;
        Button button30;
        Button button31;
        Button button32;
        Button button33;
        Button button34;
        Button button35;
        Button button36;
        Button button37;
        Button button38;
        Button button39;
        Button button40;
        Button button41;
        Button button42;
        Button button43;
        Button button44;
        Button button45;
        Button button46;
        Button button47;

        ImageButton imagebutton;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.previousCalculationView);
            editText = itemView.findViewById(R.id.displayEditText);
            button29 = itemView.findViewById(R.id.button29);
            button30 = itemView.findViewById(R.id.button30);
            button31 = itemView.findViewById(R.id.button31);
            button32 = itemView.findViewById(R.id.button32);
            button33 = itemView.findViewById(R.id.button33);
            button34 = itemView.findViewById(R.id.button34);
            button35 = itemView.findViewById(R.id.button35);
            button36 = itemView.findViewById(R.id.button36);
            button37 = itemView.findViewById(R.id.button37);
            button38 = itemView.findViewById(R.id.button38);
            button39 = itemView.findViewById(R.id.button39);
            button40 = itemView.findViewById(R.id.button40);
            button41 = itemView.findViewById(R.id.button41);
            button42 = itemView.findViewById(R.id.button42);
            button43 = itemView.findViewById(R.id.button43);
            button44 = itemView.findViewById(R.id.button44);
            button45 = itemView.findViewById(R.id.button45);
            button46 = itemView.findViewById(R.id.button46);
            button47 = itemView.findViewById(R.id.button47);

        }
    }
}
