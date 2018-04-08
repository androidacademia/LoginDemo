package constraintdemo.androidacademia.com.logindemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView  textViewWelcome;
    private EditText editTextURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("WelcomeActivity","onCreate()");
        setContentView(R.layout.activity_welcome);
        textViewWelcome = findViewById(R.id.textView);
        editTextURL = findViewById(R.id.editTextURL);

        Intent intent = getIntent();
        String user=intent.getStringExtra("u");
        String pass = intent.getStringExtra("p");
        String welcomeStr = getResources().getString(R.string.welcome,user,pass);

        textViewWelcome.setText(welcomeStr);
    }

    public void openInBrowser(View view) {
        String urlStr = editTextURL.getText().toString();
        Uri uri = Uri.parse(urlStr);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WelcomeActivity","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WelcomeActivity","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WelcomeActivity","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WelcomeActivity","onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("WelcomeActivity","onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WelcomeActivity","onDestroy()");
    }
}
