package org.andreasarf;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.andreasarf.shared.ExternalCalculation;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MultiPurposeToolTest {

    private MultiPurposeTool tool;

    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    @Mock
    private ExternalCalculation externalCalculation;

    @Before
    public void setUp() {
        tool = new MultiPurposeTool(externalCalculation);
    }

    @Test
    public void givenInputWhenCalculateWeightThenReturnResult() {
        // arrange
        final int x = 5;
        final int y = 1;
        final double expected = 6;

        when(externalCalculation.getConstX()).thenReturn(1);
        when(externalCalculation.getConstY()).thenReturn(1);

        // act
        double result = tool.calculateWeight(x, y);

        // assert
        verify(externalCalculation, atMostOnce()).getConstX();
        verify(externalCalculation, atMostOnce()).getConstY();
        collector.checkThat(result, is(expected));
    }
}
