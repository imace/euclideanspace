/*
* generated by Xtext
*/
package com.euclideanspace.euclid.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.euclideanspace.euclid.services.EditorGrammarAccess;

public class EditorParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EditorGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.euclideanspace.euclid.parser.antlr.internal.InternalEditorParser createParser(XtextTokenStream stream) {
		return new com.euclideanspace.euclid.parser.antlr.internal.InternalEditorParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}
	
	public EditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}