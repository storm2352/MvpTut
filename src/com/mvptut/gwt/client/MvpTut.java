package com.mvptut.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.mvptut.gwt.shared.Person;

public class MvpTut implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		Person me = new Person();
		Label lMe = new Label("Hello my name is " + me.fullName());
		
		Person other = new Person("Peter", "Pumkin");
		Label lOther = new Label("The other name is " + other.fullName());
		
		RootPanel.get().add(lMe);
		RootPanel.get().add(lOther);

	}

}
