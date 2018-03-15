package com.privalia.restcontrollers.enpoints;

import java.util.ArrayList;
import java.util.List;

public class BugsService {

	
	public List<Bug> list;
	
	public BugsService() {
		this.list = new ArrayList<Bug>();
		list.add(new Bug(123,"ha petao"));
		list.add(new Bug(124,"diosss"));
		list.add(new Bug(125,"no va"));
	}

	public List<Bug> getAllBugs()
	{
		return this.list;
	}
}

