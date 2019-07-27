package com.hwys.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hwys.nestedrecyclerview.adapter.ParentAdapter;
import com.hwys.nestedrecyclerview.model.ChildModel;
import com.hwys.nestedrecyclerview.model.ParentModel;

import java.util.ArrayList;
import java.util.List;

import static androidx.recyclerview.widget.DividerItemDecoration.VERTICAL;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvParent;
    private List<ParentModel> parentModelList=new ArrayList<>();// To send ParentAdapter
    private List<ChildModel> nowShowingList = new ArrayList<>();
    private List<ChildModel> upComingList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvParent = findViewById(R.id.rvParent);
        rvParent.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rvParent.setHasFixedSize(true);

        //Add Data To ParentModelList. Here I created two sample ParentModels
        parentModelList.add(new ParentModel("Now Showing", addNowShowing()));
        parentModelList.add(new ParentModel("Upcoming", addUpComing()));

        rvParent.setAdapter(new ParentAdapter(parentModelList));
        DividerItemDecoration decoration = new DividerItemDecoration(getApplicationContext(), VERTICAL);
        rvParent.addItemDecoration(decoration);
    }

    private List<ChildModel> addNowShowing(){
        nowShowingList.add(new ChildModel("Spider Man Far From Home", "https://tickets3.fgcineplex.com.sg/CDN/media/entity/get/FilmPosterGraphic/1701?referenceScheme=Global&allowPlaceHolder=true&height=350"));
        nowShowingList.add(new ChildModel("The Lion King", "https://cdn.traileraddict.com/content/walt-disney-pictures/lion-king-2019-13.jpg"));
        nowShowingList.add(new ChildModel("Toy Story 4", "https://djqh0pophbxqy.cloudfront.net/wpdata/images/90163-m.jpg"));
        nowShowingList.add(new ChildModel("Once Upon A Time In HolloWood", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a6/Once_Upon_a_Time_in_Hollywood_poster.png/220px-Once_Upon_a_Time_in_Hollywood_poster.png"));
        nowShowingList.add(new ChildModel("Yesterday", "https://www.joblo.com/assets/images/joblo/posters/2019/02/yesterdayposter.jpg"));
        return nowShowingList;
    }

    private List<ChildModel> addUpComing(){
        upComingList.add(new ChildModel("FF Hobbs & Shaw", "https://upload.wikimedia.org/wikipedia/en/0/00/Fast_%26_Furious_Presents_Hobbs_%26_Shaw_-_theatrical_poster.jpg"));
        upComingList.add(new ChildModel("Angel Has Fallen", "https://upload.wikimedia.org/wikipedia/en/thumb/1/13/Angel_Has_Fallen_poster.jpg/220px-Angel_Has_Fallen_poster.jpg"));
        upComingList.add(new ChildModel("The Fanatic", "https://ewedit.files.wordpress.com/2019/07/fanatic.jpg?w=1800&h=2667"));
        upComingList.add(new ChildModel("Gemini Man", "https://upload.wikimedia.org/wikipedia/en/thumb/5/5b/GeminiManPoster.jpeg/220px-GeminiManPoster.jpeg"));
        upComingList.add(new ChildModel("Ford V Ferrari", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Ford_v._Ferrari_%282019_film_poster%29.png/220px-Ford_v._Ferrari_%282019_film_poster%29.png"));
        return upComingList;
    }
}
