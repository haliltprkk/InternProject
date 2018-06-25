package com.example.haliltprkk.internproject;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;

import java.text.DecimalFormat;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    @BindView(R.id.x_coordinate_text_view)
    TextView xCoordinateTextView;
    @BindView(R.id.y_coordinate_text_view)
    TextView yCoordinateTextView;
    @BindView(R.id.z_coordinate_text_view)
    TextView zCoordinateTextView;
    @BindView(R.id.square_tv)
    TextView squareTv;
    @BindView(R.id.ll_1)
    LinearLayout ll1;
    @BindView(R.id.ll_2)
    LinearLayout ll2;
    @BindView(R.id.ll_3)
    LinearLayout ll3;
    @BindView(R.id.ll_4)
    LinearLayout ll4;
    @BindView(R.id.ll_5)
    LinearLayout ll5;
    @BindView(R.id.im_1_1)
    ImageView im11;
    @BindView(R.id.im_1_2)
    ImageView im12;
    @BindView(R.id.im_1_3)
    ImageView im13;
    @BindView(R.id.im_1_4)
    ImageView im14;
    @BindView(R.id.im_1_5)
    ImageView im15;
    @BindView(R.id.im_1_6)
    ImageView im16;
    @BindView(R.id.im_1_7)
    ImageView im17;
    @BindView(R.id.im_1_8)
    ImageView im18;
    @BindView(R.id.im_2_1)
    ImageView im21;
    @BindView(R.id.im_2_2)
    ImageView im22;
    @BindView(R.id.im_2_3)
    ImageView im23;
    @BindView(R.id.im_2_4)
    ImageView im24;
    @BindView(R.id.im_2_5)
    ImageView im25;
    @BindView(R.id.im_2_6)
    ImageView im26;
    @BindView(R.id.im_2_7)
    ImageView im27;
    @BindView(R.id.im_2_8)
    ImageView im28;
    @BindView(R.id.im_3_1)
    ImageView im31;
    @BindView(R.id.im_3_2)
    ImageView im32;
    @BindView(R.id.im_3_3)
    ImageView im33;
    @BindView(R.id.im_3_4)
    ImageView im34;
    @BindView(R.id.im_3_5)
    ImageView im35;
    @BindView(R.id.im_3_6)
    ImageView im36;
    @BindView(R.id.im_3_7)
    ImageView im37;
    @BindView(R.id.im_3_8)
    ImageView im38;
    @BindView(R.id.im_4_1)
    ImageView im41;
    @BindView(R.id.im_4_2)
    ImageView im42;
    @BindView(R.id.im_4_3)
    ImageView im43;
    @BindView(R.id.im_4_4)
    ImageView im44;
    @BindView(R.id.im_4_5)
    ImageView im45;
    @BindView(R.id.im_4_6)
    ImageView im46;
    @BindView(R.id.im_4_7)
    ImageView im47;
    @BindView(R.id.im_4_8)
    ImageView im48;
    @BindView(R.id.im_5_1)
    ImageView im51;
    @BindView(R.id.im_5_2)
    ImageView im52;
    @BindView(R.id.im_5_3)
    ImageView im53;
    @BindView(R.id.im_5_4)
    ImageView im54;
    @BindView(R.id.im_5_5)
    ImageView im55;
    @BindView(R.id.im_5_6)
    ImageView im56;
    @BindView(R.id.im_5_7)
    ImageView im57;
    @BindView(R.id.im_5_8)
    ImageView im58;
    @BindView(R.id.timer_tv)
    TextView timerTv;
    private SensorManager sensorManager;
    private Sensor accelerometerSensor;
    DecimalFormat df = new DecimalFormat();
    int startX = 9, startY = 0, startZ = 0;
    float calibratedXTop = 0, calibratedYTop = 0, calibratedZTop = 0;
    float calibratedXDown = 0, calibratedYDown = 0, calibratedZDown = 0;
    float calibratedXRight = 0, calibratedYRight = 0, calibratedZRight = 0;
    float calibratedXLeft = 0, calibratedYLeft = 0, calibratedZLeft = 0;
    float realX = 0, realY = 0, realZ = 0;


    int step = 0;
    TextView detailsTv;
    CountDownTimer countDownTimer;
    MaterialDialog dialog;
    ImageView imageView;
    ProgressBar progressBar;

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
        dialog();
    }

    public void dialog() {

        dialog = new MaterialDialog.Builder(MainActivity.this)
                .customView(R.layout.calibration_dialog_custom_view, false)
                .show();
        View view = dialog.getCustomView();
        final TextView counterTv = (TextView) view.findViewById(R.id.counter_tv);
        detailsTv = (TextView) view.findViewById(R.id.dialog_details_tv);
        progressBar = (ProgressBar) view.findViewById(R.id.dialog_pb);
        imageView = (ImageView) view.findViewById(R.id.tick_iv);


        countDownTimer = new CountDownTimer(7000, 1000) {
            public void onTick(long millisUntilFinished) {

                timerTv.setText("seconds remaining: " + millisUntilFinished / 1000);
                counterTv.setText(millisUntilFinished / 1000 + "");
            }

            public void onFinish() {
                step = ++step;
                progressBar.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
                control(step);
            }
        };
        countDownTimer.start();

    }

    public void control(int step) {
        if (step == 1) {
            calibratedXTop = realX;
            calibratedYTop = realY;
            calibratedZTop = realZ;
            detailsTv.setText("şimdi aşağıya bakın");

            waitt();
            countDownTimer.start();

        } else if (step == 2) {
            calibratedXDown = realX;
            calibratedYDown = realY;
            calibratedZDown = realZ;
            detailsTv.setText("şimdi sağa bakın");

            waitt();
            countDownTimer.start();

        } else if (step == 3) {
            calibratedXRight = realX;
            calibratedYRight = realY;
            calibratedZRight = realZ;
            detailsTv.setText("şimdi sola bakın");

            waitt();
            countDownTimer.start();

        } else if (step == 4) {
            calibratedXLeft = realX;
            calibratedYLeft = realY;
            calibratedZLeft = realZ;
            detailsTv.setText("TAMAMLANDI");

            waitt();
        }

    }

    public void waitt() {
        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {
                //progressBar.setVisibility(View.GONE);
                //imageView.setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                //progressBar.setVisibility(View.VISIBLE);
                //imageView.setVisibility(View.GONE);
                if (step == 4) {
                    dialog.dismiss();
                }
            }
        }.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, accelerometerSensor, 200);//it can be more slow
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        realX = sensorEvent.values[0];
        realY = sensorEvent.values[1];
        realZ = sensorEvent.values[2];
        xCoordinateTextView.setText((int) sensorEvent.values[0] + ""); ////"" + String.format("%.01f", sensorEvent.values[0]));
        yCoordinateTextView.setText((int) sensorEvent.values[1] + "");////"" + String.format("%.01f", sensorEvent.values[1]));
        zCoordinateTextView.setText((int) sensorEvent.values[2] + "");////"" + String.format("%.01f", sensorEvent.values[2]));
        row(sensorEvent);


    }

    void column(SensorEvent sensorEvent, int id) {
        //-3 -2 -1 0 1 2 3 4
        float y = sensorEvent.values[1];
        float spacing = (Math.abs(calibratedYLeft) + Math.abs(calibratedYRight)) / 8;
        if (id == R.id.ll_1) {
            if (y < calibratedYLeft) {
                makeColumnsUnVisible();
                im11.setVisibility(View.VISIBLE);

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeColumnsUnVisible();
                im12.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeColumnsUnVisible();
                im13.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeColumnsUnVisible();
                im14.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeColumnsUnVisible();
                im15.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeColumnsUnVisible();
                im16.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeColumnsUnVisible();
                im17.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeColumnsUnVisible();
                im18.setVisibility(View.VISIBLE);
            }
        } else if (id == R.id.ll_2) {
            if (y < calibratedYLeft) {
                makeColumnsUnVisible();
                im21.setVisibility(View.VISIBLE);
            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeColumnsUnVisible();
                im22.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeColumnsUnVisible();
                im23.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeColumnsUnVisible();
                im24.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeColumnsUnVisible();
                im25.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeColumnsUnVisible();
                im26.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeColumnsUnVisible();
                im27.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeColumnsUnVisible();
                im28.setVisibility(View.VISIBLE);
            }
        } else if (id == R.id.ll_3) {
            if (y < calibratedYLeft) {
                makeColumnsUnVisible();
                im31.setVisibility(View.VISIBLE);

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeColumnsUnVisible();
                im32.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeColumnsUnVisible();
                im33.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeColumnsUnVisible();
                im34.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeColumnsUnVisible();
                im35.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeColumnsUnVisible();
                im36.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeColumnsUnVisible();
                im37.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeColumnsUnVisible();
                im38.setVisibility(View.VISIBLE);
            }
        } else if (id == R.id.ll_4) {
            if (y < calibratedYLeft) {
                makeColumnsUnVisible();
                im41.setVisibility(View.VISIBLE);

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeColumnsUnVisible();
                im42.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeColumnsUnVisible();
                im43.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeColumnsUnVisible();
                im44.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeColumnsUnVisible();
                im45.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeColumnsUnVisible();
                im46.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeColumnsUnVisible();
                im47.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeColumnsUnVisible();
                im48.setVisibility(View.VISIBLE);
            }
        } else if (id == R.id.ll_5) {
            if (y < calibratedYLeft) {
                makeColumnsUnVisible();
                im51.setVisibility(View.VISIBLE);

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeColumnsUnVisible();
                im52.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeColumnsUnVisible();
                im53.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeColumnsUnVisible();
                im54.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeColumnsUnVisible();
                im55.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeColumnsUnVisible();
                im56.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeColumnsUnVisible();
                im57.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeColumnsUnVisible();
                im58.setVisibility(View.VISIBLE);
            }
        }

    }


    void row(SensorEvent sensorEvent) {
        float x = sensorEvent.values[0];

        float space = (Math.abs(calibratedXTop - calibratedXDown)) / 5;
        Log.i("sabir", "top " + calibratedXTop + " down " + calibratedXDown + " space  " + space);

        if (x < calibratedXTop) {
            makeRowsUnVisible();
            ll1.setVisibility(View.VISIBLE);
            column(sensorEvent, ll1.getId());
        }
        if (x > calibratedXTop && x < (calibratedXTop + space)) {
            makeRowsUnVisible();
            ll2.setVisibility(View.VISIBLE);
            column(sensorEvent, ll2.getId());
        }
        if (x > (calibratedXTop + space) && x < (calibratedXTop + 2 * space)) {
            makeRowsUnVisible();
            ll3.setVisibility(View.VISIBLE);
            column(sensorEvent, ll3.getId());

        }
        if (x > (calibratedXTop + 2 * space) && x < (calibratedXTop + 3 * space)) {
            makeRowsUnVisible();
            ll4.setVisibility(View.VISIBLE);
            column(sensorEvent, ll4.getId());

        }
        if (x > (calibratedXTop + 3 * space) && x < (calibratedXTop + 4 * space)) {
            makeRowsUnVisible();
            ll5.setVisibility(View.VISIBLE);
            column(sensorEvent, ll5.getId());
        }
        squareTv.setText("" + x);
    }

    void makeRowsUnVisible() {
        ll1.setVisibility(View.INVISIBLE);
        ll2.setVisibility(View.INVISIBLE);
        ll3.setVisibility(View.INVISIBLE);
        ll4.setVisibility(View.INVISIBLE);
        ll5.setVisibility(View.INVISIBLE);
    }

    void makeColumnsUnVisible() {
        if (ll1.getVisibility() == View.VISIBLE) {
            im11.setVisibility(View.INVISIBLE);
            im12.setVisibility(View.INVISIBLE);
            im13.setVisibility(View.INVISIBLE);
            im14.setVisibility(View.INVISIBLE);
            im15.setVisibility(View.INVISIBLE);
            im16.setVisibility(View.INVISIBLE);
            im17.setVisibility(View.INVISIBLE);
            im18.setVisibility(View.INVISIBLE);

        } else if (ll2.getVisibility() == View.VISIBLE) {
            im21.setVisibility(View.INVISIBLE);
            im22.setVisibility(View.INVISIBLE);
            im23.setVisibility(View.INVISIBLE);
            im24.setVisibility(View.INVISIBLE);
            im25.setVisibility(View.INVISIBLE);
            im26.setVisibility(View.INVISIBLE);
            im27.setVisibility(View.INVISIBLE);
            im28.setVisibility(View.INVISIBLE);

        } else if (ll3.getVisibility() == View.VISIBLE) {
            im31.setVisibility(View.INVISIBLE);
            im32.setVisibility(View.INVISIBLE);
            im33.setVisibility(View.INVISIBLE);
            im34.setVisibility(View.INVISIBLE);
            im35.setVisibility(View.INVISIBLE);
            im36.setVisibility(View.INVISIBLE);
            im37.setVisibility(View.INVISIBLE);
            im38.setVisibility(View.INVISIBLE);

        } else if (ll4.getVisibility() == View.VISIBLE) {
            im41.setVisibility(View.INVISIBLE);
            im42.setVisibility(View.INVISIBLE);
            im43.setVisibility(View.INVISIBLE);
            im44.setVisibility(View.INVISIBLE);
            im45.setVisibility(View.INVISIBLE);
            im46.setVisibility(View.INVISIBLE);
            im47.setVisibility(View.INVISIBLE);
            im48.setVisibility(View.INVISIBLE);

        } else if (ll5.getVisibility() == View.VISIBLE) {
            im51.setVisibility(View.INVISIBLE);
            im52.setVisibility(View.INVISIBLE);
            im53.setVisibility(View.INVISIBLE);
            im54.setVisibility(View.INVISIBLE);
            im55.setVisibility(View.INVISIBLE);
            im56.setVisibility(View.INVISIBLE);
            im57.setVisibility(View.INVISIBLE);
            im58.setVisibility(View.INVISIBLE);

        }
    }

    void movePointer(float X, float Y, float Z) {
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
