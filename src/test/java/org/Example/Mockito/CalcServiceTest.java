package org.Example.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalcServiceTest {

    @Mock
    AddService addService;

    @InjectMocks
    CalcService calcService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalcService() {
        System.out.println("## Test Executed");

        //AddService addService = Mockito.mock(AddService.class);//mocking an object
        CalcService calcService = new CalcService(addService);
        when(addService.add(13, 15)).thenReturn(28);
        int result = calcService.calculate(13,15);
        assertEquals(28, result);
    }

    @Test
    public void verifyInteractions(){
        List<String> mockList = Mockito.mock(List.class);

        mockList.add("One");
        mockList.add("Two");
        mockList.add("Three");
        mockList.add("Three");
        mockList.clear();
        verify(mockList).add("One");
        verify(mockList).add("Two");
        //verify(mockList).add("Three");
        verify(mockList, VerificationModeFactory.times(2)).add("Three");
    }

    @Test
    public void testSpy(){
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        spyList.add("Element-1");
        System.out.println(spyList.get(0));
        assertEquals("Element-1", spyList.get(0));
        when(spyList.get(0)).thenReturn("Element-2");
        System.out.println(spyList.get(0));
        assertEquals("Element-2",spyList.get(0));
    }
}
