package de.thro.inf.prg3.a08.api;

public class OpenMensaAPIService {
	private static OpenMensaAPIService instance;
	private OpenMensaAPI MensaApiInstance;

	private OpenMensaAPIService(){

	}

	public static OpenMensaAPIService getInstance(){
		if (instance == null){
			instance = new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getApi(){
		return this.MensaApiInstance;
	}
}
