package edu.lmu.cs.mike;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.AdditionDoubler;
import edu.lmu.cs.mike.impl.BitShiftDoubler;
import edu.lmu.cs.mike.impl.MultiplicationDoubler;

@Test
public class TestDoublerTestNG {
    public void additionDoubler() {
        IntegerDoubler doubler = new AdditionDoubler();

        assertEquals(10, doubler.doDouble(5));
        assertEquals(20, doubler.doDouble(10));
    }

    @Test
    public void multiplicationDoubler() {
        IntegerDoubler doubler = new MultiplicationDoubler();

        assertEquals(10, doubler.doDouble(5));
        assertEquals(20, doubler.doDouble(10));
    }

    @Test
    public void bitshiftDoubler() {
        IntegerDoubler doubler = new BitShiftDoubler();

        assertEquals(0, doubler.doDouble(5));
        assertEquals(0, doubler.doDouble(10));
    }
}