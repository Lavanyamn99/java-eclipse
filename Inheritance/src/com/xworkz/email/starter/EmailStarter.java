package com.xworkz.email.starter;

import com.xworkz.email.dao.EmailDAO;
import com.xworkz.email.dto.parent.EmailDTO;
import com.xworkz.gmail.dto.sub.GmailEmailDTO;
import com.xworkz.outlook.dto.child.OutLookEmailDTO;

public class EmailStarter {

	public static void main(String[] args) {
		EmailDAO emailDAO=new EmailDAO();
		EmailDTO emailDTO=new EmailDTO(800,false,80,"lav@gmail.com");
		emailDAO.save(emailDTO);
		OutLookEmailDTO outLookEmailDTO=new OutLookEmailDTO(600,true,90,"vbn@gmail.com",790,true); 
		emailDAO.save(outLookEmailDTO);
		GmailEmailDTO gmailEmailDTO=new GmailEmailDTO(400,false,50,"vr25@gmail.com","Red",true);
		emailDAO.save(gmailEmailDTO);
		emailDAO.displayDetailsEmailDTO();
		emailDAO.displayDetailsOutLookEmailDTO();
		emailDAO.displayDetailsGmailEmailDTO();
	}

}
