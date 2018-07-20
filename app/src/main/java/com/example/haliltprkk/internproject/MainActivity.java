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
import android.widget.RelativeLayout;
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


    //asdfghjklşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşşş


    @BindView(R.id.ll1_r1_l1_im1)
    ImageView ll1R1L1Im1;
    @BindView(R.id.ll1_r1_l1_im2)
    ImageView ll1R1L1Im2;
    @BindView(R.id.ll1_r1_l1_im3)
    ImageView ll1R1L1Im3;
    @BindView(R.id.ll1_r1_l1)
    LinearLayout ll1R1L1;
    @BindView(R.id.ll1_r1_l2_im1)
    ImageView ll1R1L2Im1;
    @BindView(R.id.ll1_r1_l2_im2)
    ImageView ll1R1L2Im2;
    @BindView(R.id.ll1_r1_l2_im3)
    ImageView ll1R1L2Im3;
    @BindView(R.id.ll1_r1_l2)
    LinearLayout ll1R1L2;
    @BindView(R.id.ll1_r1_l3_im1)
    ImageView ll1R1L3Im1;
    @BindView(R.id.ll1_r1_l3_im2)
    ImageView ll1R1L3Im2;
    @BindView(R.id.ll1_r1_l3_im3)
    ImageView ll1R1L3Im3;
    @BindView(R.id.ll1_r1_l3)
    LinearLayout ll1R1L3;
    @BindView(R.id.ll1_r1)
    RelativeLayout ll1R1;
    @BindView(R.id.ll1_r2_l1_im1)
    ImageView ll1R2L1Im1;
    @BindView(R.id.ll1_r2_l1_im2)
    ImageView ll1R2L1Im2;
    @BindView(R.id.ll1_r2_l1_im3)
    ImageView ll1R2L1Im3;
    @BindView(R.id.ll1_r2_l1)
    LinearLayout ll1R2L1;
    @BindView(R.id.ll1_r2_l2_im1)
    ImageView ll1R2L2Im1;
    @BindView(R.id.ll1_r2_l2_im2)
    ImageView ll1R2L2Im2;
    @BindView(R.id.ll1_r2_l2_im3)
    ImageView ll1R2L2Im3;
    @BindView(R.id.ll1_r2_l2)
    LinearLayout ll1R2L2;
    @BindView(R.id.ll1_r2_l3_im1)
    ImageView ll1R2L3Im1;
    @BindView(R.id.ll1_r2_l3_im2)
    ImageView ll1R2L3Im2;
    @BindView(R.id.ll1_r2_l3_im3)
    ImageView ll1R2L3Im3;
    @BindView(R.id.ll1_r2_l3)
    LinearLayout ll1R2L3;
    @BindView(R.id.ll1_r2)
    RelativeLayout ll1R2;
    @BindView(R.id.ll1_r3_l1_im1)
    ImageView ll1R3L1Im1;
    @BindView(R.id.ll1_r3_l1_im2)
    ImageView ll1R3L1Im2;
    @BindView(R.id.ll1_r3_l1_im3)
    ImageView ll1R3L1Im3;
    @BindView(R.id.ll1_r3_l1)
    LinearLayout ll1R3L1;
    @BindView(R.id.ll1_r3_l2_im1)
    ImageView ll1R3L2Im1;
    @BindView(R.id.ll1_r3_l2_im2)
    ImageView ll1R3L2Im2;
    @BindView(R.id.ll1_r3_l2_im3)
    ImageView ll1R3L2Im3;
    @BindView(R.id.ll1_r3_l2)
    LinearLayout ll1R3L2;
    @BindView(R.id.ll1_r3_l3_im1)
    ImageView ll1R3L3Im1;
    @BindView(R.id.ll1_r3_l3_im2)
    ImageView ll1R3L3Im2;
    @BindView(R.id.ll1_r3_l3_im3)
    ImageView ll1R3L3Im3;
    @BindView(R.id.ll1_r3_l3)
    LinearLayout ll1R3L3;
    @BindView(R.id.ll1_r3)
    RelativeLayout ll1R3;
    @BindView(R.id.ll1_r4_l1_im1)
    ImageView ll1R4L1Im1;
    @BindView(R.id.ll1_r4_l1_im2)
    ImageView ll1R4L1Im2;
    @BindView(R.id.ll1_r4_l1_im3)
    ImageView ll1R4L1Im3;
    @BindView(R.id.ll1_r4_l1)
    LinearLayout ll1R4L1;
    @BindView(R.id.ll1_r4_l2_im1)
    ImageView ll1R4L2Im1;
    @BindView(R.id.ll1_r4_l2_im2)
    ImageView ll1R4L2Im2;
    @BindView(R.id.ll1_r4_l2_im3)
    ImageView ll1R4L2Im3;
    @BindView(R.id.ll1_r4_l2)
    LinearLayout ll1R4L2;
    @BindView(R.id.ll1_r4_l3_im1)
    ImageView ll1R4L3Im1;
    @BindView(R.id.ll1_r4_l3_im2)
    ImageView ll1R4L3Im2;
    @BindView(R.id.ll1_r4_l3_im3)
    ImageView ll1R4L3Im3;
    @BindView(R.id.ll1_r4_l3)
    LinearLayout ll1R4L3;
    @BindView(R.id.ll1_r4)
    RelativeLayout ll1R4;
    @BindView(R.id.ll1_r5_l1_im1)
    ImageView ll1R5L1Im1;
    @BindView(R.id.ll1_r5_l1_im2)
    ImageView ll1R5L1Im2;
    @BindView(R.id.ll1_r5_l1_im3)
    ImageView ll1R5L1Im3;
    @BindView(R.id.ll1_r5_l1)
    LinearLayout ll1R5L1;
    @BindView(R.id.ll1_r5_l2_im1)
    ImageView ll1R5L2Im1;
    @BindView(R.id.ll1_r5_l2_im2)
    ImageView ll1R5L2Im2;
    @BindView(R.id.ll1_r5_l2_im3)
    ImageView ll1R5L2Im3;
    @BindView(R.id.ll1_r5_l2)
    LinearLayout ll1R5L2;
    @BindView(R.id.ll1_r5_l3_im1)
    ImageView ll1R5L3Im1;
    @BindView(R.id.ll1_r5_l3_im2)
    ImageView ll1R5L3Im2;
    @BindView(R.id.ll1_r5_l3_im3)
    ImageView ll1R5L3Im3;
    @BindView(R.id.ll1_r5_l3)
    LinearLayout ll1R5L3;
    @BindView(R.id.ll1_r5)
    RelativeLayout ll1R5;
    @BindView(R.id.ll1_r6_l1_im1)
    ImageView ll1R6L1Im1;
    @BindView(R.id.ll1_r6_l1_im2)
    ImageView ll1R6L1Im2;
    @BindView(R.id.ll1_r6_l1_im3)
    ImageView ll1R6L1Im3;
    @BindView(R.id.ll1_r6_l1)
    LinearLayout ll1R6L1;
    @BindView(R.id.ll1_r6_l2_im1)
    ImageView ll1R6L2Im1;
    @BindView(R.id.ll1_r6_l2_im2)
    ImageView ll1R6L2Im2;
    @BindView(R.id.ll1_r6_l2_im3)
    ImageView ll1R6L2Im3;
    @BindView(R.id.ll1_r6_l2)
    LinearLayout ll1R6L2;
    @BindView(R.id.ll1_r6_l3_im1)
    ImageView ll1R6L3Im1;
    @BindView(R.id.ll1_r6_l3_im2)
    ImageView ll1R6L3Im2;
    @BindView(R.id.ll1_r6_l3_im3)
    ImageView ll1R6L3Im3;
    @BindView(R.id.ll1_r6_l3)
    LinearLayout ll1R6L3;
    @BindView(R.id.ll1_r6)
    RelativeLayout ll1R6;
    @BindView(R.id.ll1_r7_l1_im1)
    ImageView ll1R7L1Im1;
    @BindView(R.id.ll1_r7_l1_im2)
    ImageView ll1R7L1Im2;
    @BindView(R.id.ll1_r7_l1_im3)
    ImageView ll1R7L1Im3;
    @BindView(R.id.ll1_r7_l1)
    LinearLayout ll1R7L1;
    @BindView(R.id.ll1_r7_l2_im1)
    ImageView ll1R7L2Im1;
    @BindView(R.id.ll1_r7_l2_im2)
    ImageView ll1R7L2Im2;
    @BindView(R.id.ll1_r7_l2_im3)
    ImageView ll1R7L2Im3;
    @BindView(R.id.ll1_r7_l2)
    LinearLayout ll1R7L2;
    @BindView(R.id.ll1_r7_l3_im1)
    ImageView ll1R7L3Im1;
    @BindView(R.id.ll1_r7_l3_im2)
    ImageView ll1R7L3Im2;
    @BindView(R.id.ll1_r7_l3_im3)
    ImageView ll1R7L3Im3;
    @BindView(R.id.ll1_r7_l3)
    LinearLayout ll1R7L3;
    @BindView(R.id.ll1_r7)
    RelativeLayout ll1R7;
    @BindView(R.id.ll1_r8_l1_im1)
    ImageView ll1R8L1Im1;
    @BindView(R.id.ll1_r8_l1_im2)
    ImageView ll1R8L1Im2;
    @BindView(R.id.ll1_r8_l1_im3)
    ImageView ll1R8L1Im3;
    @BindView(R.id.ll1_r8_l1)
    LinearLayout ll1R8L1;
    @BindView(R.id.ll1_r8_l2_im1)
    ImageView ll1R8L2Im1;
    @BindView(R.id.ll1_r8_l2_im2)
    ImageView ll1R8L2Im2;
    @BindView(R.id.ll1_r8_l2_im3)
    ImageView ll1R8L2Im3;
    @BindView(R.id.ll1_r8_l2)
    LinearLayout ll1R8L2;
    @BindView(R.id.ll1_r8_l3_im1)
    ImageView ll1R8L3Im1;
    @BindView(R.id.ll1_r8_l3_im2)
    ImageView ll1R8L3Im2;
    @BindView(R.id.ll1_r8_l3_im3)
    ImageView ll1R8L3Im3;
    @BindView(R.id.ll1_r8_l3)
    LinearLayout ll1R8L3;
    @BindView(R.id.ll1_r8)
    RelativeLayout ll1R8;
    @BindView(R.id.ll1_r9_l1_im1)
    ImageView ll1R9L1Im1;
    @BindView(R.id.ll1_r9_l1_im2)
    ImageView ll1R9L1Im2;
    @BindView(R.id.ll1_r9_l1_im3)
    ImageView ll1R9L1Im3;
    @BindView(R.id.ll1_r9_l1)
    LinearLayout ll1R9L1;
    @BindView(R.id.ll1_r9_l2_im1)
    ImageView ll1R9L2Im1;
    @BindView(R.id.ll1_r9_l2_im2)
    ImageView ll1R9L2Im2;
    @BindView(R.id.ll1_r9_l2_im3)
    ImageView ll1R9L2Im3;
    @BindView(R.id.ll1_r9_l2)
    LinearLayout ll1R9L2;
    @BindView(R.id.ll1_r9_l3_im1)
    ImageView ll1R9L3Im1;
    @BindView(R.id.ll1_r9_l3_im2)
    ImageView ll1R9L3Im2;
    @BindView(R.id.ll1_r9_l3_im3)
    ImageView ll1R9L3Im3;
    @BindView(R.id.ll1_r9_l3)
    LinearLayout ll1R9L3;
    @BindView(R.id.ll1_r9)
    RelativeLayout ll1R9;
    @BindView(R.id.ll2_r1_l1_im1)
    ImageView ll2R1L1Im1;
    @BindView(R.id.ll2_r1_l1_im2)
    ImageView ll2R1L1Im2;
    @BindView(R.id.ll2_r1_l1_im3)
    ImageView ll2R1L1Im3;
    @BindView(R.id.ll2_r1_l1)
    LinearLayout ll2R1L1;
    @BindView(R.id.ll2_r1_l2_im1)
    ImageView ll2R1L2Im1;
    @BindView(R.id.ll2_r1_l2_im2)
    ImageView ll2R1L2Im2;
    @BindView(R.id.ll2_r1_l2_im3)
    ImageView ll2R1L2Im3;
    @BindView(R.id.ll2_r1_l2)
    LinearLayout ll2R1L2;
    @BindView(R.id.ll2_r1_l3_im1)
    ImageView ll2R1L3Im1;
    @BindView(R.id.ll2_r1_l3_im2)
    ImageView ll2R1L3Im2;
    @BindView(R.id.ll2_r1_l3_im3)
    ImageView ll2R1L3Im3;
    @BindView(R.id.ll2_r1_l3)
    LinearLayout ll2R1L3;
    @BindView(R.id.ll2_r1)
    RelativeLayout ll2R1;
    @BindView(R.id.ll2_r2_l1_im1)
    ImageView ll2R2L1Im1;
    @BindView(R.id.ll2_r2_l1_im2)
    ImageView ll2R2L1Im2;
    @BindView(R.id.ll2_r2_l1_im3)
    ImageView ll2R2L1Im3;
    @BindView(R.id.ll2_r2_l1)
    LinearLayout ll2R2L1;
    @BindView(R.id.ll2_r2_l2_im1)
    ImageView ll2R2L2Im1;
    @BindView(R.id.ll2_r2_l2_im2)
    ImageView ll2R2L2Im2;
    @BindView(R.id.ll2_r2_l2_im3)
    ImageView ll2R2L2Im3;
    @BindView(R.id.ll2_r2_l2)
    LinearLayout ll2R2L2;
    @BindView(R.id.ll2_r2_l3_im1)
    ImageView ll2R2L3Im1;
    @BindView(R.id.ll2_r2_l3_im2)
    ImageView ll2R2L3Im2;
    @BindView(R.id.ll2_r2_l3_im3)
    ImageView ll2R2L3Im3;
    @BindView(R.id.ll2_r2_l3)
    LinearLayout ll2R2L3;
    @BindView(R.id.ll2_r2)
    RelativeLayout ll2R2;
    @BindView(R.id.ll2_r3_l1_im1)
    ImageView ll2R3L1Im1;
    @BindView(R.id.ll2_r3_l1_im2)
    ImageView ll2R3L1Im2;
    @BindView(R.id.ll2_r3_l1_im3)
    ImageView ll2R3L1Im3;
    @BindView(R.id.ll2_r3_l1)
    LinearLayout ll2R3L1;
    @BindView(R.id.ll2_r3_l2_im1)
    ImageView ll2R3L2Im1;
    @BindView(R.id.ll2_r3_l2_im2)
    ImageView ll2R3L2Im2;
    @BindView(R.id.ll2_r3_l2_im3)
    ImageView ll2R3L2Im3;
    @BindView(R.id.ll2_r3_l2)
    LinearLayout ll2R3L2;
    @BindView(R.id.ll2_r3_l3_im1)
    ImageView ll2R3L3Im1;
    @BindView(R.id.ll2_r3_l3_im2)
    ImageView ll2R3L3Im2;
    @BindView(R.id.ll2_r3_l3_im3)
    ImageView ll2R3L3Im3;
    @BindView(R.id.ll2_r3_l3)
    LinearLayout ll2R3L3;
    @BindView(R.id.ll2_r3)
    RelativeLayout ll2R3;
    @BindView(R.id.ll2_r4_l1_im1)
    ImageView ll2R4L1Im1;
    @BindView(R.id.ll2_r4_l1_im2)
    ImageView ll2R4L1Im2;
    @BindView(R.id.ll2_r4_l1_im3)
    ImageView ll2R4L1Im3;
    @BindView(R.id.ll2_r4_l1)
    LinearLayout ll2R4L1;
    @BindView(R.id.ll2_r4_l2_im1)
    ImageView ll2R4L2Im1;
    @BindView(R.id.ll2_r4_l2_im2)
    ImageView ll2R4L2Im2;
    @BindView(R.id.ll2_r4_l2_im3)
    ImageView ll2R4L2Im3;
    @BindView(R.id.ll2_r4_l2)
    LinearLayout ll2R4L2;
    @BindView(R.id.ll2_r4_l3_im1)
    ImageView ll2R4L3Im1;
    @BindView(R.id.ll2_r4_l3_im2)
    ImageView ll2R4L3Im2;
    @BindView(R.id.ll2_r4_l3_im3)
    ImageView ll2R4L3Im3;
    @BindView(R.id.ll2_r4_l3)
    LinearLayout ll2R4L3;
    @BindView(R.id.ll2_r4)
    RelativeLayout ll2R4;
    @BindView(R.id.ll2_r5_l1_im1)
    ImageView ll2R5L1Im1;
    @BindView(R.id.ll2_r5_l1_im2)
    ImageView ll2R5L1Im2;
    @BindView(R.id.ll2_r5_l1_im3)
    ImageView ll2R5L1Im3;
    @BindView(R.id.ll2_r5_l1)
    LinearLayout ll2R5L1;
    @BindView(R.id.ll2_r5_l2_im1)
    ImageView ll2R5L2Im1;
    @BindView(R.id.ll2_r5_l2_im2)
    ImageView ll2R5L2Im2;
    @BindView(R.id.ll2_r5_l2_im3)
    ImageView ll2R5L2Im3;
    @BindView(R.id.ll2_r5_l2)
    LinearLayout ll2R5L2;
    @BindView(R.id.ll2_r5_l3_im1)
    ImageView ll2R5L3Im1;
    @BindView(R.id.ll2_r5_l3_im2)
    ImageView ll2R5L3Im2;
    @BindView(R.id.ll2_r5_l3_im3)
    ImageView ll2R5L3Im3;
    @BindView(R.id.ll2_r5_l3)
    LinearLayout ll2R5L3;
    @BindView(R.id.ll2_r5)
    RelativeLayout ll2R5;
    @BindView(R.id.ll2_r6_l1_im1)
    ImageView ll2R6L1Im1;
    @BindView(R.id.ll2_r6_l1_im2)
    ImageView ll2R6L1Im2;
    @BindView(R.id.ll2_r6_l1_im3)
    ImageView ll2R6L1Im3;
    @BindView(R.id.ll2_r6_l1)
    LinearLayout ll2R6L1;
    @BindView(R.id.ll2_r6_l2_im1)
    ImageView ll2R6L2Im1;
    @BindView(R.id.ll2_r6_l2_im2)
    ImageView ll2R6L2Im2;
    @BindView(R.id.ll2_r6_l2_im3)
    ImageView ll2R6L2Im3;
    @BindView(R.id.ll2_r6_l2)
    LinearLayout ll2R6L2;
    @BindView(R.id.ll2_r6_l3_im1)
    ImageView ll2R6L3Im1;
    @BindView(R.id.ll2_r6_l3_im2)
    ImageView ll2R6L3Im2;
    @BindView(R.id.ll2_r6_l3_im3)
    ImageView ll2R6L3Im3;
    @BindView(R.id.ll2_r6_l3)
    LinearLayout ll2R6L3;
    @BindView(R.id.ll2_r6)
    RelativeLayout ll2R6;
    @BindView(R.id.ll2_r7_l1_im1)
    ImageView ll2R7L1Im1;
    @BindView(R.id.ll2_r7_l1_im2)
    ImageView ll2R7L1Im2;
    @BindView(R.id.ll2_r7_l1_im3)
    ImageView ll2R7L1Im3;
    @BindView(R.id.ll2_r7_l1)
    LinearLayout ll2R7L1;
    @BindView(R.id.ll2_r7_l2_im1)
    ImageView ll2R7L2Im1;
    @BindView(R.id.ll2_r7_l2_im2)
    ImageView ll2R7L2Im2;
    @BindView(R.id.ll2_r7_l2_im3)
    ImageView ll2R7L2Im3;
    @BindView(R.id.ll2_r7_l2)
    LinearLayout ll2R7L2;
    @BindView(R.id.ll2_r7_l3_im1)
    ImageView ll2R7L3Im1;
    @BindView(R.id.ll2_r7_l3_im2)
    ImageView ll2R7L3Im2;
    @BindView(R.id.ll2_r7_l3_im3)
    ImageView ll2R7L3Im3;
    @BindView(R.id.ll2_r7_l3)
    LinearLayout ll2R7L3;
    @BindView(R.id.ll2_r7)
    RelativeLayout ll2R7;
    @BindView(R.id.ll2_r8_l1_im1)
    ImageView ll2R8L1Im1;
    @BindView(R.id.ll2_r8_l1_im2)
    ImageView ll2R8L1Im2;
    @BindView(R.id.ll2_r8_l1_im3)
    ImageView ll2R8L1Im3;
    @BindView(R.id.ll2_r8_l1)
    LinearLayout ll2R8L1;
    @BindView(R.id.ll2_r8_l2_im1)
    ImageView ll2R8L2Im1;
    @BindView(R.id.ll2_r8_l2_im2)
    ImageView ll2R8L2Im2;
    @BindView(R.id.ll2_r8_l2_im3)
    ImageView ll2R8L2Im3;
    @BindView(R.id.ll2_r8_l2)
    LinearLayout ll2R8L2;
    @BindView(R.id.ll2_r8_l3_im1)
    ImageView ll2R8L3Im1;
    @BindView(R.id.ll2_r8_l3_im2)
    ImageView ll2R8L3Im2;
    @BindView(R.id.ll2_r8_l3_im3)
    ImageView ll2R8L3Im3;
    @BindView(R.id.ll2_r8_l3)
    LinearLayout ll2R8L3;
    @BindView(R.id.ll2_r8)
    RelativeLayout ll2R8;
    @BindView(R.id.ll2_r9_l1_im1)
    ImageView ll2R9L1Im1;
    @BindView(R.id.ll2_r9_l1_im2)
    ImageView ll2R9L1Im2;
    @BindView(R.id.ll2_r9_l1_im3)
    ImageView ll2R9L1Im3;
    @BindView(R.id.ll2_r9_l1)
    LinearLayout ll2R9L1;
    @BindView(R.id.ll2_r9_l2_im1)
    ImageView ll2R9L2Im1;
    @BindView(R.id.ll2_r9_l2_im2)
    ImageView ll2R9L2Im2;
    @BindView(R.id.ll2_r9_l2_im3)
    ImageView ll2R9L2Im3;
    @BindView(R.id.ll2_r9_l2)
    LinearLayout ll2R9L2;
    @BindView(R.id.ll2_r9_l3_im1)
    ImageView ll2R9L3Im1;
    @BindView(R.id.ll2_r9_l3_im2)
    ImageView ll2R9L3Im2;
    @BindView(R.id.ll2_r9_l3_im3)
    ImageView ll2R9L3Im3;
    @BindView(R.id.ll2_r9_l3)
    LinearLayout ll2R9L3;
    @BindView(R.id.ll2_r9)
    RelativeLayout ll2R9;
    @BindView(R.id.ll3_r1_l1_im1)
    ImageView ll3R1L1Im1;
    @BindView(R.id.ll3_r1_l1_im2)
    ImageView ll3R1L1Im2;
    @BindView(R.id.ll3_r1_l1_im3)
    ImageView ll3R1L1Im3;
    @BindView(R.id.ll3_r1_l1)
    LinearLayout ll3R1L1;
    @BindView(R.id.ll3_r1_l2_im1)
    ImageView ll3R1L2Im1;
    @BindView(R.id.ll3_r1_l2_im2)
    ImageView ll3R1L2Im2;
    @BindView(R.id.ll3_r1_l2_im3)
    ImageView ll3R1L2Im3;
    @BindView(R.id.ll3_r1_l2)
    LinearLayout ll3R1L2;
    @BindView(R.id.ll3_r1_l3_im1)
    ImageView ll3R1L3Im1;
    @BindView(R.id.ll3_r1_l3_im2)
    ImageView ll3R1L3Im2;
    @BindView(R.id.ll3_r1_l3_im3)
    ImageView ll3R1L3Im3;
    @BindView(R.id.ll3_r1_l3)
    LinearLayout ll3R1L3;
    @BindView(R.id.ll3_r1)
    RelativeLayout ll3R1;
    @BindView(R.id.ll3_r2_l1_im1)
    ImageView ll3R2L1Im1;
    @BindView(R.id.ll3_r2_l1_im2)
    ImageView ll3R2L1Im2;
    @BindView(R.id.ll3_r2_l1_im3)
    ImageView ll3R2L1Im3;
    @BindView(R.id.ll3_r2_l1)
    LinearLayout ll3R2L1;
    @BindView(R.id.ll3_r2_l2_im1)
    ImageView ll3R2L2Im1;
    @BindView(R.id.ll3_r2_l2_im2)
    ImageView ll3R2L2Im2;
    @BindView(R.id.ll3_r2_l2_im3)
    ImageView ll3R2L2Im3;
    @BindView(R.id.ll3_r2_l2)
    LinearLayout ll3R2L2;
    @BindView(R.id.ll3_r2_l3_im1)
    ImageView ll3R2L3Im1;
    @BindView(R.id.ll3_r2_l3_im2)
    ImageView ll3R2L3Im2;
    @BindView(R.id.ll3_r2_l3_im3)
    ImageView ll3R2L3Im3;
    @BindView(R.id.ll3_r2_l3)
    LinearLayout ll3R2L3;
    @BindView(R.id.ll3_r2)
    RelativeLayout ll3R2;
    @BindView(R.id.ll3_r3_l1_im1)
    ImageView ll3R3L1Im1;
    @BindView(R.id.ll3_r3_l1_im2)
    ImageView ll3R3L1Im2;
    @BindView(R.id.ll3_r3_l1_im3)
    ImageView ll3R3L1Im3;
    @BindView(R.id.ll3_r3_l1)
    LinearLayout ll3R3L1;
    @BindView(R.id.ll3_r3_l2_im1)
    ImageView ll3R3L2Im1;
    @BindView(R.id.ll3_r3_l2_im2)
    ImageView ll3R3L2Im2;
    @BindView(R.id.ll3_r3_l2_im3)
    ImageView ll3R3L2Im3;
    @BindView(R.id.ll3_r3_l2)
    LinearLayout ll3R3L2;
    @BindView(R.id.ll3_r3_l3_im1)
    ImageView ll3R3L3Im1;
    @BindView(R.id.ll3_r3_l3_im2)
    ImageView ll3R3L3Im2;
    @BindView(R.id.ll3_r3_l3_im3)
    ImageView ll3R3L3Im3;
    @BindView(R.id.ll3_r3_l3)
    LinearLayout ll3R3L3;
    @BindView(R.id.ll3_r3)
    RelativeLayout ll3R3;
    @BindView(R.id.ll3_r4_l1_im1)
    ImageView ll3R4L1Im1;
    @BindView(R.id.ll3_r4_l1_im2)
    ImageView ll3R4L1Im2;
    @BindView(R.id.ll3_r4_l1_im3)
    ImageView ll3R4L1Im3;
    @BindView(R.id.ll3_r4_l1)
    LinearLayout ll3R4L1;
    @BindView(R.id.ll3_r4_l2_im1)
    ImageView ll3R4L2Im1;
    @BindView(R.id.ll3_r4_l2_im2)
    ImageView ll3R4L2Im2;
    @BindView(R.id.ll3_r4_l2_im3)
    ImageView ll3R4L2Im3;
    @BindView(R.id.ll3_r4_l2)
    LinearLayout ll3R4L2;
    @BindView(R.id.ll3_r4_l3_im1)
    ImageView ll3R4L3Im1;
    @BindView(R.id.ll3_r4_l3_im2)
    ImageView ll3R4L3Im2;
    @BindView(R.id.ll3_r4_l3_im3)
    ImageView ll3R4L3Im3;
    @BindView(R.id.ll3_r4_l3)
    LinearLayout ll3R4L3;
    @BindView(R.id.ll3_r4)
    RelativeLayout ll3R4;
    @BindView(R.id.ll3_r5_l1_im1)
    ImageView ll3R5L1Im1;
    @BindView(R.id.ll3_r5_l1_im2)
    ImageView ll3R5L1Im2;
    @BindView(R.id.ll3_r5_l1_im3)
    ImageView ll3R5L1Im3;
    @BindView(R.id.ll3_r5_l1)
    LinearLayout ll3R5L1;
    @BindView(R.id.ll3_r5_l2_im1)
    ImageView ll3R5L2Im1;
    @BindView(R.id.ll3_r5_l2_im2)
    ImageView ll3R5L2Im2;
    @BindView(R.id.ll3_r5_l2_im3)
    ImageView ll3R5L2Im3;
    @BindView(R.id.ll3_r5_l2)
    LinearLayout ll3R5L2;
    @BindView(R.id.ll3_r5_l3_im1)
    ImageView ll3R5L3Im1;
    @BindView(R.id.ll3_r5_l3_im2)
    ImageView ll3R5L3Im2;
    @BindView(R.id.ll3_r5_l3_im3)
    ImageView ll3R5L3Im3;
    @BindView(R.id.ll3_r5_l3)
    LinearLayout ll3R5L3;
    @BindView(R.id.ll3_r5)
    RelativeLayout ll3R5;
    @BindView(R.id.ll3_r6_l1_im1)
    ImageView ll3R6L1Im1;
    @BindView(R.id.ll3_r6_l1_im2)
    ImageView ll3R6L1Im2;
    @BindView(R.id.ll3_r6_l1_im3)
    ImageView ll3R6L1Im3;
    @BindView(R.id.ll3_r6_l1)
    LinearLayout ll3R6L1;
    @BindView(R.id.ll3_r6_l2_im1)
    ImageView ll3R6L2Im1;
    @BindView(R.id.ll3_r6_l2_im2)
    ImageView ll3R6L2Im2;
    @BindView(R.id.ll3_r6_l2_im3)
    ImageView ll3R6L2Im3;
    @BindView(R.id.ll3_r6_l2)
    LinearLayout ll3R6L2;
    @BindView(R.id.ll3_r6_l3_im1)
    ImageView ll3R6L3Im1;
    @BindView(R.id.ll3_r6_l3_im2)
    ImageView ll3R6L3Im2;
    @BindView(R.id.ll3_r6_l3_im3)
    ImageView ll3R6L3Im3;
    @BindView(R.id.ll3_r6_l3)
    LinearLayout ll3R6L3;
    @BindView(R.id.ll3_r6)
    RelativeLayout ll3R6;
    @BindView(R.id.ll3_r7_l1_im1)
    ImageView ll3R7L1Im1;
    @BindView(R.id.ll3_r7_l1_im2)
    ImageView ll3R7L1Im2;
    @BindView(R.id.ll3_r7_l1_im3)
    ImageView ll3R7L1Im3;
    @BindView(R.id.ll3_r7_l1)
    LinearLayout ll3R7L1;
    @BindView(R.id.ll3_r7_l2_im1)
    ImageView ll3R7L2Im1;
    @BindView(R.id.ll3_r7_l2_im2)
    ImageView ll3R7L2Im2;
    @BindView(R.id.ll3_r7_l2_im3)
    ImageView ll3R7L2Im3;
    @BindView(R.id.ll3_r7_l2)
    LinearLayout ll3R7L2;
    @BindView(R.id.ll3_r7_l3_im1)
    ImageView ll3R7L3Im1;
    @BindView(R.id.ll3_r7_l3_im2)
    ImageView ll3R7L3Im2;
    @BindView(R.id.ll3_r7_l3_im3)
    ImageView ll3R7L3Im3;
    @BindView(R.id.ll3_r7_l3)
    LinearLayout ll3R7L3;
    @BindView(R.id.ll3_r7)
    RelativeLayout ll3R7;
    @BindView(R.id.ll3_r8_l1_im1)
    ImageView ll3R8L1Im1;
    @BindView(R.id.ll3_r8_l1_im2)
    ImageView ll3R8L1Im2;
    @BindView(R.id.ll3_r8_l1_im3)
    ImageView ll3R8L1Im3;
    @BindView(R.id.ll3_r8_l1)
    LinearLayout ll3R8L1;
    @BindView(R.id.ll3_r8_l2_im1)
    ImageView ll3R8L2Im1;
    @BindView(R.id.ll3_r8_l2_im2)
    ImageView ll3R8L2Im2;
    @BindView(R.id.ll3_r8_l2_im3)
    ImageView ll3R8L2Im3;
    @BindView(R.id.ll3_r8_l2)
    LinearLayout ll3R8L2;
    @BindView(R.id.ll3_r8_l3_im1)
    ImageView ll3R8L3Im1;
    @BindView(R.id.ll3_r8_l3_im2)
    ImageView ll3R8L3Im2;
    @BindView(R.id.ll3_r8_l3_im3)
    ImageView ll3R8L3Im3;
    @BindView(R.id.ll3_r8_l3)
    LinearLayout ll3R8L3;
    @BindView(R.id.ll3_r8)
    RelativeLayout ll3R8;
    @BindView(R.id.ll3_r9_l1_im1)
    ImageView ll3R9L1Im1;
    @BindView(R.id.ll3_r9_l1_im2)
    ImageView ll3R9L1Im2;
    @BindView(R.id.ll3_r9_l1_im3)
    ImageView ll3R9L1Im3;
    @BindView(R.id.ll3_r9_l1)
    LinearLayout ll3R9L1;
    @BindView(R.id.ll3_r9_l2_im1)
    ImageView ll3R9L2Im1;
    @BindView(R.id.ll3_r9_l2_im2)
    ImageView ll3R9L2Im2;
    @BindView(R.id.ll3_r9_l2_im3)
    ImageView ll3R9L2Im3;
    @BindView(R.id.ll3_r9_l2)
    LinearLayout ll3R9L2;
    @BindView(R.id.ll3_r9_l3_im1)
    ImageView ll3R9L3Im1;
    @BindView(R.id.ll3_r9_l3_im2)
    ImageView ll3R9L3Im2;
    @BindView(R.id.ll3_r9_l3_im3)
    ImageView ll3R9L3Im3;
    @BindView(R.id.ll3_r9_l3)
    LinearLayout ll3R9L3;
    @BindView(R.id.ll3_r9)
    RelativeLayout ll3R9;
    @BindView(R.id.ll4_r1_l1_im1)
    ImageView ll4R1L1Im1;
    @BindView(R.id.ll4_r1_l1_im2)
    ImageView ll4R1L1Im2;
    @BindView(R.id.ll4_r1_l1_im3)
    ImageView ll4R1L1Im3;
    @BindView(R.id.ll4_r1_l1)
    LinearLayout ll4R1L1;
    @BindView(R.id.ll4_r1_l2_im1)
    ImageView ll4R1L2Im1;
    @BindView(R.id.ll4_r1_l2_im2)
    ImageView ll4R1L2Im2;
    @BindView(R.id.ll4_r1_l2_im3)
    ImageView ll4R1L2Im3;
    @BindView(R.id.ll4_r1_l2)
    LinearLayout ll4R1L2;
    @BindView(R.id.ll4_r1_l3_im1)
    ImageView ll4R1L3Im1;
    @BindView(R.id.ll4_r1_l3_im2)
    ImageView ll4R1L3Im2;
    @BindView(R.id.ll4_r1_l3_im3)
    ImageView ll4R1L3Im3;
    @BindView(R.id.ll4_r1_l3)
    LinearLayout ll4R1L3;
    @BindView(R.id.ll4_r1)
    RelativeLayout ll4R1;
    @BindView(R.id.ll4_r2_l1_im1)
    ImageView ll4R2L1Im1;
    @BindView(R.id.ll4_r2_l1_im2)
    ImageView ll4R2L1Im2;
    @BindView(R.id.ll4_r2_l1_im3)
    ImageView ll4R2L1Im3;
    @BindView(R.id.ll4_r2_l1)
    LinearLayout ll4R2L1;
    @BindView(R.id.ll4_r2_l2_im1)
    ImageView ll4R2L2Im1;
    @BindView(R.id.ll4_r2_l2_im2)
    ImageView ll4R2L2Im2;
    @BindView(R.id.ll4_r2_l2_im3)
    ImageView ll4R2L2Im3;
    @BindView(R.id.ll4_r2_l2)
    LinearLayout ll4R2L2;
    @BindView(R.id.ll4_r2_l3_im1)
    ImageView ll4R2L3Im1;
    @BindView(R.id.ll4_r2_l3_im2)
    ImageView ll4R2L3Im2;
    @BindView(R.id.ll4_r2_l3_im3)
    ImageView ll4R2L3Im3;
    @BindView(R.id.ll4_r2_l3)
    LinearLayout ll4R2L3;
    @BindView(R.id.ll4_r2)
    RelativeLayout ll4R2;
    @BindView(R.id.ll4_r3_l1_im1)
    ImageView ll4R3L1Im1;
    @BindView(R.id.ll4_r3_l1_im2)
    ImageView ll4R3L1Im2;
    @BindView(R.id.ll4_r3_l1_im3)
    ImageView ll4R3L1Im3;
    @BindView(R.id.ll4_r3_l1)
    LinearLayout ll4R3L1;
    @BindView(R.id.ll4_r3_l2_im1)
    ImageView ll4R3L2Im1;
    @BindView(R.id.ll4_r3_l2_im2)
    ImageView ll4R3L2Im2;
    @BindView(R.id.ll4_r3_l2_im3)
    ImageView ll4R3L2Im3;
    @BindView(R.id.ll4_r3_l2)
    LinearLayout ll4R3L2;
    @BindView(R.id.ll4_r3_l3_im1)
    ImageView ll4R3L3Im1;
    @BindView(R.id.ll4_r3_l3_im2)
    ImageView ll4R3L3Im2;
    @BindView(R.id.ll4_r3_l3_im3)
    ImageView ll4R3L3Im3;
    @BindView(R.id.ll4_r3_l3)
    LinearLayout ll4R3L3;
    @BindView(R.id.ll4_r3)
    RelativeLayout ll4R3;
    @BindView(R.id.ll4_r4_l1_im1)
    ImageView ll4R4L1Im1;
    @BindView(R.id.ll4_r4_l1_im2)
    ImageView ll4R4L1Im2;
    @BindView(R.id.ll4_r4_l1_im3)
    ImageView ll4R4L1Im3;
    @BindView(R.id.ll4_r4_l1)
    LinearLayout ll4R4L1;
    @BindView(R.id.ll4_r4_l2_im1)
    ImageView ll4R4L2Im1;
    @BindView(R.id.ll4_r4_l2_im2)
    ImageView ll4R4L2Im2;
    @BindView(R.id.ll4_r4_l2_im3)
    ImageView ll4R4L2Im3;
    @BindView(R.id.ll4_r4_l2)
    LinearLayout ll4R4L2;
    @BindView(R.id.ll4_r4_l3_im1)
    ImageView ll4R4L3Im1;
    @BindView(R.id.ll4_r4_l3_im2)
    ImageView ll4R4L3Im2;
    @BindView(R.id.ll4_r4_l3_im3)
    ImageView ll4R4L3Im3;
    @BindView(R.id.ll4_r4_l3)
    LinearLayout ll4R4L3;
    @BindView(R.id.ll4_r4)
    RelativeLayout ll4R4;
    @BindView(R.id.ll4_r5_l1_im1)
    ImageView ll4R5L1Im1;
    @BindView(R.id.ll4_r5_l1_im2)
    ImageView ll4R5L1Im2;
    @BindView(R.id.ll4_r5_l1_im3)
    ImageView ll4R5L1Im3;
    @BindView(R.id.ll4_r5_l1)
    LinearLayout ll4R5L1;
    @BindView(R.id.ll4_r5_l2_im1)
    ImageView ll4R5L2Im1;
    @BindView(R.id.ll4_r5_l2_im2)
    ImageView ll4R5L2Im2;
    @BindView(R.id.ll4_r5_l2_im3)
    ImageView ll4R5L2Im3;
    @BindView(R.id.ll4_r5_l2)
    LinearLayout ll4R5L2;
    @BindView(R.id.ll4_r5_l3_im1)
    ImageView ll4R5L3Im1;
    @BindView(R.id.ll4_r5_l3_im2)
    ImageView ll4R5L3Im2;
    @BindView(R.id.ll4_r5_l3_im3)
    ImageView ll4R5L3Im3;
    @BindView(R.id.ll4_r5_l3)
    LinearLayout ll4R5L3;
    @BindView(R.id.ll4_r5)
    RelativeLayout ll4R5;
    @BindView(R.id.ll4_r6_l1_im1)
    ImageView ll4R6L1Im1;
    @BindView(R.id.ll4_r6_l1_im2)
    ImageView ll4R6L1Im2;
    @BindView(R.id.ll4_r6_l1_im3)
    ImageView ll4R6L1Im3;
    @BindView(R.id.ll4_r6_l1)
    LinearLayout ll4R6L1;
    @BindView(R.id.ll4_r6_l2_im1)
    ImageView ll4R6L2Im1;
    @BindView(R.id.ll4_r6_l2_im2)
    ImageView ll4R6L2Im2;
    @BindView(R.id.ll4_r6_l2_im3)
    ImageView ll4R6L2Im3;
    @BindView(R.id.ll4_r6_l2)
    LinearLayout ll4R6L2;
    @BindView(R.id.ll4_r6_l3_im1)
    ImageView ll4R6L3Im1;
    @BindView(R.id.ll4_r6_l3_im2)
    ImageView ll4R6L3Im2;
    @BindView(R.id.ll4_r6_l3_im3)
    ImageView ll4R6L3Im3;
    @BindView(R.id.ll4_r6_l3)
    LinearLayout ll4R6L3;
    @BindView(R.id.ll4_r6)
    RelativeLayout ll4R6;
    @BindView(R.id.ll4_r7_l1_im1)
    ImageView ll4R7L1Im1;
    @BindView(R.id.ll4_r7_l1_im2)
    ImageView ll4R7L1Im2;
    @BindView(R.id.ll4_r7_l1_im3)
    ImageView ll4R7L1Im3;
    @BindView(R.id.ll4_r7_l1)
    LinearLayout ll4R7L1;
    @BindView(R.id.ll4_r7_l2_im1)
    ImageView ll4R7L2Im1;
    @BindView(R.id.ll4_r7_l2_im2)
    ImageView ll4R7L2Im2;
    @BindView(R.id.ll4_r7_l2_im3)
    ImageView ll4R7L2Im3;
    @BindView(R.id.ll4_r7_l2)
    LinearLayout ll4R7L2;
    @BindView(R.id.ll4_r7_l3_im1)
    ImageView ll4R7L3Im1;
    @BindView(R.id.ll4_r7_l3_im2)
    ImageView ll4R7L3Im2;
    @BindView(R.id.ll4_r7_l3_im3)
    ImageView ll4R7L3Im3;
    @BindView(R.id.ll4_r7_l3)
    LinearLayout ll4R7L3;
    @BindView(R.id.ll4_r7)
    RelativeLayout ll4R7;
    @BindView(R.id.ll4_r8_l1_im1)
    ImageView ll4R8L1Im1;
    @BindView(R.id.ll4_r8_l1_im2)
    ImageView ll4R8L1Im2;
    @BindView(R.id.ll4_r8_l1_im3)
    ImageView ll4R8L1Im3;
    @BindView(R.id.ll4_r8_l1)
    LinearLayout ll4R8L1;
    @BindView(R.id.ll4_r8_l2_im1)
    ImageView ll4R8L2Im1;
    @BindView(R.id.ll4_r8_l2_im2)
    ImageView ll4R8L2Im2;
    @BindView(R.id.ll4_r8_l2_im3)
    ImageView ll4R8L2Im3;
    @BindView(R.id.ll4_r8_l2)
    LinearLayout ll4R8L2;
    @BindView(R.id.ll4_r8_l3_im1)
    ImageView ll4R8L3Im1;
    @BindView(R.id.ll4_r8_l3_im2)
    ImageView ll4R8L3Im2;
    @BindView(R.id.ll4_r8_l3_im3)
    ImageView ll4R8L3Im3;
    @BindView(R.id.ll4_r8_l3)
    LinearLayout ll4R8L3;
    @BindView(R.id.ll4_r8)
    RelativeLayout ll4R8;
    @BindView(R.id.ll4_r9_l1_im1)
    ImageView ll4R9L1Im1;
    @BindView(R.id.ll4_r9_l1_im2)
    ImageView ll4R9L1Im2;
    @BindView(R.id.ll4_r9_l1_im3)
    ImageView ll4R9L1Im3;
    @BindView(R.id.ll4_r9_l1)
    LinearLayout ll4R9L1;
    @BindView(R.id.ll4_r9_l2_im1)
    ImageView ll4R9L2Im1;
    @BindView(R.id.ll4_r9_l2_im2)
    ImageView ll4R9L2Im2;
    @BindView(R.id.ll4_r9_l2_im3)
    ImageView ll4R9L2Im3;
    @BindView(R.id.ll4_r9_l2)
    LinearLayout ll4R9L2;
    @BindView(R.id.ll4_r9_l3_im1)
    ImageView ll4R9L3Im1;
    @BindView(R.id.ll4_r9_l3_im2)
    ImageView ll4R9L3Im2;
    @BindView(R.id.ll4_r9_l3_im3)
    ImageView ll4R9L3Im3;
    @BindView(R.id.ll4_r9_l3)
    LinearLayout ll4R9L3;
    @BindView(R.id.ll4_r9)
    RelativeLayout ll4R9;
    @BindView(R.id.ll5_r1_l1_im1)
    ImageView ll5R1L1Im1;
    @BindView(R.id.ll5_r1_l1_im2)
    ImageView ll5R1L1Im2;
    @BindView(R.id.ll5_r1_l1_im3)
    ImageView ll5R1L1Im3;
    @BindView(R.id.ll5_r1_l1)
    LinearLayout ll5R1L1;
    @BindView(R.id.ll5_r1_l2_im1)
    ImageView ll5R1L2Im1;
    @BindView(R.id.ll5_r1_l2_im2)
    ImageView ll5R1L2Im2;
    @BindView(R.id.ll5_r1_l2_im3)
    ImageView ll5R1L2Im3;
    @BindView(R.id.ll5_r1_l2)
    LinearLayout ll5R1L2;
    @BindView(R.id.ll5_r1_l3_im1)
    ImageView ll5R1L3Im1;
    @BindView(R.id.ll5_r1_l3_im2)
    ImageView ll5R1L3Im2;
    @BindView(R.id.ll5_r1_l3_im3)
    ImageView ll5R1L3Im3;
    @BindView(R.id.ll5_r1_l3)
    LinearLayout ll5R1L3;
    @BindView(R.id.ll5_r1)
    RelativeLayout ll5R1;
    @BindView(R.id.ll5_r2_l1_im1)
    ImageView ll5R2L1Im1;
    @BindView(R.id.ll5_r2_l1_im2)
    ImageView ll5R2L1Im2;
    @BindView(R.id.ll5_r2_l1_im3)
    ImageView ll5R2L1Im3;
    @BindView(R.id.ll5_r2_l1)
    LinearLayout ll5R2L1;
    @BindView(R.id.ll5_r2_l2_im1)
    ImageView ll5R2L2Im1;
    @BindView(R.id.ll5_r2_l2_im2)
    ImageView ll5R2L2Im2;
    @BindView(R.id.ll5_r2_l2_im3)
    ImageView ll5R2L2Im3;
    @BindView(R.id.ll5_r2_l2)
    LinearLayout ll5R2L2;
    @BindView(R.id.ll5_r2_l3_im1)
    ImageView ll5R2L3Im1;
    @BindView(R.id.ll5_r2_l3_im2)
    ImageView ll5R2L3Im2;
    @BindView(R.id.ll5_r2_l3_im3)
    ImageView ll5R2L3Im3;
    @BindView(R.id.ll5_r2_l3)
    LinearLayout ll5R2L3;
    @BindView(R.id.ll5_r2)
    RelativeLayout ll5R2;
    @BindView(R.id.ll5_r3_l1_im1)
    ImageView ll5R3L1Im1;
    @BindView(R.id.ll5_r3_l1_im2)
    ImageView ll5R3L1Im2;
    @BindView(R.id.ll5_r3_l1_im3)
    ImageView ll5R3L1Im3;
    @BindView(R.id.ll5_r3_l1)
    LinearLayout ll5R3L1;
    @BindView(R.id.ll5_r3_l2_im1)
    ImageView ll5R3L2Im1;
    @BindView(R.id.ll5_r3_l2_im2)
    ImageView ll5R3L2Im2;
    @BindView(R.id.ll5_r3_l2_im3)
    ImageView ll5R3L2Im3;
    @BindView(R.id.ll5_r3_l2)
    LinearLayout ll5R3L2;
    @BindView(R.id.ll5_r3_l3_im1)
    ImageView ll5R3L3Im1;
    @BindView(R.id.ll5_r3_l3_im2)
    ImageView ll5R3L3Im2;
    @BindView(R.id.ll5_r3_l3_im3)
    ImageView ll5R3L3Im3;
    @BindView(R.id.ll5_r3_l3)
    LinearLayout ll5R3L3;
    @BindView(R.id.ll5_r3)
    RelativeLayout ll5R3;
    @BindView(R.id.ll5_r4_l1_im1)
    ImageView ll5R4L1Im1;
    @BindView(R.id.ll5_r4_l1_im2)
    ImageView ll5R4L1Im2;
    @BindView(R.id.ll5_r4_l1_im3)
    ImageView ll5R4L1Im3;
    @BindView(R.id.ll5_r4_l1)
    LinearLayout ll5R4L1;
    @BindView(R.id.ll5_r4_l2_im1)
    ImageView ll5R4L2Im1;
    @BindView(R.id.ll5_r4_l2_im2)
    ImageView ll5R4L2Im2;
    @BindView(R.id.ll5_r4_l2_im3)
    ImageView ll5R4L2Im3;
    @BindView(R.id.ll5_r4_l2)
    LinearLayout ll5R4L2;
    @BindView(R.id.ll5_r4_l3_im1)
    ImageView ll5R4L3Im1;
    @BindView(R.id.ll5_r4_l3_im2)
    ImageView ll5R4L3Im2;
    @BindView(R.id.ll5_r4_l3_im3)
    ImageView ll5R4L3Im3;
    @BindView(R.id.ll5_r4_l3)
    LinearLayout ll5R4L3;
    @BindView(R.id.ll5_r4)
    RelativeLayout ll5R4;
    @BindView(R.id.ll5_r5_l1_im1)
    ImageView ll5R5L1Im1;
    @BindView(R.id.ll5_r5_l1_im2)
    ImageView ll5R5L1Im2;
    @BindView(R.id.ll5_r5_l1_im3)
    ImageView ll5R5L1Im3;
    @BindView(R.id.ll5_r5_l1)
    LinearLayout ll5R5L1;
    @BindView(R.id.ll5_r5_l2_im1)
    ImageView ll5R5L2Im1;
    @BindView(R.id.ll5_r5_l2_im2)
    ImageView ll5R5L2Im2;
    @BindView(R.id.ll5_r5_l2_im3)
    ImageView ll5R5L2Im3;
    @BindView(R.id.ll5_r5_l2)
    LinearLayout ll5R5L2;
    @BindView(R.id.ll5_r5_l3_im1)
    ImageView ll5R5L3Im1;
    @BindView(R.id.ll5_r5_l3_im2)
    ImageView ll5R5L3Im2;
    @BindView(R.id.ll5_r5_l3_im3)
    ImageView ll5R5L3Im3;
    @BindView(R.id.ll5_r5_l3)
    LinearLayout ll5R5L3;
    @BindView(R.id.ll5_r5)
    RelativeLayout ll5R5;
    @BindView(R.id.ll5_r6_l1_im1)
    ImageView ll5R6L1Im1;
    @BindView(R.id.ll5_r6_l1_im2)
    ImageView ll5R6L1Im2;
    @BindView(R.id.ll5_r6_l1_im3)
    ImageView ll5R6L1Im3;
    @BindView(R.id.ll5_r6_l1)
    LinearLayout ll5R6L1;
    @BindView(R.id.ll5_r6_l2_im1)
    ImageView ll5R6L2Im1;
    @BindView(R.id.ll5_r6_l2_im2)
    ImageView ll5R6L2Im2;
    @BindView(R.id.ll5_r6_l2_im3)
    ImageView ll5R6L2Im3;
    @BindView(R.id.ll5_r6_l2)
    LinearLayout ll5R6L2;
    @BindView(R.id.ll5_r6_l3_im1)
    ImageView ll5R6L3Im1;
    @BindView(R.id.ll5_r6_l3_im2)
    ImageView ll5R6L3Im2;
    @BindView(R.id.ll5_r6_l3_im3)
    ImageView ll5R6L3Im3;
    @BindView(R.id.ll5_r6_l3)
    LinearLayout ll5R6L3;
    @BindView(R.id.ll5_r6)
    RelativeLayout ll5R6;
    @BindView(R.id.ll5_r7_l1_im1)
    ImageView ll5R7L1Im1;
    @BindView(R.id.ll5_r7_l1_im2)
    ImageView ll5R7L1Im2;
    @BindView(R.id.ll5_r7_l1_im3)
    ImageView ll5R7L1Im3;
    @BindView(R.id.ll5_r7_l1)
    LinearLayout ll5R7L1;
    @BindView(R.id.ll5_r7_l2_im1)
    ImageView ll5R7L2Im1;
    @BindView(R.id.ll5_r7_l2_im2)
    ImageView ll5R7L2Im2;
    @BindView(R.id.ll5_r7_l2_im3)
    ImageView ll5R7L2Im3;
    @BindView(R.id.ll5_r7_l2)
    LinearLayout ll5R7L2;
    @BindView(R.id.ll5_r7_l3_im1)
    ImageView ll5R7L3Im1;
    @BindView(R.id.ll5_r7_l3_im2)
    ImageView ll5R7L3Im2;
    @BindView(R.id.ll5_r7_l3_im3)
    ImageView ll5R7L3Im3;
    @BindView(R.id.ll5_r7_l3)
    LinearLayout ll5R7L3;
    @BindView(R.id.ll5_r7)
    RelativeLayout ll5R7;
    @BindView(R.id.ll5_r8_l1_im1)
    ImageView ll5R8L1Im1;
    @BindView(R.id.ll5_r8_l1_im2)
    ImageView ll5R8L1Im2;
    @BindView(R.id.ll5_r8_l1_im3)
    ImageView ll5R8L1Im3;
    @BindView(R.id.ll5_r8_l1)
    LinearLayout ll5R8L1;
    @BindView(R.id.ll5_r8_l2_im1)
    ImageView ll5R8L2Im1;
    @BindView(R.id.ll5_r8_l2_im2)
    ImageView ll5R8L2Im2;
    @BindView(R.id.ll5_r8_l2_im3)
    ImageView ll5R8L2Im3;
    @BindView(R.id.ll5_r8_l2)
    LinearLayout ll5R8L2;
    @BindView(R.id.ll5_r8_l3_im1)
    ImageView ll5R8L3Im1;
    @BindView(R.id.ll5_r8_l3_im2)
    ImageView ll5R8L3Im2;
    @BindView(R.id.ll5_r8_l3_im3)
    ImageView ll5R8L3Im3;
    @BindView(R.id.ll5_r8_l3)
    LinearLayout ll5R8L3;
    @BindView(R.id.ll5_r8)
    RelativeLayout ll5R8;
    @BindView(R.id.ll5_r9_l1_im1)
    ImageView ll5R9L1Im1;
    @BindView(R.id.ll5_r9_l1_im2)
    ImageView ll5R9L1Im2;
    @BindView(R.id.ll5_r9_l1_im3)
    ImageView ll5R9L1Im3;
    @BindView(R.id.ll5_r9_l1)
    LinearLayout ll5R9L1;
    @BindView(R.id.ll5_r9_l2_im1)
    ImageView ll5R9L2Im1;
    @BindView(R.id.ll5_r9_l2_im2)
    ImageView ll5R9L2Im2;
    @BindView(R.id.ll5_r9_l2_im3)
    ImageView ll5R9L2Im3;
    @BindView(R.id.ll5_r9_l2)
    LinearLayout ll5R9L2;
    @BindView(R.id.ll5_r9_l3_im1)
    ImageView ll5R9L3Im1;
    @BindView(R.id.ll5_r9_l3_im2)
    ImageView ll5R9L3Im2;
    @BindView(R.id.ll5_r9_l3_im3)
    ImageView ll5R9L3Im3;
    @BindView(R.id.ll5_r9_l3)
    LinearLayout ll5R9L3;
    @BindView(R.id.ll5_r9)
    RelativeLayout ll5R9;
    @BindView(R.id.text_tv)
    TextView textTv;

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
        // xCoordinateTextView.setText((int) sensorEvent.values[0] + ""); ////"" + String.format("%.01f", sensorEvent.values[0]));
        //yCoordinateTextView.setText((int) sensorEvent.values[1] + "");////"" + String.format("%.01f", sensorEvent.values[1]));
        //zCoordinateTextView.setText((int) sensorEvent.values[2] + "");////"" + String.format("%.01f", sensorEvent.values[2]));
        row(sensorEvent);


    }

    public void decidePointerofColumns(float y, float spacing, RelativeLayout[] relativeLayouts, ImageView[] imageViews, LinearLayout[] linearLayouts) {
        if (y < calibratedYLeft) {
            makeBackgroundWhite(linearLayouts);
            //ll11.setBackgroundColor(getResources().getColor(R.color.pairblue));
            makeColumnsUnVisible(imageViews);
            imageViews[0].setVisibility(View.VISIBLE);
            linearLayouts[0].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[0].setBackgroundColor(getResources().getColor(R.color.pairblue));
            //im11.setVisibility(View.VISIBLE);
            listenBackgrounds();

        } else if (y > calibratedYLeft && y < (calibratedYLeft + spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[1].setVisibility(View.VISIBLE);
            linearLayouts[0].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[0].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + spacing) && y < (calibratedYLeft + 2 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[2].setVisibility(View.VISIBLE);
            linearLayouts[0].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[0].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 2 * spacing) && y < (calibratedYLeft + 3 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[3].setVisibility(View.VISIBLE);
            linearLayouts[1].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[1].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 3 * spacing) && y < (calibratedYLeft + 4 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[4].setVisibility(View.VISIBLE);
            linearLayouts[1].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[1].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 4 * spacing) && y < (calibratedYLeft + 5 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[5].setVisibility(View.VISIBLE);
            linearLayouts[1].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[1].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 5 * spacing) && y < (calibratedYLeft + 6 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[6].setVisibility(View.VISIBLE);
            linearLayouts[2].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[2].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 6 * spacing) && y < (calibratedYLeft + 7 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[7].setVisibility(View.VISIBLE);
            linearLayouts[2].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[2].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 7 * spacing) && y < (calibratedYLeft + 8 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[8].setVisibility(View.VISIBLE);
            linearLayouts[2].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[2].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 8 * spacing) && y < (calibratedYLeft + 9 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[9].setVisibility(View.VISIBLE);
            linearLayouts[3].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[3].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 9 * spacing) && y < (calibratedYLeft + 10 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[10].setVisibility(View.VISIBLE);
            linearLayouts[3].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[3].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 10 * spacing) && y < (calibratedYLeft + 11 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[11].setVisibility(View.VISIBLE);
            linearLayouts[3].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[3].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 11 * spacing) && y < (calibratedYLeft + 12 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[12].setVisibility(View.VISIBLE);
            linearLayouts[4].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[4].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 12 * spacing) && y < (calibratedYLeft + 13 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[13].setVisibility(View.VISIBLE);
            linearLayouts[4].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[4].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 13 * spacing) && y < (calibratedYLeft + 14 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[14].setVisibility(View.VISIBLE);
            linearLayouts[4].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[4].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 14 * spacing) && y < (calibratedYLeft + 15 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[15].setVisibility(View.VISIBLE);
            linearLayouts[5].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[5].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 15 * spacing) && y < (calibratedYLeft + 16 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[16].setVisibility(View.VISIBLE);
            linearLayouts[5].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[5].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 16 * spacing) && y < (calibratedYLeft + 17 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[17].setVisibility(View.VISIBLE);
            linearLayouts[5].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[5].setBackgroundColor(getResources().getColor(R.color.pairblue));
        } else if (y > (calibratedYLeft + 17 * spacing) && y < (calibratedYLeft + 18 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[18].setVisibility(View.VISIBLE);
            linearLayouts[6].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[6].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 18 * spacing) && y < (calibratedYLeft + 19 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[19].setVisibility(View.VISIBLE);
            linearLayouts[6].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[6].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 19 * spacing) && y < (calibratedYLeft + 20 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[20].setVisibility(View.VISIBLE);
            linearLayouts[6].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[6].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 20 * spacing) && y < (calibratedYLeft + 21 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[21].setVisibility(View.VISIBLE);
            linearLayouts[7].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[7].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 21 * spacing) && y < (calibratedYLeft + 22 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[22].setVisibility(View.VISIBLE);
            linearLayouts[7].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[7].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 22 * spacing) && y < (calibratedYLeft + 23 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[23].setVisibility(View.VISIBLE);
            linearLayouts[7].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[7].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 23 * spacing) && y < (calibratedYLeft + 24 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[24].setVisibility(View.VISIBLE);
            linearLayouts[8].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[8].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 24 * spacing) && y < (calibratedYLeft + 25 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[25].setVisibility(View.VISIBLE);
            linearLayouts[8].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[8].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        } else if (y > (calibratedYLeft + 25 * spacing) && y < (calibratedYLeft + 26 * spacing)) {
            makeBackgroundWhite(linearLayouts);
            makeColumnsUnVisible(imageViews);
            imageViews[26].setVisibility(View.VISIBLE);
            linearLayouts[8].setBackgroundColor(getResources().getColor(R.color.pairblue));
            relativeLayouts[8].setBackgroundColor(getResources().getColor(R.color.pairblue));
            listenBackgrounds();
        }
    }

    void column(SensorEvent sensorEvent, int id) {
        RelativeLayout[] relativeLayouts = new RelativeLayout[9];
        ImageView[] imageViews = new ImageView[27];
        LinearLayout[] linearLayouts = new LinearLayout[9];
        float y = sensorEvent.values[1];
        float spacing = (Math.abs(calibratedYLeft) + Math.abs(calibratedYRight)) / 27;
        if (id == R.id.ll1_r1_l1) {
            //linears
            linearLayouts[0] = ll1R1L1;
            linearLayouts[1] = ll1R2L1;
            linearLayouts[2] = ll1R3L1;
            linearLayouts[3] = ll1R4L1;
            linearLayouts[4] = ll1R5L1;
            linearLayouts[5] = ll1R6L1;
            linearLayouts[6] = ll1R7L1;
            linearLayouts[7] = ll1R8L1;
            linearLayouts[8] = ll1R9L1;
            //relatives
            relativeLayouts[0] = ll1R1;
            relativeLayouts[1] = ll1R2;
            relativeLayouts[2] = ll1R3;
            relativeLayouts[3] = ll1R4;
            relativeLayouts[4] = ll1R5;
            relativeLayouts[5] = ll1R6;
            relativeLayouts[6] = ll1R7;
            relativeLayouts[7] = ll1R8;
            relativeLayouts[8] = ll1R9;
            //images
            imageViews[0] = ll1R1L1Im1;
            imageViews[1] = ll1R1L1Im2;
            imageViews[2] = ll1R1L1Im3;

            imageViews[3] = ll1R2L1Im1;
            imageViews[4] = ll1R2L1Im2;
            imageViews[5] = ll1R2L1Im3;

            imageViews[6] = ll1R3L1Im1;
            imageViews[7] = ll1R3L1Im2;
            imageViews[8] = ll1R3L1Im3;

            imageViews[9] = ll1R4L1Im1;
            imageViews[10] = ll1R4L1Im2;
            imageViews[11] = ll1R4L1Im3;

            imageViews[12] = ll1R5L1Im1;
            imageViews[13] = ll1R5L1Im2;
            imageViews[14] = ll1R5L1Im3;

            imageViews[15] = ll1R6L1Im1;
            imageViews[16] = ll1R6L1Im2;
            imageViews[17] = ll1R6L1Im3;

            imageViews[18] = ll1R7L1Im1;
            imageViews[19] = ll1R7L1Im2;
            imageViews[20] = ll1R7L1Im3;

            imageViews[21] = ll1R8L1Im1;
            imageViews[22] = ll1R8L1Im2;
            imageViews[23] = ll1R8L1Im3;

            imageViews[24] = ll1R9L1Im1;
            imageViews[25] = ll1R9L1Im2;
            imageViews[26] = ll1R9L1Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);

        } else if (id == R.id.ll1_r1_l2) {
            //linears
            linearLayouts[0] = ll1R1L2;
            linearLayouts[1] = ll1R2L2;
            linearLayouts[2] = ll1R3L2;
            linearLayouts[3] = ll1R4L2;
            linearLayouts[4] = ll1R5L2;
            linearLayouts[5] = ll1R6L2;
            linearLayouts[6] = ll1R7L2;
            linearLayouts[7] = ll1R8L2;
            linearLayouts[8] = ll1R9L2;
            //relatives
            relativeLayouts[0] = ll1R1;
            relativeLayouts[1] = ll1R2;
            relativeLayouts[2] = ll1R3;
            relativeLayouts[3] = ll1R4;
            relativeLayouts[4] = ll1R5;
            relativeLayouts[5] = ll1R6;
            relativeLayouts[6] = ll1R7;
            relativeLayouts[7] = ll1R8;
            relativeLayouts[8] = ll1R9;
            //images
            imageViews[0] = ll1R1L2Im1;
            imageViews[1] = ll1R1L2Im2;
            imageViews[2] = ll1R1L2Im3;

            imageViews[3] = ll1R2L2Im1;
            imageViews[4] = ll1R2L2Im2;
            imageViews[5] = ll1R2L2Im3;

            imageViews[6] = ll1R3L2Im1;
            imageViews[7] = ll1R3L2Im2;
            imageViews[8] = ll1R3L2Im3;

            imageViews[9] = ll1R4L2Im1;
            imageViews[10] = ll1R4L2Im2;
            imageViews[11] = ll1R4L2Im3;

            imageViews[12] = ll1R5L2Im1;
            imageViews[13] = ll1R5L2Im2;
            imageViews[14] = ll1R5L2Im3;

            imageViews[15] = ll1R6L2Im1;
            imageViews[16] = ll1R6L2Im2;
            imageViews[17] = ll1R6L2Im3;

            imageViews[18] = ll1R7L2Im1;
            imageViews[19] = ll1R7L2Im2;
            imageViews[20] = ll1R7L2Im3;

            imageViews[21] = ll1R8L2Im1;
            imageViews[22] = ll1R8L2Im2;
            imageViews[23] = ll1R8L2Im3;

            imageViews[24] = ll1R9L2Im1;
            imageViews[25] = ll1R9L2Im2;
            imageViews[26] = ll1R9L2Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll1_r1_l3) {
            //linears
            linearLayouts[0] = ll1R1L3;
            linearLayouts[1] = ll1R2L3;
            linearLayouts[2] = ll1R3L3;
            linearLayouts[3] = ll1R4L3;
            linearLayouts[4] = ll1R5L3;
            linearLayouts[5] = ll1R6L3;
            linearLayouts[6] = ll1R7L3;
            linearLayouts[7] = ll1R8L3;
            linearLayouts[8] = ll1R9L3;
            //relatives
            relativeLayouts[0] = ll1R1;
            relativeLayouts[1] = ll1R2;
            relativeLayouts[2] = ll1R3;
            relativeLayouts[3] = ll1R4;
            relativeLayouts[4] = ll1R5;
            relativeLayouts[5] = ll1R6;
            relativeLayouts[6] = ll1R7;
            relativeLayouts[7] = ll1R8;
            relativeLayouts[8] = ll1R9;
            //images
            imageViews[0] = ll1R1L3Im1;
            imageViews[1] = ll1R1L3Im2;
            imageViews[2] = ll1R1L3Im3;

            imageViews[3] = ll1R2L3Im1;
            imageViews[4] = ll1R2L3Im2;
            imageViews[5] = ll1R2L3Im3;

            imageViews[6] = ll1R3L3Im1;
            imageViews[7] = ll1R3L3Im2;
            imageViews[8] = ll1R3L3Im3;

            imageViews[9] = ll1R4L3Im1;
            imageViews[10] = ll1R4L3Im2;
            imageViews[11] = ll1R4L3Im3;

            imageViews[12] = ll1R5L3Im1;
            imageViews[13] = ll1R5L3Im2;
            imageViews[14] = ll1R5L3Im3;

            imageViews[15] = ll1R6L3Im1;
            imageViews[16] = ll1R6L3Im2;
            imageViews[17] = ll1R6L3Im3;

            imageViews[18] = ll1R7L3Im1;
            imageViews[19] = ll1R7L3Im2;
            imageViews[20] = ll1R7L3Im3;

            imageViews[21] = ll1R8L3Im1;
            imageViews[22] = ll1R8L3Im2;
            imageViews[23] = ll1R8L3Im3;

            imageViews[24] = ll1R9L3Im1;
            imageViews[25] = ll1R9L3Im2;
            imageViews[26] = ll1R9L3Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll2_r1_l1) {
            //linears
            linearLayouts[0] = ll2R1L1;
            linearLayouts[1] = ll2R2L1;
            linearLayouts[2] = ll2R3L1;
            linearLayouts[3] = ll2R4L1;
            linearLayouts[4] = ll2R5L1;
            linearLayouts[5] = ll2R6L1;
            linearLayouts[6] = ll2R7L1;
            linearLayouts[7] = ll2R8L1;
            linearLayouts[8] = ll2R9L1;
            //relatives
            relativeLayouts[0] = ll2R1;
            relativeLayouts[1] = ll2R2;
            relativeLayouts[2] = ll2R3;
            relativeLayouts[3] = ll2R4;
            relativeLayouts[4] = ll2R5;
            relativeLayouts[5] = ll2R6;
            relativeLayouts[6] = ll2R7;
            relativeLayouts[7] = ll2R8;
            relativeLayouts[8] = ll2R9;
            //images
            imageViews[0] = ll2R1L1Im1;
            imageViews[1] = ll2R1L1Im2;
            imageViews[2] = ll2R1L1Im3;

            imageViews[3] = ll2R2L1Im1;
            imageViews[4] = ll2R2L1Im2;
            imageViews[5] = ll2R2L1Im3;

            imageViews[6] = ll2R3L1Im1;
            imageViews[7] = ll2R3L1Im2;
            imageViews[8] = ll2R3L1Im3;

            imageViews[9] = ll2R4L1Im1;
            imageViews[10] = ll2R4L1Im2;
            imageViews[11] = ll2R4L1Im3;

            imageViews[12] = ll2R5L1Im1;
            imageViews[13] = ll2R5L1Im2;
            imageViews[14] = ll2R5L1Im3;

            imageViews[15] = ll2R6L1Im1;
            imageViews[16] = ll2R6L1Im2;
            imageViews[17] = ll2R6L1Im3;

            imageViews[18] = ll2R7L1Im1;
            imageViews[19] = ll2R7L1Im2;
            imageViews[20] = ll2R7L1Im3;

            imageViews[21] = ll2R8L1Im1;
            imageViews[22] = ll2R8L1Im2;
            imageViews[23] = ll2R8L1Im3;

            imageViews[24] = ll2R9L1Im1;
            imageViews[25] = ll2R9L1Im2;
            imageViews[26] = ll2R9L1Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll2_r1_l2) {
            //linears
            linearLayouts[0] = ll2R1L2;
            linearLayouts[1] = ll2R2L2;
            linearLayouts[2] = ll2R3L2;
            linearLayouts[3] = ll2R4L2;
            linearLayouts[4] = ll2R5L2;
            linearLayouts[5] = ll2R6L2;
            linearLayouts[6] = ll2R7L2;
            linearLayouts[7] = ll2R8L2;
            linearLayouts[8] = ll2R9L2;
            //relatives
            relativeLayouts[0] = ll2R1;
            relativeLayouts[1] = ll2R2;
            relativeLayouts[2] = ll2R3;
            relativeLayouts[3] = ll2R4;
            relativeLayouts[4] = ll2R5;
            relativeLayouts[5] = ll2R6;
            relativeLayouts[6] = ll2R7;
            relativeLayouts[7] = ll2R8;
            relativeLayouts[8] = ll2R9;
            //images
            imageViews[0] = ll2R1L2Im1;
            imageViews[1] = ll2R1L2Im2;
            imageViews[2] = ll2R1L2Im3;

            imageViews[3] = ll2R2L2Im1;
            imageViews[4] = ll2R2L2Im2;
            imageViews[5] = ll2R2L2Im3;

            imageViews[6] = ll2R3L2Im1;
            imageViews[7] = ll2R3L2Im2;
            imageViews[8] = ll2R3L2Im3;

            imageViews[9] = ll2R4L2Im1;
            imageViews[10] = ll2R4L2Im2;
            imageViews[11] = ll2R4L2Im3;

            imageViews[12] = ll2R5L2Im1;
            imageViews[13] = ll2R5L2Im2;
            imageViews[14] = ll2R5L2Im3;

            imageViews[15] = ll2R6L2Im1;
            imageViews[16] = ll2R6L2Im2;
            imageViews[17] = ll2R6L2Im3;

            imageViews[18] = ll2R7L2Im1;
            imageViews[19] = ll2R7L2Im2;
            imageViews[20] = ll2R7L2Im3;

            imageViews[21] = ll2R8L2Im1;
            imageViews[22] = ll2R8L2Im2;
            imageViews[23] = ll2R8L2Im3;

            imageViews[24] = ll2R9L2Im1;
            imageViews[25] = ll2R9L2Im2;
            imageViews[26] = ll2R9L2Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll2_r1_l3) {
            //linears
            linearLayouts[0] = ll2R1L3;
            linearLayouts[1] = ll2R2L3;
            linearLayouts[2] = ll2R3L3;
            linearLayouts[3] = ll2R4L3;
            linearLayouts[4] = ll2R5L3;
            linearLayouts[5] = ll2R6L3;
            linearLayouts[6] = ll2R7L3;
            linearLayouts[7] = ll2R8L3;
            linearLayouts[8] = ll2R9L3;
            //relatives
            relativeLayouts[0] = ll2R1;
            relativeLayouts[1] = ll2R2;
            relativeLayouts[2] = ll2R3;
            relativeLayouts[3] = ll2R4;
            relativeLayouts[4] = ll2R5;
            relativeLayouts[5] = ll2R6;
            relativeLayouts[6] = ll2R7;
            relativeLayouts[7] = ll2R8;
            relativeLayouts[8] = ll2R9;
            //images
            imageViews[0] = ll2R1L3Im1;
            imageViews[1] = ll2R1L3Im2;
            imageViews[2] = ll2R1L3Im3;

            imageViews[3] = ll2R2L3Im1;
            imageViews[4] = ll2R2L3Im2;
            imageViews[5] = ll2R2L3Im3;

            imageViews[6] = ll2R3L3Im1;
            imageViews[7] = ll2R3L3Im2;
            imageViews[8] = ll2R3L3Im3;

            imageViews[9] = ll2R4L3Im1;
            imageViews[10] = ll2R4L3Im2;
            imageViews[11] = ll2R4L3Im3;

            imageViews[12] = ll2R5L3Im1;
            imageViews[13] = ll2R5L3Im2;
            imageViews[14] = ll2R5L3Im3;

            imageViews[15] = ll2R6L3Im1;
            imageViews[16] = ll2R6L3Im2;
            imageViews[17] = ll2R6L3Im3;

            imageViews[18] = ll2R7L3Im1;
            imageViews[19] = ll2R7L3Im2;
            imageViews[20] = ll2R7L3Im3;

            imageViews[21] = ll2R8L3Im1;
            imageViews[22] = ll2R8L3Im2;
            imageViews[23] = ll2R8L3Im3;

            imageViews[24] = ll2R9L3Im1;
            imageViews[25] = ll2R9L3Im2;
            imageViews[26] = ll2R9L3Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll3_r1_l1) {
            //linears
            linearLayouts[0] = ll3R1L1;
            linearLayouts[1] = ll3R2L1;
            linearLayouts[2] = ll3R3L1;
            linearLayouts[3] = ll3R4L1;
            linearLayouts[4] = ll3R5L1;
            linearLayouts[5] = ll3R6L1;
            linearLayouts[6] = ll3R7L1;
            linearLayouts[7] = ll3R8L1;
            linearLayouts[8] = ll3R9L1;
            //relatives
            relativeLayouts[0] = ll3R1;
            relativeLayouts[1] = ll3R2;
            relativeLayouts[2] = ll3R3;
            relativeLayouts[3] = ll3R4;
            relativeLayouts[4] = ll3R5;
            relativeLayouts[5] = ll3R6;
            relativeLayouts[6] = ll3R7;
            relativeLayouts[7] = ll3R8;
            relativeLayouts[8] = ll3R9;
            //images
            imageViews[0] = ll3R1L1Im1;
            imageViews[1] = ll3R1L1Im2;
            imageViews[2] = ll3R1L1Im3;

            imageViews[3] = ll3R2L1Im1;
            imageViews[4] = ll3R2L1Im2;
            imageViews[5] = ll3R2L1Im3;

            imageViews[6] = ll3R3L1Im1;
            imageViews[7] = ll3R3L1Im2;
            imageViews[8] = ll3R3L1Im3;

            imageViews[9] = ll3R4L1Im1;
            imageViews[10] = ll3R4L1Im2;
            imageViews[11] = ll3R4L1Im3;

            imageViews[12] = ll3R5L1Im1;
            imageViews[13] = ll3R5L1Im2;
            imageViews[14] = ll3R5L1Im3;

            imageViews[15] = ll3R6L1Im1;
            imageViews[16] = ll3R6L1Im2;
            imageViews[17] = ll3R6L1Im3;

            imageViews[18] = ll3R7L1Im1;
            imageViews[19] = ll3R7L1Im2;
            imageViews[20] = ll3R7L1Im3;

            imageViews[21] = ll3R8L1Im1;
            imageViews[22] = ll3R8L1Im2;
            imageViews[23] = ll3R8L1Im3;

            imageViews[24] = ll3R9L1Im1;
            imageViews[25] = ll3R9L1Im2;
            imageViews[26] = ll3R9L1Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll3_r1_l2) {
            //linears
            linearLayouts[0] = ll3R1L2;
            linearLayouts[1] = ll3R2L2;
            linearLayouts[2] = ll3R3L2;
            linearLayouts[3] = ll3R4L2;
            linearLayouts[4] = ll3R5L2;
            linearLayouts[5] = ll3R6L2;
            linearLayouts[6] = ll3R7L2;
            linearLayouts[7] = ll3R8L2;
            linearLayouts[8] = ll3R9L2;
            //relatives
            relativeLayouts[0] = ll3R1;
            relativeLayouts[1] = ll3R2;
            relativeLayouts[2] = ll3R3;
            relativeLayouts[3] = ll3R4;
            relativeLayouts[4] = ll3R5;
            relativeLayouts[5] = ll3R6;
            relativeLayouts[6] = ll3R7;
            relativeLayouts[7] = ll3R8;
            relativeLayouts[8] = ll3R9;
            //images
            imageViews[0] = ll3R1L2Im1;
            imageViews[1] = ll3R1L2Im2;
            imageViews[2] = ll3R1L2Im3;

            imageViews[3] = ll3R2L2Im1;
            imageViews[4] = ll3R2L2Im2;
            imageViews[5] = ll3R2L2Im3;

            imageViews[6] = ll3R3L2Im1;
            imageViews[7] = ll3R3L2Im2;
            imageViews[8] = ll3R3L2Im3;

            imageViews[9] = ll3R4L2Im1;
            imageViews[10] = ll3R4L2Im2;
            imageViews[11] = ll3R4L2Im3;

            imageViews[12] = ll3R5L2Im1;
            imageViews[13] = ll3R5L2Im2;
            imageViews[14] = ll3R5L2Im3;

            imageViews[15] = ll3R6L2Im1;
            imageViews[16] = ll3R6L2Im2;
            imageViews[17] = ll3R6L2Im3;

            imageViews[18] = ll3R7L2Im1;
            imageViews[19] = ll3R7L2Im2;
            imageViews[20] = ll3R7L2Im3;

            imageViews[21] = ll3R8L2Im1;
            imageViews[22] = ll3R8L2Im2;
            imageViews[23] = ll3R8L2Im3;

            imageViews[24] = ll3R9L2Im1;
            imageViews[25] = ll3R9L2Im2;
            imageViews[26] = ll3R9L2Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll3_r1_l3) {
            //linears
            linearLayouts[0] = ll3R1L3;
            linearLayouts[1] = ll3R2L3;
            linearLayouts[2] = ll3R3L3;
            linearLayouts[3] = ll3R4L3;
            linearLayouts[4] = ll3R5L3;
            linearLayouts[5] = ll3R6L3;
            linearLayouts[6] = ll3R7L3;
            linearLayouts[7] = ll3R8L3;
            linearLayouts[8] = ll3R9L3;
            //relatives
            relativeLayouts[0] = ll3R1;
            relativeLayouts[1] = ll3R2;
            relativeLayouts[2] = ll3R3;
            relativeLayouts[3] = ll3R4;
            relativeLayouts[4] = ll3R5;
            relativeLayouts[5] = ll3R6;
            relativeLayouts[6] = ll3R7;
            relativeLayouts[7] = ll3R8;
            relativeLayouts[8] = ll3R9;
            //images
            imageViews[0] = ll3R1L3Im1;
            imageViews[1] = ll3R1L3Im2;
            imageViews[2] = ll3R1L3Im3;

            imageViews[3] = ll3R2L3Im1;
            imageViews[4] = ll3R2L3Im2;
            imageViews[5] = ll3R2L3Im3;

            imageViews[6] = ll3R3L3Im1;
            imageViews[7] = ll3R3L3Im2;
            imageViews[8] = ll3R3L3Im3;

            imageViews[9] = ll3R4L3Im1;
            imageViews[10] = ll3R4L3Im2;
            imageViews[11] = ll3R4L3Im3;

            imageViews[12] = ll3R5L3Im1;
            imageViews[13] = ll3R5L3Im2;
            imageViews[14] = ll3R5L3Im3;

            imageViews[15] = ll3R6L3Im1;
            imageViews[16] = ll3R6L3Im2;
            imageViews[17] = ll3R6L3Im3;

            imageViews[18] = ll3R7L3Im1;
            imageViews[19] = ll3R7L3Im2;
            imageViews[20] = ll3R7L3Im3;

            imageViews[21] = ll3R8L3Im1;
            imageViews[22] = ll3R8L3Im2;
            imageViews[23] = ll3R8L3Im3;

            imageViews[24] = ll3R9L3Im1;
            imageViews[25] = ll3R9L3Im2;
            imageViews[26] = ll3R9L3Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll4_r1_l1) {
            //linears
            linearLayouts[0] = ll4R1L1;
            linearLayouts[1] = ll4R2L1;
            linearLayouts[2] = ll4R3L1;
            linearLayouts[3] = ll4R4L1;
            linearLayouts[4] = ll4R5L1;
            linearLayouts[5] = ll4R6L1;
            linearLayouts[6] = ll4R7L1;
            linearLayouts[7] = ll4R8L1;
            linearLayouts[8] = ll4R9L1;
            //relatives
            relativeLayouts[0] = ll4R1;
            relativeLayouts[1] = ll4R2;
            relativeLayouts[2] = ll4R3;
            relativeLayouts[3] = ll4R4;
            relativeLayouts[4] = ll4R5;
            relativeLayouts[5] = ll4R6;
            relativeLayouts[6] = ll4R7;
            relativeLayouts[7] = ll4R8;
            relativeLayouts[8] = ll4R9;
            //images
            imageViews[0] = ll4R1L1Im1;
            imageViews[1] = ll4R1L1Im2;
            imageViews[2] = ll4R1L1Im3;

            imageViews[3] = ll4R2L1Im1;
            imageViews[4] = ll4R2L1Im2;
            imageViews[5] = ll4R2L1Im3;

            imageViews[6] = ll4R3L1Im1;
            imageViews[7] = ll4R3L1Im2;
            imageViews[8] = ll4R3L1Im3;

            imageViews[9] = ll4R4L1Im1;
            imageViews[10] = ll4R4L1Im2;
            imageViews[11] = ll4R4L1Im3;

            imageViews[12] = ll4R5L1Im1;
            imageViews[13] = ll4R5L1Im2;
            imageViews[14] = ll4R5L1Im3;

            imageViews[15] = ll4R6L1Im1;
            imageViews[16] = ll4R6L1Im2;
            imageViews[17] = ll4R6L1Im3;

            imageViews[18] = ll4R7L1Im1;
            imageViews[19] = ll4R7L1Im2;
            imageViews[20] = ll4R7L1Im3;

            imageViews[21] = ll4R8L1Im1;
            imageViews[22] = ll4R8L1Im2;
            imageViews[23] = ll4R8L1Im3;

            imageViews[24] = ll4R9L1Im1;
            imageViews[25] = ll4R9L1Im2;
            imageViews[26] = ll4R9L1Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll4_r1_l2) {
            //linears
            linearLayouts[0] = ll4R1L2;
            linearLayouts[1] = ll4R2L2;
            linearLayouts[2] = ll4R3L2;
            linearLayouts[3] = ll4R4L2;
            linearLayouts[4] = ll4R5L2;
            linearLayouts[5] = ll4R6L2;
            linearLayouts[6] = ll4R7L2;
            linearLayouts[7] = ll4R8L2;
            linearLayouts[8] = ll4R9L2;
            //relatives
            relativeLayouts[0] = ll4R1;
            relativeLayouts[1] = ll4R2;
            relativeLayouts[2] = ll4R3;
            relativeLayouts[3] = ll4R4;
            relativeLayouts[4] = ll4R5;
            relativeLayouts[5] = ll4R6;
            relativeLayouts[6] = ll4R7;
            relativeLayouts[7] = ll4R8;
            relativeLayouts[8] = ll4R9;

            //images
            imageViews[0] = ll4R1L2Im1;
            imageViews[1] = ll4R1L2Im2;
            imageViews[2] = ll4R1L2Im3;

            imageViews[3] = ll4R2L2Im1;
            imageViews[4] = ll4R2L2Im2;
            imageViews[5] = ll4R2L2Im3;

            imageViews[6] = ll4R3L2Im1;
            imageViews[7] = ll4R3L2Im2;
            imageViews[8] = ll4R3L2Im3;

            imageViews[9] = ll4R4L2Im1;
            imageViews[10] = ll4R4L2Im2;
            imageViews[11] = ll4R4L2Im3;

            imageViews[12] = ll4R5L2Im1;
            imageViews[13] = ll4R5L2Im2;
            imageViews[14] = ll4R5L2Im3;

            imageViews[15] = ll4R6L2Im1;
            imageViews[16] = ll4R6L2Im2;
            imageViews[17] = ll4R6L2Im3;

            imageViews[18] = ll4R7L2Im1;
            imageViews[19] = ll4R7L2Im2;
            imageViews[20] = ll4R7L2Im3;

            imageViews[21] = ll4R8L2Im1;
            imageViews[22] = ll4R8L2Im2;
            imageViews[23] = ll4R8L2Im3;

            imageViews[24] = ll4R9L2Im1;
            imageViews[25] = ll4R9L2Im2;
            imageViews[26] = ll4R9L2Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll4_r1_l3) {
            //linears
            linearLayouts[0] = ll4R1L3;
            linearLayouts[1] = ll4R2L3;
            linearLayouts[2] = ll4R3L3;
            linearLayouts[3] = ll4R4L3;
            linearLayouts[4] = ll4R5L3;
            linearLayouts[5] = ll4R6L3;
            linearLayouts[6] = ll4R7L3;
            linearLayouts[7] = ll4R8L3;
            linearLayouts[8] = ll4R9L3;
            //relatives
            relativeLayouts[0] = ll4R1;
            relativeLayouts[1] = ll4R2;
            relativeLayouts[2] = ll4R3;
            relativeLayouts[3] = ll4R4;
            relativeLayouts[4] = ll4R5;
            relativeLayouts[5] = ll4R6;
            relativeLayouts[6] = ll4R7;
            relativeLayouts[7] = ll4R8;
            relativeLayouts[8] = ll4R9;

            //images
            imageViews[0] = ll4R1L3Im1;
            imageViews[1] = ll4R1L3Im2;
            imageViews[2] = ll4R1L3Im3;

            imageViews[3] = ll4R2L3Im1;
            imageViews[4] = ll4R2L3Im2;
            imageViews[5] = ll4R2L3Im3;

            imageViews[6] = ll4R3L3Im1;
            imageViews[7] = ll4R3L3Im2;
            imageViews[8] = ll4R3L3Im3;

            imageViews[9] = ll4R4L3Im1;
            imageViews[10] = ll4R4L3Im2;
            imageViews[11] = ll4R4L3Im3;

            imageViews[12] = ll4R5L3Im1;
            imageViews[13] = ll4R5L3Im2;
            imageViews[14] = ll4R5L3Im3;

            imageViews[15] = ll4R6L3Im1;
            imageViews[16] = ll4R6L3Im2;
            imageViews[17] = ll4R6L3Im3;

            imageViews[18] = ll4R7L3Im1;
            imageViews[19] = ll4R7L3Im2;
            imageViews[20] = ll4R7L3Im3;

            imageViews[21] = ll4R8L3Im1;
            imageViews[22] = ll4R8L3Im2;
            imageViews[23] = ll4R8L3Im3;

            imageViews[24] = ll4R9L3Im1;
            imageViews[25] = ll4R9L3Im2;
            imageViews[26] = ll4R9L3Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll5_r1_l1) {
            //linears
            linearLayouts[0] = ll5R1L1;
            linearLayouts[1] = ll5R2L1;
            linearLayouts[2] = ll5R3L1;
            linearLayouts[3] = ll5R4L1;
            linearLayouts[4] = ll5R5L1;
            linearLayouts[5] = ll5R6L1;
            linearLayouts[6] = ll5R7L1;
            linearLayouts[7] = ll5R8L1;
            linearLayouts[8] = ll5R9L1;
            //relatives
            relativeLayouts[0] = ll5R1;
            relativeLayouts[1] = ll5R2;
            relativeLayouts[2] = ll5R3;
            relativeLayouts[3] = ll5R4;
            relativeLayouts[4] = ll5R5;
            relativeLayouts[5] = ll5R6;
            relativeLayouts[6] = ll5R7;
            relativeLayouts[7] = ll5R8;
            relativeLayouts[8] = ll5R9;

            //images
            imageViews[0] = ll5R1L1Im1;
            imageViews[1] = ll5R1L1Im2;
            imageViews[2] = ll5R1L1Im3;

            imageViews[3] = ll5R2L1Im1;
            imageViews[4] = ll5R2L1Im2;
            imageViews[5] = ll5R2L1Im3;

            imageViews[6] = ll5R3L1Im1;
            imageViews[7] = ll5R3L1Im2;
            imageViews[8] = ll5R3L1Im3;

            imageViews[9] = ll5R4L1Im1;
            imageViews[10] = ll5R4L1Im2;
            imageViews[11] = ll5R4L1Im3;

            imageViews[12] = ll5R5L1Im1;
            imageViews[13] = ll5R5L1Im2;
            imageViews[14] = ll5R5L1Im3;

            imageViews[15] = ll5R6L1Im1;
            imageViews[16] = ll5R6L1Im2;
            imageViews[17] = ll5R6L1Im3;

            imageViews[18] = ll5R7L1Im1;
            imageViews[19] = ll5R7L1Im2;
            imageViews[20] = ll5R7L1Im3;

            imageViews[21] = ll5R8L1Im1;
            imageViews[22] = ll5R8L1Im2;
            imageViews[23] = ll5R8L1Im3;

            imageViews[24] = ll5R9L1Im1;
            imageViews[25] = ll5R9L1Im2;
            imageViews[26] = ll5R9L1Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll5_r1_l2) {
            //linears
            linearLayouts[0] = ll5R1L2;
            linearLayouts[1] = ll5R2L2;
            linearLayouts[2] = ll5R3L2;
            linearLayouts[3] = ll5R4L2;
            linearLayouts[4] = ll5R5L2;
            linearLayouts[5] = ll5R6L2;
            linearLayouts[6] = ll5R7L2;
            linearLayouts[7] = ll5R8L2;
            linearLayouts[8] = ll5R9L2;
            //relatives
            relativeLayouts[0] = ll5R1;
            relativeLayouts[1] = ll5R2;
            relativeLayouts[2] = ll5R3;
            relativeLayouts[3] = ll5R4;
            relativeLayouts[4] = ll5R5;
            relativeLayouts[5] = ll5R6;
            relativeLayouts[6] = ll5R7;
            relativeLayouts[7] = ll5R8;
            relativeLayouts[8] = ll5R9;

            //images
            imageViews[0] = ll5R1L2Im1;
            imageViews[1] = ll5R1L2Im2;
            imageViews[2] = ll5R1L2Im3;

            imageViews[3] = ll5R2L2Im1;
            imageViews[4] = ll5R2L2Im2;
            imageViews[5] = ll5R2L2Im3;

            imageViews[6] = ll5R3L2Im1;
            imageViews[7] = ll5R3L2Im2;
            imageViews[8] = ll5R3L2Im3;

            imageViews[9] = ll5R4L2Im1;
            imageViews[10] = ll5R4L2Im2;
            imageViews[11] = ll5R4L2Im3;

            imageViews[12] = ll5R5L2Im1;
            imageViews[13] = ll5R5L2Im2;
            imageViews[14] = ll5R5L2Im3;

            imageViews[15] = ll5R6L2Im1;
            imageViews[16] = ll5R6L2Im2;
            imageViews[17] = ll5R6L2Im3;

            imageViews[18] = ll5R7L2Im1;
            imageViews[19] = ll5R7L2Im2;
            imageViews[20] = ll5R7L2Im3;

            imageViews[21] = ll5R8L2Im1;
            imageViews[22] = ll5R8L2Im2;
            imageViews[23] = ll5R8L2Im3;

            imageViews[24] = ll5R9L2Im1;
            imageViews[25] = ll5R9L2Im2;
            imageViews[26] = ll5R9L2Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        } else if (id == R.id.ll5_r1_l3) {
            //linears
            linearLayouts[0] = ll5R1L3;
            linearLayouts[1] = ll5R2L3;
            linearLayouts[2] = ll5R3L3;
            linearLayouts[3] = ll5R4L3;
            linearLayouts[4] = ll5R5L3;
            linearLayouts[5] = ll5R6L3;
            linearLayouts[6] = ll5R7L3;
            linearLayouts[7] = ll5R8L3;
            linearLayouts[8] = ll5R9L3;
            //relatives
            relativeLayouts[0] = ll5R1;
            relativeLayouts[1] = ll5R2;
            relativeLayouts[2] = ll5R3;
            relativeLayouts[3] = ll5R4;
            relativeLayouts[4] = ll5R5;
            relativeLayouts[5] = ll5R6;
            relativeLayouts[6] = ll5R7;
            relativeLayouts[7] = ll5R8;
            relativeLayouts[8] = ll5R9;

            //images
            imageViews[0] = ll5R1L3Im1;
            imageViews[1] = ll5R1L3Im2;
            imageViews[2] = ll5R1L3Im3;

            imageViews[3] = ll5R2L3Im1;
            imageViews[4] = ll5R2L3Im2;
            imageViews[5] = ll5R2L3Im3;

            imageViews[6] = ll5R3L3Im1;
            imageViews[7] = ll5R3L3Im2;
            imageViews[8] = ll5R3L3Im3;

            imageViews[9] = ll5R4L3Im1;
            imageViews[10] = ll5R4L3Im2;
            imageViews[11] = ll5R4L3Im3;

            imageViews[12] = ll5R5L3Im1;
            imageViews[13] = ll5R5L3Im2;
            imageViews[14] = ll5R5L3Im3;

            imageViews[15] = ll5R6L3Im1;
            imageViews[16] = ll5R6L3Im2;
            imageViews[17] = ll5R6L3Im3;

            imageViews[18] = ll5R7L3Im1;
            imageViews[19] = ll5R7L3Im2;
            imageViews[20] = ll5R7L3Im3;

            imageViews[21] = ll5R8L3Im1;
            imageViews[22] = ll5R8L3Im2;
            imageViews[23] = ll5R8L3Im3;

            imageViews[24] = ll5R9L3Im1;
            imageViews[25] = ll5R9L3Im2;
            imageViews[26] = ll5R9L3Im3;
            decidePointerofColumns(y, spacing, relativeLayouts, imageViews, linearLayouts);
        }

    }

    void makeFirstRowVisible() {
        ll1R1L1.setVisibility(View.VISIBLE);
        ll1R2L1.setVisibility(View.VISIBLE);
        ll1R3L1.setVisibility(View.VISIBLE);
        ll1R4L1.setVisibility(View.VISIBLE);
        ll1R5L1.setVisibility(View.VISIBLE);
        ll1R6L1.setVisibility(View.VISIBLE);
        ll1R7L1.setVisibility(View.VISIBLE);
        ll1R8L1.setVisibility(View.VISIBLE);
        ll1R9L1.setVisibility(View.VISIBLE);
    }

    void makeSecondRowVisible() {
        ll1R1L2.setVisibility(View.VISIBLE);
        ll1R2L2.setVisibility(View.VISIBLE);
        ll1R3L2.setVisibility(View.VISIBLE);
        ll1R4L2.setVisibility(View.VISIBLE);
        ll1R5L2.setVisibility(View.VISIBLE);
        ll1R6L2.setVisibility(View.VISIBLE);
        ll1R7L2.setVisibility(View.VISIBLE);
        ll1R8L2.setVisibility(View.VISIBLE);
        ll1R9L2.setVisibility(View.VISIBLE);
    }

    void makeThirdRowVisible() {
        ll1R1L3.setVisibility(View.VISIBLE);
        ll1R2L3.setVisibility(View.VISIBLE);
        ll1R3L3.setVisibility(View.VISIBLE);
        ll1R4L3.setVisibility(View.VISIBLE);
        ll1R5L3.setVisibility(View.VISIBLE);
        ll1R6L3.setVisibility(View.VISIBLE);
        ll1R7L3.setVisibility(View.VISIBLE);
        ll1R8L3.setVisibility(View.VISIBLE);
        ll1R9L3.setVisibility(View.VISIBLE);
    }

    void makeFourthRowVisible() {
        ll2R1L1.setVisibility(View.VISIBLE);
        ll2R2L1.setVisibility(View.VISIBLE);
        ll2R3L1.setVisibility(View.VISIBLE);
        ll2R4L1.setVisibility(View.VISIBLE);
        ll2R5L1.setVisibility(View.VISIBLE);
        ll2R6L1.setVisibility(View.VISIBLE);
        ll2R7L1.setVisibility(View.VISIBLE);
        ll2R8L1.setVisibility(View.VISIBLE);
        ll2R9L1.setVisibility(View.VISIBLE);
    }

    void makeFifthRowVisible() {
        ll2R1L2.setVisibility(View.VISIBLE);
        ll2R2L2.setVisibility(View.VISIBLE);
        ll2R3L2.setVisibility(View.VISIBLE);
        ll2R4L2.setVisibility(View.VISIBLE);
        ll2R5L2.setVisibility(View.VISIBLE);
        ll2R6L2.setVisibility(View.VISIBLE);
        ll2R7L2.setVisibility(View.VISIBLE);
        ll2R8L2.setVisibility(View.VISIBLE);
        ll2R9L2.setVisibility(View.VISIBLE);
    }

    void makeSixthRowVisible() {
        ll2R1L3.setVisibility(View.VISIBLE);
        ll2R2L3.setVisibility(View.VISIBLE);
        ll2R3L3.setVisibility(View.VISIBLE);
        ll2R4L3.setVisibility(View.VISIBLE);
        ll2R5L3.setVisibility(View.VISIBLE);
        ll2R6L3.setVisibility(View.VISIBLE);
        ll2R7L3.setVisibility(View.VISIBLE);
        ll2R8L3.setVisibility(View.VISIBLE);
        ll2R9L3.setVisibility(View.VISIBLE);
    }

    void makeSeventhRowVisible() {
        ll3R1L1.setVisibility(View.VISIBLE);
        ll3R2L1.setVisibility(View.VISIBLE);
        ll3R3L1.setVisibility(View.VISIBLE);
        ll3R4L1.setVisibility(View.VISIBLE);
        ll3R5L1.setVisibility(View.VISIBLE);
        ll3R6L1.setVisibility(View.VISIBLE);
        ll3R7L1.setVisibility(View.VISIBLE);
        ll3R8L1.setVisibility(View.VISIBLE);
        ll3R9L1.setVisibility(View.VISIBLE);
    }

    void makeEighthRowVisible() {
        ll3R1L2.setVisibility(View.VISIBLE);
        ll3R2L2.setVisibility(View.VISIBLE);
        ll3R3L2.setVisibility(View.VISIBLE);
        ll3R4L2.setVisibility(View.VISIBLE);
        ll3R5L2.setVisibility(View.VISIBLE);
        ll3R6L2.setVisibility(View.VISIBLE);
        ll3R7L2.setVisibility(View.VISIBLE);
        ll3R8L2.setVisibility(View.VISIBLE);
        ll3R9L2.setVisibility(View.VISIBLE);
    }

    void makeNinethRowVisible() {
        ll3R1L3.setVisibility(View.VISIBLE);
        ll3R2L3.setVisibility(View.VISIBLE);
        ll3R3L3.setVisibility(View.VISIBLE);
        ll3R4L3.setVisibility(View.VISIBLE);
        ll3R5L3.setVisibility(View.VISIBLE);
        ll3R6L3.setVisibility(View.VISIBLE);
        ll3R7L3.setVisibility(View.VISIBLE);
        ll3R8L3.setVisibility(View.VISIBLE);
        ll3R9L3.setVisibility(View.VISIBLE);
    }

    void makeTenthRowVisible() {
        ll4R1L1.setVisibility(View.VISIBLE);
        ll4R2L1.setVisibility(View.VISIBLE);
        ll4R3L1.setVisibility(View.VISIBLE);
        ll4R4L1.setVisibility(View.VISIBLE);
        ll4R5L1.setVisibility(View.VISIBLE);
        ll4R6L1.setVisibility(View.VISIBLE);
        ll4R7L1.setVisibility(View.VISIBLE);
        ll4R8L1.setVisibility(View.VISIBLE);
        ll4R9L1.setVisibility(View.VISIBLE);
    }

    void makeEleventhRowVisible() {
        ll4R1L2.setVisibility(View.VISIBLE);
        ll4R2L2.setVisibility(View.VISIBLE);
        ll4R3L2.setVisibility(View.VISIBLE);
        ll4R4L2.setVisibility(View.VISIBLE);
        ll4R5L2.setVisibility(View.VISIBLE);
        ll4R6L2.setVisibility(View.VISIBLE);
        ll4R7L2.setVisibility(View.VISIBLE);
        ll4R8L2.setVisibility(View.VISIBLE);
        ll4R9L2.setVisibility(View.VISIBLE);
    }

    void makeTwelfthRowVisible() {
        ll4R1L3.setVisibility(View.VISIBLE);
        ll4R2L3.setVisibility(View.VISIBLE);
        ll4R3L3.setVisibility(View.VISIBLE);
        ll4R4L3.setVisibility(View.VISIBLE);
        ll4R5L3.setVisibility(View.VISIBLE);
        ll4R6L3.setVisibility(View.VISIBLE);
        ll4R7L3.setVisibility(View.VISIBLE);
        ll4R8L3.setVisibility(View.VISIBLE);
        ll4R9L3.setVisibility(View.VISIBLE);
    }

    void makeThirteenthRowVisible() {
        ll5R1L1.setVisibility(View.VISIBLE);
        ll5R2L1.setVisibility(View.VISIBLE);
        ll5R3L1.setVisibility(View.VISIBLE);
        ll5R4L1.setVisibility(View.VISIBLE);
        ll5R5L1.setVisibility(View.VISIBLE);
        ll5R6L1.setVisibility(View.VISIBLE);
        ll5R7L1.setVisibility(View.VISIBLE);
        ll5R8L1.setVisibility(View.VISIBLE);
        ll5R9L1.setVisibility(View.VISIBLE);
    }

    void makeFourteenthRowVisible() {
        ll5R1L2.setVisibility(View.VISIBLE);
        ll5R2L2.setVisibility(View.VISIBLE);
        ll5R3L2.setVisibility(View.VISIBLE);
        ll5R4L2.setVisibility(View.VISIBLE);
        ll5R5L2.setVisibility(View.VISIBLE);
        ll5R6L2.setVisibility(View.VISIBLE);
        ll5R7L2.setVisibility(View.VISIBLE);
        ll5R8L2.setVisibility(View.VISIBLE);
        ll5R9L2.setVisibility(View.VISIBLE);
    }

    void makeFifteenthRowVisible() {
        ll5R1L3.setVisibility(View.VISIBLE);
        ll5R2L3.setVisibility(View.VISIBLE);
        ll5R3L3.setVisibility(View.VISIBLE);
        ll5R4L3.setVisibility(View.VISIBLE);
        ll5R5L3.setVisibility(View.VISIBLE);
        ll5R6L3.setVisibility(View.VISIBLE);
        ll5R7L3.setVisibility(View.VISIBLE);
        ll5R8L3.setVisibility(View.VISIBLE);
        ll5R9L3.setVisibility(View.VISIBLE);
    }

    void makeBackgroundWhite(LinearLayout[] linearLayouts) {
        for (LinearLayout i : linearLayouts) {
            i.setBackgroundColor(getResources().getColor(R.color.white));
        }
        ll1R1.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R2.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R3.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R4.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R5.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R6.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R7.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R8.setBackgroundColor(getResources().getColor(R.color.white));
        ll1R9.setBackgroundColor(getResources().getColor(R.color.white));

        ll2R1.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R2.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R3.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R4.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R5.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R6.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R7.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R8.setBackgroundColor(getResources().getColor(R.color.white));
        ll2R9.setBackgroundColor(getResources().getColor(R.color.white));

        ll3R1.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R2.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R3.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R4.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R5.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R6.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R7.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R8.setBackgroundColor(getResources().getColor(R.color.white));
        ll3R9.setBackgroundColor(getResources().getColor(R.color.white));

        ll4R1.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R2.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R3.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R4.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R5.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R6.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R7.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R8.setBackgroundColor(getResources().getColor(R.color.white));
        ll4R9.setBackgroundColor(getResources().getColor(R.color.white));

        ll5R1.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R2.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R3.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R4.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R5.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R6.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R7.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R8.setBackgroundColor(getResources().getColor(R.color.white));
        ll5R9.setBackgroundColor(getResources().getColor(R.color.white));

    }

    void row(SensorEvent sensorEvent) {
        float x = sensorEvent.values[0];

        float space = (Math.abs(calibratedXTop - calibratedXDown)) / 15;
        Log.i("sabir", "top " + calibratedXTop + " down " + calibratedXDown + " space  " + space);

        if (x < calibratedXTop) {
            makeRowsUnVisible();
            makeFirstRowVisible();
            column(sensorEvent, ll1R1L1.getId());
        } else if (x > calibratedXTop && x < (calibratedXTop + space)) {
            makeRowsUnVisible();
            makeSecondRowVisible();
            column(sensorEvent, ll1R1L2.getId());
        } else if (x > (calibratedXTop + space) && x < (calibratedXTop + 2 * space)) {
            makeRowsUnVisible();
            makeThirdRowVisible();
            column(sensorEvent, ll1R1L3.getId());

        } else if (x > (calibratedXTop + 2 * space) && x < (calibratedXTop + 3 * space)) {
            makeRowsUnVisible();
            makeFourthRowVisible();
            column(sensorEvent, ll2R1L1.getId());

        } else if (x > (calibratedXTop + 3 * space) && x < (calibratedXTop + 4 * space)) {
            makeRowsUnVisible();
            makeFifthRowVisible();
            column(sensorEvent, ll2R1L2.getId());
        } else if (x > (calibratedXTop + 4 * space) && x < (calibratedXTop + 5 * space)) {
            makeRowsUnVisible();
            makeSixthRowVisible();
            column(sensorEvent, ll2R1L3.getId());
        } else if (x > (calibratedXTop + 5 * space) && x < (calibratedXTop + 6 * space)) {
            makeRowsUnVisible();
            makeSeventhRowVisible();
            column(sensorEvent, ll3R1L1.getId());
        } else if (x > (calibratedXTop + 6 * space) && x < (calibratedXTop + 7 * space)) {
            makeRowsUnVisible();
            makeEighthRowVisible();
            column(sensorEvent, ll3R1L2.getId());
        } else if (x > (calibratedXTop + 7 * space) && x < (calibratedXTop + 8 * space)) {
            makeRowsUnVisible();
            makeNinethRowVisible();
            column(sensorEvent, ll3R1L3.getId());
        } else if (x > (calibratedXTop + 8 * space) && x < (calibratedXTop + 9 * space)) {
            makeRowsUnVisible();
            makeTenthRowVisible();
            column(sensorEvent, ll4R1L1.getId());
        } else if (x > (calibratedXTop + 9 * space) && x < (calibratedXTop + 10 * space)) {
            makeRowsUnVisible();
            makeEleventhRowVisible();
            column(sensorEvent, ll4R1L2.getId());
        } else if (x > (calibratedXTop + 10 * space) && x < (calibratedXTop + 11 * space)) {
            makeRowsUnVisible();
            makeTwelfthRowVisible();
            column(sensorEvent, ll4R1L3.getId());
        } else if (x > (calibratedXTop + 11 * space) && x < (calibratedXTop + 12 * space)) {
            makeRowsUnVisible();
            makeThirteenthRowVisible();
            column(sensorEvent, ll5R1L1.getId());
        } else if (x > (calibratedXTop + 12 * space) && x < (calibratedXTop + 13 * space)) {
            makeRowsUnVisible();
            makeFourteenthRowVisible();
            column(sensorEvent, ll5R1L2.getId());
        } else if (x > (calibratedXTop + 13 * space) && x < (calibratedXTop + 14 * space)) {
            makeRowsUnVisible();
            makeFifteenthRowVisible();
            column(sensorEvent, ll5R1L3.getId());
        }
    }

    void makeRowsUnVisible() {

        ll1R1L1.setVisibility(View.INVISIBLE);
        ll1R2L1.setVisibility(View.INVISIBLE);
        ll1R3L1.setVisibility(View.INVISIBLE);
        ll1R4L1.setVisibility(View.INVISIBLE);
        ll1R5L1.setVisibility(View.INVISIBLE);
        ll1R6L1.setVisibility(View.INVISIBLE);
        ll1R7L1.setVisibility(View.INVISIBLE);
        ll1R8L1.setVisibility(View.INVISIBLE);
        ll1R9L1.setVisibility(View.INVISIBLE);

        ll1R1L2.setVisibility(View.INVISIBLE);
        ll1R2L2.setVisibility(View.INVISIBLE);
        ll1R3L2.setVisibility(View.INVISIBLE);
        ll1R4L2.setVisibility(View.INVISIBLE);
        ll1R5L2.setVisibility(View.INVISIBLE);
        ll1R6L2.setVisibility(View.INVISIBLE);
        ll1R7L2.setVisibility(View.INVISIBLE);
        ll1R8L2.setVisibility(View.INVISIBLE);
        ll1R9L2.setVisibility(View.INVISIBLE);

        ll1R1L3.setVisibility(View.INVISIBLE);
        ll1R2L3.setVisibility(View.INVISIBLE);
        ll1R3L3.setVisibility(View.INVISIBLE);
        ll1R4L3.setVisibility(View.INVISIBLE);
        ll1R5L3.setVisibility(View.INVISIBLE);
        ll1R6L3.setVisibility(View.INVISIBLE);
        ll1R7L3.setVisibility(View.INVISIBLE);
        ll1R8L3.setVisibility(View.INVISIBLE);
        ll1R9L3.setVisibility(View.INVISIBLE);

        ll2R1L1.setVisibility(View.INVISIBLE);
        ll2R2L1.setVisibility(View.INVISIBLE);
        ll2R3L1.setVisibility(View.INVISIBLE);
        ll2R4L1.setVisibility(View.INVISIBLE);
        ll2R5L1.setVisibility(View.INVISIBLE);
        ll2R6L1.setVisibility(View.INVISIBLE);
        ll2R7L1.setVisibility(View.INVISIBLE);
        ll2R8L1.setVisibility(View.INVISIBLE);
        ll2R9L1.setVisibility(View.INVISIBLE);

        ll2R1L2.setVisibility(View.INVISIBLE);
        ll2R2L2.setVisibility(View.INVISIBLE);
        ll2R3L2.setVisibility(View.INVISIBLE);
        ll2R4L2.setVisibility(View.INVISIBLE);
        ll2R5L2.setVisibility(View.INVISIBLE);
        ll2R6L2.setVisibility(View.INVISIBLE);
        ll2R7L2.setVisibility(View.INVISIBLE);
        ll2R8L2.setVisibility(View.INVISIBLE);
        ll2R9L2.setVisibility(View.INVISIBLE);

        ll2R1L3.setVisibility(View.INVISIBLE);
        ll2R2L3.setVisibility(View.INVISIBLE);
        ll2R3L3.setVisibility(View.INVISIBLE);
        ll2R4L3.setVisibility(View.INVISIBLE);
        ll2R5L3.setVisibility(View.INVISIBLE);
        ll2R6L3.setVisibility(View.INVISIBLE);
        ll2R7L3.setVisibility(View.INVISIBLE);
        ll2R8L3.setVisibility(View.INVISIBLE);
        ll2R9L3.setVisibility(View.INVISIBLE);

        ll3R1L1.setVisibility(View.INVISIBLE);
        ll3R2L1.setVisibility(View.INVISIBLE);
        ll3R3L1.setVisibility(View.INVISIBLE);
        ll3R4L1.setVisibility(View.INVISIBLE);
        ll3R5L1.setVisibility(View.INVISIBLE);
        ll3R6L1.setVisibility(View.INVISIBLE);
        ll3R7L1.setVisibility(View.INVISIBLE);
        ll3R8L1.setVisibility(View.INVISIBLE);
        ll3R9L1.setVisibility(View.INVISIBLE);

        ll3R1L2.setVisibility(View.INVISIBLE);
        ll3R2L2.setVisibility(View.INVISIBLE);
        ll3R3L2.setVisibility(View.INVISIBLE);
        ll3R4L2.setVisibility(View.INVISIBLE);
        ll3R5L2.setVisibility(View.INVISIBLE);
        ll3R6L2.setVisibility(View.INVISIBLE);
        ll3R7L2.setVisibility(View.INVISIBLE);
        ll3R8L2.setVisibility(View.INVISIBLE);
        ll3R9L2.setVisibility(View.INVISIBLE);

        ll3R1L3.setVisibility(View.INVISIBLE);
        ll3R2L3.setVisibility(View.INVISIBLE);
        ll3R3L3.setVisibility(View.INVISIBLE);
        ll3R4L3.setVisibility(View.INVISIBLE);
        ll3R5L3.setVisibility(View.INVISIBLE);
        ll3R6L3.setVisibility(View.INVISIBLE);
        ll3R7L3.setVisibility(View.INVISIBLE);
        ll3R8L3.setVisibility(View.INVISIBLE);
        ll3R9L3.setVisibility(View.INVISIBLE);

        ll4R1L1.setVisibility(View.INVISIBLE);
        ll4R2L1.setVisibility(View.INVISIBLE);
        ll4R3L1.setVisibility(View.INVISIBLE);
        ll4R4L1.setVisibility(View.INVISIBLE);
        ll4R5L1.setVisibility(View.INVISIBLE);
        ll4R6L1.setVisibility(View.INVISIBLE);
        ll4R7L1.setVisibility(View.INVISIBLE);
        ll4R8L1.setVisibility(View.INVISIBLE);
        ll4R9L1.setVisibility(View.INVISIBLE);

        ll4R1L2.setVisibility(View.INVISIBLE);
        ll4R2L2.setVisibility(View.INVISIBLE);
        ll4R3L2.setVisibility(View.INVISIBLE);
        ll4R4L2.setVisibility(View.INVISIBLE);
        ll4R5L2.setVisibility(View.INVISIBLE);
        ll4R6L2.setVisibility(View.INVISIBLE);
        ll4R7L2.setVisibility(View.INVISIBLE);
        ll4R8L2.setVisibility(View.INVISIBLE);
        ll4R9L2.setVisibility(View.INVISIBLE);

        ll4R1L3.setVisibility(View.INVISIBLE);
        ll4R2L3.setVisibility(View.INVISIBLE);
        ll4R3L3.setVisibility(View.INVISIBLE);
        ll4R4L3.setVisibility(View.INVISIBLE);
        ll4R5L3.setVisibility(View.INVISIBLE);
        ll4R6L3.setVisibility(View.INVISIBLE);
        ll4R7L3.setVisibility(View.INVISIBLE);
        ll4R8L3.setVisibility(View.INVISIBLE);
        ll4R9L3.setVisibility(View.INVISIBLE);

        ll5R1L1.setVisibility(View.INVISIBLE);
        ll5R2L1.setVisibility(View.INVISIBLE);
        ll5R3L1.setVisibility(View.INVISIBLE);
        ll5R4L1.setVisibility(View.INVISIBLE);
        ll5R5L1.setVisibility(View.INVISIBLE);
        ll5R6L1.setVisibility(View.INVISIBLE);
        ll5R7L1.setVisibility(View.INVISIBLE);
        ll5R8L1.setVisibility(View.INVISIBLE);
        ll5R9L1.setVisibility(View.INVISIBLE);

        ll5R1L2.setVisibility(View.INVISIBLE);
        ll5R2L2.setVisibility(View.INVISIBLE);
        ll5R3L2.setVisibility(View.INVISIBLE);
        ll5R4L2.setVisibility(View.INVISIBLE);
        ll5R5L2.setVisibility(View.INVISIBLE);
        ll5R6L2.setVisibility(View.INVISIBLE);
        ll5R7L2.setVisibility(View.INVISIBLE);
        ll5R8L2.setVisibility(View.INVISIBLE);
        ll5R9L2.setVisibility(View.INVISIBLE);

        ll5R1L3.setVisibility(View.INVISIBLE);
        ll5R2L3.setVisibility(View.INVISIBLE);
        ll5R3L3.setVisibility(View.INVISIBLE);
        ll5R4L3.setVisibility(View.INVISIBLE);
        ll5R5L3.setVisibility(View.INVISIBLE);
        ll5R6L3.setVisibility(View.INVISIBLE);
        ll5R7L3.setVisibility(View.INVISIBLE);
        ll5R8L3.setVisibility(View.INVISIBLE);
        ll5R9L3.setVisibility(View.INVISIBLE);
    }

    void makeColumnsUnVisible(ImageView[] imageViews) {

        for (ImageView i : imageViews) {
            i.setVisibility(View.INVISIBLE);
        }
    }

    void countShouldWordWrite(final int resorces, int cancelOrStart) {
        if (resorces == res) {
            return;
        } else if (resorces != res) {
            if (textCounter != null) {
                textCounter.cancel();
            }

            res = resorces;

            textCounter = new CountDownTimer(1200, 1000) {

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
        if (resorces == ll1R1.getId()) {
            res2 = resorces;
            arraylistText.add("0");
            writeText();
        } else if (resorces == ll1R2.getId()) {
            res2 = resorces;
            arraylistText.add("1");
            writeText();

        } else if (resorces == ll1R3.getId()) {
            res2 = resorces;
            arraylistText.add("2");
            writeText();
        } else if (resorces == ll1R4.getId()) {
            res2 = resorces;
            arraylistText.add("3");
            writeText();
        } else if (resorces == ll1R5.getId()) {
            res2 = resorces;
            arraylistText.add("4");
            writeText();
        } else if (resorces == ll1R6.getId()) {
            res2 = resorces;
            arraylistText.add("5");
            writeText();
        } else if (resorces == ll1R7.getId()) {
            res2 = resorces;
            arraylistText.add("6");
            writeText();
        } else if (resorces == ll1R8.getId()) {
            res2 = resorces;
            arraylistText.add("7");
            writeText();
        } else if (resorces == ll1R9.getId()) {
            res2 = resorces;
            arraylistText.add("8");
            writeText();
        } else if (resorces == ll2R1.getId()) {
            res2 = resorces;
            arraylistText.add("9");
            writeText();
        } else if (resorces == ll2R2.getId()) {
            res2 = resorces;
            arraylistText.add("a");
            writeText();
        } else if (resorces == ll2R3.getId()) {
            res2 = resorces;
            arraylistText.add("b");
            writeText();
        } else if (resorces == ll2R4.getId()) {
            res2 = resorces;
            arraylistText.add("c");
            writeText();
        } else if (resorces == ll2R5.getId()) {
            res2 = resorces;
            arraylistText.add("ç");
            writeText();
        } else if (resorces == ll2R6.getId()) {
            res2 = resorces;
            arraylistText.add("d");
            writeText();
        } else if (resorces == ll2R7.getId()) {
            res2 = resorces;
            arraylistText.add("e");
            writeText();
        } else if (resorces == ll2R8.getId()) {
            res2 = resorces;
            arraylistText.add("f");
            writeText();
        } else if (resorces == ll2R9.getId()) {
            res2 = resorces;
            arraylistText.add("g");
            writeText();
        } else if (resorces == ll3R1.getId()) {
            res2 = resorces;
            arraylistText.add("ğ");
            writeText();
        } else if (resorces == ll3R2.getId()) {
            res2 = resorces;
            arraylistText.add("h");
            writeText();
        } else if (resorces == ll3R3.getId()) {
            res2 = resorces;
            arraylistText.add("ı");
            writeText();
        } else if (resorces == ll3R4.getId()) {
            res2 = resorces;
            arraylistText.add("i");
            writeText();
        } else if (resorces == ll3R5.getId()) {
            res2 = resorces;
            arraylistText.add("j");
            writeText();
        } else if (resorces == ll3R6.getId()) {
            res2 = resorces;
            arraylistText.add("k");
            writeText();
        } else if (resorces == ll3R7.getId()) {
            res2 = resorces;
            arraylistText.add("l");
            writeText();
        } else if (resorces == ll3R8.getId()) {
            res2 = resorces;
            arraylistText.add("");
            writeText();
        } else if (resorces == ll3R9.getId()) {
            res2 = resorces;
            arraylistText.remove(arraylistText.size() - 1);
            writeText();
        } else if (resorces == ll4R1.getId()) {
            res2 = resorces;
            arraylistText.add("m");
            writeText();
        } else if (resorces == ll4R2.getId()) {
            res2 = resorces;
            arraylistText.add("n");
            writeText();
        } else if (resorces == ll4R3.getId()) {
            res2 = resorces;
            arraylistText.add("o");
            writeText();
        } else if (resorces == ll4R4.getId()) {
            res2 = resorces;
            arraylistText.add("ö");
            writeText();
        } else if (resorces == ll4R5.getId()) {
            res2 = resorces;
            arraylistText.add("p");
            writeText();
        } else if (resorces == ll4R6.getId()) {
            res2 = resorces;
            arraylistText.add("r");
            writeText();
        } else if (resorces == ll4R7.getId()) {
            res2 = resorces;
            arraylistText.add("s");
            writeText();
        } else if (resorces == ll4R8.getId()) {
            res2 = resorces;
            arraylistText.add("  ");
            writeText();
        } else if (resorces == ll4R9.getId()) {
            res2 = resorces;
            isSpeak = true;
            writeText();
        } else if (resorces == ll5R1.getId()) {
            res2 = resorces;
            arraylistText.add("ş");
            writeText();
        } else if (resorces == ll5R2.getId()) {
            res2 = resorces;
            arraylistText.add("t");
            writeText();
        } else if (resorces == ll5R3.getId()) {
            res2 = resorces;
            arraylistText.add("u");
            writeText();
        } else if (resorces == ll5R4.getId()) {
            res2 = resorces;
            arraylistText.add("ü");
            writeText();
        } else if (resorces == ll5R5.getId()) {
            res2 = resorces;
            arraylistText.add("v");
            writeText();
        } else if (resorces == ll5R6.getId()) {
            res2 = resorces;
            arraylistText.add("y");
            writeText();
        } else if (resorces == ll5R7.getId()) {
            res2 = resorces;
            arraylistText.add("z");
            writeText();
        } else if (resorces == ll5R8.getId()) {
            res2 = resorces;
            arraylistText.add(".");
            writeText();
        } else if (resorces == ll5R9.getId()) {
            res2 = resorces;
            finish();
        }
    }

    void writeText() {
        ArrayList<String> split = new ArrayList<>();
        if (arraylistText.size() != 0) {
            String string = "";
            for (int i = 0; i < arraylistText.size(); i++) {
                string += arraylistText.get(i);
            }

            textTv.setText(" >> : " + string);

            if (isSpeak) {
                speak(string);
                isSpeak = false;
            }

        } else {
            textTv.setText(">> : birşeyler yazın...");
        }

    }

    void listenBackgrounds() {
        if (((ColorDrawable) ll1R1.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R1.getId(), 1);
        } else if (((ColorDrawable) ll1R2.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R2.getId(), 1);
        } else if (((ColorDrawable) ll1R3.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R3.getId(), 1);
        } else if (((ColorDrawable) ll1R4.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R4.getId(), 1);
        } else if (((ColorDrawable) ll1R5.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R5.getId(), 1);
        } else if (((ColorDrawable) ll1R6.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R6.getId(), 1);
        } else if (((ColorDrawable) ll1R7.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R7.getId(), 1);
        } else if (((ColorDrawable) ll1R8.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R8.getId(), 1);
        } else if (((ColorDrawable) ll1R9.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll1R9.getId(), 1);
        }


        if (((ColorDrawable) ll2R1.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R1.getId(), 1);
        } else if (((ColorDrawable) ll2R2.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R2.getId(), 1);
        } else if (((ColorDrawable) ll2R3.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R3.getId(), 1);
        } else if (((ColorDrawable) ll2R4.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R4.getId(), 1);
        } else if (((ColorDrawable) ll2R5.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R5.getId(), 1);
        } else if (((ColorDrawable) ll2R6.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R6.getId(), 1);
        } else if (((ColorDrawable) ll2R7.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R7.getId(), 1);
        } else if (((ColorDrawable) ll2R8.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R8.getId(), 1);
        } else if (((ColorDrawable) ll2R9.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll2R9.getId(), 1);
        }


        if (((ColorDrawable) ll3R1.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R1.getId(), 1);
        } else if (((ColorDrawable) ll3R2.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R2.getId(), 1);
        } else if (((ColorDrawable) ll3R3.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R3.getId(), 1);
        } else if (((ColorDrawable) ll3R4.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R4.getId(), 1);
        } else if (((ColorDrawable) ll3R5.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R5.getId(), 1);
        } else if (((ColorDrawable) ll3R6.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R6.getId(), 1);
        } else if (((ColorDrawable) ll3R7.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R7.getId(), 1);
        } else if (((ColorDrawable) ll3R8.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R8.getId(), 1);
        } else if (((ColorDrawable) ll3R9.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll3R9.getId(), 1);
        }


        if (((ColorDrawable) ll4R1.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R1.getId(), 1);
        } else if (((ColorDrawable) ll4R2.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R2.getId(), 1);
        } else if (((ColorDrawable) ll4R3.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R3.getId(), 1);
        } else if (((ColorDrawable) ll4R4.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R4.getId(), 1);
        } else if (((ColorDrawable) ll4R5.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R5.getId(), 1);
        } else if (((ColorDrawable) ll4R6.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R6.getId(), 1);
        } else if (((ColorDrawable) ll4R7.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R7.getId(), 1);
        } else if (((ColorDrawable) ll4R8.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R8.getId(), 1);
        } else if (((ColorDrawable) ll4R9.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll4R9.getId(), 1);
        }


        if (((ColorDrawable) ll5R1.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R1.getId(), 1);
        } else if (((ColorDrawable) ll5R2.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R2.getId(), 1);
        } else if (((ColorDrawable) ll5R3.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R3.getId(), 1);
        } else if (((ColorDrawable) ll5R4.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R4.getId(), 1);
        } else if (((ColorDrawable) ll5R5.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R5.getId(), 1);
        } else if (((ColorDrawable) ll5R6.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R6.getId(), 1);
        } else if (((ColorDrawable) ll5R7.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R7.getId(), 1);
        } else if (((ColorDrawable) ll5R8.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R8.getId(), 1);
        } else if (((ColorDrawable) ll5R9.getBackground()).getColor() == getResources().getColor(R.color.pairblue)) {
            countShouldWordWrite(ll5R9.getId(), 1);
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
    protected void onStop() {
        super.onStop();
        textToSpeech.stop();
        textToSpeech.shutdown();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textToSpeech.stop();
        textToSpeech.shutdown();
    }

}
