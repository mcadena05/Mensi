package com.example.mensi_menstrualcycletracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity implements SignUpInterface {

    EditText name, email, pass, confirm_pass;
    AppCompatButton button_signup;
    DBHandler dbHandler;
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    LoginAdapter loginAdapter;

//    FloatingActionButton fb;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        confirm_pass = findViewById(R.id.confirm_pass);
        button_signup = findViewById(R.id.button_signup);


        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.view_pager);
        loginAdapter = new LoginAdapter(this);
        viewPager2.setAdapter(loginAdapter);
//        fb = findViewById(R.id.fab_bf);
//        google = findViewById(R.id.fab_google);
//        twitter = findViewById(R.id.fab_twitter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
    }


    @Override
    public void onDataReceived(String data) {

    }
}