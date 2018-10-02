package surabaya.smkn2.nyepik;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.HolderMain> {

    @NonNull
    @Override
    public HolderMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderMain holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HolderMain extends RecyclerView.ViewHolder{
        public HolderMain(View itemView) {
            super(itemView);
        }
    }
}
