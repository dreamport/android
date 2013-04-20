package com.demo.android.youdao;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Youdao extends Activity {

	private Button check;
    private Button clear;
    private EditText edit;
    private WebView view;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        check=(Button)findViewById(R.id.check);
        clear=(Button)findViewById(R.id.clear);
        edit=(EditText)findViewById(R.id.edit);
        view=(WebView)findViewById(R.id.view);
        check.setOnClickListener(cd);
        clear.setOnClickListener(cd1);
    }
    private Button.OnClickListener cd = new Button.OnClickListener(){
    	public void onClick(View v)
    	{
    		String str=edit.getText().toString();
    		str=str.trim();
    		if(str.length()==0)
    		{
    			Toast.makeText(Youdao.this, "²»ÄÜÎª¿Õ", Toast.LENGTH_LONG).show();
    		}
    		else
    		{
    			String URL="http://dict.youdao.com/m/search?keyfrom=dict.mindex&q="+str;
    			view.loadUrl(URL);
    		}
    	}
    	
    };
    private Button.OnClickListener cd1 = new Button.OnClickListener(){
    	public void onClick(View v)
    	{
    		edit.setText("");
    	}
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
}
