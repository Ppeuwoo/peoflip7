package ore.techtown.peoflip_7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Github push test1

    private Button main_btn;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_btn = findViewById(R.id.main_btn);
        main_btn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

            main_btn = findViewById(R.id.button2);
            main_btn.setOnClickListener(singleView -> {
                Intent myintent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(myintent);
            });
        });
    }
}





//        Button button = (Button) findViewById(R.id.main_btn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//                startActivity(intent);
//            }
//        });

