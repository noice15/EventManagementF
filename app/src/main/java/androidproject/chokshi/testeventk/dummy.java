package androidproject.chokshi.testeventk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import androidproject.chokshi.testeventk.MainActivity;

public class dummy extends Activity {
    private RecyclerView eventsRecyclerView;
    private EventsRecyclerAdapter eventsAdapter;
//    Button b1 = findViewById(R.id.events);


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);

        eventsRecyclerView = findViewById(R.id.eventsRecyclerView);
        Button b1 = findViewById(R.id.events);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // view = eventsRecyclerView;
                //setContentView(R.layout.dummy);
                eventsRecyclerView.setLayoutManager(new LinearLayoutManager(dummy.this));
                List<Event> myEventList = new ArrayList<>();
                for (int i = 1; i < 20; i++) {
                    Event event = new Event("Event" + i,
                            new Date(),
                            "https://media.glassdoor.com/sql/27375/san-francisco-state-squarelogo-1378477907074.png",
                            37.8199286,
                            -122.4804438);
                    myEventList.add(event);
                }
                eventsAdapter = new EventsRecyclerAdapter(myEventList);
                eventsRecyclerView.setAdapter(eventsAdapter);
            }


        });
        Button b2 = findViewById(R.id.maps);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dummy.this,MapsActivity.class));
            }
        });
    }


}


