package com.example.haliltprkk.internproject;

import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
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
import java.util.ArrayList;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    @BindView(R.id.x_coordinate_text_view)
    TextView xCoordinateTextView;
    @BindView(R.id.y_coordinate_text_view)
    TextView yCoordinateTextView;
    @BindView(R.id.z_coordinate_text_view)
    TextView zCoordinateTextView;
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
    @BindView(R.id.ll_1_1)
    LinearLayout ll11;
    @BindView(R.id.ll_1_2)
    LinearLayout ll12;
    @BindView(R.id.ll_1_3)
    LinearLayout ll13;
    @BindView(R.id.ll_1_4)
    LinearLayout ll14;
    @BindView(R.id.ll_1_5)
    LinearLayout ll15;
    @BindView(R.id.ll_1_6)
    LinearLayout ll16;
    @BindView(R.id.ll_1_7)
    LinearLayout ll17;
    @BindView(R.id.ll_1_8)
    LinearLayout ll18;
    @BindView(R.id.ll_2_1)
    LinearLayout ll21;
    @BindView(R.id.ll_2_2)
    LinearLayout ll22;
    @BindView(R.id.ll_2_3)
    LinearLayout ll23;
    @BindView(R.id.ll_2_4)
    LinearLayout ll24;
    @BindView(R.id.ll_2_5)
    LinearLayout ll25;
    @BindView(R.id.ll_2_6)
    LinearLayout ll26;
    @BindView(R.id.ll_2_7)
    LinearLayout ll27;
    @BindView(R.id.ll_2_8)
    LinearLayout ll28;
    @BindView(R.id.ll_3_1)
    LinearLayout ll31;
    @BindView(R.id.ll_3_2)
    LinearLayout ll32;
    @BindView(R.id.ll_3_3)
    LinearLayout ll33;
    @BindView(R.id.ll_3_4)
    LinearLayout ll34;
    @BindView(R.id.ll_3_5)
    LinearLayout ll35;
    @BindView(R.id.ll_3_6)
    LinearLayout ll36;
    @BindView(R.id.ll_3_7)
    LinearLayout ll37;
    @BindView(R.id.ll_3_8)
    LinearLayout ll38;
    @BindView(R.id.ll_4_1)
    LinearLayout ll41;
    @BindView(R.id.ll_4_2)
    LinearLayout ll42;
    @BindView(R.id.ll_4_3)
    LinearLayout ll43;
    @BindView(R.id.ll_4_4)
    LinearLayout ll44;
    @BindView(R.id.ll_4_5)
    LinearLayout ll45;
    @BindView(R.id.ll_4_6)
    LinearLayout ll46;
    @BindView(R.id.ll_4_7)
    LinearLayout ll47;
    @BindView(R.id.ll_4_8)
    LinearLayout ll48;
    @BindView(R.id.ll_5_1)
    LinearLayout ll51;
    @BindView(R.id.ll_5_2)
    LinearLayout ll52;
    @BindView(R.id.ll_5_3)
    LinearLayout ll53;
    @BindView(R.id.ll_5_4)
    LinearLayout ll54;
    @BindView(R.id.ll_5_5)
    LinearLayout ll55;
    @BindView(R.id.ll_5_6)
    LinearLayout ll56;
    @BindView(R.id.ll_5_7)
    LinearLayout ll57;
    @BindView(R.id.ll_5_8)
    LinearLayout ll58;
    @BindView(R.id.text_tv)
    TextView textTv;
    @BindView(R.id.im_1_9)
    ImageView im19;
    @BindView(R.id.ll_1_9)
    LinearLayout ll19;
    @BindView(R.id.im_2_9)
    ImageView im29;
    @BindView(R.id.ll_2_9)
    LinearLayout ll29;
    @BindView(R.id.im_3_9)
    ImageView im39;
    @BindView(R.id.ll_3_9)
    LinearLayout ll39;
    @BindView(R.id.im_4_9)
    ImageView im49;
    @BindView(R.id.ll_4_9)
    LinearLayout ll49;
    @BindView(R.id.im_5_9)
    ImageView im59;
    @BindView(R.id.ll_5_9)
    LinearLayout ll59;
    private SensorManager sensorManager;
    private Sensor accelerometerSensor;
    DecimalFormat df = new DecimalFormat();
    float calibratedXTop = 0, calibratedYTop = 0, calibratedZTop = 0;
    float calibratedXDown = 0, calibratedYDown = 0, calibratedZDown = 0;
    float calibratedXRight = 0, calibratedYRight = 0, calibratedZRight = 0;
    float calibratedXLeft = 0, calibratedYLeft = 0, calibratedZLeft = 0;
    float realX = 0, realY = 0, realZ = 0;
    ArrayList<String> arraylistText = new ArrayList<>();
    CountDownTimer textCounter;
    int res = 0, res2 = 0;
    boolean addNewLine = false, isSpeak = false;
    int step = 0;
    TextView detailsTv;
    CountDownTimer countDownTimer;
    MaterialDialog dialog;
    ProgressBar progressBar;
    TextToSpeech textToSpeech;
    int result;

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
        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    result = textToSpeech.setLanguage(new Locale("tr-TR"));

                } else {
                    Toast.makeText(MainActivity.this, "Hata oluştu!", Toast.LENGTH_SHORT).show();
                }

            }
        });
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

        countDownTimer = new CountDownTimer(7000, 1000) {
            public void onTick(long millisUntilFinished) {

                counterTv.setText(millisUntilFinished / 1000 + "");
            }

            public void onFinish() {
                step = ++step;
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
            waitt(2000);
            countDownTimer.start();

        } else if (step == 2) {
            calibratedXDown = realX;
            calibratedYDown = realY;
            calibratedZDown = realZ;
            detailsTv.setText("şimdi sağa bakın");
            waitt(2000);
            countDownTimer.start();

        } else if (step == 3) {
            calibratedXRight = realX;
            calibratedYRight = realY;
            calibratedZRight = realZ;
            detailsTv.setText("şimdi sola bakın");
            waitt(2000);
            countDownTimer.start();

        } else if (step == 4) {
            calibratedXLeft = realX;
            calibratedYLeft = realY;
            calibratedZLeft = realZ;
            detailsTv.setText("TAMAMLANDI");
            waitt(2000);
        }

    }

    public void waitt(int time) {
        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {

                if (step == 4) {
                    dialog.dismiss();
                    arraylistText = new ArrayList<>();
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
        float y = sensorEvent.values[1];
        float spacing = (Math.abs(calibratedYLeft) + Math.abs(calibratedYRight)) / 9;
        if (id == R.id.ll_1) {
            if (y < calibratedYLeft) {
                makeBackgroundWhite();
                ll11.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im11.setVisibility(View.VISIBLE);
                listenBackgrounds();

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeBackgroundWhite();
                ll12.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im12.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeBackgroundWhite();
                ll13.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im13.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeBackgroundWhite();
                ll14.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im14.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeBackgroundWhite();
                ll15.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im15.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeBackgroundWhite();
                ll16.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im16.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeBackgroundWhite();
                ll17.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im17.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeBackgroundWhite();
                ll18.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im18.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 7 * spacing) && y < (calibratedYLeft + 8 * spacing)) {
                makeBackgroundWhite();
                ll19.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im19.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
        } else if (id == R.id.ll_2) {
            if (y < calibratedYLeft) {
                makeBackgroundWhite();
                ll21.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im21.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeBackgroundWhite();
                ll22.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im22.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeBackgroundWhite();
                ll23.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im23.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeBackgroundWhite();
                ll24.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im24.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeBackgroundWhite();
                ll25.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im25.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeBackgroundWhite();
                ll26.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im26.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeBackgroundWhite();
                ll27.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im27.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeBackgroundWhite();
                ll28.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im28.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 7 * spacing) && y < (calibratedYLeft + 8 * spacing)) {
                makeBackgroundWhite();
                ll29.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im29.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
        } else if (id == R.id.ll_3) {
            if (y < calibratedYLeft) {
                makeBackgroundWhite();
                ll31.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im31.setVisibility(View.VISIBLE);
                listenBackgrounds();

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeBackgroundWhite();
                ll32.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im32.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeBackgroundWhite();
                ll33.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im33.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeBackgroundWhite();
                ll34.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im34.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeBackgroundWhite();
                ll35.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im35.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeBackgroundWhite();
                ll36.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im36.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeBackgroundWhite();
                ll37.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im37.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeBackgroundWhite();
                ll38.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im38.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 7 * spacing) && y < (calibratedYLeft + 8 * spacing)) {
                makeBackgroundWhite();
                ll39.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im39.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
        } else if (id == R.id.ll_4) {
            if (y < calibratedYLeft) {
                makeBackgroundWhite();
                ll41.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im41.setVisibility(View.VISIBLE);
                listenBackgrounds();

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeBackgroundWhite();
                ll42.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im42.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeBackgroundWhite();
                ll43.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im43.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeBackgroundWhite();
                ll44.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im44.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeBackgroundWhite();
                ll45.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im45.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeBackgroundWhite();
                ll46.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im46.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeBackgroundWhite();
                ll47.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im47.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeBackgroundWhite();
                ll48.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im48.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 7 * spacing) && y < (calibratedYLeft + 8 * spacing)) {
                makeBackgroundWhite();
                ll49.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im49.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
        } else if (id == R.id.ll_5) {
            if (y < calibratedYLeft) {
                makeBackgroundWhite();
                ll51.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im51.setVisibility(View.VISIBLE);
                listenBackgrounds();

            }
            if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
                makeBackgroundWhite();
                ll52.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im52.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
                makeBackgroundWhite();
                ll53.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im53.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
                makeBackgroundWhite();
                ll54.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im54.setVisibility(View.VISIBLE);
            }
            if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
                makeBackgroundWhite();
                ll55.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im55.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
                makeBackgroundWhite();
                ll56.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im56.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
                makeBackgroundWhite();
                ll57.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im57.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
                makeBackgroundWhite();
                ll58.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im58.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
            if (y > (calibratedYLeft + 7 * spacing) && y < (calibratedYLeft + 8 * spacing)) {
                makeBackgroundWhite();
                ll59.setBackgroundColor(getResources().getColor(R.color.pairblue));
                makeColumnsUnVisible();
                im59.setVisibility(View.VISIBLE);
                listenBackgrounds();
            }
        }

    }

    void makeBackgroundWhite() {
        ll11.setBackgroundColor(getResources().getColor(R.color.white));
        ll12.setBackgroundColor(getResources().getColor(R.color.white));
        ll13.setBackgroundColor(getResources().getColor(R.color.white));
        ll14.setBackgroundColor(getResources().getColor(R.color.white));
        ll15.setBackgroundColor(getResources().getColor(R.color.white));
        ll16.setBackgroundColor(getResources().getColor(R.color.white));
        ll17.setBackgroundColor(getResources().getColor(R.color.white));
        ll18.setBackgroundColor(getResources().getColor(R.color.white));
        ll19.setBackgroundColor(getResources().getColor(R.color.white));

        ll21.setBackgroundColor(getResources().getColor(R.color.white));
        ll22.setBackgroundColor(getResources().getColor(R.color.white));
        ll23.setBackgroundColor(getResources().getColor(R.color.white));
        ll24.setBackgroundColor(getResources().getColor(R.color.white));
        ll25.setBackgroundColor(getResources().getColor(R.color.white));
        ll26.setBackgroundColor(getResources().getColor(R.color.white));
        ll27.setBackgroundColor(getResources().getColor(R.color.white));
        ll28.setBackgroundColor(getResources().getColor(R.color.white));
        ll29.setBackgroundColor(getResources().getColor(R.color.white));

        ll31.setBackgroundColor(getResources().getColor(R.color.white));
        ll32.setBackgroundColor(getResources().getColor(R.color.white));
        ll33.setBackgroundColor(getResources().getColor(R.color.white));
        ll34.setBackgroundColor(getResources().getColor(R.color.white));
        ll35.setBackgroundColor(getResources().getColor(R.color.white));
        ll36.setBackgroundColor(getResources().getColor(R.color.white));
        ll37.setBackgroundColor(getResources().getColor(R.color.white));
        ll38.setBackgroundColor(getResources().getColor(R.color.white));
        ll39.setBackgroundColor(getResources().getColor(R.color.white));

        ll41.setBackgroundColor(getResources().getColor(R.color.white));
        ll42.setBackgroundColor(getResources().getColor(R.color.white));
        ll43.setBackgroundColor(getResources().getColor(R.color.white));
        ll44.setBackgroundColor(getResources().getColor(R.color.white));
        ll45.setBackgroundColor(getResources().getColor(R.color.white));
        ll46.setBackgroundColor(getResources().getColor(R.color.white));
        ll47.setBackgroundColor(getResources().getColor(R.color.white));
        ll48.setBackgroundColor(getResources().getColor(R.color.white));
        ll49.setBackgroundColor(getResources().getColor(R.color.white));

        ll51.setBackgroundColor(getResources().getColor(R.color.white));
        ll52.setBackgroundColor(getResources().getColor(R.color.white));
        ll53.setBackgroundColor(getResources().getColor(R.color.white));
        ll54.setBackgroundColor(getResources().getColor(R.color.white));
        ll55.setBackgroundColor(getResources().getColor(R.color.white));
        ll56.setBackgroundColor(getResources().getColor(R.color.white));
        ll57.setBackgroundColor(getResources().getColor(R.color.white));
        ll58.setBackgroundColor(getResources().getColor(R.color.white));
        ll59.setBackgroundColor(getResources().getColor(R.color.white));
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
    }

    void makeRowsUnVisible() {
        im11.setVisibility(View.INVISIBLE);
        im12.setVisibility(View.INVISIBLE);
        im13.setVisibility(View.INVISIBLE);
        im14.setVisibility(View.INVISIBLE);
        im15.setVisibility(View.INVISIBLE);
        im16.setVisibility(View.INVISIBLE);
        im17.setVisibility(View.INVISIBLE);
        im18.setVisibility(View.INVISIBLE);
        im19.setVisibility(View.INVISIBLE);
        im21.setVisibility(View.INVISIBLE);
        im22.setVisibility(View.INVISIBLE);
        im23.setVisibility(View.INVISIBLE);
        im24.setVisibility(View.INVISIBLE);
        im25.setVisibility(View.INVISIBLE);
        im26.setVisibility(View.INVISIBLE);
        im27.setVisibility(View.INVISIBLE);
        im28.setVisibility(View.INVISIBLE);
        im29.setVisibility(View.INVISIBLE);
        im31.setVisibility(View.INVISIBLE);
        im32.setVisibility(View.INVISIBLE);
        im33.setVisibility(View.INVISIBLE);
        im34.setVisibility(View.INVISIBLE);
        im35.setVisibility(View.INVISIBLE);
        im36.setVisibility(View.INVISIBLE);
        im37.setVisibility(View.INVISIBLE);
        im38.setVisibility(View.INVISIBLE);
        im39.setVisibility(View.INVISIBLE);
        im41.setVisibility(View.INVISIBLE);
        im42.setVisibility(View.INVISIBLE);
        im43.setVisibility(View.INVISIBLE);
        im44.setVisibility(View.INVISIBLE);
        im45.setVisibility(View.INVISIBLE);
        im46.setVisibility(View.INVISIBLE);
        im47.setVisibility(View.INVISIBLE);
        im48.setVisibility(View.INVISIBLE);
        im49.setVisibility(View.INVISIBLE);
        im51.setVisibility(View.INVISIBLE);
        im52.setVisibility(View.INVISIBLE);
        im53.setVisibility(View.INVISIBLE);
        im54.setVisibility(View.INVISIBLE);
        im55.setVisibility(View.INVISIBLE);
        im56.setVisibility(View.INVISIBLE);
        im57.setVisibility(View.INVISIBLE);
        im58.setVisibility(View.INVISIBLE);
        im59.setVisibility(View.INVISIBLE);


        /*ll1.setVisibility(View.INVISIBLE);
        ll2.setVisibility(View.INVISIBLE);
        ll3.setVisibility(View.INVISIBLE);
        ll4.setVisibility(View.INVISIBLE);
        ll5.setVisibility(View.INVISIBLE);*/
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
            im19.setVisibility(View.INVISIBLE);

        } else if (ll2.getVisibility() == View.VISIBLE) {
            im21.setVisibility(View.INVISIBLE);
            im22.setVisibility(View.INVISIBLE);
            im23.setVisibility(View.INVISIBLE);
            im24.setVisibility(View.INVISIBLE);
            im25.setVisibility(View.INVISIBLE);
            im26.setVisibility(View.INVISIBLE);
            im27.setVisibility(View.INVISIBLE);
            im28.setVisibility(View.INVISIBLE);
            im29.setVisibility(View.INVISIBLE);

        } else if (ll3.getVisibility() == View.VISIBLE) {
            im31.setVisibility(View.INVISIBLE);
            im32.setVisibility(View.INVISIBLE);
            im33.setVisibility(View.INVISIBLE);
            im34.setVisibility(View.INVISIBLE);
            im35.setVisibility(View.INVISIBLE);
            im36.setVisibility(View.INVISIBLE);
            im37.setVisibility(View.INVISIBLE);
            im38.setVisibility(View.INVISIBLE);
            im39.setVisibility(View.INVISIBLE);

        } else if (ll4.getVisibility() == View.VISIBLE) {
            im41.setVisibility(View.INVISIBLE);
            im42.setVisibility(View.INVISIBLE);
            im43.setVisibility(View.INVISIBLE);
            im44.setVisibility(View.INVISIBLE);
            im45.setVisibility(View.INVISIBLE);
            im46.setVisibility(View.INVISIBLE);
            im47.setVisibility(View.INVISIBLE);
            im48.setVisibility(View.INVISIBLE);
            im49.setVisibility(View.INVISIBLE);

        } else if (ll5.getVisibility() == View.VISIBLE) {
            im51.setVisibility(View.INVISIBLE);
            im52.setVisibility(View.INVISIBLE);
            im53.setVisibility(View.INVISIBLE);
            im54.setVisibility(View.INVISIBLE);
            im55.setVisibility(View.INVISIBLE);
            im56.setVisibility(View.INVISIBLE);
            im57.setVisibility(View.INVISIBLE);
            im58.setVisibility(View.INVISIBLE);
            im59.setVisibility(View.INVISIBLE);

        }
    }

    void countIsWordWrite(final int resorces, int cancelOrStart) {
        if (resorces == res) {
            return;
        } else if (resorces != res) {
            if (textCounter != null) {
                textCounter.cancel();
            }

            res = resorces;

            textCounter = new CountDownTimer(2000, 1000) {

                @Override
                public void onTick(long l) {
                }

                @Override
                public void onFinish() {
                    decideText(resorces);
                }
            };
            textCounter.start();
        }

    }

    void decideText(int resorces) {
        if (res2 == resorces) {
            return;
        }
        if (resorces == ll11.getId()) {
            res2 = resorces;
            arraylistText.add("0");
            writeText();
        } else if (resorces == ll12.getId()) {
            res2 = resorces;
            arraylistText.add("1");
            writeText();

        } else if (resorces == ll13.getId()) {
            res2 = resorces;
            arraylistText.add("2");
            writeText();
        } else if (resorces == ll14.getId()) {
            res2 = resorces;
            arraylistText.add("3");
            writeText();
        } else if (resorces == ll15.getId()) {
            res2 = resorces;
            arraylistText.add("4");
            writeText();
        } else if (resorces == ll16.getId()) {
            res2 = resorces;
            arraylistText.add("5");
            writeText();
        } else if (resorces == ll17.getId()) {
            res2 = resorces;
            arraylistText.add("6");
            writeText();
        } else if (resorces == ll18.getId()) {
            res2 = resorces;
            arraylistText.add("7");
            writeText();
        } else if (resorces == ll19.getId()) {
            res2 = resorces;
            arraylistText.add("8");
            writeText();
        } else if (resorces == ll21.getId()) {
            res2 = resorces;
            arraylistText.add("9");
            writeText();
        } else if (resorces == ll22.getId()) {
            res2 = resorces;
            arraylistText.add("a");
            writeText();
        } else if (resorces == ll23.getId()) {
            res2 = resorces;
            arraylistText.add("b");
            writeText();
        } else if (resorces == ll24.getId()) {
            res2 = resorces;
            arraylistText.add("c");
            writeText();
        } else if (resorces == ll25.getId()) {
            res2 = resorces;
            arraylistText.add("ç");
            writeText();
        } else if (resorces == ll26.getId()) {
            res2 = resorces;
            arraylistText.add("d");
            writeText();
        } else if (resorces == ll27.getId()) {
            res2 = resorces;
            arraylistText.add("e");
            writeText();
        } else if (resorces == ll28.getId()) {
            res2 = resorces;
            arraylistText.add("f");
            writeText();
        } else if (resorces == ll29.getId()) {
            res2 = resorces;
            arraylistText.add("g");
            writeText();
        } else if (resorces == ll31.getId()) {
            res2 = resorces;
            arraylistText.add("ğ");
            writeText();
        } else if (resorces == ll32.getId()) {
            res2 = resorces;
            arraylistText.add("h");
            writeText();
        } else if (resorces == ll33.getId()) {
            res2 = resorces;
            arraylistText.add("ı");
            writeText();
        } else if (resorces == ll34.getId()) {
            res2 = resorces;
            arraylistText.add("i");
            writeText();
        } else if (resorces == ll35.getId()) {
            res2 = resorces;
            arraylistText.add("j");
            writeText();
        } else if (resorces == ll36.getId()) {
            res2 = resorces;
            arraylistText.add("k");
            writeText();
        } else if (resorces == ll37.getId()) {
            res2 = resorces;
            arraylistText.add("l");
            writeText();
        } else if (resorces == ll38.getId()) {
            res2 = resorces;
            addNewLine = true;
            writeText();
        } else if (resorces == ll39.getId()) {
            res2 = resorces;
            finish();
            /*arraylistText.add("za");
            writeText();*/
        } else if (resorces == ll41.getId()) {
            res2 = resorces;
            arraylistText.add("m");
            writeText();
        } else if (resorces == ll42.getId()) {
            res2 = resorces;
            arraylistText.add("n");
            writeText();
        } else if (resorces == ll43.getId()) {
            res2 = resorces;
            arraylistText.add("o");
            writeText();
        } else if (resorces == ll44.getId()) {
            res2 = resorces;
            arraylistText.add("ö");
            writeText();
        } else if (resorces == ll45.getId()) {
            res2 = resorces;
            arraylistText.add("p");
            writeText();
        } else if (resorces == ll46.getId()) {
            res2 = resorces;
            arraylistText.add("r");
            writeText();
        } else if (resorces == ll47.getId()) {
            res2 = resorces;
            arraylistText.add("s");
            writeText();
        } else if (resorces == ll48.getId()) {
            res2 = resorces;
            arraylistText.add("  ");
            writeText();
        } else if (resorces == ll49.getId()) {
            res2 = resorces;
            arraylistText.remove(arraylistText.size() - 1);
            writeText();
        } else if (resorces == ll51.getId()) {
            res2 = resorces;
            arraylistText.add("ş");
            writeText();
        } else if (resorces == ll52.getId()) {
            res2 = resorces;
            arraylistText.add("t");
            writeText();
        } else if (resorces == ll53.getId()) {
            res2 = resorces;
            arraylistText.add("u");
            writeText();
        } else if (resorces == ll54.getId()) {
            res2 = resorces;
            arraylistText.add("ü");
            writeText();
        } else if (resorces == ll55.getId()) {
            res2 = resorces;
            arraylistText.add("v");
            writeText();
        } else if (resorces == ll56.getId()) {
            res2 = resorces;
            arraylistText.add("y");
            writeText();
        } else if (resorces == ll57.getId()) {
            res2 = resorces;
            arraylistText.add("z");
            writeText();
        } else if (resorces == ll58.getId()) {
            res2 = resorces;
            arraylistText.add(".");
            writeText();
        } else if (resorces == ll59.getId()) {
            res2 = resorces;
            isSpeak = true;
            writeText();
        }
    }

    void writeText() {
        if (arraylistText.size() != 0) {
            String string = "";
            for (int i = 0; i < arraylistText.size(); i++) {
                string += arraylistText.get(i);
            }
            /*if (addNewLine) {
                addNewLine = false;
                string += '\n';
            }*/
            if (isSpeak) {
                textTv.setText(" >> : " + string);
                speak(string);
                isSpeak = false;
            }
            textTv.setText(" >> : " + string);

        } else {
            textTv.setText(">> : birşeyler yazın...");
        }

    }

    void listenBackgrounds() {
        if (((ColorDrawable) ll11.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll11.getId(), 1);
        } else if (((ColorDrawable) ll12.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll12.getId(), 1);
        } else if (((ColorDrawable) ll13.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll13.getId(), 1);
        } else if (((ColorDrawable) ll14.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll14.getId(), 1);
        } else if (((ColorDrawable) ll15.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll15.getId(), 1);
        } else if (((ColorDrawable) ll16.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll16.getId(), 1);
        } else if (((ColorDrawable) ll17.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll17.getId(), 1);
        } else if (((ColorDrawable) ll18.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll18.getId(), 1);
        } else if (((ColorDrawable) ll19.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll19.getId(), 1);
        }


        if (((ColorDrawable) ll21.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll21.getId(), 1);
        } else if (((ColorDrawable) ll22.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll22.getId(), 1);
        } else if (((ColorDrawable) ll23.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll23.getId(), 1);
        } else if (((ColorDrawable) ll24.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll24.getId(), 1);
        } else if (((ColorDrawable) ll25.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll25.getId(), 1);
        } else if (((ColorDrawable) ll26.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll26.getId(), 1);
        } else if (((ColorDrawable) ll27.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll27.getId(), 1);
        } else if (((ColorDrawable) ll28.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll28.getId(), 1);
        } else if (((ColorDrawable) ll29.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll29.getId(), 1);
        }


        if (((ColorDrawable) ll31.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll31.getId(), 1);
        } else if (((ColorDrawable) ll32.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll32.getId(), 1);
        } else if (((ColorDrawable) ll33.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll33.getId(), 1);
        } else if (((ColorDrawable) ll34.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll34.getId(), 1);
        } else if (((ColorDrawable) ll35.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll35.getId(), 1);
        } else if (((ColorDrawable) ll36.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll36.getId(), 1);
        } else if (((ColorDrawable) ll37.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll37.getId(), 1);
        } else if (((ColorDrawable) ll38.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll38.getId(), 1);
        } else if (((ColorDrawable) ll39.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll39.getId(), 1);
        }


        if (((ColorDrawable) ll41.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll41.getId(), 1);
        } else if (((ColorDrawable) ll42.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll42.getId(), 1);
        } else if (((ColorDrawable) ll43.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll43.getId(), 1);
        } else if (((ColorDrawable) ll44.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll44.getId(), 1);
        } else if (((ColorDrawable) ll45.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll45.getId(), 1);
        } else if (((ColorDrawable) ll46.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll46.getId(), 1);
        } else if (((ColorDrawable) ll47.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll47.getId(), 1);
        } else if (((ColorDrawable) ll48.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll48.getId(), 1);
        } else if (((ColorDrawable) ll49.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll49.getId(), 1);
        }


        if (((ColorDrawable) ll51.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll51.getId(), 1);
        } else if (((ColorDrawable) ll52.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll52.getId(), 1);
        } else if (((ColorDrawable) ll53.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll53.getId(), 1);
        } else if (((ColorDrawable) ll54.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll54.getId(), 1);
        } else if (((ColorDrawable) ll55.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll55.getId(), 1);
        } else if (((ColorDrawable) ll56.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll56.getId(), 1);
        } else if (((ColorDrawable) ll57.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll57.getId(), 1);
        } else if (((ColorDrawable) ll58.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll58.getId(), 1);
        } else if (((ColorDrawable) ll59.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countIsWordWrite(ll59.getId(), 1);
        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    void speak(String text) {
        if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
            Toast.makeText(this, "Telefonunuz bu özelliği desteklemiyor..", Toast.LENGTH_SHORT).show();
        } else {
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textToSpeech.stop();
        textToSpeech.shutdown();
    }
}
