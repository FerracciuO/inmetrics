package br.com.inmetrics.teste.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"br.com.inmetrics.teste.stepdefinitions"})						
public class RunCucumberTest
{		

}