package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;

    private String valorA;
    private String valorB;
    private boolean valorASet;
    private int modo;
    private String modoText;
    private float resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);

        valorA = 0+"";
        valorB = 0+"";
        valorASet = false;
        modo = 1;
        modoText = "+";
        resultado = 0;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_clear:
                clear();
                break;
            case R.id.btn_igual:
                igual();
                break;
            case R.id.btn_dividir:
                dividir();
                break;
            case R.id.btn_multiplicar:
                multiplicar();
                break;
            case R.id.btn_sumar:
                sumar();
                break;
            case R.id.btn_restar:
                restar();
                break;
            case R.id.btn_cero:
                cero();
                break;
            case R.id.btn_uno:
                uno();
                break;
            case R.id.btn_dos:
                dos();
                break;
            case R.id.btn_tres:
                tres();
                break;
            case R.id.btn_cuatro:
                cuatro();
                break;
            case R.id.btn_cinco:
                cinco();
                break;
            case R.id.btn_seis:
                seis();
                break;
            case R.id.btn_siete:
                siete();
                break;
            case R.id.btn_ocho:
                ocho();
                break;
            case R.id.btn_nueve:
                nueve();
                break;
            default:
                break;
        }
    }
    public void clear(){
        textView.setText("");
        valorA = 0+"";
        valorB = 0+"";
        valorASet = false;
        resultado = 0;
    }
    public void igual(){
        if(valorA.equals("0") && valorB.equals("0")){
            return;
        }
        switch (modo){
            case 1:
                resultado = Float.parseFloat(valorA)+Float.parseFloat(valorB);
                break;
            case 2:
                resultado = Float.parseFloat(valorA)-Float.parseFloat(valorB);
                break;
            case 3:
                resultado = Float.parseFloat(valorA)/Float.parseFloat(valorB);
                break;
            case 4:
                resultado = Float.parseFloat(valorA)*Float.parseFloat(valorB);
                break;
        }

        valorA = resultado+"";
        valorB = 0+"";
        textView.setText(resultado+"");
    }
    public void dividir(){
        modo = 3;
        modoText = "÷";
        valorASet = true;
        if(!valorB.equals("0"))
            textView.setText(valorA+modoText+valorB);
        else
            textView.setText(valorA+modoText);
    }
    public void multiplicar(){
        modo = 4;
        modoText = "×";
        valorASet = true;
        if(!valorB.equals("0"))
            textView.setText(valorA+modoText+valorB);
        else
            textView.setText(valorA+modoText);
    }
    public void sumar(){
        modo = 1;
        modoText = "+";
        valorASet = true;
        if(!valorB.equals("0"))
            textView.setText(valorA+modoText+valorB);
        else
            textView.setText(valorA+modoText);
    }
    public void restar(){
        modo = 2;
        modoText = "-";
        valorASet = true;
        if(!valorB.equals("0"))
        textView.setText(valorA+modoText+valorB);
        else
            textView.setText(valorA+modoText);
    }
    public void cero(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="0";
            }else {
                valorA=valorA+"0";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="0";
            }else {
                valorB=valorB+"0";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void uno(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="1";
            }else {
                valorA=valorA+"1";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="1";
            }else {
                valorB=valorB+"1";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void dos(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="2";
            }else {
                valorA=valorA+"2";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="2";
            }else {
                valorB=valorB+"2";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void tres(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="3";
            }else {
                valorA=valorA+"3";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="3";
            }else {
                valorB=valorB+"3";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void cuatro(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="4";
            }else {
                valorA=valorA+"4";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="4";
            }else {
                valorB=valorB+"4";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void cinco(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="5";
            }else {
                valorA=valorA+"5";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="5";
            }else {
                valorB=valorB+"5";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void seis(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="6";
            }else {
                valorA=valorA+"6";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="6";
            }else {
                valorB=valorB+"6";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void siete(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="7";
            }else {
                valorA=valorA+"7";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="7";
            }else {
                valorB=valorB+"7";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void ocho(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="8";
            }else {
                valorA=valorA+"8";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="8";
            }else {
                valorB=valorB+"8";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }
    public void nueve(){
        if(!valorASet){
            if(valorA.equals("0")){
                valorA="9";
            }else {
                valorA=valorA+"9";
            }
            textView.setText(valorA);
        }else {
            if(valorB.equals("0")){
                valorB="9";
            }else {
                valorB=valorB+"9";
            }
            textView.setText(valorA+modoText+valorB);
        }
    }

}
