package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button0,button4,button5,button6,button7,button8,button9,
            buttonEqual,buttonMinus,buttonAdd,buttonClear,buttonDivide,buttonDot,buttonMult,
            buttonInvert,buttonExp,buttonEuler,buttonSqrt,buttonRoot3,buttonSign,buttonSquare,
            buttonPercentage,buttonDelete;
    TextView screen,screen2;
    float val1,val2;
    boolean add,equal,minus,div,mult,invert;
    String newValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we link all the buttons to the object
        button0 =(Button) findViewById(R.id.btn0);
        button1 =(Button) findViewById(R.id.btn1);
        button2 =(Button) findViewById(R.id.btn2);
        button3 =(Button) findViewById(R.id.btn3);
        button4 =(Button) findViewById(R.id.btn4);
        button5 =(Button) findViewById(R.id.btn5);
        button6 =(Button) findViewById(R.id.btn6);
        button7 =(Button) findViewById(R.id.btn7);
        button8 =(Button) findViewById(R.id.btn8);
        button9 =(Button) findViewById(R.id.btn9);
        buttonEqual =(Button) findViewById(R.id.btnEqual);
        buttonAdd =(Button) findViewById(R.id.btnAdd);
        buttonMinus =(Button) findViewById(R.id.btnMinus);
        buttonDivide =(Button) findViewById(R.id.btnDiv);
        buttonClear =(Button) findViewById(R.id.btnClear);
        buttonDot =(Button) findViewById(R.id.btnDot);
        buttonMult = (Button) findViewById(R.id.btnMult);
        buttonInvert = (Button) findViewById(R.id.btnInverse);
        buttonExp = (Button) findViewById(R.id.btnExp);
        buttonSqrt = (Button) findViewById(R.id.btnSqrt);
        buttonRoot3 = (Button) findViewById(R.id.btnRoot3);
        buttonEuler = (Button) findViewById(R.id.btnEuler);
        buttonSign = (Button) findViewById(R.id.btnSign);
        buttonSquare = (Button) findViewById(R.id.btnSquare);
        buttonPercentage = (Button) findViewById(R.id.btnPercentage);
        buttonDelete = (Button) findViewById(R.id.btnDel);

        //we link the screen to the obkect

        screen =(TextView) findViewById(R.id.screen);
        screen2 =(TextView) findViewById(R.id.screen2);

        //actions methods

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "0");
                screen2.setText(screen2.getText()+ "0");


            }

        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "1");
                screen2.setText(screen2.getText()+ "1");


            }

        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "2");
                screen2.setText(screen2.getText()+ "2");

            }

        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "3");
                screen2.setText(screen2.getText()+ "3");

            }

        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "4");
                screen2.setText(screen2.getText()+ "4");

            }

        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "5");
                screen2.setText(screen2.getText()+ "5");

            }

        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "6");
                screen2.setText(screen2.getText()+ "6");

            }

        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "7");
                screen2.setText(screen2.getText()+ "7");

            }

        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "8");
                screen2.setText(screen2.getText()+ "8");

            }

        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(equal){
                    screen.setText(null);
                    screen2.setText(null);
                    equal = false;
                }
                screen.setText(screen.getText()+ "9");
                screen2.setText(screen2.getText()+ "9");

            }

        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                equal = true;

                val2 = Float.parseFloat(screen.getText() + " ");

                if (add) {
                    screen.setText((val1 + val2) + " ");
                    add=false;
                }
                if (minus){
                    screen.setText((val1-val2)+ " ");
                    minus=false;
                }
                if (div){
                    screen.setText((val1 / val2) + " ");
                    div=false;

                }
                if (mult){
                    screen.setText((val1 * val2) + " ");
                    mult=false;

                }


            }

        });

        buttonDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() + ".");

                add = true;

                screen.setText(null);
                screen2.setText(screen2.getText()+ ".");

            }

        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() + " ");

                add = true;

                screen.setText(null);
                screen2.setText(screen2.getText()+ " + ");

            }

        });

        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }


                screen.setText(null);
                screen2.setText(null);
                add=false;
                minus=false;
                div = false;


            }

        });

        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() + " ");

                minus = true;

                screen.setText(null);
                screen2.setText(screen2.getText()+ " - ");

            }

        });

        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() + " ");

                div = true;

                screen.setText(null);
                screen2.setText(screen2.getText()+ " ÷ ");

            }

        });

        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() + " ");

                mult = true;

                screen.setText(null);
                screen2.setText(screen2.getText()+ " x ");


            }

        });

        buttonSign.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() +"");

                val1 = val1*(-1);
                screen.setText(val1 + " ");
                screen2.setText(val1 + " ");
                equal = true;

                }







        });



        buttonInvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText() + " ");
                screen.setText((1/val1)+ " ");
                screen2.setText("1/"+val1);

            }

        });

        buttonSqrt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText()+ " ");
                screen.setText(Math.sqrt(val1)+" ");
                screen2.setText("sqrt("+val1+")");

            }

        });

        buttonRoot3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText()+ " ");
                screen.setText(Math.pow(val1,(1/3))+" ");

            }

        });

        buttonExp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText()+ " ");
                screen.setText(Math.pow(10,val1)+" ");

            }


        });

        buttonEuler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }

                val1 = Float.parseFloat(screen.getText()+ " ");
                screen.setText(Math.exp(val1)+" ");
                screen2.setText("e^" + val1 );
                equal = true;




            }

        });

        buttonSquare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText()+ " ");
                screen.setText((val1*val1)+" ");
                screen2.setText((val1)+"²");
                equal =true;

            }

        });

        buttonPercentage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == ""){
                    screen.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText()+ " ");
                screen.setText((val1/100)+" ");
                screen2.setText((val1)+"/100");
                equal =true;

            }

        });

        buttonDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (screen.getText() == "" || (screen2.getText()== null)){
                    screen.setText(null);
                    screen2.setText(null);
                    return;
                }
                val1 = Float.parseFloat(screen.getText()+ " ");
                val1 = (int) val1/10;


                String newValue = (String) screen2.getText();
                newValue = newValue.substring(0,newValue.length()-1);
                screen.setText(val1 +" ");
                screen2.setText((newValue));
                equal = true;


            }

        });












    }
}