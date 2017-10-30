package com.example.jiteshnarula.gimt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jitesh Narula on 12-10-2017.
 */

public class MCA_Courses extends Fragment {
  ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.mca_layout,container,false);
            listView = (ListView) view.findViewById(R.id.listView);
        ArrayList<BtechMtechCard> mcaArrayList  = new ArrayList<>();
        mcaArrayList.add(new BtechMtechCard("COMPUTER APPLICATIONS",
                "drawable://" + R.drawable.mca2,
                "This program caters to the foundation of computing" +
                        " principles and business practices and to train " +
                        "the students to analyze problems in a wide range " +
                        "of applications. This program provides exposure to" +
                        " the students to enterprise software management " +
                        "methodologies. The course curriculum requires " +
                        "rigorous teaching, and consistent " +
                        "learning within the stipulated schedule."));

        CustomListAdapter adapter = new CustomListAdapter(getActivity(),R.layout.btechmtechcard_layout,mcaArrayList);

        listView.setAdapter(adapter);




             return view;




    }
}
