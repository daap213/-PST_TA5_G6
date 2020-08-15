package com.example.amst6;

import android.content.Context;
import android.content.Intent;

import java.io.Serializable;

public class BaseDatos implements Serializable {

    public BaseDatos() {
    }

    public void basedatos(Context context){
        DeveloperuBD developeruBD= new DeveloperuBD(context);
        developeruBD.agredarDatos("1", "rjtorres", "rjtorres", "rjtorres@espol.edu.ec", "0999999999","Accion");
        developeruBD.agredarDatos("2", "bcali", "bcali", "bcali@espol.edu.ec", "0888888888","terror");
        developeruBD.agredarDatos("3", "jareva", "jareva", "jareva@espol.edu.ec", "0777777777","romantica");




        developeruBD.agredarPeliculas(1,"1", "Yo antes de ti", "Jojo Moyes", "Penguin Books",
                "La vida de Louisa Clark, que va empalmando un trabajo con otro para ayudar a su familia a subsistir, cambia por completo cuando comienza a trabajar como cuidadora de un joven millonario.",
                "Romantica",R.drawable.yoantesdeti);
        developeruBD.agredarPeliculas(2,"1", "El hombre de tiza", "C.J. Tudor", "PLAZA Y JANES EDITORES",
                "Un niño que descubre un modo sorprendente de dejar mensajes entre su grupo de amigos: dibujos de tiza en la puerta de casa.\n",
                "Terror",R.drawable.elhombredetiza);
        developeruBD.agredarPeliculas(3,"2", "La villa de las telas", "Anne Jacobs", "PLAZA & JANÉS",
                "Una familia industrial a principios del siglo XX: celos, intrigas, secretos oscuros y un gran amor. La villa de las telas es una novela que engancha al lector hasta la última línea",
                "Romantica",R.drawable.lavilladelastelas);
        developeruBD.agredarPeliculas(4,"2", "Bajo la misma estrella", "John GreenJojo Moyes", "Nube de tinta",
                "Dos adolescentes pacientes de cáncer inician un viaje para reafirmar sus vidas y visitar a un escritor solitario en Ámsterdam.",
                "Juvenil",R.drawable.bajolamismaestrella);
        developeruBD.agredarPeliculas(5,"3", "After", "Anna Todd", "Editorial Planeta",
                "Tessa Young se enfrenta a su primer año en la universidad. Acostumbrada a una vida estable y ordenada, su mundo cambia cuando conoce a Hardin, el chico malo por excelencia, con tatuajes y de mala vida.",
                "Juvenil",R.drawable.after);
        developeruBD.agredarPeliculas(6,"3", "Apartamento 16", "Adam L. G. Nevill", "Minotauro",
                "Apryl, una joven norteamericana, viaja a Inglaterra para vender el apartamento que su tía abuela Lillian les ha dejado en herencia a ella y a su madre. La situación es fantástica: un viejo edificio, clásico, en uno de los mejores puntos de la ciudad, con vecinos forrados de pasta.",
                "Terror",R.drawable.apartamento16);
        developeruBD.agredarPeliculas(7,"3", "Los jardines de la luna", "Steven Erikson", "Bantam Books",
                "Tras guerras interminables y amargas luchas internas, el descontento se ha apoderado del Imperio de Malaz. Incluso las tropas imperiales, siempre ansiosas por derramar sangre, necesitan un respiro.",
                "Acción",R.drawable.losjardinesdelaluna);
        developeruBD.agredarPeliculas(8,"1", "El camino de las sombras", "Brent Weeks", "Orbit Books",
                "La muerte es un arte, y Durzo Blint lo ejecuta a la perfección, sea en una callejuela oscura o en las grandes estancias de palacio.",
                "Acción",R.drawable.elcaminodelasombra);


    }

}

