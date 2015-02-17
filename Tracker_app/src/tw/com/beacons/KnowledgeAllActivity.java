package tw.com.beacons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KnowledgeAllActivity extends Activity {

	Intent infor = new Intent();
	Bundle bundle = new Bundle();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.knowledge);

		findViewById(R.id.web1).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								KnowledgeAllActivity.this,
								WebInforActivity.class);
						// intent.putExtra(ListBeaconsActivity.EXTRAS_TARGET_ACTIVITY,
						// NotifyDemoActivity.class.getName());
						bundle.putString("w", "w1");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});

		findViewById(R.id.web2).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								KnowledgeAllActivity.this,
								WebInforActivity.class);
						bundle.putString("w", "w2");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
		
		findViewById(R.id.web3).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								KnowledgeAllActivity.this,
								WebInforActivity.class);
						bundle.putString("w", "w3");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
		
		findViewById(R.id.web4).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								KnowledgeAllActivity.this,
								WebInforActivity.class);
						bundle.putString("w", "w4");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
		
		findViewById(R.id.web5).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								KnowledgeAllActivity.this,
								WebInforActivity.class);
						bundle.putString("w", "w5");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
	}
}
