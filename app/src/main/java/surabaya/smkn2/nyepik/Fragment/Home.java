package surabaya.smkn2.nyepik.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import surabaya.smkn2.nyepik.Adapter.AdapterMain;
import surabaya.smkn2.nyepik.Model.ContentModel;
import surabaya.smkn2.nyepik.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private RecyclerView recyclerView;
    private AdapterMain adapterMain;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<ContentModel> contentModels;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.content_home, container, false);

        recyclerView = view.findViewById(R.id.RecyclerView);

        contentModels = new ArrayList<>();
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));

        adapterMain = new AdapterMain(contentModels);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AdapterMain(contentModels);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
