package com.example.szidonialaszlo.projectbooks;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by szidonia.laszlo on 2017. 10. 25..
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<String> values;


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView author;
        public TextView title;

        public View layout;


        public ViewHolder(View v) {
            super(v);
            layout=v;
            author = (TextView) v.findViewById(R.id.authorTextView);
            title = (TextView) v.findViewById(R.id.titleTextView);

        }
    }

    public MyAdapter(List<String> myDataset){
        values=myDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

            //get element from your dataset at this position
        final String name = values.get(position);
        holder.author.setText(name);
        holder.author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mit csinal ha ralepunk
            }
        });

        holder.title.setText("Title...");
    }

    @Override
    public int getItemCount() {
        return values.size();
    }


}
