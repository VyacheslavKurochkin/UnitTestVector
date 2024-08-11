package ru.kurochkin.unittestvector;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    @Test
    public void constructorWithDimensionAndArray_DimensionLessArrayLength_ReturnsDimension() {
        Vector vector = new Vector(3, new double[]{1, 2, 3, 4, 5});

        assertEquals(3, vector.getDimension());
    }

    @Test
    public void constructorWithDimensionAndArray_DimensionAboveArrayLength_ReturnsDimension() {
        Vector vector = new Vector(8, new double[]{1, 2, 3, 4, 5});

        assertEquals(8, vector.getDimension());
    }

    @Test
    public void constructorWithDimensionAndArray_NotPositiveDimension_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Vector(0, new double[]{1, 2, 3}));
    }

    @Test
    public void add_EqualsDimensions_returnsVector(){
        Vector vector = new Vector(new double[]{1, 2, 3, 4, 5});
        Vector expectedVector = new Vector(new double[]{1, 2, 3, 4, 5});

        vector.add(new Vector(new double[]{0,0,0,0,0}));

        assertEquals(expectedVector, vector);
    }

    @Test
    public void add_DifferentDimensions_returnsVector(){
        Vector vector = new Vector(new double[]{1, 2, 3, 4, 5});
        Vector expectedVector = new Vector(new double[]{1, 2, 3, 4, 5});

        vector.add(new Vector(new double[]{0,0}));

        assertEquals(expectedVector, vector);
    }
}