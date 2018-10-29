package surabaya.smkn2.nyepik;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import surabaya.smkn2.nyepik.Adapter.AdapterPlaylist;
import surabaya.smkn2.nyepik.Model.PlaylistModel;

public class PlaylistActivity extends AppCompatActivity {

    @BindView(R.id.VideoContent)
    FrameLayout VideoContent;
    @BindView(R.id.JudulVideo)
    TextView JudulVideo;
    @BindView(R.id.ImageCircle)
    CircleImageView ImageCircle;
    @BindView(R.id.Owner)
    TextView Owner;
    @BindView(R.id.videoView)
    VideoView videoView;
    @BindView(R.id.RecyclerView)
    android.support.v7.widget.RecyclerView RecyclerView;
    private AdapterPlaylist adapterPlaylist;
    private MediaController mediaController;
    private List<PlaylistModel> playlistModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Playlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        playlistModels = new ArrayList<>();
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        playlistModels.add(new PlaylistModel("Ini Judul Vide", R.mipmap.ic_launcher, "Ini Url Video"));
        adapterPlaylist = new AdapterPlaylist(playlistModels);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView.setAdapter(adapterPlaylist);

        mediaController = new MediaController(this);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
