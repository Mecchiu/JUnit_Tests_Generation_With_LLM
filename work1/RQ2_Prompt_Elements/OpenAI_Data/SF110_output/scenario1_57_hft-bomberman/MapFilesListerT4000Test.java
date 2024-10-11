// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {

		private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps2() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps3() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps4() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps5() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps6() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps7() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps8() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps9() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps10() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
}

// MapInfo.java
package messages.global;

import java.io.Serializable;

/**
 * class for map information
 *
 * @author christian
 */
public class MapInfo implements Serializable {

    private String name;
    private String description;
    private String author;
    private String version;
    private String date;
    private String mapFile;
    private String mapImage;
    private int width;
    private int height;
    private int maxPlayers;
    private int minPlayers;
    private int maxTeams;
    private int minTeams;
    private int maxUnits;
    private int minUnits;
    private int maxBuildings;
    private int minBuildings;
    private int maxResources;
    private int minResources;
    private int maxRounds;
    private int minRounds;
    private int maxTime;
    private int minTime;
    private int maxScore;
    private int minScore;
    private int maxMoney;
    private int minMoney;
    private int maxEnergy;
    private int minEnergy;
    private int maxPower;
    private int minPower;
    private int maxPopulation;
    private int minPopulation;
    private int maxUnitLimit;
    private int minUnitLimit;
    private int maxBuildingLimit;
    private int minBuildingLimit;
    private int maxResearchLimit;
    private int minResearchLimit;
    private int maxUnitCost;
    private int minUnitCost;
    private int maxBuildingCost;
    private int minBuildingCost;
    private int maxResearchCost;
    private int minResearchCost;
    private int maxUnitPower;
    private int minUnitPower;
    private int maxBuildingPower;
    private int minBuildingPower;
    private int maxResearchPower;
    private int minResearchPower;
    private int maxUnitPoints;
    private int minUnitPoints;
    private int maxBuildingPoints;
    private int minBuildingPoints;
    private int maxResearchPoints;
    private int minResearchPoints;
    private int maxUnitRange;
    private int minUnitRange;
    private int maxBuildingRange;
    private int minBuildingRange;
    private int maxResearchRange;
    private int minResearchRange;
    private int maxUnitSight;
    private int minUnitSight;
    private int maxBuildingSight;
    private int minBuildingSight;
    private int maxResearchSight;
    private int minResearchSight;
    private int maxUnitSpeed;
    private int minUnitSpeed;
    private int maxBuildingSpeed;
    private int minBuildingSpeed;
    private int maxResearchSpeed;
    private int minResearchSpeed;
    private int maxUnitStrength;
    private int minUnitStrength;
    private int maxBuildingStrength;
    private int minBuildingStrength;
    private int maxResearchStrength;
    private int minResearchStrength;
    private int maxUnitArmor;
    private int minUnitArmor;
    private int maxBuildingArmor;
    private int minBuildingArmor;
    private int maxResearchArmor;
    private int minResearchArmor;
    private int maxUnitHitpoints;
    private int minUnitHitpoints;
    private int maxBuildingHitpoints;
    private int minBuildingHitpoints;
    private int maxResearchHitpoints;
    private int minResearchHitpoints;
    private int maxUnitDamage;
    private int minUnitDamage;
    private int maxBuildingDamage;
    private int minBuildingDamage;
    private int maxResearchDamage;
    private int minResearchDamage;
    private int maxUnitReload;
    private int minUnitReload;
    private int maxBuildingReload;
    private int minBuildingReload;
    private int maxResearchReload;
    private int minResearchReload;
    private int maxUnitAmmo;
    private int minUnitAmmo;
    private int maxBuildingAmmo;
    private int minBuildingAmmo;
    private int maxResearchAmmo;
    private int minResearchAmmo;
    private int maxUnitFuel;
    private int minUnitFuel;
    private int maxBuildingFuel;
    private int minBuildingFuel;
    private int maxResearchFuel;
    private int minResearchFuel;
    private int maxUnitSupply;
    private int minUnitSupply;
    private int maxBuildingSupply;
    private int minBuildingSupply;
    private int maxResearchSupply;
    private int minResearchSupply;
    private int maxUnitUpkeep;
    private int minUnitUpkeep;
    private int maxBuildingUpkeep;
    private int minBuildingUpkeep;
    private int maxResearchUpkeep;
    private int minResearchUpkeep;
    private int maxUnitExperience;
    private int minUnitExperience;
    private int maxBuildingExperience;
    private int minBuildingExperience;
    private int maxResearchExperience;
    private int minResearchExperience;
    private int maxUnitTrainingTime;
    private int minUnitTrainingTime;
    private int maxBuildingTrainingTime;
    private int minBuildingTrainingTime;
    private int maxResearchTrainingTime;
    private int minResearchTrainingTime;
    private int maxUnitTrainingCost;
    private int minUnitTrainingCost;
    private int maxBuildingTrainingCost;
    private int minBuildingTrainingCost;
    private int maxResearchTrainingCost;
    private int minResearchTrainingCost;
    private int maxUnitTrainingPower;
    private int minUnitTrainingPower;
    private int maxBuildingTrainingPower;
    private int minBuildingTrainingPower;
    private int maxResearchTrainingPower;
    private int minResearchTrainingPower;
    private int maxUnitTrainingPoints;
    private int minUnitTrainingPoints;
    private int maxBuildingTrainingPoints;
    private int minBuildingTrainingPoints;
    private int maxResearchTrainingPoints;
    private int minResearchTrainingPoints;
    private int maxUnitTrainingRange;
    private int minUnitTrainingRange;
    private int maxBuildingTrainingRange;
    private int minBuildingTrainingRange;
    private int maxResearchTrainingRange;
    private int minResearchTrainingRange;
    private int maxUnitTrainingSight;
    private int minUnitTrainingSight;
    private int maxBuildingTrainingSight;
    private int minBuildingTrainingSight;
    private int maxResearchTrainingSight;
    private int minResearchTrainingSight;
    private int maxUnitTrainingSpeed;
    private int minUnitTrainingSpeed;
    private int maxBuildingTrainingSpeed;
    private int minBuildingTrainingSpeed;
    private int maxResearchTrainingSpeed;
    private int minResearchTrainingSpeed;
    private int maxUnitTrainingStrength;
    private int minUnitTrainingStrength;
    private int maxBuildingTrainingStrength;
    private int minBuildingTrainingStrength;
    private int maxResearchTrainingStrength;
    private int minResearchTrainingStrength;
    private int maxUnitTrainingArmor;
    private int minUnitTrainingArmor;
    private int maxBuildingTrainingArmor;
    private int minBuildingTrainingArmor;
    private int maxResearchTrainingArmor;
    private int minResearchTrainingArmor;
    private int maxUnitTrainingHitpoints;
    private int minUnitTrainingHitpoints;
    private int maxBuildingTrainingHitpoints;
    private int minBuildingTrainingHitpoints;
    private int maxResearchTrainingHitpoints;
    private int minResearchTrainingHitpoints;
    private int maxUnitTrainingDamage;
    private int minUnitTrainingDamage;
    private int maxBuildingTrainingDamage;
    private int minBuildingTrainingDamage;
    private int maxResearchTrainingDamage;
    private int minResearchTrainingDamage;
    private int maxUnitTrainingReload;
    private int minUnitTrainingReload;
    private int maxBuildingTrainingReload;
    private int minBuildingTrainingReload;
    private int maxResearchTrainingReload;
    private int minResearchTrainingReload;
    private int maxUnitTrainingAmmo;
    private int minUnitTrainingAmmo;
    private int maxBuildingTrainingAmmo;
    private int minBuildingTrainingAmmo;
    private int maxResearchTrainingAmmo;
    private int minResearchTrainingAmmo;
    private int maxUnitTrainingFuel;
    private int minUnitTrainingFuel;
    private int maxBuildingTrainingFuel;
    private int minBuildingTrainingFuel;
    private int maxResearchTrainingFuel;
    private int minResearchTrainingFuel;
    private int maxUnitTrainingSupply;
    private int minUnitTrainingSupply;
    private int maxBuildingTrainingSupply;
    private int minBuildingTrainingSupply;
    private int maxResearchTrainingSupply;
    private int minResearchTrainingSupply;
    private int maxUnitTrainingUpkeep;
    private int minUnitTrainingUpkeep;
    private int maxBuildingTrainingUpkeep;
    private int minBuildingTrainingUpkeep;
    private int maxResearchTrainingUpkeep;
    private int minResearchTrainingUpkeep;
    private int maxUnitTrainingExperience;
    private int minUnitTrainingExperience;
    private int maxBuildingTrainingExperience;
    private int minBuildingTrainingExperience;
    private int maxResearchTrainingExperience;
    private int minResearchTrainingExperience;
    private int maxUnitTrainingTrainingTime;
    private int minUnitTrainingTrainingTime;
    private int maxBuildingTrainingTrainingTime;
    private int minBuildingTrainingTrainingTime;
    private int maxResearchTrainingTrainingTime;
    private int minResearchTrainingTrainingTime;
    private int maxUnitTrainingTrainingCost;
    private int minUnitTrainingTrainingCost;
    private int maxBuildingTrainingTrainingCost;
    private int minBuildingTrainingTrainingCost;
    private int maxResearchTrainingTrainingCost;
    private int minResearchTrainingTrainingCost;
    private int maxUnitTrainingTrainingPower;
    private int minUnitTrainingTrainingPower;
    private int maxBuildingTrainingTrainingPower;
    private int minBuildingTrainingTrainingPower;
    private int maxResearchTrainingTrainingPower;
    private int minResearchTrainingTrainingPower;
    private int maxUnitTrainingTrainingPoints;
    private int minUnitTrainingTrainingPoints;
    private int maxBuildingTrainingTrainingPoints;
    private int minBuildingTrainingTrainingPoints;
    private int maxResearchTrainingTrainingPoints;
    private int minResearchTrainingTrainingPoints;
    private int maxUnitTrainingTrainingRange;
    private int minUnitTrainingTrainingRange;
    private int maxBuildingTrainingTrainingRange;
    private int minBuildingTrainingTrainingRange;
    private int maxResearchTrainingTrainingRange;
    private int minResearchTrainingTrainingRange;
    private int maxUnitTrainingTrainingSight;
    private int minUnitTrainingTrainingSight;
    private int maxBuildingTrainingTrainingSight;
    private int minBuildingTrainingTrainingSight;
    private int maxResearchTrainingTrainingSight;
    private int minResearchTrainingTrainingSight;
    private int maxUnitTrainingTrainingSpeed;
    private int minUnitTrainingTrainingSpeed;
    private int maxBuildingTrainingTrainingSpeed;
    private int minBuildingTrainingTrainingSpeed;
    private int maxResearchTrainingTrainingSpeed;
    private int minResearchTrainingTrainingSpeed;
    private int maxUnitTrainingTrainingStrength;
    private int minUnitTrainingTrainingStrength;
    private int maxBuildingTrainingTrainingStrength;
    private int minBuildingTrainingTrainingStrength;
    private int maxResearchTrainingTrainingStrength;
    private int minResearchTrainingTrainingStrength;
    private int maxUnitTrainingTrainingArmor;
    private int minUnitTrainingTrainingArmor;
    private int maxBuildingTrainingTrainingArmor;
    private int minBuildingTrainingTrainingArmor;
    private int maxResearchTrainingTrainingArmor;
    private int minResearchTrainingTrainingArmor;
    private int maxUnitTrainingTrainingHitpoints;
    private int minUnitTrainingTrainingHitpoints;
    private int maxBuildingTrainingTrainingHitpoints;
    private int minBuildingTrainingTrainingHitpoints;
    private int maxResearchTrainingTrainingHitpoints;
    private int minResearchTrainingTrainingHitpoints;
    private int maxUnitTrainingTrainingDamage;
    private int minUnitTrainingTrainingDamage;
    private int maxBuildingTrainingTrainingDamage;
    private int minBuildingTrainingTrainingDamage;
    private int maxResearchTrainingTrainingDamage;
    private int minResearchTrainingTrainingDamage;
    private int maxUnitTrainingTrainingReload;
    private int minUnitTrainingTrainingReload;
    private int maxBuildingTrainingTrainingReload;
    private int minBuildingTrainingTrainingReload;
    private int maxResearchTraining