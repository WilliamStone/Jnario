/*
 * generated by Xtext
 */
package de.bmw.carit.jnario;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import de.bmw.carit.jnario.generator.JnarioCompiler;
import de.bmw.carit.jnario.scoping.JnarioScopeProvider;
import de.bmw.carit.jnario.typing.JnarioTypeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class JnarioRuntimeModule extends de.bmw.carit.jnario.AbstractJnarioRuntimeModule {
	
	@Override
	public Class<? extends ITypeProvider> bindITypeProvider() {
		return JnarioTypeProvider.class;
	}
	
	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return JnarioScopeProvider.class;
	}
	
	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return JnarioCompiler.class; 
	}
}
