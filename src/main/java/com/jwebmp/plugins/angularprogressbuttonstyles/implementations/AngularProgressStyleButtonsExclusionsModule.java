package com.jwebmp.plugins.angularprogressbuttonstyles.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularProgressStyleButtonsExclusionsModule
		implements IGuiceScanModuleExclusions<AngularProgressStyleButtonsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularprogressbuttonstyles");
		return strings;
	}
}
