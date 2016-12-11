package com.ayc.noria.API;

import net.minecraft.util.EnumFacing;

/**Interface for water transferring blocks using velocity eg canal*/
public interface ITransferWater {

	public void addVelocity (int velocity, EnumFacing dir);			//handles the receiving of velocity from previous block
	
	public void transferVelocity ();								//handles the transferring of velocity to next block
	
	public int getVelocity ();										//getter for velocity
	
	public void setVelocity (int velocity);							//setter for velocity
	
	public boolean getCanAcceptWater (EnumFacing dir);				//getter for can accept water
	
	public void setCanAcceptWater (EnumFacing dir);					//setter for can accept water
	
	public boolean getCanTransferWater (EnumFacing dir);			//getter for can transfer, used for network logic
	
	public void setCanTransferWater (EnumFacing dir, boolean bool);	//setter for transfer
	
}