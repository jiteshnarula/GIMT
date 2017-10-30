package com.example.jiteshnarula.gimt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jitesh Narula on 12-10-2017.
 */

public class BTech_Courses extends Fragment {
    ListView listView;
    TextView messageTextView;

   TextView b_techTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.b_tech_layout,container,false);

        listView =(ListView) view.findViewById(R.id.listView);

        ArrayList<BtechMtechCard> cardArrayList  = new ArrayList<>();
        cardArrayList.add(new BtechMtechCard("COMPUTER SCIENCE ENGINEERING","drawable://" + R.drawable.cse ,
                "Computer Science Engineering covers all the fundamentals, " +
                        "working and expert subjects that provide a holistic " +
                        "learning environment where students understand and " +
                        "are able to apply the most contemporary and essential " +
                        "tools needed in the breadth and depth of core domain. "));

        cardArrayList.add(new BtechMtechCard("CIVIL ENGINEERING","drawable://" + R.drawable.ce,"Civil Engineering is a core branch of Engineering that deals with planning," +
                " design construction and maintenance of various work structures related to infrastructure," +
                        " urban development and environmental protection. The achievements of Civil Engineers " +
                        "are well-known to the general public, because Civil Engineers build the world's " +
                        "infrastructure. They work on airports, bridges, buildings, dams and waterways, drainage" +
                        " and sewer systems, city roads, and highways. The Civil Engineering courses teach students " +
                        "the fundamentals of Engineering design, as well as potential applications."));

        cardArrayList.add(new BtechMtechCard("ELECTRICAL ENGINEERING ","drawable://" + R.drawable.ee,
                "Electrical engineering is one of the" +
                        " largest and most diverse technological and engineering disciplines" +
                        " in today's world. Electrical engineering is the study and application " +
                        "of electricity, electronics and electromagnetism for the development and" +
                        " maintenance of electrical and electronics equipments such as electric motors," +
                        " navigation systems, medical devices, broadcast and communication systems, power" +
                        " generation systems, electrical distribution systems, electric grids etc.," +
                        " while keeping in mind the safety, quality, economic feasibility and sustainability " +
                        "of these products and systems."));

        cardArrayList.add(new BtechMtechCard("ELECTRONICS & COMMUNICATION ENGINEERING ","drawable://" + R.drawable.ece,
                "Electronic Engineering drives our world of new technologies. " +
                        "Devices designed by Electronic Engineers feature in all aspects of modern life, " +
                        "including computers, mobile phones, robotics, internet, digital television, satellites," +
                        " aerospace, medical scanners, security systems and sustainable energy. The department is" +
                        " well established with state of the art technology to " +
                        "impart knowledge for future industrial and educational needs. "));


        cardArrayList.add(new BtechMtechCard("MECHANICAL ENGINEERING","drawable://" + R.drawable.me
                ,"Mechanical Engineering is the core discipline as it includes the science " +
                "and art of formulation, design, development and control of systems and components" +
                " involving thermodynamics," +
                " mechanics, fluid mechanics, mechanisms and the conversion of energy into useful work. "));


        CustomListAdapter adapter  = new CustomListAdapter(getActivity(),R.layout.btechmtechcard_layout,cardArrayList);

        listView.setAdapter(adapter);

        return view;
    }
}
