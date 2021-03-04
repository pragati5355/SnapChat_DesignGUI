package com.example.designingfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listsnapview;

    String[] Name1={"Sayali Kadam","Mansee Katke","Sahil Bhilare","Deep Bhilare","Harshali Dhage","Yugandhar Mayekar",
            "Siddhi Shinde","Dinesh Choudhary","Aakanshya Jagtap","Rutuja Satav","Bhishali","Rutuja Sapkal",
            "Sangram","Akash Gawade","Anup Gawade","Suraj Gawade","Akshay Gawade"};

    String[] Name2={"New snap","New snap","New snap","Tap to load","New snap","New snap",
                    "New snap","Tap to load","New snap","Tap to load","New snap","New snap",
                    "New snap","Tap to load","New snap","New snap","New snap"};

    String [] Name3= {"12h","6h","1w","1d","2d","2w","2w","5w","1mo","3w","3d","3d","5mo","5mo","7mo","7mo","7mo"};

    String [] Name4={"10","15","10","30","50","20","6","2","0","0","0","0","0","0","0","0","0"};

    int [] snapImages={R.drawable.girl1,R.drawable.girl2,R.drawable.boy1,R.drawable.boy2,R.drawable.girl3,R.drawable.boy3,
                       R.drawable.girl4,R.drawable.boy4,R.drawable.girl5,R.drawable.girl6,R.drawable.girl7,R.drawable.girl8,
                       R.drawable.boy5,R.drawable.boy6,R.drawable.boy7,R.drawable.boy8,R.drawable.boy9};


    Adaptersnap adaptersnap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listsnapview = findViewById(R.id.Listviewsnap);
        adaptersnap = new Adaptersnap(this,Name1,Name2,Name3,Name4,snapImages);
        listsnapview.setAdapter(adaptersnap);


    }
}