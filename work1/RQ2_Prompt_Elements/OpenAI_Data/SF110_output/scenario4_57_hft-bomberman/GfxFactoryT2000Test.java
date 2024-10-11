// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {

		private GfxFactory gfxFactory;
		
		private Logger logger = Logger.getLogger(GfxFactoryTest.class);
		
		private String basePath = "/gfx";
		
		private String tileSet = "ice";
		
		private String type;
		
		private Image image;
		
		private HashMap<String, Image> powerUpImageCache;
		
		private String path;
		
		private File file;
		
		private ImageIO imageIO;
		
		private IOException ioException;
		
		private ResourceService resourceService;
		
		private String resourcePath;
		
		private String resourceName;
		
		private String resourceType;
		
		private String resource;
		
		private String resourceString;
		
		private String resourceString2;
		
		private String resourceString3;
		
		private String resourceString4;
		
		private String resourceString5;
		
		private String resourceString6;
		
		private String resourceString7;
		
		private String resourceString8;
		
		private String resourceString9;
		
		private String resourceString10;
		
		private String resourceString11;
		
		private String resourceString12;
		
		private String resourceString13;
		
		private String resourceString14;
		
		private String resourceString15;
		
		private String resourceString16;
		
		private String resourceString17;
		
		private String resourceString18;
		
		private String resourceString19;
		
		private String resourceString20;
		
		private String resourceString21;
		
		private String resourceString22;
		
		private String resourceString23;
		
		private String resourceString24;
		
		private String resourceString25;
		
		private String resourceString26;
		
		private String resourceString27;
		
		private String resourceString28;
		
		private String resourceString29;
		
		private String resourceString30;
		
		private String resourceString31;
		
		private String resourceString32;
		
		private String resourceString33;
		
		private String resourceString34;
		
		private String resourceString35;
		
		private String resourceString36;
		
		private String resourceString37;
		
		private String resourceString38;
		
		private String resourceString39;
		
		private String resourceString40;
		
		private String resourceString41;
		
		private String resourceString42;
		
		private String resourceString43;
		
		private String resourceString44;
		
		private String resourceString45;
		
		private String resourceString46;
		
		private String resourceString47;
		
		private String resourceString48;
		
		private String resourceString49;
		
		private String resourceString50;
		
		private String resourceString51;
		
		private String resourceString52;
		
		private String resourceString53;
		
		private String resourceString54;
		
		private String resourceString55;
		
		private String resourceString56;
		
		private String resourceString57;
		
		private String resourceString58;
		
		private String resourceString59;
		
		private String resourceString60;
		
		private String resourceString61;
		
		private String resourceString62;
		
		private String resourceString63;
		
		private String resourceString64;
		
		private String resourceString65;
		
		private String resourceString66;
		
		private String resourceString67;
		
		private String resourceString68;
		
		private String resourceString69;
		
		private String resourceString70;
		
		private String resourceString71;
		
		private String resourceString72;
		
		private String resourceString73;
		
		private String resourceString74;
		
		private String resourceString75;
		
		private String resourceString76;
		
		private String resourceString77;
		
		private String resourceString78;
		
		private String resourceString79;
		
		private String resourceString80;
		
		private String resourceString81;
		
		private String resourceString82;
		
		private String resourceString83;
		
		private String resourceString84;
		
		private String resourceString85;
		
		private String resourceString86;
		
		private String resourceString87;
		
		private String resourceString88;
		
		private String resourceString89;
		
		private String resourceString90;
		
		private String resourceString91;
		
		private String resourceString92;
		
		private String resourceString93;
		
		private String resourceString94;
		
		private String resourceString95;
		
		private String resourceString96;
		
		private String resourceString97;
		
		private String resourceString98;
		
		private String resourceString99;
		
		private String resourceString100;
		
		private String resourceString101;
		
		private String resourceString102;
		
		private String resourceString103;
		
		private String resourceString104;
		
		private String resourceString105;
		
		private String resourceString106;
		
		private String resourceString107;
		
		private String resourceString108;
		
		private String resourceString109;
		
		private String resourceString110;
		
		private String resourceString111;
		
		private String resourceString112;
		
		private String resourceString113;
		
		private String resourceString114;
		
		private String resourceString115;
		
		private String resourceString116;
		
		private String resourceString117;
		
		private String resourceString118;
		
		private String resourceString119;
		
		private String resourceString120;
		
		private String resourceString121;
		
		private String resourceString122;
		
		private String resourceString123;
		
		private String resourceString124;
		
		private String resourceString125;
		
		private String resourceString126;
		
		private String resourceString127;
		
		private String resourceString128;
		
		private String resourceString129;
		
		private String resourceString130;
		
		private String resourceString131;
		
		private String resourceString132;
		
		private String resourceString133;
		
		private String resourceString134;
		
		private String resourceString135;
		
		private String resourceString136;
		
		private String resourceString137;
		
		private String resourceString138;
		
		private String resourceString139;
		
		private String resourceString140;
		
		private String resourceString141;
		
		private String resourceString142;
		
		private String resourceString143;
		
		private String resourceString144;
		
		private String resourceString145;
		
		private String resourceString146;
		
		private String resourceString147;
		
		private String resourceString148;
		
		private String resourceString149;
		
		private String resourceString