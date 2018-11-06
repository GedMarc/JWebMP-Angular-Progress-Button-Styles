import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesModule;
import com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesPageConfigurator;
import com.jwebmp.plugins.angularprogressbuttonstyles.implementations.AngularProgressStyleButtonsExclusionsModule;

module com.jwebmp.plugins.angularprogressbuttonstyles {
	exports com.jwebmp.plugins.angularprogressbuttonstyles;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularProgressButtonStylesPageConfigurator;
	provides IAngularModule with AngularProgressButtonStylesModule;

	provides IGuiceScanJarExclusions with AngularProgressStyleButtonsExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularProgressStyleButtonsExclusionsModule;

	opens com.jwebmp.plugins.angularprogressbuttonstyles to com.fasterxml.jackson.databind, com.jwebmp.core;
}
