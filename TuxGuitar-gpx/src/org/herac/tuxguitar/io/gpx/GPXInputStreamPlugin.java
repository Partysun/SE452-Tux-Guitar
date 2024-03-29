package org.herac.tuxguitar.io.gpx;

import org.herac.tuxguitar.app.system.plugins.base.TGInputStreamPlugin;
import org.herac.tuxguitar.io.base.TGInputStreamBase;

public class GPXInputStreamPlugin extends TGInputStreamPlugin{
	
	protected TGInputStreamBase getInputStream() {
		return new GPXInputStream();
	}
	
	public String getAuthor() {
		return "J.Jørgen von Bargen, Julian Casadesus <julian@casadesus.com.ar>";
	}
	
	public String getDescription() {
		return "GPX File Format plugin based on code contributed by J.Jørgen von Bargen";
	}
	
	public String getName() {
		return "GPX File Format plugin";
	}
	
	public String getVersion() {
		return "0.1";
	}
}
