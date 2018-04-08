package constraintdemo.androidacademia.com.logindemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etUN,etPass;
    private TextView textViewFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUN= findViewById(R.id.editTextUN);
        etPass= findViewById(R.id.editTextUP);
        textViewFont = findViewById(R.id.textViewFont);
        Log.i("MainActivity","onCreate()");
        //Locale locale = Locale.getDefault();
        //locale.getLanguage()
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mypersonal.ttf");
        textViewFont.setTypeface(typeface);
    }

    public void login(View view) {
        String user=etUN.getText().toString();
        String pass= etPass.getText().toString();

        if (user.isEmpty() || pass.isEmpty()){
            //
            Log.i("MainActivity","Empty Field");
        }else if (user.equals("girish") && pass.equals("123456")){
            //Use Intent
            //Intent intent = new Intent(MainActivity.this,WelcomeActivity.class) ;
            Intent intent = new Intent("constraintdemo.androidacademia.com.logindemo.LOGIN");
            intent.putExtra("u",user);
            intent.putExtra("p",pass);
            startActivity(intent);


        }else {
            Log.i("MainActivity","Wrong username of password");

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy()");
    }
}
