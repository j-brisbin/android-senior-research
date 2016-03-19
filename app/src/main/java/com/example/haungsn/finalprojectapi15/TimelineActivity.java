package com.example.haungsn.finalprojectapi15;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

/*RecyclerView code is courtesy of Android Developers and tutsplus.com
* http://code.tutsplus.com/tutorials/getting-started-with-recyclerview-and-cardview-on-android--cms-23465
* http://developer.android.com/training/material/lists-cards.html*/
public class TimelineActivity extends AppCompatActivity {

    private RecyclerView timelineRecyclerView;
    private ArrayList<TimelineItem> timelineItems;
    private LinearLayoutManager timelineLayoutManager;
    private TimelineAdapter timelineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        /*Adds test TimelineItem objects*/
        timelineItems = new ArrayList<>();
        timelineItems.add(new TimelineItem(1985,"Nintendo Entertainment System (NES)",
                "The NES was released in the US, becoming the system to bring the American " +
                        "video game market out of the crash."));
        timelineItems.add(new TimelineItem(1989,"Sega Genesis","The first 16-bit system, the " +
                "Sega Genesis, is released. It was the first major system to successfully " +
                "compete against Nintendo."));
        timelineItems.add(new TimelineItem(1991,"Super Nintendo Entertainment System (SNES)",
                "The SNES is released in the US, bringing superior technical capabilities " +
                        "compared to the Sega Genesis."));
        timelineItems.add(new TimelineItem(1995,"Sega Saturn and Sony PlayStation",
                "The Sega Saturn and Sony PlayStation are released in the US, ushering in " +
                        "a new era of 3D gaming."));
        timelineItems.add(new TimelineItem(1996,"Nintendo 64","The Nintendo 64 is released, the " +
                "first true 64-bit system to be created. It was the only system of this " +
                "generation to use cartridges."));
        timelineItems.add(new TimelineItem(1999,"Sega Dreamcast","The Sega Dreamcast, Sega's " +
                "last console was released in the US. It brought better graphics and sound than " +
                "the competition of the time and was the first to bring online gaming on a console.\n " +
                "The system was short-lived due to increased competition from Sony's PlayStation 2 " +
                "and Microsoft's Xbox."));
        timelineItems.add(new TimelineItem(2000,"PlayStation 2","The PlayStation 2 is released " +
                "in the US. It is one of the most successful consoles of all time with a large " +
                "library of games released for it."));
        timelineItems.add(new TimelineItem(2001,"Microsoft Xbox and Nintendo GameCube",
                "The Nintendo GameCube and Microsoft Xbox were released. While the GameCube would " +
                        "be unsuccessful due to it's proprietary minidisc format, the Xbox would " +
                        "be the system that brought online gaming to the masses with the console's " +
                        "Xbox Live service."));

        /*Define RecyclerView with accompanying LayoutManager and custom adapter.*/
        timelineLayoutManager = new LinearLayoutManager(this.getApplicationContext());
        timelineAdapter = new TimelineAdapter(timelineItems,getAssets());
        timelineRecyclerView = (RecyclerView)findViewById(R.id.timeline_recycler_view);
        timelineRecyclerView.setLayoutManager(timelineLayoutManager);
        timelineRecyclerView.setAdapter(timelineAdapter);
    }

}
