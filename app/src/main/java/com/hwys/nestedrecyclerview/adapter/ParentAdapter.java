package com.hwys.nestedrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hwys.nestedrecyclerview.R;
import com.hwys.nestedrecyclerview.model.ParentModel;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder>{
    private List<ParentModel> parentModelList;

    public ParentAdapter(List<ParentModel> parentModelList) {
        this.parentModelList = parentModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitle.setText(parentModelList.get(position).getTitle());
        holder.rvChild.setAdapter(new ChildAdapter(parentModelList.get(position).getChildModelList()));
    }

    @Override
    public int getItemCount() {
        return parentModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        RecyclerView rvChild;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            rvChild = itemView.findViewById(R.id.rvChild);
            rvChild.setHasFixedSize(true);
            LinearLayoutManager layoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);
            rvChild.setLayoutManager(layoutManager);
        }
    }
}
