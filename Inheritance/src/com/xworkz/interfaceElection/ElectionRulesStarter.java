package com.xworkz.interfaceElection;

import com.xworkz.ElectionRules.ElectionRules;
import com.xworkz.ElectionRules.CitizenElectionRules;
import com.xworkz.ElectionRules.KarnatakaElection;

public class ElectionRulesStarter {

	public static void main(String[] args) {

		ElectionRules rules = new CitizenElectionRules();

		KarnatakaElection election = new KarnatakaElection(rules);
		election.electionProcedure();

	}

}
