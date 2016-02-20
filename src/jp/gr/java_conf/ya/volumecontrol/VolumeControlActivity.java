package jp.gr.java_conf.ya.volumecontrol; // Copyright (c) 2012-2016 YA <ya.androidapp@gmail.com> All rights reserved.

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class VolumeControlActivity extends Activity {
    SeekBar seekBar01;
    SeekBar seekBar02;
    SeekBar seekBar03;
    SeekBar seekBar04;
    SeekBar seekBar05;
    SeekBar seekBar06;

    TextView tv01;
    TextView tv02;
    TextView tv03;
    TextView tv04;
    TextView tv05;
    TextView tv06;

    Button btn01;
    Button btn02;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        int vol01 = am.getStreamVolume(AudioManager.STREAM_ALARM);
        int vol02 = am.getStreamVolume(AudioManager.STREAM_MUSIC);
        int vol03 = am.getStreamVolume(AudioManager.STREAM_NOTIFICATION);
        int vol04 = am.getStreamVolume(AudioManager.STREAM_RING);
        int vol05 = am.getStreamVolume(AudioManager.STREAM_SYSTEM);
        int vol06 = am.getStreamVolume(AudioManager.STREAM_VOICE_CALL);

        final int vol11 = am.getStreamMaxVolume(AudioManager.STREAM_ALARM);
        final int vol12 = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final int vol13 = am.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);
        final int vol14 = am.getStreamMaxVolume(AudioManager.STREAM_RING);
        final int vol15 = am.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);
        final int vol16 = am.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL);

        seekBar01 = (SeekBar)findViewById(R.id.SeekBar01);
        seekBar01.setMax(vol11);
        seekBar01.setProgress(vol01);
        seekBar02 = (SeekBar)findViewById(R.id.SeekBar02);
        seekBar02.setMax(vol12);
        seekBar02.setProgress(vol02);
        seekBar03 = (SeekBar)findViewById(R.id.SeekBar03);
        seekBar03.setMax(vol13);
        seekBar03.setProgress(vol03);
        seekBar04 = (SeekBar)findViewById(R.id.SeekBar04);
        seekBar04.setMax(vol14);
        seekBar04.setProgress(vol04);
        seekBar05 = (SeekBar)findViewById(R.id.SeekBar05);
        seekBar05.setMax(vol15);
        seekBar05.setProgress(vol05);
        seekBar06 = (SeekBar)findViewById(R.id.SeekBar06);
        seekBar06.setMax(vol16);
        seekBar06.setProgress(vol06);
        btn01 = (Button)findViewById(R.id.button1);
        btn02 = (Button)findViewById(R.id.button2);

        tv01 = (TextView)findViewById(R.id.TextView01);
        tv01.setText("Alarm:"+String.valueOf(vol01)+"/"+String.valueOf(vol11));
        tv02 = (TextView)findViewById(R.id.TextView02);
        tv02.setText("Music:"+String.valueOf(vol02)+"/"+String.valueOf(vol12));
        tv03 = (TextView)findViewById(R.id.TextView03);
        tv03.setText("Notification:"+String.valueOf(vol03)+"/"+String.valueOf(vol13));
        tv04 = (TextView)findViewById(R.id.TextView04);
        tv04.setText("Ring:"+String.valueOf(vol04)+"/"+String.valueOf(vol14));
        tv05 = (TextView)findViewById(R.id.TextView05);
        tv05.setText("System:"+String.valueOf(vol05)+"/"+String.valueOf(vol15));
        tv06 = (TextView)findViewById(R.id.TextView06);
        tv06.setText("Call:"+String.valueOf(vol06)+"/"+String.valueOf(vol16));

        seekBar01.setOnSeekBarChangeListener( new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar01, int progress01, boolean fromUser) {
                tv01.setText("Alarm:"+String.valueOf(progress01)+"/"+String.valueOf(vol11));
                am.setStreamVolume(AudioManager.STREAM_ALARM, progress01, 0);
            }
            public void onStartTrackingTouch(SeekBar seekBar01) {  }
            public void onStopTrackingTouch(SeekBar seekBar01) {  }
        });

        seekBar02.setOnSeekBarChangeListener( new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar02, int progress02, boolean fromUser) {
                tv02.setText("Music:"+String.valueOf(progress02)+"/"+String.valueOf(vol12));
                am.setStreamVolume(AudioManager.STREAM_MUSIC, progress02, 0);
            }
            public void onStartTrackingTouch(SeekBar seekBar02) {  }
            public void onStopTrackingTouch(SeekBar seekBar02) {  }
        });

        seekBar03.setOnSeekBarChangeListener( new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar03, int progress03, boolean fromUser) {
                tv03.setText("Notification:"+String.valueOf(progress03)+"/"+String.valueOf(vol13));
                am.setStreamVolume(AudioManager.STREAM_NOTIFICATION, progress03, 0);
            }
            public void onStartTrackingTouch(SeekBar seekBar03) {  }
            public void onStopTrackingTouch(SeekBar seekBar03) {  }
        });

        seekBar04.setOnSeekBarChangeListener( new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar04, int progress04, boolean fromUser) {
                tv04.setText("Ring:"+String.valueOf(progress04)+"/"+String.valueOf(vol14));
                am.setStreamVolume(AudioManager.STREAM_RING, progress04, 0);
            }
            public void onStartTrackingTouch(SeekBar seekBar04) {  }
            public void onStopTrackingTouch(SeekBar seekBar04) {  }
        });

        seekBar05.setOnSeekBarChangeListener( new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar05, int progress05, boolean fromUser) {
                tv05.setText("System:"+String.valueOf(progress05)+"/"+String.valueOf(vol15));
                am.setStreamVolume(AudioManager.STREAM_SYSTEM, progress05, 0);
            }
            public void onStartTrackingTouch(SeekBar seekBar05) {  }
            public void onStopTrackingTouch(SeekBar seekBar05) {  }
        });

        seekBar06.setOnSeekBarChangeListener( new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar06, int progress06, boolean fromUser) {
                tv06.setText("Call:"+String.valueOf(progress06)+"/"+String.valueOf(vol16));
                am.setStreamVolume(AudioManager.STREAM_VOICE_CALL, progress06, 0);
            }
            public void onStartTrackingTouch(SeekBar seekBar06) {  }
            public void onStopTrackingTouch(SeekBar seekBar06) {  }
        });

        btn01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                seekBar01.setProgress(0);
                tv01.setText("Alarm:0/"+String.valueOf(vol11));
                am.setStreamVolume(AudioManager.STREAM_ALARM, 0, 0);

                seekBar02.setProgress(0);
                tv02.setText("Music:0/"+String.valueOf(vol12));
                am.setStreamVolume(AudioManager.STREAM_MUSIC, 0, 0);

                seekBar03.setProgress(0);
                tv03.setText("Notification:0/"+String.valueOf(vol13));
                am.setStreamVolume(AudioManager.STREAM_NOTIFICATION, 0, 0);

                seekBar04.setProgress(0);
                tv04.setText("Ring:0/"+String.valueOf(vol14));
                am.setStreamVolume(AudioManager.STREAM_RING, 0, 0);

                seekBar05.setProgress(0);
                tv05.setText("System:0/"+String.valueOf(vol15));
                am.setStreamVolume(AudioManager.STREAM_SYSTEM, 0, 0);

                seekBar06.setProgress(0);
                tv06.setText("Call:0/"+String.valueOf(vol16));
                am.setStreamVolume(AudioManager.STREAM_VOICE_CALL, 0, 0);
            }
        });

        btn02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                seekBar01.setProgress(vol11);
                tv01.setText("Alarm:"+String.valueOf(vol11)+"/"+String.valueOf(vol11));
                am.setStreamVolume(AudioManager.STREAM_ALARM, vol11, 0);

                seekBar02.setProgress(vol12);
                tv02.setText("Music:"+String.valueOf(vol12)+"/"+String.valueOf(vol12));
                am.setStreamVolume(AudioManager.STREAM_MUSIC, vol12, 0);

                seekBar03.setProgress(vol13);
                tv03.setText("Notification:"+String.valueOf(vol13)+"/"+String.valueOf(vol13));
                am.setStreamVolume(AudioManager.STREAM_NOTIFICATION, vol13, 0);

                seekBar04.setProgress(vol14);
                tv04.setText("Ring:"+String.valueOf(vol14)+"/"+String.valueOf(vol14));
                am.setStreamVolume(AudioManager.STREAM_RING, vol14, 0);

                seekBar05.setProgress(vol15);
                tv05.setText("System:"+String.valueOf(vol15)+"/"+String.valueOf(vol15));
                am.setStreamVolume(AudioManager.STREAM_SYSTEM, vol15, 0);

                seekBar06.setProgress(vol16);
                tv06.setText("Call:"+String.valueOf(vol16)+"/"+String.valueOf(vol16));
                am.setStreamVolume(AudioManager.STREAM_VOICE_CALL, vol16, 0);
            }
        });
    }
}