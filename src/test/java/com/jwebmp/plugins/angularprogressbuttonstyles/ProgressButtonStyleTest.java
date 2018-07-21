/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.core.Page;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.events.click.ClickAdapter;
import com.jwebmp.core.generics.Direction;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class ProgressButtonStyleTest

{

	public ProgressButtonStyleTest()
	{
	}

	@Test
	public void testSetStyle()
	{
		ProgressButtonStyle pbs = new ProgressButtonStyle(new ClickAdapter(new Page().getBody())
		{
			@Override
			public void onClick(AjaxCall call, AjaxResponse response)
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		System.out.println(pbs.toString(true));

	}

	@Test
	public void testSetDirection()
	{
		ProgressButtonStyle pbs = new ProgressButtonStyle(new ClickAdapter(new Page().getBody())
		{
			@Override
			public void onClick(AjaxCall call, AjaxResponse response)
			{
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		pbs.setStyle(ProgressButtonAvailableStyles.Rotate_Side_Right);
		pbs.setDirection(Direction.Vertical);
		pbs.setRandomProgress(false);
		System.out.println(pbs.toString(true));
	}

}
