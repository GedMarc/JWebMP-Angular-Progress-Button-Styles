package za.co.mmagon.jwebswing.plugins.angularprogressbuttonstyles;

import za.co.mmagon.jwebswing.Event;
import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.generics.Direction;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_ANGULAR_EVENT_START_SHORT;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Progress button style
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class ProgressButtonStyle extends Button
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new ProgressButtonStyle
	 */
	@SuppressWarnings("unchecked")
	public ProgressButtonStyle(Event eventToPerform)
	{
		addEvent(eventToPerform);
		addAttribute("progress-button", STRING_ANGULAR_EVENT_START_SHORT + eventToPerform.renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);

	}

	/**
	 * Defines button appearance. Default value is fill.
	 *
	 * @param style
	 *
	 * @return
	 */
	public ProgressButtonStyle setStyle(ProgressButtonAvailableStyles style)
	{
		addAttribute("pb-style", style.toString());
		return this;
	}

	/**
	 * To be used with pb-style=(fill or shrink). Defines the direction of the progress bar. Default value is horizontal.
	 *
	 * @param direction
	 *
	 * @return
	 */
	public ProgressButtonStyle setDirection(Direction direction)
	{
		addAttribute("pb-direction", direction.toString());
		return this;
	}

	/**
	 * @param randomProgress
	 *
	 * @return
	 */
	public ProgressButtonStyle setRandomProgress(Boolean randomProgress)
	{
		addAttribute("pb-random-progress", randomProgress.toString());
		return this;
	}

}
