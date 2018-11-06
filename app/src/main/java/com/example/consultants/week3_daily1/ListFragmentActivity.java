package com.example.consultants.week3_daily1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.consultants.week3_daily1.fragment.PersonFragment;
import com.example.consultants.week3_daily1.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ListFragmentActivity extends AppCompatActivity {

    private List<Person> people = new ArrayList<>();
    private EditText etPersonName;
    private EditText etPersonAge;
    private EditText etPersonGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fragment);
    }

    private void bindViews(){
        etPersonName = findViewById(R.id.etPersonName);
        etPersonAge = findViewById(R.id.etPersonAge);
        etPersonGender = findViewById(R.id.etPersonGender);
    }

    public void onDisplayPeople(View view) {
        if ( getSupportFragmentManager().findFragmentByTag("people") == null ){
            getSupportFragmentManager().beginTransaction()
                    .add( R.id.rvDisplayPeople, PersonFragment.newInstance(people), "people")
                    .addToBackStack( "people" )
                    .commit();
        }
    }

    public void onAddPerson(View view) {
        Person person = new Person(etPersonName.getText().toString(),
                etPersonAge.getText().toString(),
                etPersonGender.getText().toString());

        people.add(person);
        Toast.makeText(this, "Added Person", Toast.LENGTH_LONG).show();
    }
}
