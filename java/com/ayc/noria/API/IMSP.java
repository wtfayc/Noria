package com.ayc.noria.API;

/**Interface for handling submodels and model changes in blockstate*/
public interface IMSP {

	public void setState (int state);
	
	public int getState ();
	
	public void setPart (int part);
	
	public int getPart ();
	
	public void setContent (int content);
	
	public int getContent ();
}