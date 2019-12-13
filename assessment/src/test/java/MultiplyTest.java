package test.java;

import main.java.Main;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {
    @Test
    public void multipliesByZeroShouldReturnZero(){
        assertEquals(0, Main.multipliesBy321(0));
    }

    @Test
    public void multipliesByNShouldReturnNBy321(){
        int n = 5;
        assertEquals(n*321, Main.multipliesBy321(n));
    }
}
