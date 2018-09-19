package sv.edu.catolica.lab2_elmer_victor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ahorros_figueroa_padilla extends AppCompatActivity {

    EditText etMonto;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    Button btnCalcular;
    TextView tvInteres;
    TextView tvSaldo;
    String interes;
    String saldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahorros_figueroa_padilla);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvInteres.setText(calcularInteres());
                tvSaldo.setText(calcularSaldo());
            }
        });
    }

    protected String calcularInteres(){
        if(rb1.isChecked()==true){
            DecimalFormat df = new DecimalFormat("#.00");
            interes=df.format(Double.parseDouble(etMonto.getText().toString())*0.02);
        }
        else if(rb2.isChecked()) {
            DecimalFormat df = new DecimalFormat("#.00");
            interes=df.format(Double.parseDouble(etMonto.getText().toString())*0.03);
        }
        else if(rb3.isChecked()){
            DecimalFormat df = new DecimalFormat("#.00");
            interes=df.format(Double.parseDouble(etMonto.getText().toString())*0.05);
        }
        else if(rb4.isChecked()){
            DecimalFormat df = new DecimalFormat("#.00");
            interes=df.format(Double.parseDouble(etMonto.getText().toString())*0.07);
        }
        else{
            interes="Error";
        }
        return interes;
    }

    protected String calcularSaldo(){
        if(rb1.isChecked()==true){
            DecimalFormat df = new DecimalFormat("#.00");
            saldo=df.format(Double.parseDouble(etMonto.getText().toString())*1.02);
        }
        else if(rb2.isChecked()) {
            DecimalFormat df = new DecimalFormat("#.00");
            saldo=df.format(Double.parseDouble(etMonto.getText().toString())*1.03);
        }
        else if(rb3.isChecked()){
            DecimalFormat df = new DecimalFormat("#.00");
            saldo=df.format(Double.parseDouble(etMonto.getText().toString())*1.05);
        }
        else if(rb4.isChecked()){
            DecimalFormat df = new DecimalFormat("#.00");
            saldo=df.format(Double.parseDouble(etMonto.getText().toString())*1.07);
        }
        else{
            saldo="Error";
        }
        return saldo;
    }
}
