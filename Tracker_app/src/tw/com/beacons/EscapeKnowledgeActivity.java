package tw.com.beacons;

import tw.com.beacons.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EscapeKnowledgeActivity extends Activity {

	Intent infor = new Intent();
	Bundle bundle = new Bundle();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.escape_knowledge);

		findViewById(R.id.web1_gov).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								EscapeKnowledgeActivity.this,
								WebInforActivity.class);
						// intent.putExtra(ListBeaconsActivity.EXTRAS_TARGET_ACTIVITY,
						// NotifyDemoActivity.class.getName());
						bundle.putString("w", "web1");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});

		findViewById(R.id.web2_gov).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								EscapeKnowledgeActivity.this,
								WebInforActivity.class);
						bundle.putString("w", "web2");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
		
		findViewById(R.id.web3_gov).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								EscapeKnowledgeActivity.this,
								WebInforActivity.class);
						bundle.putString("w", "web3");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
		
		findViewById(R.id.web4_gov).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(
								EscapeKnowledgeActivity.this,
								KnowledgeAllActivity.class);
						bundle.putString("w", "web4");
						intent.putExtras(bundle); // 盢把计
						startActivity(intent);
					}
				});
		
	}
}
