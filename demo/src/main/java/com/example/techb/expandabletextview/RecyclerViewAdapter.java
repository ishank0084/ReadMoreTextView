package com.example.techb.expandabletextview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.readmoretextview.ReadMoreTextView;

import java.util.ArrayList;

/**
 * Created by Ishank @ Triplived on 07-06-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyCustomViewHolder> {

    Context context;
    public ArrayList<String> contentList = new ArrayList<>();
    String name[] = new String[]{"Google", "Apple", "Blackberry"};


    public RecyclerViewAdapter(Context context) {
        this.context = context;
        contentList.add(context.getResources().getString(R.string.google));
        contentList.add(context.getResources().getString(R.string.apple));
        contentList.add(context.getResources().getString(R.string.blackberry));

    }

    @Override
    public MyCustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_items, null);
        RecyclerViewAdapter.MyCustomViewHolder viewHolder = new RecyclerViewAdapter.MyCustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyCustomViewHolder holder, int position) {

        holder.tvTittle.setText(name[position]);
        holder.tvDetails.append(", " + contentList.get(position));
        new ReadMoreTextView(holder.tvDetails, 3, "Read More", "Read less", "");


    }

    @Override
    public int getItemCount() {
        return (null != contentList ? contentList.size() : 0);
    }


    class MyCustomViewHolder extends RecyclerView.ViewHolder {

        TextView tvTittle, tvDetails;

        public MyCustomViewHolder(View itemView) {
            super(itemView);
            tvTittle = (TextView) itemView.findViewById(R.id.tv_tittle);
            tvDetails = (TextView) itemView.findViewById(R.id.tv_details);

        }

    }
}
