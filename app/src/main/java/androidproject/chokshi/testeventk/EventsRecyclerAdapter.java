//package com.example.dhwan.myapplication;
package androidproject.chokshi.testeventk;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.dhwan.myapplication.model.Event;

import java.util.Date;
import java.util.List;

import androidproject.chokshi.testeventk.R;

public class EventsRecyclerAdapter extends RecyclerView.Adapter<EventsRecyclerAdapter.EventItemViewHolder> {

    private List<Event> myEventList;

    //Constructor
    public EventsRecyclerAdapter(List<Event> myEventList) {
        this.myEventList = myEventList;
    }

    //Item Count
    @Override
    public int getItemCount() {
        return myEventList.size();
    }

    @NonNull
    @Override
    public EventItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View individualEventRowView = layoutInflater.inflate(R.layout.individual_eventrow_layout, viewGroup, false);
        EventItemViewHolder eventItemViewHolder = new EventItemViewHolder(individualEventRowView);
        return eventItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventItemViewHolder eventItemViewHolder, int position) {
        Event event = myEventList.get(position);
        String imgUrl = event.getImgUrl();
        String title = event.getTitle();
        Date eventDate = event.getEventDate();
        final double latitude = event.getLatitude();
        final double longitude = event.getLongitude();
        eventItemViewHolder.txtTitle.setText(title);
        eventItemViewHolder.txtDate.setText(eventDate.toString());
        eventItemViewHolder.txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(v.getContext(), "Hi\n" + latitude + "\n" + longitude, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), MapsActivity.class);
                intent.putExtra("latitude", latitude);
                intent.putExtra("longitude", longitude);
            }
        });
    }

    //View Holder
    public static class EventItemViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgThumbnail;
        public TextView txtTitle, txtDate;

        public EventItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDate = itemView.findViewById(R.id.txtDate);
        }
    }









}
