package com.example.jiteshnarula.gimt;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Courses_ViewMore extends AppCompatActivity{

    ListView listView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_viewmore_layout);

         listView = (ListView) findViewById(R.id.listView1);

         TextView textView12 = (TextView) findViewById(R.id.textView12);
         TextView textView11 = (TextView) findViewById(R.id.textView11);
         TextView textView = (TextView) findViewById(R.id.textView);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Courses_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Courses_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Courses_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Courses_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });
         textView.setText("Eligibility Criteria");
         textView11.setText("Courses & Eligibility Criteria");
         textView12.setText("B. Tech (4 Years )\n" +
                 "\n" +
                 "Minimum Academic Qualifications for B.E. /B.Tech.\n" +
                 "Should be a pass in 10+2 examination from recognized Board/University with Physics and Mathematics as compulsory subjects along with one of the following subjects:\n" +
                 "(a) Chemistry\n" +
                 "(b) Bio-Technology\n" +
                 "(c) Biology/Technical Vocational subject\n" +
                 "\n" +
                 "Obtained at least 45% marks (42.75% in case of candidate belonging to SC category) in the above subjects taken together for B.E/B.Tech and B.E/B.Tech. (Bio-Technology) respectively. \n" +
                 "B. Tech (Lateral entry to second year)\n" +
                 "\n" +
                 "a) Obtained at least 45% marks (42.75% in case of candidate belonging to SC category) in aggregate in Diploma in Engg./ Technology of a duration of 3 years or more from Haryana State Board of Technical Education or its equivalent.\n" +
                 "b) Passed B.Sc Degree from a recognized University as defined by UGC, with at least 45% marks (42.75 % in case of candidates belonging to SC category) and passed XII standard with mathematics as a subject.\n" +
                 "c) Provided that in case of students belonging to B.Sc stream, shall clear the subjects of Engineering Graphics/Engineering Drawing and Engineering Mechanics of the first year engineering program along with the second Year subjects.\n" +
                 "d) Provided further that, the students belonging to B.Sc. stream shall be considered only after filling the supernumerary seats in this category with students belonging to the Diploma stream.\n" +
                 "e) Provided further those students, who have passed Diploma in Engineering & Technology from an AICTE/UGC approved instt. or B.Sc Degree from a recognized University as defined by UGC, shall also be eligible for admission to the first year Engineering Degree courses subject to vacancies in the first year class in case the vacancies at lateral entry are exhausted. The admissions shall be based strictly on the eligibility criteria as mentioned in a, b, d and e above.\n" +
                 "f) For Kashmiri Migrants (KM) relaxation in cut-off percentage upto 10% subject to minimum eligibility requirement.\n" +
                 "\n" +
                 "MBA(2Year)\n" +
                 "\n" +
                 "Should be a pass in Bachelor‘s or Post Graduate Degree in any discipline from a recognized university or an examination recognized as equivalent thereto by KU, Kurukshetra, Maharshi Dayanand University, Rohtak, Guru Jambheshwar University of Sc. & Technology Hissar, CCS HAU, Hissar, DCR University of Sc. & Technology, Murthal and Ch. Devi Lal University, Sirsa, as the case may be \n" +
                 "OR \n" +
                 "Pass in Final Examination conducted by Institute of Chartered Accountant of India/Institute of Costs and Works Accountants of India/Institute of Company Secretaries of India. \n" +
                 "Obtained at least 50% (47.50% of candidate belonging to SC category) in the qualifying Examination.\n" +
                 "MCA(3Year)\n" +
                 "\n" +
                 "Pass in any recognized Bachelor‟s Degree of minimum 3 Yrs duration with Mathematics at 10+2  level. OR Pass in any recognized Bachelor‟s Degree of minimum 3 Yrs duration with Mathematics as one of  the subjects. OR Should be pass in BCA Degree of minimum three years duration from a recognized University.  Obtained at least 50% (47.5% in case of candidate belonging to SC category) in the qualifying Examination. Note: Candidates having passed Mathematics / Statistics in one semester / in one year as the case may be shall be considered eligible for MCA\n" +
                 "\n" +
                 "MCA(Lateral entry to second year)\n" +
                 "\n" +
                 "Pass in BCA, B.Sc (Computer Science, Computer Application, IT) from a recognized University.  Obtained at least 50% (47.5% in case of candidate belonging to SC category) in the qualifying Examination. Note: Candidates having passed Mathematics / Statistics in one semester / in one year as the case may be shall be considered eligible for MCA\n" +
                 "M.E. / M. Tech. (2 Years )\n" +
                 "\n" +
                 "Bachelors degree or equivalent in the relevant field\n" +
                 "Obtained at least 50% (45% in case of candidate belonging to reserved category) at the qualifying Examination\n" +
                 "Bachelor of Business Administration (BBA)\n" +
                 "\n" +
                 "Duration 3 Years\n" +
                 "Seats 60\n" +
                 "Eligibility Conditions\n" +
                 "The candidates should have passed Senior Secondary Certificate Examination (10+2) from any recognized Board/University with at least five subjects including English as one of the main subjects.");
     }
}