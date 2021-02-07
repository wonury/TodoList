package com.thepencil.journel.ui.post;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.thepencil.journel.R;
import com.thepencil.journel.databinding.FragmentPostBinding;

public class PostFragment extends Fragment {

    public static PostFragment newInstance() {
        return new PostFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentPostBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_post, container, false);
        return binding.getRoot();
    }
}