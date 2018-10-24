package com.example.cas.parallaxscrollingheader;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private int color;
    public FirstFragment() {
        // Required empty public constructor
    }
    //use SuppressLint ot suppress not valid constructor warning
    @SuppressLint("ValidFragment")
    public FirstFragment(int color) {
        this.color = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View view=inflater.inflate(R.layout.fragment_first,container,false);

     final FrameLayout frameLayout=(FrameLayout)view.findViewById(R.id.firstfrag_bg);
     frameLayout.setBackgroundColor(color);

        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.firstfrag_scrollableview);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);


        return view;
    }

}
