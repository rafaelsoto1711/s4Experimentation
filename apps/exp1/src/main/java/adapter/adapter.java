package adapter;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Vector;

import org.apache.s4.base.Event;
import org.apache.s4.core.adapter.AdapterApp;
import org.apache.s4.core.RemoteStream;
import org.apache.s4.base.KeyFinder;
import org.omg.CORBA.Environment;


public class adapter extends AdapterApp{

    /* el siguiente vector almacenará todos los RemoteStream que salen del adapter*/
    public Vector<RemoteStream> inputs = new Vector<RemoteStream>();
    public int cantPeFirstLevel;

	
    @Override
    protected void onInit() {
       cantPeFirstLevel = 8;

       /* creamos los RemoteStreams que son los streams que salen del adapter hacia el primer nivel de la topología y 
       los almacenamos en el vector "inputs"  */
        
        for(int i=0 ; i< cantPeFirstLevel ; i++){

            RemoteStream input = createOutputStream("input"+i, new KeyFinder<Event>(){
                @Override
                public List<String> get(Event event){
                    return Arrays.asList(new String[] {event.get("KEY")});
                }
            });

            inputs.add(input);
        }

        /* Finalmente inicialzamos los RemoteStreams */

        for(int i=0 ; i< inputs.size() ; i++){
            inputs.elementAt(i).start();
        }
        
        super.onInit();

       
    }



    @Override
    protected void onStart() {
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                /*  En esta parte se crearán los eventos con el parametro KEY y se enviarán a los PE's del primer nivel 
                    siguiendo un algoritmo Round Robin */
                int counter = 0;
                int turn=0;
                while(true){
            		Event event = new Event();
                    event.put("KEY", Integer.class, turn);
                    inputs.elementAt(turn).put(event);
                    turn = (turn + 1)%(inputs.size());
                    System.out.println("evento "+counter);
                    counter++;
            	}	
            }
        }).start();
        
        
        
    }
	
}//fin clase Adapter
