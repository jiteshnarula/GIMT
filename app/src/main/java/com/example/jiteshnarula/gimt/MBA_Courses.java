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

public class MBA_Courses extends Fragment {

    ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.mba_layout,container,false);
        listView = (ListView) view.findViewById(R.id.listView);

        ArrayList<BtechMtechCard> mbaArrayList = new ArrayList<>();
        mbaArrayList.add(new BtechMtechCard("BUSINESS ADMINISTRATION",
                "drawable://" + R.drawable.mba2,
                "Management program is aimed to groom the students " +
                        "by providing soft skills programs, personality" +
                        " development programs, seminars, workshops and" +
                        " entrepreneur development programs. The " +
                        "specialization in this program are Financial" +
                        " Management, " +
                        "Marketing Management and Human Resource Management."+"\n"+"The Master of Business Administration (MBA or M.B.A.) is a master's degree in business administration (management).\n" +
                        "\n" +
                        "The MBA degree originated in the United States in the early" +
                        " 20th century when the country industrialized and companies" +
                        " sought scientific approaches to management. The core courses" +
                        " in an MBA program cover various areas of business such as" +
                        " accounting, applied statistics, business communication," +
                        " business ethics, business law, finance, managerial economics" +
                        ", management, marketing and operations in a manner most" +
                        " relevant to management analysis and strategy. Most programs " +
                        "also include elective courses and concentrations for further" +
                        " study in a particular area. Most challenging and prestigious" +
                        " MBA concentrations include accounting and finance. MBA " +
                        "programs typically require completing nearly twice the number" +
                        " of credits typically required for degrees that cover some of" +
                        " the same material such as the Master of Economics, Master of" +
                        " Finance, Master of Accountancy, Master of Science in " +
                        "Marketing and Master of Science in Management."));

                CustomListAdapter adapter = new CustomListAdapter(getActivity(),R.layout.btechmtechcard_layout,mbaArrayList);
                listView.setAdapter(adapter);
            return view;
    }
}
