package solutions.ranajawad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText met;
    Button mbtn0, mbtn1, mbtn2, mbtn3, mbtn4, mbtn5, mbtn6, mbtn7, mbtn8, mbtn9, mbtnpnt, mbtneql, mbtnpls,mbtnmin, mbtndiv, mbtnmul, mbtnprcnt, mbtnclr, mbtnac;
    float mValueOne , mValueTwo ;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        met = (EditText) findViewById(R.id.edittext1);
        mbtn0 = (Button) findViewById(R.id.btnzero);
        mbtn1 = (Button) findViewById(R.id.btn1);
        mbtn2 = (Button) findViewById(R.id.btn2);
        mbtn3 = (Button) findViewById(R.id.btn3);
        mbtn4 = (Button) findViewById(R.id.btn4);
        mbtn5 = (Button) findViewById(R.id.btn5);
        mbtn6 = (Button) findViewById(R.id.btn6);
        mbtn7 = (Button) findViewById(R.id.btn7);
        mbtn8 = (Button) findViewById(R.id.btn8);
        mbtn9 = (Button) findViewById(R.id.btn9);
        mbtnpnt = (Button) findViewById(R.id.btnpnt);
        mbtneql = (Button) findViewById(R.id.btneql);
        mbtnpls = (Button) findViewById(R.id.btnplus);
        mbtnmin = (Button) findViewById(R.id.btnmin);
        mbtndiv = (Button) findViewById(R.id.btndiv);
        mbtnmul = (Button) findViewById(R.id.btnmul);
        mbtnprcnt = (Button) findViewById(R.id.btnperc);
        mbtnclr = (Button) findViewById(R.id.btnclr);
        mbtnac = (Button) findViewById(R.id.btnac);

        mbtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"0");
            }
        });
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"1");
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"2");
            }
        });
        mbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"3");
            }
        });
        mbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"4");
            }
        });
        mbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"5");
            }
        });
        mbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"6");
            }
        });
        mbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"7");
            }
        });
        mbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"8");
            }
        });
        mbtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"9");
            }
        });
        mbtnpnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+".");
            }
        });
        mbtneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(met.getText()+"");

                if (mAddition==true){
                 met.setText(mValueOne + mValueTwo +"");
                 mAddition = false;
                }
                if (mSubtract==true){
                    met.setText(mValueOne - mValueTwo +"");
                    mSubtract = false;
                }
                if (mMultiplication==true){
                    met.setText(mValueOne * mValueTwo +"");
                }
                if (mDivision==true){
                    met.setText(mValueOne / mValueTwo +"");
                }
            }
        });
        mbtnpls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (met==null){
                    met.setText("");
                }
                else {
                    mValueOne = Float.parseFloat(met.getText()+"");
                    mAddition = true;
                    met.setText(null);
                }
            }
        });
        mbtnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(met.getText()+"");
                mSubtract = true;
                met.setText(null);
            }
        });
        mbtndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(met.getText()+"");
                mDivision = true;
                met.setText(null);
            }
        });
        mbtnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(met.getText()+"");
                mMultiplication = true;
                met.setText(null);
            }
        });
        mbtnprcnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"1");
            }
        });
        mbtnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"");
            }
        });
        mbtnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                met.setText(met.getText()+"");
            }
        });

    }
}
