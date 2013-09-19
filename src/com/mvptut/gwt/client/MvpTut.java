package com.mvptut.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class MvpTut implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		Button btn = new Button("Hello World");
		RootPanel.get().add(btn);

	}

}
