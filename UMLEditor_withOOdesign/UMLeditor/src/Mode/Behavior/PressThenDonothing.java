package Mode.Behavior;

import java.awt.*;

public class PressThenDonothing implements PressBehavior {
    @Override
    public Boolean press(Point pos) {
        return false;
    }
}
