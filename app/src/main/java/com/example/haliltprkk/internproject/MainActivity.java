package com.example.haliltprkk.internproject;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.x_coordinate_text_view)
    TextView xCoordinateTextView;
    @BindView(R.id.y_coordinate_text_view)
    TextView yCoordinateTextView;
    @BindView(R.id.z_coordinate_text_view)
    TextView zCoordinateTextView;
    private SensorManager sensorManager;
    private Sensor accelerometerSensor;
    private SensorEventListener gyroscobeventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (accelerometerSensor == null) {
            Toast.makeText(this, "Cihazınızda İVMEÖLÇER sensörü bulunmamaktadır!", Toast.LENGTH_SHORT).show();
            finish();
        }
        gyroscobeventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                xCoordinateTextView.setText("" + (int) sensorEvent.values[0]);
                yCoordinateTextView.setText("" + (int) sensorEvent.values[1]);
                zCoordinateTextView.setText("" + (int) sensorEvent.values[2]);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(gyroscobeventListener, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);//it can be more slow
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(gyroscobeventListener);
    }
}
