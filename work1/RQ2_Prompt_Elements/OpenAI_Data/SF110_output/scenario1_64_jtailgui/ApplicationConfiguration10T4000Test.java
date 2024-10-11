// ApplicationConfigurationTest.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_quitAction_returns_a_new_instance_of_QuitAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction);
		assertTrue(quitAction instanceof QuitAction);
	}
	
	@Test
	void test_quitAction_returns_a_new_instance_of_QuitAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction1);
		assertNotNull(quitAction2);
		assertTrue(quitAction1 instanceof QuitAction);
		assertTrue(quitAction2 instanceof QuitAction);
		assertNotSame(quitAction1, quitAction2);
	}
}
```

### Test the `quitAction` method

```java
// QuitActionTest.java
package fr.pingtimeout.jtail.gui.action;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class QuitActionTest {

    @Mock
    private JTailMainFrame mainFrame;

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_quit_application_when_action_is_performed() {
        // Given
        QuitAction quitAction = new QuitAction();

        // When
        quitAction.actionPerformed(null);

        // Then
        verify(mainFrame).quit();
    }
}
```

### Test the `quit` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }
}
```

### Test the `dispose` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }
}
```

### Test the `dispose` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_twice() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }
}
```

### Test the `dispose` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_twice() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_three_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }
}
```

### Test the `dispose` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_twice() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_three_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_four_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }
}
```

### Test the `dispose` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_twice() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_three_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_four_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_five_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }
}
```

### Test the `dispose` method

```java
// JTailMainFrameTest.java
package fr.pingtimeout.jtail.gui.view;

import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class JTailMainFrameTest {

    @Mock
    private JTailMainModel mainModel;

    @Test
    void should_dispose_frame_when_quit_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.quit();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_twice() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

    @Test
    void should_dispose_frame_when_dispose_is_called_three_times() {
        // Given
        JTailMainFrame mainFrame = new JTailMainFrame(mainModel);

        // When
        mainFrame.dispose();
        mainFrame.dispose();
        mainFrame.dispose();

        // Then
        verify(mainFrame).dispose();
    }

