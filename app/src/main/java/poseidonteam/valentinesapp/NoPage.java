package poseidonteam.valentinesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class NoPage extends AppCompatActivity {

    private Button button;
    private CheckBox[] checkBoxen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_page);

        button = (Button) findViewById(R.id.button2);
        checkBoxen = new CheckBox[]{
                (CheckBox) findViewById(R.id.checkBox4),
                (CheckBox) findViewById(R.id.checkBox5),
                (CheckBox) findViewById(R.id.checkBox6)
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondStep();
            }
        });

        for (int i = 0; i < checkBoxen.length; i++) {
            checkBoxen[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    boolean allChecked = true;
                    for (int j = 0; j < checkBoxen.length; j++) {
                        if (!checkBoxen[j].isChecked()) {
                            allChecked = false;
                        }
                    }

                    button.setEnabled(allChecked);
                }
            });
        }

        button.setEnabled(false);
    }


    public void openSecondStep() {
        Intent intent = new Intent(this, YesPage.class);
        startActivity(intent);
    }

}