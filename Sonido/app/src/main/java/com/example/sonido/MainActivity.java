package com.example.sonido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_sonido_arpia;
    Button btn_sonido_elefante;
    Button btn_sonido_gorila;
    Button btn_sonido_jaguar;
    Button btn_sonido_lemur;
    Button btn_sonido_leon;
    Button btn_sonido_mono;
    Button btn_sonido_oso;
    Button btn_sonido_tigre;
    Button btn_sonido_tucan;
    SoundPool soundPool_1;
    SoundPool soundPool_2;
    SoundPool soundPool_3;
    SoundPool soundPool_4;
    SoundPool soundPool_5;
    SoundPool soundPool_6;
    SoundPool soundPool_7;
    SoundPool soundPool_8;
    SoundPool soundPool_9;
    SoundPool soundPool_10;
    int audio_1,audio_2,audio_3,audio_4,audio_5,audio_6,audio_7,audio_8,audio_9,audio_10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_sonido_arpia=(Button) findViewById(R.id.btn_arpia);
        btn_sonido_elefante=(Button) findViewById(R.id.btn_elefante);
        btn_sonido_gorila=(Button) findViewById(R.id.btn_gorila);
        btn_sonido_jaguar=(Button) findViewById(R.id.btn_jaguar);
        btn_sonido_lemur=(Button) findViewById(R.id.btn_lemur);
        btn_sonido_leon=(Button) findViewById(R.id.btn_leon);
        btn_sonido_mono=(Button) findViewById(R.id.btn_mono);
        btn_sonido_oso=(Button) findViewById(R.id.btn_oso);
        btn_sonido_tigre=(Button) findViewById(R.id.btn_tigre);
        btn_sonido_tucan=(Button) findViewById(R.id.btn_tucan);


        soundPool_1 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_1 =soundPool_1.load(this,R.raw.aguila,1);
        soundPool_2 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_2 =soundPool_2.load(this,R.raw.elefante,1);
        soundPool_3 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_3 =soundPool_3.load(this,R.raw.gorila,1);
        soundPool_4 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_4=soundPool_4.load(this,R.raw.jaguar,1);
        soundPool_5 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_5 =soundPool_5.load(this,R.raw.lemur,1);
        soundPool_6 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_6 =soundPool_6.load(this,R.raw.leon,1);
        soundPool_7 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_7 =soundPool_7.load(this,R.raw.mono,1);
        soundPool_8=new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_8 =soundPool_8.load(this,R.raw.oso,1);
        soundPool_9 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_9 =soundPool_9.load(this,R.raw.tigre,1);
        soundPool_10 =new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        audio_10 =soundPool_10.load(this,R.raw.tucan,1);




    }

    public void reproductorSonido1(View view){
        soundPool_1.play(audio_1,1,1,1,0,0);
    }
    public void reproductorSonido2(View view){
        soundPool_2.play(audio_2,1,1,1,0,0);
    }
    public void reproductorSonido3(View view){
        soundPool_3.play(audio_3,1,1,1,0,0);
    }
    public void reproductorSonido4(View view){
        soundPool_4.play(audio_4,1,1,1,0,0);
    }
    public void reproductorSonido5(View view){
        soundPool_5.play(audio_5,1,1,1,0,0);
    }
    public void reproductorSonido6(View view){
        soundPool_6.play(audio_6,1,1,1,0,0);
    }
    public void reproductorSonido7(View view){
        soundPool_7.play(audio_7,1,1,1,0,0);
    }
    public void reproductorSonido8(View view){
        soundPool_8.play(audio_8,1,1,1,0,0);
    }
    public void reproductorSonido9(View view){
        soundPool_9.play(audio_9,1,1,1,0,0);
    }
    public  void  reproductorSonido10(View view){
        soundPool_10.play(audio_10, 1,1,1,0,0);
    }
}