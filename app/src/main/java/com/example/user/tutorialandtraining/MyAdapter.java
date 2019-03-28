package com.example.user.tutorialandtraining;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 3/24/2019.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        RecyclerView recyclerView;
        Context context;
        ArrayList<String> items=new ArrayList <>();
        ArrayList<String> urls=new ArrayList <>();

public void update(String name,String url)
        {
        items.add(name);
        urls.add(url);
        notifyDataSetChanged();

        }


    public MyAdapter(RecyclerView recyclerView, Context context, ArrayList <String> items,ArrayList<String> urls) {
        this.recyclerView = recyclerView;
        this.context = context;
        this.items = items;
        this.urls=urls;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nameOfFile.setText(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameOfFile;

        public ViewHolder(View itemView) {
            super(itemView);
            nameOfFile=(TextView)itemView.findViewById(R.id.cardtextid);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position=recyclerView.getChildLayoutPosition(v);

                    //this for download from firebase
                    //   Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(urls.get(position)));
                    //this for show pdf in activity
                    Intent intent=new Intent(context,ShowPdf.class);
                    intent.putExtra("url",urls.get(position));
                    context.startActivity(intent);

                }
            });
        }
    }
}
