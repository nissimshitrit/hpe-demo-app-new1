package com.hp.devops.demoapp;

import org.junit.runners.Parameterized;
import org.testng.annotations.DataProvider;

public class DProvider {
    @DataProvider(name = "data provider")
    @Parameterized.Parameters(name = "")
    public static Object[][] dpMethod() {
        return new Object[][]{ { 1, 1 },{ 2, 4 },{ 3, 19 },{ 4, 16 },{ 5, 25 } };

    }
}