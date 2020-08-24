/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularprogressbuttonstyles;

import com.jwebmp.core.Event;
import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.generics.Direction;
import com.jwebmp.core.utilities.StaticStrings;

import static com.guicedee.guicedinjection.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Progress button style
 *
 * @author GedMarc
 * @since 10 Jun 2017
 */
public class ProgressButtonStyle
		extends Button
{


	/*
	 * Constructs a new ProgressButtonStyle
	 */
	@SuppressWarnings("unchecked")
	public ProgressButtonStyle(Event eventToPerform)
	{
		addEvent(eventToPerform);
		addAttribute("progress-button", StaticStrings.STRING_ANGULAR_EVENT_START_SHORT + eventToPerform.renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);

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
