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

PeLv0N0 PeObjectLv0N0 = createPE(PeLv0N0.class);
PeLv0N1 PeObjectLv0N1 = createPE(PeLv0N1.class);
PeLv0N2 PeObjectLv0N2 = createPE(PeLv0N2.class);
PeLv0N3 PeObjectLv0N3 = createPE(PeLv0N3.class);
PeLv0N4 PeObjectLv0N4 = createPE(PeLv0N4.class);
PeLv0N5 PeObjectLv0N5 = createPE(PeLv0N5.class);
PeLv0N6 PeObjectLv0N6 = createPE(PeLv0N6.class);
PeLv0N7 PeObjectLv0N7 = createPE(PeLv0N7.class);
PeLv1N0 PeObjectLv1N0 = createPE(PeLv1N0.class);
PeLv1N1 PeObjectLv1N1 = createPE(PeLv1N1.class);
PeLv1N2 PeObjectLv1N2 = createPE(PeLv1N2.class);
PeLv1N3 PeObjectLv1N3 = createPE(PeLv1N3.class);
PeLv1N4 PeObjectLv1N4 = createPE(PeLv1N4.class);
PeLv1N5 PeObjectLv1N5 = createPE(PeLv1N5.class);
PeLv1N6 PeObjectLv1N6 = createPE(PeLv1N6.class);
PeLv1N7 PeObjectLv1N7 = createPE(PeLv1N7.class);
PeLv1N8 PeObjectLv1N8 = createPE(PeLv1N8.class);
PeLv2N0 PeObjectLv2N0 = createPE(PeLv2N0.class);
PeLv2N1 PeObjectLv2N1 = createPE(PeLv2N1.class);
PeLv2N2 PeObjectLv2N2 = createPE(PeLv2N2.class);
PeLv2N3 PeObjectLv2N3 = createPE(PeLv2N3.class);
PeLv2N4 PeObjectLv2N4 = createPE(PeLv2N4.class);
PeLv2N5 PeObjectLv2N5 = createPE(PeLv2N5.class);
				
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
		
Stream<Event> StreamPE00 = createInputStream("input0", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N0);
Stream<Event> StreamPE01 = createInputStream("input1", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N1);
Stream<Event> StreamPE02 = createInputStream("input2", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N2);
Stream<Event> StreamPE03 = createInputStream("input3", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N3);
Stream<Event> StreamPE04 = createInputStream("input4", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N4);
Stream<Event> StreamPE05 = createInputStream("input5", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N5);
Stream<Event> StreamPE06 = createInputStream("input6", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N6);
Stream<Event> StreamPE07 = createInputStream("input7", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
		}
	},PeObjectLv0N7);
Stream<Event> link0 = createStream("LINK0", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N0);
Stream<Event> link1 = createStream("LINK1", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N1);
Stream<Event> link2 = createStream("LINK2", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N2);
Stream<Event> link3 = createStream("LINK3", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N3);
Stream<Event> link4 = createStream("LINK4", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N4);
Stream<Event> link5 = createStream("LINK5", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N5);
Stream<Event> link6 = createStream("LINK6", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N6);
Stream<Event> link7 = createStream("LINK7", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N7);
Stream<Event> link8 = createStream("LINK8", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv1N8);
Stream<Event> link9 = createStream("LINK9", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N0);
Stream<Event> link10 = createStream("LINK10", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N1);
Stream<Event> link11 = createStream("LINK11", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N2);
Stream<Event> link12 = createStream("LINK12", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N3);
Stream<Event> link13 = createStream("LINK13", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N4);
Stream<Event> link14 = createStream("LINK14", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N5);
Stream<Event> link15 = createStream("LINK15", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N0);
Stream<Event> link16 = createStream("LINK16", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N1);
Stream<Event> link17 = createStream("LINK17", new KeyFinder<Event>(){
		public List<String> get(Event event){
			return Arrays.asList(new String[] {event.get("KEY")});
			}
	},PeObjectLv2N2);
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

PeObjectLv0N0.setSalida(link0);
PeObjectLv0N1.setSalida(link1);
PeObjectLv0N2.setSalida(link2);
PeObjectLv0N3.setSalida(link3);
PeObjectLv0N4.setSalida(link4);
PeObjectLv0N5.setSalida(link5);
PeObjectLv0N6.setSalida(link6);
PeObjectLv0N7.setSalida(link7);
PeObjectLv0N0.setSalida(link8);
PeObjectLv1N0.setSalida(link9);
PeObjectLv1N1.setSalida(link10);
PeObjectLv1N2.setSalida(link11);
PeObjectLv1N3.setSalida(link12);
PeObjectLv1N4.setSalida(link13);
PeObjectLv1N5.setSalida(link14);
PeObjectLv1N6.setSalida(link15);
PeObjectLv1N7.setSalida(link16);
PeObjectLv1N8.setSalida(link17);
		
	}
	
	@Override
	protected void onClose(){}

}

