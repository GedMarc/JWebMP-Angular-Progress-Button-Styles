import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesModule;
import com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesPageConfigurator;

module com.jwebmp.plugins.angularprogressbuttonstyles {
	exports com.jwebmp.plugins.angularprogressbuttonstyles;

	requires com.jwebmp.core;
	requires java.validation;

	provides IPageConfigurator with AngularProgressButtonStylesPageConfigurator;
	provides IAngularModule with AngularProgressButtonStylesModule;

	opens com.jwebmp.plugins.angularprogressbuttonstyles to com.fasterxml.jackson.databind,com.jwebmp.core;
}
