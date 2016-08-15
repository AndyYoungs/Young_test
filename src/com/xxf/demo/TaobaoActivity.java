package com.xxf.demo;
import com.xxf.test2.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * 高仿淘宝按钮主页面
 * @author 
 *
 */
public class TaobaoActivity extends Activity {

	private ComposerLayout clayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setView();
		initView();
		setListener();
	}
	public void setView() {
		setContentView(R.layout.activity_imitate_taobao);
		
	}

	public void initView() {
		// 引用控件
		clayout = (ComposerLayout) findViewById(R.id.test);
		clayout.init(new int[] { R.drawable.composer_camera,
				R.drawable.composer_music, R.drawable.composer_place,
				R.drawable.composer_sleep, R.drawable.composer_thought,
				R.drawable.composer_with }, R.drawable.composer_button,
				R.drawable.composer_icn_plus, ComposerLayout.RIGHTCENTER, 180,
				300);
		
	}

	public void setListener() {
		// 点击事件监听，100+0对应composer_camera，100+1对应composer_music……如此类推你有机个按钮就加几个按钮都行。
				OnClickListener clickit = new OnClickListener() {
					@Override
					public void onClick(View v) {
						if (v.getId() == 100 + 0) {
							Toast.makeText(TaobaoActivity.this, "打开相机...", 0).show();
						} else if (v.getId() == 100 + 1) {
							Toast.makeText(TaobaoActivity.this, "打开音乐...", 0).show();
						} else if (v.getId() == 100 + 2) {
							Toast.makeText(TaobaoActivity.this, "打开地理位置...", 0).show();
						} else if (v.getId() == 100 + 3) {
							Toast.makeText(TaobaoActivity.this, "打开睡觉模式...", 0).show();
						} else if (v.getId() == 100 + 4) {
							Toast.makeText(TaobaoActivity.this, "打开对话模式...", 0).show();
						} else if (v.getId() == 100 + 5) {
							Toast.makeText(TaobaoActivity.this, "关于我..", 0).show();
						}
					}
				};
				clayout.setButtonsOnClickListener(clickit);

			
		
	}
	
}

