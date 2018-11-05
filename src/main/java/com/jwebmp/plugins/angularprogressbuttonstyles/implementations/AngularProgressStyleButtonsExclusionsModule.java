package com.jwebmp.plugins.angularprogressbuttonstyles.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularProgressStyleButtonsExclusionsModule
		implements IGuiceScanModuleExclusions<AngularProgressStyleButtonsExclusionsModule>,
				           IGuiceScanJarExclusions<AngularProgressStyleButtonsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-progress-button-styles-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularprogressbuttonstyles");
		return strings;
	}
}
