package com.example.mgumiero9.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button mButtonSunny;
    private Button mButtonFoggy;
    private EditText mTextViewCondition;
    private Fragment textViewCondition;
    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mButtonSunny = (Button) findViewById(R.id.buttonSunny);
        mButtonFoggy = (Button) findViewById(R.id.buttonFoggy);
        mTextViewCondition = (EditText) findViewById(R.id.textViewCondition);

        mRef = new Firebase("https://mybackend-10a0f.firebaseio.com/condition");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        })

        mButtonSunny.setOnClickListener(this);
        mButtonFoggy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSunny:

                break;
            case R.id.buttonFoggy:

                break;
        }
    }

    private void submit() {
        // validate
        String textViewConditionString = textViewCondition.getText().toString().trim();
        if (TextUtils.isEmpty(textViewConditionString)) {
            Toast.makeText(this, "textViewConditionString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
