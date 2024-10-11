// Drink_0Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {
// Drink.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;

/**
 * @author Rainer Friesen
 */
public class Drink {

    /**
     * Recalculate the current price for this drink
     */
    public int recalculate() {
        //Calculate new average values
        totalSold += lastSold;
        averageAmount = (float) totalSold / model.getIteration();
        averagePrice = ((averagePrice * (model.getIteration() - 1)) + currentPrice) / model.getIteration();
        if (totalSold > 0) {
            averageSoldPrice = ((averageSoldPrice * (totalSold - lastSold)) + (currentPrice * lastSold)) / totalSold;
        }
        int newPrice;
        if (directPrice!= 0) {
            // If a direct price was set, use it
            newPrice = directPrice;
            directPrice = 0;
        } else if (keepPrice) {
            // Keep the price
            newPrice = currentPrice;
        } else {
            // Calculate the new price
            double diffSold = lastSold - targetAmount;
            double factor = diffSold / deltaAmount;
            double change = factor * maxStep;
            int priceSteps = model.getSettings().getPriceSteps();
            double rest = Math.floor(Math.abs(change % priceSteps));
            double full = Math.floor(Math.abs(change / priceSteps));
            int priceChange = 0;
            if (rest >= priceSteps / 2) {
                priceChange = priceSteps;
            }
            priceChange += full * priceSteps;
            // Check that the change of the price is not more than the max step
            if (priceChange > maxStep) {
                priceChange = maxStep;
            }
            if (model.getSettings().isStandardLogic()) {
                if (factor >= 0) {
                    newPrice = currentPrice + priceChange;
                } else {
                    newPrice = currentPrice - priceChange;
                }
            } else {
                // Inverse logic
                if (factor >= 0) {
                    newPrice = currentPrice - priceChange;
                } else {
                    newPrice = currentPrice + priceChange;
                }
            }
        }
        // Check that the new price is not above the max price or below the min price
        if (newPrice > maxPrice) {
            newPrice = maxPrice;
        } else if (newPrice < minPrice) {
            newPrice = minPrice;
        }
        // Calculate the trend
        if (newPrice > currentPrice) {
            trend = 1;
        } else if (newPrice < currentPrice) {
            trend = -1;
        } else {
            trend = 0;
        }
        currentPrice = newPrice;
        //Debug output
        model.getLog().debug("Recalculating drink: " + name + " for iteration: " + model.getIteration());
        model.getLog().debug("Last sold: " + lastSold);
        model.getLog().debug("Total sold:" + totalSold);
        model.getLog().debug("Average sold: " + averageAmount);
        model.getLog().debug("Average price: " + averagePrice);
        model.getLog().debug("Average sold price: " + averageSoldPrice);
        model.getLog().debug("New price: " + currentPrice);
        // Reset values for the next iteration
        lastSold = 0;
        return currentPrice;
    }
}

// Drink_0Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {
		/**
		 * @NoArgsConstructor Use only in Spring
		 * @param <T>
		 */
		@Test
		public void test001_S1_recalculate() throws Exception {
			model.getLog().debug(SimpleModel.getMethodName());
			model.setSettings(SimpleModel.getSettings());
			model.getSettings().set(SimpleModel.PRODUCTION_BOUNDARY, true);
			model.getSettings().set(SimpleModel.PRODUCTION_DEVICE_BOUNDARY, true);
			model.getSettings().set(SimpleModel.PRODUCTION_TRAFFIC_TRAINING, true);
			// Run the test
			String fullPath = new File(new File("src/test/resources/drink/")
					.getCanonicalPath() + "/" + name).getAbsolutePath();
			model.getSettings().set(SimpleModel.TRAFFIC_TRAINING,
					new File(fullPath).exists());
			new Drink().recalculate();
		}

		@Test
		public void test002_S1_recalculate_T() throws Exception {
			model.getLog().debug(SimpleModel.getMethodName());
			model.getLog().debug(SimpleModel.getMethodDisplayName());
			model.setSettings(SimpleModel.getSettings());
			model.getSettings().set(SimpleModel.PRODUCTION_BOUNDARY, true);
			model.getSettings().set(SimpleModel.PRODUCTION_DEVICE_BOUNDARY, true);
			model.getSettings().set(SimpleModel.PRODUCTION_TRAFFIC_TRAINING, true);
            new Drink_T().recalculate();
		}

		@Test
		public void test_S1_recalculate_test() throws Exception {
			model.getLog().debug(SimpleModel.getMethodName());
			model.getLog().debug(SimpleModel.getMethodDisplayName());
			model.setSettings(SimpleModel.getSettings());
			model.getSettings().set(SimpleModel.PRODUCTION_BOUNDARY, true);
			model.getSettings().set(SimpleModel.PRODUCTION_DEVICE_BOUNDARY, true);
			model.getSettings().set(SimpleModel.PRODUCTION_TRAFFIC_TRAINING, true);
			// Run the test
			String simplePath = new File(SimpleModel.getMethodDisplayName()
					.replace("{model}", model.getName()).replace("{iteration}",
					model.getIteration()).replace("{model.name}", model.getName())
					.replace("{model_name}", model.getName())).getAbsolutePath();
			String fullPath = new File(new File(fullPath)
					.getCanonicalPath() + "/" + name).getAbsolutePath();
			document = new Document();
			SAXBuilder builder = new SAXBuilder();
			builder.setFeature("http://xml.org/sax/features/external-general-entities", false);
			builder.setFeature("http://xml.org/sax/features/external-parameter-entities",
					false);
			builder.setFeature("http://xml.org/sax/features/external-parameter-entities",
					false);
			builder.setFeature("http://xml.org/sax/features/external-parameter-entities",
					false);
			Document doc = builder.build(new File(simplePath + "/" + name));
			Element root = doc.getRootElement();
			model.setSettings(model.getSettings()
					.set(SimpleModel.TRAFFIC_TRAFFIC_TRAINING, true));
			model.getSettings().getTransient().set(
					SimpleModel.TRANSIENT_PRODUCTION_BOUNDARY, true);
			Element tr = root.addContent(new Element("transient_productivity"));
			tr.add