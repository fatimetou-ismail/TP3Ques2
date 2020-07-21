package com.example.tp3ques2;

import android.media.MediaCodec;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;


public class LoginFragment extends Fragment {


    // TODO: Rename and change types of parameters
    private EditText email ;
    private EditText password;
    private Button bouton;
    private View rootView;

    public LoginFragment() {
        // Required empty public constructor
    }

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView= inflater.inflate(R.layout.fragment_login, container, false);
        email= (EditText) rootView.findViewById(R.id.Email) ;
        password= (EditText) rootView.findViewById(R.id.Password) ;
        bouton= (Button) rootView.findViewById(R.id.button) ;

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              WelcomeFragment welcomeFragment=new WelcomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_activity_layout,welcomeFragment);
                transaction.commit();
            }
        });

        return rootView;
    }
   
}