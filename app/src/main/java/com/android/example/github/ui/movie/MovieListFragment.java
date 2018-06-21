package com.android.example.github.ui.movie;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.example.github.R;
import com.android.example.github.databinding.ActivityEarthquakeListFragmentBinding;

public class MovieListFragment extends Fragment {

    private static final String MOVIE_DIALOG_TAG = "movie_dialog_tag";

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private RecyclerView.LayoutManager recyclerViewLayoutManager;

    ActivityEarthquakeListFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()),
                R.layout.activity_earthquake_list_fragment, container, false);

        promptForPlayers();

        return binding.getRoot();
    }

    public void promptForPlayers() {
        MoviesFilterFragment dialog = MoviesFilterFragment.newInstance(this);
        dialog.setCancelable(false);
        dialog.show(getFragmentManager(), MOVIE_DIALOG_TAG);
    }
}
