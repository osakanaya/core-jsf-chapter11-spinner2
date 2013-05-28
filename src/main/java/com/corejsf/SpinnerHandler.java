package com.corejsf;

import javax.faces.event.ActionEvent;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.MetaRuleset;

import com.corejsf.util.MethodRule;

public class SpinnerHandler extends ComponentHandler {

	public SpinnerHandler(ComponentConfig config) {
		super(config);
	}

	@Override
	protected MetaRuleset createMetaRuleset(@SuppressWarnings("rawtypes") Class type) {
		return super.createMetaRuleset(type)
			.addRule(new MethodRule("atMax", Void.class, new Class<?>[] {ActionEvent.class}))
			.addRule(new MethodRule("atMin", Void.class, new Class<?>[] {ActionEvent.class}));
	}
}
