package app;


import java.util.Arrays;
import java.util.List;
import org.apache.s4.base.Event;
import org.apache.s4.base.KeyFinder;
import org.apache.s4.core.App;
import org.apache.s4.core.Stream;

public class app extends App{
	@Override
	protected void onStart(){}
	
	@Override
	protected void onInit(){


		/* 	creación de PE 
			PECLASSNAME #OBJECTNAME# = createPE(PECLASSNAME.class);
		*/

		#CREACIONPES#
				
		/* Creación de streams:
		 1- streams de entrada para los PE del primer nivel que recibirán eventos desde el adapter
		 2- streams entre los niveles de los PE */
		

		/*************************** ENTRADA A LOS PE DEL PRIMER NIVEL****************************/		
		/* 

		Stream<Event> StreamPE[level][posLv] = createInputStream("input[posLv]", new KeyFinder<Event>(){
			@Override
			public List<String> get(Event event){
				return Arrays.asList(new String[] {event.get("KEY")});
			}
		},PE[level][posLv]);
		
		*/
		
		#STREAMSAPP#
		/*************************** CREACION STREAMS HACIA LOS SIGUIENTES NIVELES****************/	
		/*
		
		Stream<Event> link[counter] = createStream("LINK"+counter, new KeyFinder<Event>(){
			@Override
			public List<String> get(Event event){
				return Arrays.asList(new String[] {event.get("KEY")});
			}
		},PE[level][counterLv%cantPELv]);
		
		*/

		/* AHORA QUE ESTABLECEMOS LAS SALIDAS DE LOS PE's CON EL MÉTODO setSalida() EN CADA PE */
		
		/* desde el primer nivel
			PE[level][posLv].setSalida(link[globalCounter]);
		*/

		#SETSALIDAS#	
		
	}
	
	@Override
	protected void onClose(){}

}

