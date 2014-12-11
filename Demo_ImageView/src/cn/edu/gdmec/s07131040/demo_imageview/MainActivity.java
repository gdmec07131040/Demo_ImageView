package cn.edu.gdmec.s07131040.demo_imageview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {
	private int[] pics={R.drawable.pic1
			,R.drawable.pic2
			,R.drawable.pic3
			,R.drawable.pic4
			,R.drawable.pic5
			,R.drawable.pic6};
	private int index;
	private ImageView imageView;
	private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView) findViewById(R.id.imageView1);
        button=(Button) findViewById(R.id.button1);
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//«–ªªœ‘ æµƒÕº∆¨
				imageView.setImageResource(pics[++index % pics.length]);
			}
		});
        
    }


   
}
