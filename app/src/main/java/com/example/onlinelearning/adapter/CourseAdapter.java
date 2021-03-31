package com.example.onlinelearning.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.onlinelearning.R;
import com.example.onlinelearning.model.PlayList;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<PlayList> playLists;
    private Listener listener;

    public interface Listener{
        void onClick(int position);
    }
    public void setListener(Listener listener){
        this.listener = listener;
    }

    public CourseAdapter(Context context, List<PlayList> playLists) {
        this.context = context;
        this.playLists = playLists;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.course_list_row_items, parent, false);

        return new CourseViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, final int position) {

        int i=position+1;
        holder.contentNumber.setText("0"+i);
        holder.contentTime.setText(playLists.get(position).getTime());
        holder.contentName.setText(playLists.get(position).getName());

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent(context, Video_music.class);
//                context.startActivity(i);
                if (listener != null) {
                    listener.onClick(position);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return playLists.size();
    }


    public static class CourseViewHolder extends RecyclerView.ViewHolder{


        TextView contentNumber, contentTime, contentName;

        ImageButton imageButton;
        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            contentName = itemView.findViewById(R.id.content_title);
            contentTime = itemView.findViewById(R.id.content_time);
            contentNumber = itemView.findViewById(R.id.content_number);
            imageButton = itemView.findViewById(R.id.ImageButton12);

        }
    }

}
