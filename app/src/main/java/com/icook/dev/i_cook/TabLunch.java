package com.icook.dev.i_cook;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Win8.1 on 9/23/2017.
 */

public class TabLunch extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public static final String[] titleArray = new String[] {"Chicken Curry","Crunchy Sisig","Pinakbet","Paksiw na Lechon"};
    public static final Integer[] imageArray = {R.drawable.chicken_curry,R.drawable.crunchy_sisig,R.drawable.pinakbet,R.drawable.paksiw_lechon};

    private List<ListBFast> listRecipes;

    public TabLunch() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_lunch, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.lunchRecylerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        listRecipes = new ArrayList<ListBFast>();


        for(int i=0; i<titleArray.length;i++){
            ListBFast listRecipe = new ListBFast(titleArray[i], imageArray[i]);
            listRecipes.add(listRecipe);
        }

        adapter = new BFastAdapter(listRecipes, getActivity());

        recyclerView.setAdapter(adapter);

        return view;
    }
}
