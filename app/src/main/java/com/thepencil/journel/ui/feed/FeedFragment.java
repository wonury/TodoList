package com.thepencil.journel.ui.feed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.thepencil.journel.R;
import com.thepencil.journel.databinding.FragmentFeedBinding;

public class FeedFragment extends Fragment {

    public static FeedFragment newInstance() { return new FeedFragment(); }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentFeedBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_feed, container, false);

        binding.navigatePostButton.setOnClickListener(v -> {
            NavDirections action = FeedFragmentDirections.actionFeedFragmentToPostFragment();
            Navigation.findNavController(v).navigate(action);
        });
        return binding.getRoot();
    }
}