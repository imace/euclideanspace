/*
 * generated by Xtext
 */
package com.euclideanspace.aldor.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.euclideanspace.aldor.ui.internal.EditorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EditorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EditorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EditorActivator.getInstance().getInjector(EditorActivator.COM_EUCLIDEANSPACE_ALDOR_EDITOR);
	}
	
}
