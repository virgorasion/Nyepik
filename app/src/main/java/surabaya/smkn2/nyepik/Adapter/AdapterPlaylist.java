package surabaya.smkn2.nyepik.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import surabaya.smkn2.nyepik.Model.PlaylistModel;
import surabaya.smkn2.nyepik.R;

public class AdapterPlaylist extends RecyclerView.Adapter<AdapterPlaylist.PlaylistHolder> {

    private List<PlaylistModel> playlistModels;

    public AdapterPlaylist(List<PlaylistModel> playlistModels) {
        this.playlistModels = playlistModels;
    }

    @NonNull
    @Override
    public PlaylistHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_playlist, viewGroup, false);
        return new PlaylistHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlaylistHolder playlistHolder, int i) {
        final PlaylistModel playlistModel = playlistModels.get(i);

        playlistHolder.JudulVideo.setText(playlistModel.getJudul());
        playlistHolder.imageVideo.setImageResource(playlistModel.getImage());
        playlistHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(playlistHolder.itemView.getContext(), "image URL : " + playlistModel.getUrlImage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return playlistModels.size();
    }

    public class PlaylistHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageVideo)
        ImageView imageVideo;
        @BindView(R.id.JudulVideo)
        TextView JudulVideo;

        public PlaylistHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
