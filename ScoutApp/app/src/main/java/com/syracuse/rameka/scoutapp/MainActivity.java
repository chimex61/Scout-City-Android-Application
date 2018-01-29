package com.syracuse.rameka.scoutapp;
/*
    The first activity launched after the splash screen activity is this one which loads the log in fragment
 */
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener, SignupFragment.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.first_frame, LoginFragment.newInstance()).commit();
    }

    @Override
    public void onSigninRoutine() {
        getSupportFragmentManager().beginTransaction().replace(R.id.first_frame, LoginFragment.newInstance()).addToBackStack(null).commit();
    }

    @Override
    public void onSignupRoutine() {
        getSupportFragmentManager().beginTransaction().replace(R.id.first_frame, SignupFragment.newInstance()).addToBackStack(null).commit();

    }
}