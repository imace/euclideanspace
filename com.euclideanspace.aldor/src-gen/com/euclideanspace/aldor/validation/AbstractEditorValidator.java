/*
 * generated by Xtext
 */
package com.euclideanspace.aldor.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractEditorValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.euclideanspace.aldor.editor.EditorPackage.eINSTANCE);
		return result;
	}
}
