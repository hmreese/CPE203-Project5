import processing.core.PImage;
import java.util.List;

public class Snowflake extends ActivityEntity{

    private static final String CRAB_KEY = "crab";
    private static final int CRAB_PERIOD_SCALE = 4;
    private static final int CRAB_ANIMATION_MIN = 50;
    private static final int CRAB_ANIMATION_MAX = 150;

    public Snowflake(Point position, int actionPeriod, List<PImage> images) {
        super(position, images, 0, actionPeriod);
    }

    public void executeActivity(WorldModel world, ImageStore imageStore, EventScheduler scheduler)
    {
        Point pos = this.getPosition();  // store current position before removing

        world.removeEntity(this);
        scheduler.unscheduleAllEvents(this);
    }

}
