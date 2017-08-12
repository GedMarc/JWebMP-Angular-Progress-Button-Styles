package za.co.mmagon.jwebswing.plugins.angularprogressbuttonstyles;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Progress Button Styles",
		pluginDescription = "A set of flat and 3D progress button styles where the button itself serves as a progress indicator. 3D styles are used for showing the progress indication on one side of the button while rotating the button in perspective.",
		pluginUniqueName = "jwebswing-angular-animate",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,animations, ui,web ui, framework",
		pluginSubtitle = "hese animation hooks are set in place to trigger animations during the life cycle of various directives ",
		pluginSourceUrl = "https://github.com/akveo/angular-progress-button-styles",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Progress-Button-Styles/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Progress-Button-Styles",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://lugovsky.github.io/angular-progress-button-styles/example.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularProgressButtonStyles.jar/download"
) class AngularProgressButtonStylesPageConfigurator extends PageConfigurator
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularProgressButtonStylesPageConfigurator
	 */
	public AngularProgressButtonStylesPageConfigurator()
	{
		//Nothing needed
	}
	
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			page.getBody().addJavaScriptReference(AngularProgressButtonStylesReferencePool.AngularProgressButtonStyles.getJavaScriptReference());
			page.getAngular().getAngularModules().add(new AngularProgressButtonStylesModule());
		}
		return page;
	}
}
