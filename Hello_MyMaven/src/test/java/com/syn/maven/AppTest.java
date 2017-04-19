package com.syn.maven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.syn.maven.App;

public class AppTest 
{
	@Test
	public void testApp()
    {
        assertEquals(0,new App().calculateSomething());
    }

	
	
}
