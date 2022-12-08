package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService 
{
	public void getCityNameService() {
		GameDAO GameDAOobj=new GameDAO();
		GameDAOobj.getCityName();
	}
}