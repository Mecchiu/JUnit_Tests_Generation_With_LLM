// ApplicationConfiguration_8Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains one unit test case for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
/**
		* Default {@link ApplicationConfiguration Configuration} class.
		*/
		@SuppressWarnings("rawtypes")
		public static class Configuration extends ApplicationConfiguration {
				
				/**
				* The "close" action to be added to the main menu.
				*/
				@Bean(name="closeAction")
				CloseAction closeAction() {
						return (CloseAction)application::close;
					}
				
				@Bean(destroyMethod = "close")
				intProperty getProperty() {
						return property;
				}
				
				@Bean(name="application")
				Application application() {
						return Application.getInstance();
				}
				
				@Bean(name="labelTitle")
				LabelTitle labelTitle() {
						return LabelTitle.LABEL;
				}
				
				@Bean(name="labelText")
				ListLabel text(String labelText) {
						return LabelText.LIST(labelText);
				}
				
				@Bean(name="labelMenuText")
				MenuItem text(MenuItem menuItem) {
						return ListMenuItem.MENU(menuItem);
				}
				
				@Bean(name="menuButton")
				JTailMainButton menuButton() {
						return JTailMainButton.JTail_MENU;
				}
				
			}

       public static class OpenFileModel_8Test
       	extends AbstractOpenFileModel<String> {
               
            /**
                * The open file dialog controller.
                */
               @Bean
               (name="openFileModelController")
               OpenFileDialog openFileModelController() {
                       return OpenFileDialog.create();
               }
                
           public static class LabelTitle {
                LabelText labelText;
                /**
                 * Override the method for getting the name of the label.
                 *
                 * @return the label name
                 */
                public String getName() {
                        return labelText.getName();
                }
            }
            /**
             * The label text.
             */
            @Bean(name="labelText")
            public LabelText labelText() {
                return LabelText.LABEL_TEXT;
            }
            
	}
       public static class LabelText {
	       /**
	        * An empty label.
	        */
	        @Bean
	        public static String emptyLabel() {
	                return "";
	        }
		/**
		* The name of the label.
		*/
		@Bean
		public String name() {
		            return "labelName";
		        }
		/**
		* The contents of the label.
		*/
		@Bean
		public ListLabel label(LabelText labelText) {
		            return ListLabel.LABEL(labelText);
		        }
		                            
		}
	public static class ListMenuItem {
			 /**
			 * The list menu items.
			 */
			@Bean
			public ListMenuItem() {
				this.listItem = ListMenuItem.List;
			}
			
			private ListMenuItem(ListMenuItem listMenuItem) {
				
			}
			
			/**
			 * The list items.
			 */
			@Bean
			public List<JTailMainButton.JTailMenuItem>
			listContent() {
				return listItem.getList();
			}
			
			/**
			 * The list item.
			 */
			@Bean
			ListItem listItem() {
				return listItem(ListMenuItem.listItem);
			}
			
			/**
			 * The list item.
			 */
			@Bean
			public ListItem listItem(ListMenuItem listItem) {
				return listMenuItem.listContent();
			}
		                        
		}
       public static class ListLabel {
	       /**
	        * The label.
	        */
	        private ListLabel() {
	       }
	        /**
	        * An empty label.
	        */
		        @Bean
		        public static ListLabel emptyLabel() {
		                return ListLabel.List_LABEL;
		        }
		                
		}
	   public static class ListMenuItem {
	       /**
	        * The list menu items.
	        */
	        @Bean(name="listMenuItem")
	        public ListMenuItem() {
	        }
	        
	        /**
	        * The list menu items.
	        */
	        @Bean(name="menuItem")
	        public ListMenuItem(ListMenuItem listMenuItem) {
	        }
		                        
		}
       public static class JTailMainButton {
	       /**
	        * The jtail button.
	        */
	        @Bean(name="jTailMainButton")
	        public JTailMainButton jTailMainButton() {
	        	return JTailMainButton.JTail_MAIN;
	        }
	        
	        /**
	        * The jTail button.
	        */
	        @Bean
	        public JTailMainFrame jTailMainButton(JTailMainModel model) {
	        	return JTailMainFrame.create(model);
	        }
		                        
		}
       public static class JTailMainModel {
	       /**
	        * The jTail main model.
	        */
	        @Bean()
	        public JTailMainModel() {
	        }
	        
	        @Bean(name="jTailMainModel")
	        public JTailMainModel(ResourceBundle res) {
	        	
	        }
		
		}
       public static class OpenFileModel {
	       /**
	        * The jTail main model.
	        */
	        @Bean()
	        public JTailMainModel() {
	        }
	        
	        @Bean(name="jTailMainModel")
	        public JTailMainModel(ResourceBundle res) {
	        	
	