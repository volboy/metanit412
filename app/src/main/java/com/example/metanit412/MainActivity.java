package com.example.metanit412;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radio=findViewById(R.id.radio);
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                TextView selection=findViewById(R.id.selection);

                switch (checkedId){
                    case R.id.Java:
                        selection.setText("Java");
                        break;
                    case R.id.JavaScript:
                        selection.setText("JavaScript");
                        break;
                }
            }
        });
    }

    public void onRadioButtonClicked (View view){
        //если переключатель отмечен
        boolean checked=((RadioButton)view).isChecked();
        TextView selection=findViewById(R.id.selection);
        //Получаем нажатый переключатель
        switch (view.getId()){
            case R.id.Java:
                if (checked){
                    selection.setText("Java");
                }
                break;
            case R.id.JavaScript:
                if (checked){
                    selection.setText("JavaScript");
                }
                break;

        }


    }
}
