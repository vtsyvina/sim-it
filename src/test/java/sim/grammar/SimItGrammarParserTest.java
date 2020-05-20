package sim.grammar;


import org.junit.Test;
import sim.core.simulation.Simulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static sim.start.Start.fileToString;

public class SimItGrammarParserTest {

    SimItGrammarParser parser = new SimItGrammarParser();

    @Test
    public void testArithmeticCalculations(){
        Simulation simulation = parser.parseToSimulation(fileToString("src/test/resources/arithmetic.txt"), 10_000);
        simulation.run();
//        simulation.getContext().getEnvironment().print();
        assertEquals(5.7, simulation.getContext().getEnvironment().get("money"), 1e-5);
        assertEquals(1, simulation.getContext().getEnvironment().get("mod", 1), 1e-5);
        assertEquals(2, simulation.getContext().getEnvironment().get("mod", 2), 1e-5);
        assertEquals(0, simulation.getContext().getEnvironment().get("mod", 10), 1e-5);
        assertEquals(8, simulation.getContext().getEnvironment().get("m", 10), 1e-5);

        assertTrue("The rand is not in bounds(smaller)", simulation.getContext().getEnvironment().get("r", 1) >= 5.4);
        assertTrue("The rand is not in bounds(higher)", simulation.getContext().getEnvironment().get("r", 1) <= 9);
    }

    @Test
    public void testTime() {
        Simulation simulation = parser.parseToSimulation(fileToString("src/test/resources/time.txt"), 1);
        simulation.run();
        assertEquals(1, simulation.getContext().getEnvironment().get("it", 1), 1e-5);
        assertEquals(10, simulation.getContext().getEnvironment().get("it", 10), 1e-5);
    }

    @Test
    public void ifTest() {
        Simulation simulation = parser.parseToSimulation(fileToString("src/test/resources/if.txt"), 1);
        simulation.run();
//        simulation.getContext().getEnvironment().print();
        assertEquals(1, simulation.getContext().getEnvironment().get("it", 1), 1e-5);
        assertEquals(10, simulation.getContext().getEnvironment().get("it", 10), 1e-5);
        assertEquals(2, simulation.getContext().getEnvironment().get("it", 2), 1e-5);
        assertEquals(0, simulation.getContext().getEnvironment().get("it", 3), 1e-5);
        assertEquals(0, simulation.getContext().getEnvironment().get("it", 4), 1e-5);
        assertEquals(5, simulation.getContext().getEnvironment().get("it", 5), 1e-5);

    }

}
