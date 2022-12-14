/*
 * generated by Xtext 2.25.0
 */
package diazdecerio.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import diazdecerio.mydsl.MyDslRuntimeModule;
import diazdecerio.mydsl.MyDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyDslIdeSetup extends MyDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule(), new MyDslIdeModule()));
	}
	
}
