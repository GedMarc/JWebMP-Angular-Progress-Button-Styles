import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesModule;
import com.jwebmp.plugins.angularprogressbuttonstyles.AngularProgressButtonStylesPageConfigurator;

module com.jwebmp.plugins.angularprogressbuttonstyles {
	exports com.jwebmp.plugins.angularprogressbuttonstyles;

	requires com.jwebmp.core;

	provides IPageConfigurator with AngularProgressButtonStylesPageConfigurator;
	provides IAngularModule with AngularProgressButtonStylesModule;

}
