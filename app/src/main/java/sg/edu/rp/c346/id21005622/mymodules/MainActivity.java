package sg.edu.rp.c346.id21005622.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAP;
    TextView tvITSM;
    TextView tvWAD;
    TextView tvSDP;
    TextView tvUIUX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAP = findViewById(R.id.textViewAP);
        tvITSM = findViewById(R.id.textViewITSM);
        tvWAD = findViewById(R.id.textViewWAD);
        tvSDP = findViewById(R.id.textViewSDP);
        tvUIUX = findViewById(R.id.textViewUIUX);

        tvAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "AP");
                startActivity(intent);
            }
        });
        tvITSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "ITSM");
                startActivity(intent);
            }
        });
        tvWAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "WAD");
                startActivity(intent);
            }
        });
        tvSDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "SDP");
                startActivity(intent);
            }
        });
        tvUIUX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "UIUX");
                startActivity(intent);
            }
        });
    }
}