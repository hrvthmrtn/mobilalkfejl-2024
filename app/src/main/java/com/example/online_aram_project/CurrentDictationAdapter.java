package com.example.online_aram_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CurrentDictationAdapter extends RecyclerView.Adapter<CurrentDictationAdapter.ViewHolder> {
    private Context mContext;
    private int lastPosition = -1;

    CurrentDictationAdapter(Context context){
        this.mContext = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {return 0;}

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mNameText;
        private TextView mEmailText;
        private TextView mCurrentDictText;
        private TextView mPlaceText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mNameText = itemView.findViewById(R.id.dictationNameEditText);
            mEmailText = itemView.findViewById(R.id.dictationEmailEditText);
            mCurrentDictText = itemView.findViewById(R.id.dictationCurrentEditText);
            mPlaceText = itemView.findViewById(R.id.dictationAddressEditText);
        }
        public void bindTo(CurrentDictationItem currentItem){
            mNameText.setText(currentItem.getName());
            mEmailText.setText(currentItem.getEmail());
            mCurrentDictText.setText(currentItem.getCurrent());
            mPlaceText.setText(currentItem.getPlace());
        }
    }

}
