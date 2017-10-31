package com.swoopdata.forgeserve.aquire.cucumber.stepdefs;

import com.swoopdata.forgeserve.aquire.ForgeServeAquireApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ForgeServeAquireApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
