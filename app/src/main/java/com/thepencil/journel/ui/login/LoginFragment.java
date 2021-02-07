package com.thepencil.journel.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.thepencil.journel.R;
import com.thepencil.journel.databinding.FragmentLoginBinding;
import com.thepencil.journel.ui.MainActivity;
import com.thepencil.journel.util.EventObserver;

public class LoginFragment extends Fragment {

    private NavDirections mActionJoinFragment = LoginFragmentDirections.actionLoginFragmentToJoinFragment();
    private LoginViewModel mLoginViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentLoginBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_login, container, false);
        mLoginViewModel = new LoginViewModel();
        binding.setViewModel(mLoginViewModel);

        setUpViewModel();
        return binding.getRoot();
    }

    private void setUpViewModel() {
        mLoginViewModel.navigateToJoinEvent.observe(getViewLifecycleOwner(), new EventObserver<>(data -> {
            Navigation.findNavController(getView()).navigate(mActionJoinFragment);
        }));
    }
}