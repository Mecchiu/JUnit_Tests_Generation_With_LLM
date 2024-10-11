// Component3DManager_1Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)} method.
*/
class Component3DManager_1Test {

	@Test
	void testGetOnscreenCanvas3D_1() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_2() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_3() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_4() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_5() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_6() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_7() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_8() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_9() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOnscreenCanvas3D_10() {
		// Test the creation of a canvas 3D with a rendering observer
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D(new RenderingObserver() {
			public void canvas3DPreRendered(Canvas3D canvas3D) {
			}
			public void canvas3DPostRendered(Canvas3D canvas3D) {
			}
			public void canvas3DSwapped(Canvas3D canvas3D) {
			}
		});
		assertNotNull(canvas3D);
	}
}

// Component3DManager_2Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOffScreenCanvas3D(int, int)} method.
*/
class Component3DManager_2Test {
		
	@Test
	void testGetOffScreenCanvas3D_1() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_2() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_3() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_4() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_5() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_6() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_7() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_8() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_9() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
	
	@Test
	void testGetOffScreenCanvas3D_10() {
		// Test the creation of an off screen canvas 3D
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOffScreenCanvas3D(100, 100);
		assertNotNull(canvas3D);
	}
}

// Component3DManager_3Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOffScreenImage(View, int, int)} method.
*/
class Component3DManager_3Test {
		
	@Test
	void testGetOffScreenImage_1() {
		// Test the creation of an off screen image
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D();
		View view = new View();
		view.addCanvas3D(canvas3D);
		BufferedImage image = manager.getOffScreenImage(view, 100, 100);
		assertNotNull(image);
	}
	
	@Test
	void testGetOffScreenImage_2() {
		// Test the creation of an off screen image
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D();
		View view = new View();
		view.addCanvas3D(canvas3D);
		BufferedImage image = manager.getOffScreenImage(view, 100, 100);
		assertNotNull(image);
	}
	
	@Test
	void testGetOffScreenImage_3() {
		// Test the creation of an off screen image
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D();
		View view = new View();
		view.addCanvas3D(canvas3D);
		BufferedImage image = manager.getOffScreenImage(view, 100, 100);
		assertNotNull(image);
	}
	
	@Test
	void testGetOffScreenImage_4() {
		// Test the creation of an off screen image
		Component3DManager manager = Component3DManager.getInstance();
		Canvas3D canvas3D = manager.getOnscreenCanvas3D