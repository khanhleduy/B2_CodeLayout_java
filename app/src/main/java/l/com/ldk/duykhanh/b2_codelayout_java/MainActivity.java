package l.com.ldk.duykhanh.b2_codelayout_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayoutRoot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initLayoutLinearLayout();


        //setContentView linearLayout run later
        setContentView(linearLayoutRoot);

    }

    public void initLayoutLinearLayout(){
        //LinearLayout root
        linearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(layoutParams);

        //LinearLayout seccon

        LinearLayout linearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsSecond = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutSecond.setLayoutParams(layoutParamsSecond);

        // Create ImageView

        ImageView imgView = new ImageView(this);
        imgView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        imgView.setImageResource(R.mipmap.ic_launcher);

        //Create TextView

        TextView textView = new TextView(this);
        LinearLayout.LayoutParams layoutParamsTextView =  new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsTextView.gravity = Gravity.CENTER;
        layoutParamsTextView.setMargins(20,0,0,0);
        textView.setLayoutParams(layoutParamsTextView);
        textView.setText("Hello guy i am khanh developer");

        //add linearLayoutSecond

        linearLayoutSecond.addView(imgView);
        linearLayoutSecond.addView(textView);


        //Create Button

        Button btnClick = new Button(this);
        LinearLayout.LayoutParams layoutParamsButton1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsButton1.gravity = Gravity.CENTER;
        btnClick.setPadding(20,0,0,0);
        btnClick.setText("Click me now!");
        btnClick.setLayoutParams(layoutParamsButton1);

        //Create Button 2

        Button btnClick2 = new Button(this);
        LinearLayout.LayoutParams layoutParamsButton2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsButton2.gravity = Gravity.CENTER;
        btnClick2.setPadding(20,0,0,0);
        btnClick2.setText("Click me now part 2!");
        btnClick2.setLayoutParams(layoutParamsButton2);

        // Add button images textview with LinearLayoutRoot;

        linearLayoutRoot.addView(linearLayoutSecond);
        linearLayoutRoot.addView(btnClick);
        linearLayoutRoot.addView(btnClick2);
    }
}
