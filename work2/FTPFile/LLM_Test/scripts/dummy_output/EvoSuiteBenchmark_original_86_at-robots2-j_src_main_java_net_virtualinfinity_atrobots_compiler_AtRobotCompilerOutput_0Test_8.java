// AtRobotCompilerOutput_0Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains one unit test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutput_0Test {
		/**
		 * Test creating a robot factory object.
		 *
		 * @throws Exception if some other error occurs from the test
		 */
		@Test
		public void testCreateRobotFactory_0() throws Exception {
				AtRobotFactoryFactory robotFactoryFactory = new AtRobotFactoryFactory(4159);
				AtRobotRobotFactoryFactory botFactory = botFactoryFactory.getAtRobotRobotFactoryFactory(null, false);

				AtRobotCompilerOutput robotFactory = new AtRobotCompilerOutput(null, new TestLogger(), new HardwareSpecification(0), 160000000, null, null, false);
				AtRobotRobotFactoryFactory createdRobotFactory = botFactory.createRobotFactory(new TestLogger(), robotFactory);

				Program program = new TestLogger().newProgram();
				String message = new TestLogger().newString(527);
				AtRobotProgramCompiler compiler = new AtRobotProgramCompiler(program, null);
				AtRobotRobotFactory compilerRobotFactory = compiler.createRobotFactory(new TestLogger(), robotFactory, null);
				AtRobotRobotFactory compilerRobotFactory = compilerRobotFactory.createRobot();

				assertNotNull(createdRobotFactory.build());
				assertNotNull(createdRobotFactory.getCompiler().getRobotFactory());

				program = createdRobotFactory.build();
				compilerRobotFactory = createdRobotFactory.getCompilerRobotFactory();
				program.getDebugInfo().clear();
				program.getDebugInfo().add("test");

				compilerRobotFactory.addRobot(createdRobotFactory.getRobotFactory(), createdRobotFactory.build(), program.getDebugInfo());
				assertNotNull(compiler.compile(new TestLogger(), robotFactory));
		}

		/**
		 * Create a robot factory based on this compiled output.
		 *
		 * @return a successfully created robot factory object.
		 */
		public RobotFactoryBuilder createRobotFactoryBuilder() {
				return BotFactoryBuilderFactory.getBotFactoryBuilder(4159);
		}

		/**
		 * Test parsing a robot factory derived by this compiled output.
		 *
		 * @throws Exception if any of the test exceptions occur
		 */
		@Test
		public void testParsingRobotFactory() throws Exception {
				AtRobotRobotFactoryFactory botFactory = new AtRobotRobotFactoryFactory(4159);
				AtRobotRobotFactory botRobotFactory = botFactory.createRobotFactory(null, false);
				AtRobotRobotFactoryBuilder robotFactoryBuilder = new AtRobotRobotFactoryBuilder(new BotFactoryBuilderFactory(botRobotFactory), new TestLogger());
				botRobotFactory = botRobotFactoryBuilder.createRobotFactory(null, null);
				RobotFactory botFactory1 = botFactory.build();

				String testLogger = new TestLogger().newString(527);
				AtRobotProgramCompiler botCompiler = new AtRobotProgramCompiler(new TestLogger(), new StringRobotFactory(true));
				AtRobotRobotProgramCompiler compilerRobotFactory = botCompiler.compile(testLogger, new TestLogger(), null);
				BotProgramBuilder botProgramBuilder = new BotProgramBuilder(testLogger, new StringProgramFactory(true), new TestLogger(), null);
				AtRobotRobotProgramCompiler robotProgramBuilder = (AtRobotRobotProgramCompiler) botProgramBuilder.build();
				Program botProgram = botProgramBuilder.build();

				botRobotFactory.addRobot(new TestLogger().newRobotFactory(), botRobotFactory, botProgram);

				try {
					botFactory.getTestLogger().add("test");
					BotFactoryBuilderFactory.getBuilderFactory(new BotFactoryBuilderFactory(botFactory, false)).createBuilder(new BotFactoryBuilder(new BotFactoryBuilderFactory(new BotFactoryBuilder()), new TestLogger()), null);
				} catch (Exception e) {
					throw new Error(e);
				}
		}
}