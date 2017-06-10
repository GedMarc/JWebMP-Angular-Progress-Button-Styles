package za.co.mmagon.jwebswing.plugins.angularprogressbuttonstyles;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.base.ajax.AjaxCall;
import za.co.mmagon.jwebswing.base.ajax.AjaxResponse;
import za.co.mmagon.jwebswing.events.click.ClickAdapter;
import za.co.mmagon.jwebswing.generics.Direction;

/**
 *
 * @author Marc Magon
 */
public class ProgressButtonStyleTest extends BaseTestClass
{

    public ProgressButtonStyleTest()
    {
    }

    @Test
    public void testSetStyle()
    {
        ProgressButtonStyle pbs = new ProgressButtonStyle(new ClickAdapter(getPage().getBody())
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
        ProgressButtonStyle pbs = new ProgressButtonStyle(new ClickAdapter(getPage().getBody())
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
