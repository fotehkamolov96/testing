package com.example.dt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SliderAdp extends RecyclerView.Adapter<SliderAdp.SliderViewHolder>{
    private List<Sliideriteam> sliideriteams;
    private ViewPager2 viewPager2;

    SliderAdp(List<Sliideriteam> sliideriteams, ViewPager2 viewPager2) {
        this.sliideriteams = sliideriteams;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slider_iteam,
                        parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(sliideriteams.get(position));
        if (position ==sliideriteams.size()- 2){
            viewPager2.post(runnable);
        }


    }

    @Override
    public int getItemCount() {
        return sliideriteams.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{
        private RoundedImageView imageView;
         SliderViewHolder(@NonNull View itemView){
            super(itemView);
            imageView=itemView.findViewById(R.id.imageslider);
        }
        void setImage(Sliideriteam sliideriteam){
            imageView.setImageResource(sliideriteam.getImage());

        }
    }

        private Runnable runnable = new Runnable() {
            @Override
            public void run() {
                sliideriteams.addAll(sliideriteams);
                notifyDataSetChanged();
            }
        };


}
