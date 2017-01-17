package com.example.silvanadorantes.desayunofitness;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.squareup.picasso.Picasso;

/**
 * Created by silvana on 10/03/16.
 */
public class BreakfastAdapter  extends RecyclerView.Adapter<BreakfastAdapter.ViewHolder> implements ItemClickListener{
    private LayoutInflater mLayoutInflater;
    private List<Breakfast> mBreakfastItem;
    private Context mContext;

    public BreakfastAdapter(Context context, List<Breakfast> breakfasts){
        mContext = context;
        mLayoutInflater = mLayoutInflater.from(context);
        mBreakfastItem = breakfasts;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mDiaSemana;
        private TextView mNombre;
        private ImageView mImagen;
        private RatingBar mRatingBar;
        public ItemClickListener listener;

        public ViewHolder(View itemView, ItemClickListener listener){
            super(itemView);
            mDiaSemana = (TextView) itemView.findViewById(R.id.dia_semana);
            mNombre = (TextView) itemView.findViewById(R.id.nombre);
            mImagen = (ImageView) itemView.findViewById(R.id.imagen);
            mImagen.setOnClickListener(this);
            mRatingBar = (RatingBar) itemView.findViewById(R.id.rating);
            itemView.setOnClickListener(this);
            this.listener = listener;

        }

        public void setDiaSemana(String text) {
             mDiaSemana.setText(text);
        }

        public void setNombre(String text) {
             mNombre.setText(text);
        }

        public void setImagen(int imagen) {
            mImagen.setTag(imagen);
            mImagen.setImageResource(imagen);
        }

        public void setRatingBar(float ratingBar) {
            mRatingBar.setRating(ratingBar);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());

        }
    }

    @Override
    public void onItemClick(View view, int position){
        View sharedImage = view.findViewById(R.id.imagen);
        DetailActivity.launch((Activity) mContext, position, sharedImage);
    }

    @Override
    public int getItemCount() {
        return mBreakfastItem.size();
    }

    public void add(Breakfast breakfast){
        mBreakfastItem.add(breakfast);
        notifyItemInserted(mBreakfastItem.indexOf(breakfast));
    }

    public void remove(Breakfast breakfast){
        int position = mBreakfastItem.indexOf(breakfast);
        if (position != -1){
            mBreakfastItem.remove(position);
            notifyItemRemoved(position);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = mLayoutInflater.inflate(R.layout.breakfast_item, viewGroup, false);

        return new ViewHolder(v, this);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mDiaSemana.setText(mBreakfastItem.get(i).getDia_semana());
        viewHolder.mNombre.setText(mBreakfastItem.get(i).getNombre());
        viewHolder.mRatingBar.setRating(mBreakfastItem.get(i).getRating());
        //Cargar la imagen
        Picasso.with(mContext)
                .load(mBreakfastItem.get(i).getImagen())
                .into(viewHolder.mImagen);


    }
}
 interface ItemClickListener{
     void onItemClick(View view, int position);
 }
