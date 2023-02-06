package com.example.mensi_menstrualcycletracking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import java.text.BreakIterator;

public class SignupTabFragment extends Fragment {

    private final com.example.mensi_menstrualcycletracking.SignUpInterface SignUpInterface ;
    EditText email;
    EditText pass;
    EditText confirm_pass;
    AppCompatButton button_signup;
    float v=0;
    SignUpInterface signUpInterface;
    private DBHandler dbHandler;

    public SignupTabFragment(SignUpInterface signUpInterface, com.example.mensi_menstrualcycletracking.SignUpInterface signUpInterface1){
        SignUpInterface = signUpInterface1;
        this.signUpInterface = SignUpInterface;
    }

    public SignupTabFragment(com.example.mensi_menstrualcycletracking.SignUpInterface signUpInterface) {

        SignUpInterface = signUpInterface;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        email.setTranslationX(800);
        pass.setTranslationX(800);
        confirm_pass.setTranslationX(800);
        button_signup.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        confirm_pass.setAlpha(v);
        button_signup.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        confirm_pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        button_signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();


        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        email = view.findViewById(R.id.email);
        pass = view.findViewById(R.id.pass);
        confirm_pass = view.findViewById(R.id.confirm_pass);
        button_signup = view.findViewById(R.id.button_signup);

        Bundle bundle= getArguments();
        String data= bundle.getString("output_data_fragment");
        BreakIterator output = null;
        output.setText(data);

        final AppCompatButton button_signup=view.findViewById(R.id.button_signup);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpInterface.onDataReceived("Dummy Data\n");
            }
        });

    }
}
