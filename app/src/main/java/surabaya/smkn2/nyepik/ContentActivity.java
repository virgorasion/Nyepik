package surabaya.smkn2.nyepik;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import surabaya.smkn2.nyepik.Adapter.AdapterMain;
import surabaya.smkn2.nyepik.Model.ContentModel;

public class ContentActivity extends AppCompatActivity {

    @BindView(R.id.RecyclerView)
    android.support.v7.widget.RecyclerView RecyclerView;
    private AdapterMain adapterMain;
    private List<ContentModel> contentModels;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);
        ButterKnife.bind(this);

        contentModels = new ArrayList<>();
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));
        contentModels.add(new ContentModel(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, "Judul Video", "Ini adalah keterangan sebagai dammy adata"));

        adapterMain = new AdapterMain(contentModels);
        RecyclerView.setAdapter(adapterMain);
        RecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContentActivity.this, "Action Ketika Klik", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
