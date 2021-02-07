package com.thepencil.journel.ui.join;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thepencil.journel.R;
import com.thepencil.journel.databinding.FragmentJoinBinding;
import com.thepencil.journel.util.EventObserver;

public class JoinFragment extends Fragment {

    public static JoinFragment newInstance() {
        return new JoinFragment();
    }

    private FragmentJoinBinding mBinding;
    private JoinViewModel mViewModel;
    private ActivityResultLauncher<String> mGetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            new ActivityResultCallback<Uri>() {
                @Override
                public void onActivityResult(Uri result) {
                    mViewModel.setProfileImageUri(result);
                }
            });

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_join, container, false);
        mViewModel = new JoinViewModel();
        mBinding.setViewModel(mViewModel);

        setUpViewModel();
        return mBinding.getRoot();
    }

    private void setUpViewModel() {
        mViewModel.navigateToGallery.observe(getViewLifecycleOwner(), new EventObserver<>(data -> {
            mGetContent.launch("image/*");
        }));

        mViewModel.profileImageUri.observe(getViewLifecycleOwner(), uri -> {
            mBinding.addProfileImageView.setImageURI(uri);
        });
    }
}