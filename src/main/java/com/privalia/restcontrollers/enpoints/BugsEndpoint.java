package com.privalia.restcontrollers.enpoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

@Component
public class BugsEndpoint extends AbstractEndpoint<List<Bug>> {
 
    @Autowired
    BugsService bugsService;
 
    
    public BugsEndpoint() {
        super("bugs");
        bugsService = new BugsService();
    }
 
 
    @Override
    public List<Bug> invoke() {
        return bugsService.getAllBugs();
    }
}