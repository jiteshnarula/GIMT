package com.example.jiteshnarula.gimt;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView);
        ArrayList<CardMainClass> list  = new ArrayList<>();


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(MainActivity.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(MainActivity.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(MainActivity.this, LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }

                return false;
            }
        });


        list.add(new CardMainClass("Welcome To GEETA INSTITUTE OF MANAGEMENT and TECHNOLOGY"+"\n\n\n","drawable://" + R.drawable.gimt,"Geeta Institute of Management and Technology (A Unit of Geeta Education Trust)  offers  M.Tech, B.Tech, MBA & MCA programs for which the institute has created excellent infrastructure in terms of physical, Human and Information resources. The institute has also tie up with leading corporate house for training, development and placement of students. The institute is situated on national highway in lush green pollution free academic environment in Haryana.\n" +
                "\n" +
                "Our vision is to become a top institution in engineering and management with departments as centers of excellence," +
                " imparting high quality education and providing ambience for growth of professionals as excellent human " +
                "beings as well."));

        list.add(new CardMainClass(" Why GIMT? "+ "\n\n\n" +
                ""
                ,"drawable://" + R.drawable.microsoft,"" +
                "“BLEND KNOWLEDGE WITH TECHNOLOGY AND TECHNOLOGY WITH PERFECTION”" +
                "Microsoft Innovation Center" +
                "In collaboration with Microsoft India, GIMT had conducted Microsoft Certification in various courses. Many number of students as well as faculty members from various departments participated in this certification in various courses." +
                "Geeta Institute of Management and Technology (A Unit of Geeta Education Trust)  offers  M.Tech, B.Tech, MBA & MCA programs for which the institute has created excellent infrastructure in terms of physical, Human and Information resources. The institute has also tie up with leading corporate house for training, development and placement of students. The institute is situated on national highway in lush green pollution free academic environment in Haryana.\n" +
                "\n" ));

        list.add(new CardMainClass("Collaboration with IITs ","drawable://" + R.drawable.iit ,
                "The MOU had signed in between IIT Bombay and IIT Kharagpur and IIT Roorkee that our college is authorized remote " +
                "center to conduct various workshops in different fields."));

               list.add(new CardMainClass("Collaboration with TCS-ION","drawable://" + R.drawable.tcs ,
                " We GIMT is in collaboration with TCS ION which is a strategic unit of Tata Consultancy Services focused on Manufacturing Industries(SMB), Educational Institutions and Examination Boards."));

        list.add(new CardMainClass("IBM (Center of Excellence)","drawable://" + R.drawable.ibm,
                "The MOU was signed between the institute and IBM and a relationship was established" +
                        " to give students and faculty the opportunity to work closely " +
                        "with the industry and utilize both the resources in the best possible manner."));


        list.add(new CardMainClass("World Class Libary","drawable://" + R.drawable.lib,
                " Visual and creative material resources are available to keep the faculty and students abreast with the day to day knowledge exploration."));



        list.add(new CardMainClass("Excellent Hostel","drawable://" + R.drawable.hostel,
                "The world class hostel has separate wings for boys and girls." +
                        " The rooms are spacious, airy, well lighted and fully furnished."));

        list.add(new CardMainClass("Vast Buses Fleet","drawable://" + R.drawable.bus1,
                "The transport facility is available for the students and staff. " +
                        "The fleet of GIMT buses provide pick and drop facility" +
                        " to the students coming from within a radial distance of 60 kms."));


        list.add(new CardMainClass("Anti Ragging Campus","drawable://" + R.drawable.ragging,
                " To provide for prohibition of ragging in educational institutional " +
                        "in the State of Haryana " +
                        "and for matters connected therewith or incidental there to."));

        list.add(new CardMainClass("Sports","drawable://" + R.drawable.sports1,
                " GIMT has good sports facility in the campus, like football " +
                        "ground, volleyball, badminton," +
                        " basket ball, tennis court, cricket pitch for net practice."));




        CustomListAdapter1  adapter = new CustomListAdapter1(getApplicationContext(),R.layout.card_layout_main,list);
          listView.setAdapter(adapter);




    }

}
