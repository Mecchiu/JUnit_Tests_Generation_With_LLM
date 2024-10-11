// Test case 1: Test creating a RobotFactory with no errors
@Test
void testCreateRobotFactoryNoErrors() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage(null);
    RobotFactory factory = output.createRobotFactory("TestRobot");
    assertNotNull(factory);
}

// Test case 2: Test creating a RobotFactory with compiler errors
@Test
void testCreateRobotFactoryWithErrors() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.addError("Syntax error on line 5");
    assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 3: Test creating a RobotFactory with a null program
@Test
void testCreateRobotFactoryNullProgram() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage(null);
    assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 4: Test creating a RobotFactory with a null hardware specification
@Test
void testCreateRobotFactoryNullHardwareSpecification() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage(null);
    assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 5: Test creating a RobotFactory with a null debug info
@Test
void testCreateRobotFactoryNullDebugInfo() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setMaxProcessorSpeed(100);
    output.setMessage(null);
    assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 6: Test creating a RobotFactory with a negative max processor speed
@Test
void testCreateRobotFactoryNegativeMaxProcessorSpeed() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(-100);
    output.setMessage(null);
    assertThrows(IllegalStateException.class, () -> output.createRobotFactory("TestRobot"));
}

// Test case 7: Test creating a RobotFactory with a null message
@Test
void testCreateRobotFactoryNullMessage() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage(null);
    RobotFactory factory = output.createRobotFactory("TestRobot");
    assertNotNull(factory);
}

// Test case 8: Test creating a RobotFactory with an empty message
@Test
void testCreateRobotFactoryEmptyMessage() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage("");
    RobotFactory factory = output.createRobotFactory("TestRobot");
    assertNotNull(factory);
}

// Test case 9: Test creating a RobotFactory with a non-empty message
@Test
void testCreateRobotFactoryNonEmptyMessage() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage("Compilation successful");
    RobotFactory factory = output.createRobotFactory("TestRobot");
    assertNotNull(factory);
    assertEquals("Compilation successful", factory.getMessage());
}

// Test case 10: Test creating a RobotFactory with a valid program and hardware specification
@Test
void testCreateRobotFactoryValidProgramAndHardwareSpecification() {
    AtRobotCompilerOutput output = new AtRobotCompilerOutput();
    output.setProgram(new Program());
    output.setHardwareSpecification(new HardwareSpecification());
    output.setDebugInfo(new DebugInfo());
    output.setMaxProcessorSpeed(100);
    output.setMessage(null);
    RobotFactory factory = output.createRobotFactory("TestRobot");
    assertNotNull(factory);
}