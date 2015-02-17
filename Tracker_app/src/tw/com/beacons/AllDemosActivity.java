package tw.com.beacons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tw.com.beacons.R;
import tw.com.beacons.R.id;
import tw.com.beacons.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.ViewSwitcher.ViewFactory;

/**
 * Shows all available demos.
 *
 * @author wiktor@estimote.com (Wiktor Gworek)
 */
public class AllDemosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.all_demos);

		// findViewById(R.id.distance_demo_button).setOnClickListener(new
		// View.OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// Intent intent = new Intent(AllDemosActivity.this,
		// ListBeaconsActivity.class);
		// intent.putExtra(ListBeaconsActivity.EXTRAS_TARGET_ACTIVITY,
		// DistanceBeaconActivity.class.getName());
		// startActivity(intent);
		// }
		// });
		findViewById(R.id.notify_demo_button).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(AllDemosActivity.this,
								ListBeaconsActivity.class);
						intent.putExtra(
								ListBeaconsActivity.EXTRAS_TARGET_ACTIVITY,
								NotifyDemoActivity.class.getName());
						startActivity(intent);
					}
				});
		// findViewById(R.id.characteristics_demo_button).setOnClickListener(new
		// View.OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// Intent intent = new Intent(AllDemosActivity.this,
		// ListBeaconsActivity.class);
		// intent.putExtra(ListBeaconsActivity.EXTRAS_TARGET_ACTIVITY,
		// CharacteristicsDemoActivity.class.getName());
		// startActivity(intent);
		// }
		// });

		findViewById(R.id.escape_knowledge).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(AllDemosActivity.this,
								EscapeKnowledgeActivity.class);
						intent.putExtra(
								ListBeaconsActivity.EXTRAS_TARGET_ACTIVITY,
								ListBeaconsActivity.class.getName());
						startActivity(intent);
					}
				});
	}
}
