package smoothpineapple.com.howru.views.carousel;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import smoothpineapple.com.howru.R;


public class CarouselView extends RecyclerView.Adapter<CarouselView.ViewHolder> {
    private static  final String CLASS_NAME = CarouselView.class.getSimpleName();

    private List<CarouselItem> data;
    private Context context;

    public CarouselView(Context context, List<CarouselItem> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public CarouselView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.emotion_card, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CarouselView.ViewHolder holder, final int position) {
        Glide.with(holder.itemView.getContext())
                .load(data.get(position).getImage())
                .into(holder.image);

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,getName(position),Toast.LENGTH_SHORT).show();
                Log.d(CLASS_NAME, "I've been clicked! " + getName(position));

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public String getName(int position) {
        return data.get(position).getName();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.emotion_image);
        }
    }
}
