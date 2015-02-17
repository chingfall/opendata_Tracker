package tw.com.beacons;

import tw.com.beacons.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebInforActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.web_infor);

		// Intent intent = getIntent();
		// String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

		WebView myWebView = (WebView) findViewById(R.id.webView1);	
		myWebView.getSettings().setJavaScriptEnabled(true);
		myWebView.requestFocus();
		myWebView.setWebViewClient(new MyWebViewClient());
		//myWebView.getSettings().setLoadWithOverviewMode(true);
		myWebView.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);

		Intent intent = this.getIntent();
		Bundle bundle = intent.getExtras();// 取得Bundle
		// TextView txt_1 = (TextView) findViewById(R.id.txt1);
		// txt_1.setText(bundle.getString("name1")); // 輸出Bundle內容
		String i = bundle.getString("w");
		if (i.equals("web1")) {
			myWebView
					.loadUrl("http://www.nfa.gov.tw/main/Unit.aspx?ID=&MenuID=378&ListID=3309");
		}else if(i.equals("web2")){
			myWebView
			.loadUrl("http://sistadiary.com/%E9%AB%98%E6%A8%93%E5%A4%B1%E7%81%AB%E6%98%AF%E5%BE%80%E4%B8%8A%E8%B7%91%E9%82%84%E6%98%AF%E5%BE%80%E4%B8%8B%E8%B7%91/");
		}else if(i.equals("web3")){
			myWebView
			.loadUrl("http://www.moi.gov.tw/chi/chi_news/news_detail.aspx?sn=8821&type_code=01");
		}else if(i.equals("w1")){
			myWebView
			.loadUrl("http://www.hkjh.kh.edu.tw/admin/31/new/fire/new_page_7.htm");
		}else if(i.equals("w2")){
			myWebView
			.loadUrl("http://www.chpb.gov.tw/top_menu/sec_G.HTM");
		}else if(i.equals("w3")){
			myWebView
			.loadUrl("http://www.tw.org/safety/fire-1.html");
		}else if(i.equals("w4")){
			myWebView
			.loadUrl("http://www.ncku.edu.tw/biochem/notebook_stu/earthquake-fire-emergency.html");
		}else if(i.equals("w5")){
			myWebView
			.loadUrl("http://web.ntnu.edu.tw/~496700507/fire.htm");
		}
	}

	private class MyWebViewClient extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			return super.shouldOverrideUrlLoading(view, url);
		}
	}

}
