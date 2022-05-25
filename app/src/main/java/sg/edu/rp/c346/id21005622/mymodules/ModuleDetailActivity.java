package sg.edu.rp.c346.id21005622.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCred;
    TextView tvVenue;
    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCred = findViewById(R.id.textViewCred);
        tvVenue = findViewById(R.id.textViewVenue);
        btBack = findViewById(R.id.buttonBack);

        String code = "Module Code: ";
        String name = "Module Name: ";
        String year = "Academic Year: ";
        String sem = "Semester: ";
        String cred = "Module Credit: ";
        String venue = "Venue: ";

        Intent intentReceived = getIntent();
        String moduleSelected =intentReceived.getStringExtra("Module");

        if (moduleSelected.equalsIgnoreCase("AP")){
            tvCode.setText(code + "C346");
            tvName.setText(name + "Android Programming");
            tvYear.setText(year + "2022");
            tvSem.setText(sem + "1");
            tvCred.setText(cred + "4");
            tvVenue.setText(venue + "E62E");
        }
        else if (moduleSelected.equalsIgnoreCase("ITSM")){
            tvCode.setText(code + "C235");
            tvName.setText(name + "IT Security and Management");
            tvYear.setText(year + "2022");
            tvSem.setText(sem + "1");
            tvCred.setText(cred + "4");
            tvVenue.setText(venue + "E65H");
        }
        else if (moduleSelected.equalsIgnoreCase("WAD")){
            tvCode.setText(code + "C203");
            tvName.setText(name + "Web Appln Development in php");
            tvYear.setText(year + "2022");
            tvSem.setText(sem + "1");
            tvCred.setText(cred + "4");
            tvVenue.setText(venue + "W65H");
        }
        else if (moduleSelected.equalsIgnoreCase("SDP")){
            tvCode.setText(code + "C206");
            tvName.setText(name + "Software Development Process");
            tvYear.setText(year + "2022");
            tvSem.setText(sem + "1");
            tvCred.setText(cred + "4");
            tvVenue.setText(venue + "C206");
        }
        else if (moduleSelected.equalsIgnoreCase("UIUX")){
            tvCode.setText(code + "C218");
            tvName.setText(name + "UI/UX Design for Apps");
            tvYear.setText(year + "2022");
            tvSem.setText(sem + "1");
            tvCred.setText(cred + "4");
            tvVenue.setText(venue + "E66B");
        }
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}