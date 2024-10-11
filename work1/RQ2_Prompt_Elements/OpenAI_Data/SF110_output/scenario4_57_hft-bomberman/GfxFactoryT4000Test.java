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
		
		private String powerUpType = "";
		
		private Image powerUpImage;
		
		private HashMap<String, Image> powerUpImageCache;
		
		private String path = "";
		
		private Image image;
		
		private String type = "";
		
		private String powerUpType1 = "bomb";
		
		private String powerUpType2 = "flame";
		
		private String powerUpType3 = "speed";
		
		private String powerUpType4 = "wallpass";
		
		private String powerUpType5 = "bombpass";
		
		private String powerUpType6 = "flamepass";
		
		private String powerUpType7 = "detonator";
		
		private String powerUpType8 = "kick";
		
		private String powerUpType9 = "skate";
		
		private String powerUpType10 = "";
		
		private String powerUpType11 = "";
		
		private String powerUpType12 = "";
		
		private String powerUpType13 = "";
		
		private String powerUpType14 = "";
		
		private String powerUpType15 = "";
		
		private String powerUpType16 = "";
		
		private String powerUpType17 = "";
		
		private String powerUpType18 = "";
		
		private String powerUpType19 = "";
		
		private String powerUpType20 = "";
		
		private String powerUpType21 = "";
		
		private String powerUpType22 = "";
		
		private String powerUpType23 = "";
		
		private String powerUpType24 = "";
		
		private String powerUpType25 = "";
		
		private String powerUpType26 = "";
		
		private String powerUpType27 = "";
		
		private String powerUpType28 = "";
		
		private String powerUpType29 = "";
		
		private String powerUpType30 = "";
		
		private String powerUpType31 = "";
		
		private String powerUpType32 = "";
		
		private String powerUpType33 = "";
		
		private String powerUpType34 = "";
		
		private String powerUpType35 = "";
		
		private String powerUpType36 = "";
		
		private String powerUpType37 = "";
		
		private String powerUpType38 = "";
		
		private String powerUpType39 = "";
		
		private String powerUpType40 = "";
		
		private String powerUpType41 = "";
		
		private String powerUpType42 = "";
		
		private String powerUpType43 = "";
		
		private String powerUpType44 = "";
		
		private String powerUpType45 = "";
		
		private String powerUpType46 = "";
		
		private String powerUpType47 = "";
		
		private String powerUpType48 = "";
		
		private String powerUpType49 = "";
		
		private String powerUpType50 = "";
		
		private String powerUpType51 = "";
		
		private String powerUpType52 = "";
		
		private String powerUpType53 = "";
		
		private String powerUpType54 = "";
		
		private String powerUpType55 = "";
		
		private String powerUpType56 = "";
		
		private String powerUpType57 = "";
		
		private String powerUpType58 = "";
		
		private String powerUpType59 = "";
		
		private String powerUpType60 = "";
		
		private String powerUpType61 = "";
		
		private String powerUpType62 = "";
		
		private String powerUpType63 = "";
		
		private String powerUpType64 = "";
		
		private String powerUpType65 = "";
		
		private String powerUpType66 = "";
		
		private String powerUpType67 = "";
		
		private String powerUpType68 = "";
		
		private String powerUpType69 = "";
		
		private String powerUpType70 = "";
		
		private String powerUpType71 = "";
		
		private String powerUpType72 = "";
		
		private String powerUpType73 = "";
		
		private String powerUpType74 = "";
		
		private String powerUpType75 = "";
		
		private String powerUpType76 = "";
		
		private String powerUpType77 = "";
		
		private String powerUpType78 = "";
		
		private String powerUpType79 = "";
		
		private String powerUpType80 = "";
		
		private String powerUpType81 = "";
		
		private String powerUpType82 = "";
		
		private String powerUpType83 = "";
		
		private String powerUpType84 = "";
		
		private String powerUpType85 = "";
		
		private String powerUpType86 = "";
		
		private String powerUpType87 = "";
		
		private String powerUpType88 = "";
		
		private String powerUpType89 = "";
		
		private String powerUpType90 = "";
		
		private String powerUpType91 = "";
		
		private String powerUpType92 = "";
		
		private String powerUpType93 = "";
		
		private String powerUpType94 = "";
		
		private String powerUpType95 = "";
		
		private String powerUpType96 = "";
		
		private String powerUpType97 = "";
		
		private String powerUpType98 = "";
		
		private String powerUpType99 = "";
		
		private String powerUpType100 = "";
		
		private String powerUpType101 = "";
		
		private String powerUpType102 = "";
		
		private String powerUpType103 = "";
		
		private String powerUpType104 = "";
		
		private String powerUpType105 = "";
		
		private String powerUpType106 = "";
		
		private String powerUpType107 = "";
		
		private String powerUpType108 = "";
		
		private String powerUpType109 = "";
		
		private String powerUpType110 = "";
		
		private String powerUpType111 = "";
		
		private String powerUpType112 = "";
		
		private String powerUpType113 = "";
		
		private String powerUpType114 = "";
		
		private String powerUpType115 = "";
		
		private String powerUpType116 = "";
		
		private String powerUpType117 = "";
		
		private String powerUpType118 = "";
		
		private String powerUpType119 = "";
		
		private String powerUpType120 = "";
		
		private String powerUpType121 = "";
		
		private String powerUpType122 = "";
		
		private String powerUpType123 = "";
		
		private String powerUpType124 = "";
		
		private String powerUpType125 = "";
		
		private String powerUpType126 = "";
		
		private String powerUpType127 = "";
		
		private String powerUpType128 = "";
		
		private String powerUpType129 = "";
		
		private String powerUpType130 = "";
		
		private String powerUpType131 = "";
		
		private String powerUpType132 = "";
		
		private String powerUpType133 = "";
		
		private String powerUpType134 = "";
		
		private String powerUpType135 = "";
		
		private String powerUpType136 = "";
		
		private String powerUpType137 = "";
		
		private String powerUpType138 = "";
		
		private String powerUpType139 = "";
		
		private String powerUpType140 = "";
		
		private String powerUpType141 = "";
		
		private String powerUpType142 = "";
		
		private String powerUpType143 = "";
		
		private String powerUpType144 = "";
		
		private String powerUpType145 = "";
		
		private String powerUpType146 = "";
		
		private String powerUpType147 = "";
		
		private String powerUpType148 = "";
		
		private String powerUpType149 = "";
		
		private String powerUpType150 = "";
		
		private String powerUpType151 = "";
		
		private String powerUpType152 = "";
		
		private String powerUpType153 = "";
		
		private String powerUpType154 = "";
		
		private String powerUpType155 = "";
		
		private String powerUpType156 = "";
		
		private String powerUpType157 = "";
		
		private String powerUpType158 = "";
		
		private String powerUpType159 = "";
		
		private String powerUpType160 = "";
		
		private String powerUpType161 = "";
		
		private String powerUpType162 = "";
		
		private String powerUpType163 = "";
		
		private String powerUpType164 = "";
		
		private String powerUpType165 = "";
		
		private String powerUpType166 = "";
		
		private String powerUpType167 = "";
		
		private String powerUpType168 = "";
		
		private String powerUpType169 = "";
		
		private String powerUpType170 = "";
		
		private String powerUpType171 = "";
		
		private String powerUpType172 = "";
		
		private String powerUpType173 = "";
		
		private String powerUpType174 = "";
		
		private String powerUpType175 = "";
		
		private String powerUpType176 = "";
		
		private String powerUpType177 = "";
		
		private String powerUpType178 = "";
		
		private String powerUpType179 = "";
		
		private String powerUpType180 = "";
		
		private String powerUpType181 = "";
		
		private String powerUpType182 = "";
		
		private String powerUpType183 = "";
		
		private String powerUpType184 = "";
		
		private String powerUpType185 = "";
		
		private String powerUpType186 = "";
		
		private String powerUpType187 = "";
		
		private String powerUpType188 = "";
		
		private String powerUpType189 = "";
		
		private String powerUpType190 = "";
		
		private String powerUpType191 = "";
		
		private String powerUpType192 = "";
		
		private String powerUpType193 = "";
		
		private String powerUpType194 = "";
		
		private String powerUpType195 = "";
		
		private String powerUpType196 = "";
		
		private String powerUpType197 = "";
		
		private String powerUpType198 = "";
		
		private String powerUpType199 = "";
		
		private String powerUpType200 = "";
		
		private String powerUpType201 = "";
		
		private String powerUpType202 = "";
		
		private String powerUpType203 = "";
		
		private String powerUpType204 = "";
		
		private String powerUpType205 = "";
		
		private String powerUpType206 = "";
		
		private String powerUpType207 = "";
		
		private String powerUpType208 = "";
		
		private String powerUpType209 = "";
		
		private String powerUpType210 = "";
		
		private String powerUpType211 = "";
		
		private String powerUpType212 = "";
		
		private String powerUpType213 = "";
		
		private String powerUpType214 = "";
		
		private String powerUpType215 = "";
		
		private String powerUpType216 = "";
		
		private String powerUpType217 = "";
		
		private String powerUpType218 = "";
		
		private String powerUpType219 = "";
		
		private String powerUpType220 = "";
		
		private String powerUpType221 = "";
		
		private String powerUpType222 = "";
		
		private String powerUpType223 = "";
		
		private String powerUpType224 = "";
		
		private String powerUpType225 = "";
		
		private String powerUpType226 = "";
		
		private String powerUpType227 = "";
		
		private String powerUpType228 = "";
		
		private String powerUpType229 = "";
		
		private String powerUpType230 = "";
		
		private String powerUpType231 = "";
		
		private String powerUpType232 = "";
		
		private String powerUpType233 = "";
		
		private String powerUpType234 = "";
		
		private String powerUpType235 = "";
		
		private String powerUpType236 = "";
		
		private String powerUpType237 = "";
		
		private String powerUpType238 = "";
		
		private String powerUpType239 = "";
		
		private String powerUpType240 = "";
		
		private String powerUpType241 = "";
		
		private String powerUpType242 = "";
		
		private String powerUpType243 = "";
		
		private String powerUpType244 = "";
		
		private String powerUpType245 = "";
		
		private String powerUpType246 = "";
		
		private String powerUpType247 = "";
		
		private String powerUpType248 = "";
		
		private String powerUpType249 = "";
		
		private String powerUpType250 = "";
		
		private String powerUpType251 = "";
		
		private String powerUpType252 = "";
		
		private String powerUpType253 = "";
		
		private String powerUpType254 = "";
		
		private String powerUpType255 = "";
		
		private String powerUpType256 = "";
