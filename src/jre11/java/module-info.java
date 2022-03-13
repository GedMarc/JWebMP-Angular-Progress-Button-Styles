import com.jwebmp.plugins.angularprogressbuttonstyles.implementations.AngularProgressButtonStylesModuleInclusions;

module com.jwebmp.plugins.angularprogressbuttonstyles {
	exports com.jwebmp.plugins.angularprogressbuttonstyles;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angular;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularprogressbuttonstyles.implementations.AngularProgressStyleButtonsExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularProgressButtonStylesModuleInclusions;

	opens com.jwebmp.plugins.angularprogressbuttonstyles to com.fasterxml.jackson.databind, com.jwebmp.core;
}
