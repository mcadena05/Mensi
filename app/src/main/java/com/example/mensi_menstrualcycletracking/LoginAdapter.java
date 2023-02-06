package com.example.mensi_menstrualcycletracking;

import androidx.fragment.app.FragmentActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LoginAdapter extends FragmentStateAdapter {


    public LoginAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new LoginTabFragment();
//                LoginTabFragment loginTabFragment = new LoginTabFragment();
//                return loginTabFragment;
            case 1:
                SignUpInterface signUpInterface = null;
                return new SignupTabFragment(null);
//                SignupTabFragment signupTabFragment = new SignupTabFragment();
//                return signupTabFragment;
            default:
                return new LoginTabFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
