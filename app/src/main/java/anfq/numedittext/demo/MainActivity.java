package anfq.numedittext.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import anfq.numedittext.lib.AnFQNumEditText;

public class MainActivity extends AppCompatActivity {

    private AnFQNumEditText anetDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anetDemo = (AnFQNumEditText) findViewById(R.id.anetDemo);
        anetDemo.setEtHint("请填写内容（500字以内）")//设置提示文字
                .setType(AnFQNumEditText.PERCENTAGE)//TextView显示类型(SINGULAR单数类型)(PERCENTAGE百分比类型)
                .show();
    }
}
