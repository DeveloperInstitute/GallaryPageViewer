package sam.tutorial.gallarypageviewer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public final class PlaceSlideFragment extends Fragment {
    int imageResourceId;

    private static final String IMAGE_RES_ID = "image_res_id";

    public PlaceSlideFragment() {

    }

    public static PlaceSlideFragment newInstance(int i) {
        PlaceSlideFragment f = new PlaceSlideFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt(IMAGE_RES_ID, i);
        f.setArguments(args);

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        imageResourceId = getArguments().getInt(IMAGE_RES_ID);

        ImageView image = new ImageView(getActivity());
        image.setImageResource(imageResourceId);

        LinearLayout layout = new LinearLayout(getActivity());
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));

        layout.setGravity(Gravity.CENTER);
        layout.addView(image);

        return layout;
    }
}