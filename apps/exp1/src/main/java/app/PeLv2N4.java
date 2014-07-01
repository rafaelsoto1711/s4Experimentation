package app;

import org.apache.s4.base.Event;
import org.apache.s4.core.App;
import org.apache.s4.core.ProcessingElement;
import org.apache.s4.core.Stream;
import org.apache.s4.core.Streamable;
import java.util.ArrayList;
import java.util.Vector;

public class PeLv2N4 extends ProcessingElement{
	 
   //stream de salida
	private Vector<Stream<Event>> salidas = new Vector<Stream<Event>>();
   public int counter=0;
   public boolean empty = true;
	
   // seteamos el stream de salida
   public void setSalida(Stream stream) {
        this.salidas.add(stream);
        empty = false;
   }

   // que hacemos cuando llega un evento
   public void onEvent(Event event){

         /* si se encuentra vacio es porque esta en el ultimo nivel y no hay salidas, solo muestra datos
            , en cambio si se encuentra con salidas, se debe enviar el evento por alguna de ellas */
         if(empty){
            System.out.println(" desde PeLv2N4 en ultimo nivel");
         }else{
            /* enviamos el evento que llego por la salida */
            Stream<Event> s = salidas.elementAt(counter%salidas.size());
            s.put(event);
            this.counter++;   
         }
   }
   
     
   @Override
   protected void onCreate() {}
   @Override
   protected void onRemove() {}
   
}


