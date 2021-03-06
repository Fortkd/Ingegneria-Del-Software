package com.project.ingsoft.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ingsoft.model.Evento;
import com.project.ingsoft.repository.EventoRepository;

/*
 * Author: Alessio Spina
 * Class: EventoServiceImpl
 * Description: A service supplies coordination or other "services" that are required to operate your application. 
 * 				They are very different in that Services don't typically know how to access data from persistence, 
 * 				and repositories typically only access data/objects for any services you may have.
 * 				
 * 				Un servizio fornisce il coordinamento o altri "servizi" necessari per il funzionamento dell'applicazione. 
 * 				Sono molto diversi in quanto i Servizi in genere non sanno come accedere ai dati dalla persistenza e gli archivi 
 * 				in ​​genere accedono solo a dati / oggetti per qualsiasi servizio che si possa avere.
 * */

@Service("EventoService")
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	EventoRepository EventoRep;
	
	@Override
	public void saveEvento(Evento e) {
		EventoRep.save(e);
		
	}

	@Override
	public List<Evento> getbyDate(Date date) {
		
		return EventoRep.getbyDate(date);
	}

	@Override
	public List<Evento> getbyTipologia(String Tipologia) {
		return EventoRep.getbyTipologia(Tipologia);
	}

	@Override
	public List<Evento> getbyCosto(float costo) {
		return EventoRep.getbyCosto(costo);
	}

}
