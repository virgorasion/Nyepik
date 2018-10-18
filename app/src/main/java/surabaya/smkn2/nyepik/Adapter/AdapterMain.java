package surabaya.smkn2.nyepik.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
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
import de.hdodenhof.circleimageview.CircleImageView;
import surabaya.smkn2.nyepik.Model.ContentModel;
import surabaya.smkn2.nyepik.R;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.HolderMain> {

    private List<ContentModel> mItems;

    public AdapterMain(List<ContentModel> mItems) {
        this.mItems = mItems;
    }

    @NonNull
    @Override
    public HolderMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items, parent, false);
        return new HolderMain(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final HolderMain holder, int position) {
        ContentModel contentModel = mItems.get(position);

        holder.MainImage.setImageResource(contentModel.getMainImage());
        holder.ImageCircle.setImageResource(contentModel.getCircleImage());
        holder.JudulVideo.setText(contentModel.getJudulVideo());
        holder.KeteranganVideo.setText(contentModel.getKeteranganVideo());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.cardView.getContext(), "Ini Buat Pindah Halaman", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class HolderMain extends RecyclerView.ViewHolder {

        @BindView(R.id.MainImage)
        ImageView MainImage;
        @BindView(R.id.ImageCircle)
        CircleImageView ImageCircle;
        @BindView(R.id.JudulVideo)
        TextView JudulVideo;
        @BindView(R.id.KeteranganVideo)
        TextView KeteranganVideo;
        @BindView(R.id.cardView)
        CardView cardView;

        public HolderMain(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
