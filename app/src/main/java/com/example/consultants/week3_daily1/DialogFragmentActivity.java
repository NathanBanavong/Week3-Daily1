package com.example.consultants.week3_daily1;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

//using the MyDialogFragment
public class DialogFragmentActivity extends AppCompatActivity {

    FragmentManager findme = getSupportFragmentManager();

//    getSupportFragmentManager().findFragmentByTag(MyDialogFragment.TAG)
    private MyDialogFragment newDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);
    }

    void showDialog() {
        newDialog = MyDialogFragment.newInstance();
        newDialog.show(findme, "dialog");
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                newDialog.dismiss();
            }
        }, 3000);
    }


    public void doPositiveClick() {
        // Do stuff here.
        Log.i("FragmentAlertDialog", "Positive click!");
    }

    public void doNegativeClick() {
        // Do stuff here.
        Log.i("FragmentAlertDialog", "Negative click!");
    }
}

