package com.mvptut.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.mvptut.gwt.client.presenters.PersonPresenter;
import com.mvptut.gwt.client.presenters.PersonPresenter.Display;
import com.mvptut.gwt.client.presenters.Presenter;
import com.mvptut.gwt.client.views.PersonView;
import com.mvptut.gwt.shared.Person;

public class MvpTut implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		Person me = new Person();
		Display view = new PersonView() ;
		Presenter presenter = new PersonPresenter(me, view);
		presenter.go(RootPanel.get());

	}

}
