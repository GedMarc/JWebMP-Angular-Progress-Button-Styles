package za.co.mmagon.jwebswing.plugins.angularprogressbuttonstyles;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum AngularProgressButtonStylesReferencePool implements ReferencePool
{
	AngularProgressButtonStyles(new JavascriptReference("AngularProgressButtonStyles", 1.6, "bower_components/angular-progress-button-styles/dist/angular-progress-button-styles.js"),
	                            new CSSReference("AngularProgressButtonStyles", 1.6, "bower_components/angular-progress-button-styles/dist/angular-progress-button-styles.css"));
	/**
	 * Any sub data
	 */
	private String data;
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;
	
	/**
	 * A new AngularSlimScrollReferencePool
	 */
	AngularProgressButtonStylesReferencePool()
	{
	
	}
	
	AngularProgressButtonStylesReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		if (this.javaScriptReference != null)
		{
			this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
		}
		this.cssReference = cssReference;
		if (this.cssReference != null)
		{
			this.cssReference.setPriority(RequirementsPriority.DontCare);
		}
	}
	
	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}
	
	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
	
	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}
	
	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}
	
	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name();
		}
	}
}
