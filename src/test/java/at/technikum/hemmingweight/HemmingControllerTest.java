package at.technikum.hemmingweight;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HemmingControllerTest{


    HemmingController controller= new HemmingController();

    @Test
    public void HemmingControllerTest()
    {
        int result= controller.calculateHammingWeight("01234");
        assertEquals(4,result);
    }





}