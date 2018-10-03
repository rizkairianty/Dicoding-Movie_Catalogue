package com.dicoding.mymoviecataloguev2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    TextView tvDetailTitle;
    TextView tvDetailReleaseDate;
    TextView tvDetailOverview;
    TextView tvDetailVote;
    TextView tvDetailVoteCount;
    ImageView ivDetailPoster;

    public final static String EXTRA_TITLE = "TITLE";
    public final static String EXTRA_RELEASE_DATE = "RELEASE_DATE";
    public final static String  EXTRA_VOTE_COUNT = "VOTE_COUNT";
    public final static String EXTRA_VOTE = "VOTE";
    public final static String EXTRA_POSTER = "POSTER";
    public final static String EXTRA_OVERVIEW = "OVERVIEW";
    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        tvDetailTitle = (TextView) view.findViewById(R.id.tv_detail_title);
        tvDetailReleaseDate = (TextView) view.findViewById(R.id.tv_detail_release_date);
        tvDetailOverview = (TextView) view.findViewById(R.id.tv_overview);
        tvDetailVote = (TextView) view.findViewById(R.id.tv_detail_vote);
        tvDetailVoteCount = (TextView) view.findViewById(R.id.tv_detail_vote_count);
        ivDetailPoster = (ImageView) view.findViewById(R.id.iv_detail_poster);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tvDetailTitle.setText(getArguments().getString(EXTRA_TITLE));
        tvDetailReleaseDate.setText(getArguments().getString(EXTRA_RELEASE_DATE));
        tvDetailVote.setText(getArguments().getString(EXTRA_VOTE));
        tvDetailVoteCount.setText(getArguments().getString(EXTRA_VOTE_COUNT));
        tvDetailOverview.setText(getArguments().getString(EXTRA_OVERVIEW));
        Glide.with(this)
                .load("http://image.tmdb.org/t/p/w92/" + getArguments().getString(EXTRA_POSTER))
                .override(55,90)
                .placeholder(R.drawable.placeholder)
                .into(ivDetailPoster);
    }
}
