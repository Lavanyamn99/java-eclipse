package com.xworkz.outlook.dto.child;
import com.xworkz.email.dto.parent.EmailDTO;
public class OutLookEmailDTO extends EmailDTO {
	
	private double cloudStorage;
	private boolean backUp;
	public  OutLookEmailDTO()
	{
		
	}
	public OutLookEmailDTO(float storageSize, boolean free, int noOfEmailPerDay, String emailId, double cloudStorage,
			boolean backUp) {
		super(storageSize, free, noOfEmailPerDay, emailId);
		this.cloudStorage = cloudStorage;
		this.backUp = backUp;
	}

	
	
	public double getCloudStorage() {
		return cloudStorage;
	}
	public void setCloudStorage(double cloudStorage) {
		this.cloudStorage = cloudStorage;
	}
	public boolean isBackUp() {
		return backUp;
	}
	public void setBackUp(boolean backUp) {
		this.backUp = backUp;
	}
	
}
