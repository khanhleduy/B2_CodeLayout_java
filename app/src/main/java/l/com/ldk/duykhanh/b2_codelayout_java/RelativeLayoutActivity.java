package l.com.ldk.duykhanh.b2_codelayout_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutActivity extends AppCompatActivity {

    private RelativeLayout relativeLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initLayoutRelativeLayout();
        setContentView(relativeLayoutRoot);
    }

    public void initLayoutRelativeLayout() {
        relativeLayoutRoot = new RelativeLayout(this);

        //RelativeLayout second
        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams reLayoutParamsSecond = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        /*Không cần thiết phải sét LayoutParams nếu không dùng WRAP_CONTENT
        RelativeLayout.LayoutParams reLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);*/
        relativeLayoutSecond.setId(R.id.rl);
        //relativeLayoutSecond.setLayoutParams(reLayoutParamsSecond); co the dien khi addView

        //ImageView

        ImageView imgAvatar = new ImageView(this);
        imgAvatar.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imgAvatar.setId(R.id.imgAvatar);
        imgAvatar.setImageResource(R.drawable.img);


        //TextView

        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParamstv = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstv.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParamstv.setMargins(20, 0, 0, 0);
        layoutParamstv.addRule(RelativeLayout.RIGHT_OF, imgAvatar.getId());
        textView.setText(R.string.slogan);
        textView.setLayoutParams(layoutParamstv);

        //add with relativeLayoutSecond

        relativeLayoutSecond.addView(imgAvatar);
        relativeLayoutSecond.addView(textView);


        //Create Button

        Button btnClick = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtnClick = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnClick.setId(R.id.btnClick);
        layoutParamsbtnClick.addRule(RelativeLayout.BELOW, relativeLayoutSecond.getId());
        layoutParamsbtnClick.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnClick.setPadding(10, 10, 10, 10);
        btnClick.setText(getString(R.string.slogan2));


        //Create Button 2

        Button btnClick2 = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtnClick2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtnClick2.addRule(RelativeLayout.BELOW, btnClick.getId());
        layoutParamsbtnClick2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnClick2.setGravity(Gravity.CENTER);
        btnClick2.setPadding(10, 10, 10, 10);
        btnClick2.setText(getString(R.string.slogan3));

        //setLayoutParams sau cung dk

        relativeLayoutRoot.addView(relativeLayoutSecond, reLayoutParamsSecond);
        relativeLayoutRoot.addView(btnClick, layoutParamsbtnClick);
        relativeLayoutRoot.addView(btnClick2, layoutParamsbtnClick2);

    }
}
