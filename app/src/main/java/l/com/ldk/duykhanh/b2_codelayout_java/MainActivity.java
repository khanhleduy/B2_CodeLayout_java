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
        createLinnearLayoutView();
        setContentView(linearLayoutRoot);
    }

    public void createLinnearLayoutView() {
        linearLayoutRoot = new LinearLayout(this);
        linearLayoutRoot.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);

        LinearLayout linearLayoutSub = new LinearLayout(this);
        linearLayoutSub.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayoutSub.setOrientation(LinearLayout.HORIZONTAL);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);

        TextView textView = new TextView(this);
        textView.setText("Xin Chào! Tôi là ngôn ngữ lập trình Android");
        LinearLayout.LayoutParams lay = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lay.gravity = Gravity.CENTER;
        textView.setLayoutParams(lay);

        linearLayoutSub.addView(imageView);
        linearLayoutSub.addView(textView);

        Button btnClick = new Button(this);
        btnClick.setText("Click để xem");
        btnClick.setLayoutParams(lay);

        Button btnHihi = new Button(this);
        btnHihi.setText("Hihi Đồ Ngốc");
        btnHihi.setLayoutParams(lay);

        linearLayoutRoot.addView(linearLayoutSub);
        linearLayoutRoot.addView(btnClick);
        linearLayoutRoot.addView(btnHihi);

    }
}
