package com.marcorobregon.multiservicios1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView iconView, nextIconView;
    TextView nameView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        iconView = itemView.findViewById(R.id.icon);
        nameView = itemView.findViewById(R.id.name);
        nextIconView = itemView.findViewById(R.id.nextIcon);
    }
}
