package com.hwys.nestedrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hwys.nestedrecyclerview.R;
import com.hwys.nestedrecyclerview.model.ChildModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {
    private List<ChildModel> childModelList;

    public ChildAdapter(List<ChildModel> childModelList) {
        this.childModelList = childModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_list_item, parent, false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitle.setText(childModelList.get(position).getMovieTitle());
        Picasso.get().load(childModelList.get(position).getMoviePoster()).into(holder.ivPoster);
    }

    @Override
    public int getItemCount() {
        return childModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle; ImageView ivPoster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            ivPoster = itemView.findViewById(R.id.ivPoster);
        }
    }
}
