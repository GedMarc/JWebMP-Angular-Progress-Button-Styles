package za.co.mmagon.jwebswing.plugins.angularprogressbuttonstyles;

import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;

/**
 * Defines button appearance. Default value is fill.
 *
 * @author Marc Magon
 * @since 11 Jun 2017
 */
public enum ProgressButtonAvailableStyles
{
	Fill,
	Shrink,
	Rotate_Angle_Bottom,
	Rotate_Angle_Top,
	Rotate_Angle_Right,
	Rotate_Angle_Left,
	Rotate_Side_Down,
	Rotate_Side_Up,
	Rotate_Side_Right,
	Rotate_Side_Left,
	Rotate_Back,
	Slide_Down,
	Top_Line,
	Move_Up,
	Lateral_Lines,
	Flip_Open;
	/**
	 * Any sub data
	 */
	private String data;

	/**
	 * A new ProgressButtonAvailableStyles
	 */
	ProgressButtonAvailableStyles()
	{

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
			return name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
		}
	}
}
