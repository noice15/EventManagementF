package androidproject.chokshi.testeventk;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class list extends Activity {
    private RecyclerView eventsRecyclerView;
    private EventsRecyclerAdapter eventsAdapter;
   protected void onCreate(Bundle getSavedInstance) {

       super.onCreate(getSavedInstance);
       setContentView(R.layout.list);

       eventsRecyclerView.setLayoutManager(new LinearLayoutManager(list.this));
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
}
