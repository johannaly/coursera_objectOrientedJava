package module6;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	protected PImage icon;
	
	public OceanQuakeMarker(PointFeature quake, PImage icon) {
		super(quake, icon);
		
		// setting field in earthquake marker
		isOnLand = false;
		
		this.icon = icon;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.pushStyle();
		//pg.imageMode(PConstants.CORNER);
		pg.imageMode(PConstants.CENTER);
		//pg.tint(255, 128);
		pg.image(icon, x, y, 2 * radius, 2 * radius);
		pg.popStyle();
		
		// pg.rect(x-radius, y-radius, 2*radius, 2*radius);
	}
	

	

}
