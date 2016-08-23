package com.futsal.vnttkf;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by seungmin on 2016-08-04.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<MyData> mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView mImageView1, mImageView2;

        public TextView mTextView1, mTextView2, mTextView3;


        public ViewHolder(View view) {
            super(view);
            mImageView1 = (ImageView)view.findViewById(R.id.fieldimage);
            mTextView1 = (TextView)view.findViewById(R.id.fieldname);
            mImageView2 = (ImageView)view.findViewById(R.id.image);
            mTextView2 = (TextView)view.findViewById(R.id.distance);
            mTextView3 = (TextView)view.findViewById(R.id.available);

        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(ArrayList<MyData> myDataset) {

        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_view, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mImageView1.setImageResource(mDataset.get(position).img1);
        holder.mTextView1.setText(mDataset.get(position).text1);
        holder.mImageView2.setImageResource(mDataset.get(position).img2);
        holder.mTextView2.setText(mDataset.get(position).text2);
        holder.mTextView3.setText(mDataset.get(position).text3);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();

    }
}



