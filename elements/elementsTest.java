package com.chemistryprogram.elements;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Faraan on 4/15/2017.
 */
public class elementsTest {

    @Test
    public void hydrogenProtonCount() {

        Hydrogen hydrogen = new Hydrogen();

        Assert.assertEquals(1, hydrogen.getProton());
    }
}
