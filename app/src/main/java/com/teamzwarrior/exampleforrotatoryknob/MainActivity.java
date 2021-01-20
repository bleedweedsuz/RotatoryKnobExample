package com.teamzwarrior.exampleforrotatoryknob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.zwarriorteam.rotatoryknob.RotatoryKnobView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    
    RotatoryKnobView rotatoryKnobView1, rotatoryKnobView2;
    TextView rotatoryKnobView1_text, rotatoryKnobView2_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotatoryKnobView1_text = findViewById(R.id.rotatoryKnobView1_text);
        rotatoryKnobView2_text = findViewById(R.id.rotatoryKnobView2_text);

        //Example 1
        rotatoryKnobView1 = findViewById(R.id.rotatoryKnobView1);
        rotatoryKnobView1.setOnRotatoryKnobViewListener(new RotatoryKnobView.RotatoryKnobViewListener() {
            @Override
            public void onStateChange(boolean state) {
                Log.d(TAG, state + ": Knob 1 State");
            }

            @Override
            public void onRotateChange(int rotorValue) {
                rotatoryKnobView1_text.setText(String.valueOf(rotorValue));
                Log.d(TAG, rotatoryKnobView1.getKnobState() + " :Knob 1");
                Log.d(TAG, rotatoryKnobView1.getLastKnobDirection() + " :Knob 1");
                Log.d(TAG, rotatoryKnobView1.getMinRotorValue() + " :Knob 1");
                Log.d(TAG, rotatoryKnobView1.getMaxRotorValue() + " :Knob 1");
                Log.d(TAG, rotatoryKnobView1.getRotorValue() + " :Knob 1");
                Log.d(TAG, rotatoryKnobView1.getRotorAngle() + " :Knob 1");
                Log.d(TAG, rotatoryKnobView1.getRotorStep() + " :Knob 1");
            }

            @Override
            public void onTap(boolean isTap) {

            }
        });

        //Example 2
        rotatoryKnobView2 = findViewById(R.id.rotatoryKnobView2);
        rotatoryKnobView2.setOnRotatoryKnobViewListener(new RotatoryKnobView.RotatoryKnobViewListener() {
            @Override
            public void onStateChange(boolean state) {
                Log.d(TAG, state + ": Knob 2 State");
            }

            @Override
            public void onRotateChange(int rotorValue) {
                rotatoryKnobView2_text.setText(String.valueOf(rotorValue));
                Log.d(TAG, rotatoryKnobView2.getKnobState() + " :Knob 2");
                Log.d(TAG, rotatoryKnobView2.getLastKnobDirection() + " :Knob 2");
                Log.d(TAG, rotatoryKnobView2.getMinRotorValue() + " :Knob 2");
                Log.d(TAG, rotatoryKnobView2.getMaxRotorValue() + " :Knob 2");
                Log.d(TAG, rotatoryKnobView2.getRotorValue() + " :Knob 2");
                Log.d(TAG, rotatoryKnobView2.getRotorAngle() + " :Knob 2");
                Log.d(TAG, rotatoryKnobView2.getRotorStep() + " :Knob 2");
            }

            @Override
            public void onTap(boolean isTap) {

            }
        });
    }
}