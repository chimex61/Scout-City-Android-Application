package com.syracuse.rameka.scoutapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.syracuse.rameka.scoutapp.FourSquareVenuDetailModel.FSVenueDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class InterestedFragment extends Fragment {
    RecyclerView myRecyclerView;
    LinearLayoutManager myLayoutManager;
    RecommendedRecyclerAdapter myAdapter;
    //ShareActionProvider mySharedActionProvider;
//    static Double lat;
//    static Double lng;
//    static String lname;
//    static int taskId;
//    TextView textViewToolbar;
    static List<String> listData;
    static int totalListSize;
    static List<FSVenueDetails> adapterData;


    public interface InterestedRecycleViewListener {
        public void onRecycleViewItemClicked(View v, com.syracuse.rameka.scoutapp.FourSquareVenueRecommendedModel.Item item);
    }
    private InterestedRecycleViewListener customOnClickRvListener;

    private static final String ARG_SECTION_NUMBER = "sectionNumber";

    public static  RecommendedRecyclerFragment newInstance(List<String> list){
        RecommendedRecyclerFragment fragment = new RecommendedRecyclerFragment();
        Bundle args = new Bundle();
        listData = list;
        totalListSize = list.size();
        fragment.setArguments(args);
        return  fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setHasOptionsMenu(true);
    }

    public InterestedFragment(){
    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//
//        if (menu.findItem(R.id.icon_searchButton) == null) {
//            inflater.inflate(R.menu.menu_recycler, menu);
//        }
//        SearchView search = (SearchView) menu.findItem(R.id.icon_searchButton).getActionView();
//        if (search != null) {
//            search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//                @Override
//                public boolean onQueryTextSubmit(String query) {
//                    int pos = findFirst(query);
//                    if (pos >= 0)
//                        myRecyclerView.scrollToPosition(pos);
//                    return true;
//                }
//
//                @Override
//                public boolean onQueryTextChange(String query) {
//                    return true;
//                }
//            });
//        }
//
//        super.onCreateOptionsMenu(menu, inflater);
//    }

//    private int findFirst(String query) {
//        int pos=-1;
//
//        for(int i=0;i<listData.size();i++){
//            if(listData.get(i).getVenue().getName().toLowerCase().contains(query.toLowerCase())){
//                pos = i;
//                break;
//            }
//        }
//
//        return pos;
//    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        final View rootView = inflater.inflate(R.layout.fragment_recommended_recycler,container,false);



        customOnClickRvListener = (InterestedRecycleViewListener) rootView.getContext();

        myRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerviewrow);
        //Implement myRecyclerView

        myLayoutManager = new LinearLayoutManager(getActivity());
        //Implement myLayoutManager

        myRecyclerView.setLayoutManager(myLayoutManager);

        for(int i=0;i<listData.size();i++){
            getData(listData.get(i),i);
        }


        return rootView;
    }

    private void getData(String s, int i) {
        final int valCheck = i;
        Call<FSVenueDetails> venue = FSVenueDetailAPI.getService().getDetails(s);

        venue.enqueue(new Callback<FSVenueDetails>() {
            @Override
            public void onResponse(Call<FSVenueDetails> call, Response<FSVenueDetails> response) {
                FSVenueDetails list = response.body();
                adapterData.add(list);
                if(valCheck==totalListSize) {
                    //set adapter;
                }
            }

            @Override
            public void onFailure(Call<FSVenueDetails> call, Throwable t) {

            }
        });

    }

}


