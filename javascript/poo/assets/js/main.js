/* clase modelo o plano que permite crear objeto, usando la palabra reservada class */
/* primera letra en mayuscula para identificar que es una clase */
/* dentro del cuerpo de la clase no declarar valiables (let, var...) ni funciones  */
class Persona {
    //atributos, no es necesario declararlos primero en js (se podria comenta el bloque y funciona igual), pero en java si es obligatorio
    #id = 0;
    static #contador = 0; //al ser estatico deja de pertenecer al objeto y pasan a ser de la clase (ajuste en constructor)
    #nombre = 'Ricardo';
    #edad = 0;
    #correo = '';

    /* Encapsulamiento para atributos privados ECMA2020 usar # (no se pueden llamar fuera de la clase) solo accesibles dentro de la misma clase, hay medios para acceder ver setters y getters */
    //#atributoPrivado = true

   /* Se usa un constructor para recibir valores por parametro (al usar new Persona desde afuera) y asignarlos sus respectivos atributos (sobreescribe)
    se usa this para indicarle que se refiere al atributo y el otro indica el parametro*/
    constructor (nombre,edad,correo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#correo = correo;
        this.#id = ++Persona.#contador;  //se hace uso de una variable de control que aumenta cada que se 
    }

    //Setter Getters (fijar y obtener de propiedad privada)
    //se usan y se llaman como si fueran propiedad (sin parentesis afuera)
    //set solo permite un parametro, tambien permite arreglo pero lo tomo como string 
    get getNombre(){return this.#nombre;}
    set setNombre(nombre){this.#nombre = nombre;}

    get getEdad(){return this.#edad;}
    set setEdad(edad){this.#edad = edad;}

    get getCorreo(){return this.#correo;}
    set setNombre(correo){this.#correo = correo;}

    //metodos (es una funcion pero no se usa la palabra function, tampoco usar funcion flecha)
    cambiarNombre(nombre) {this.#nombre = nombre;}


    //metodo privado, ya no es accesible desde fuera de la clase
    #saludar(){
        /* aqui si se declaran variables */
        let mensaje = `Hola mi nombre es ${this.#nombre}`
        return mensaje
    }

    //se ocupa otra funcion para aventar para afuera el resultado de la funcion anterior
    mostrarSaludo(){
        return this.#saludar()
    }


    /* metodos estaticos (disponibles para nuestros objetos pero no forman parte del objeto) */
    static mostrarContador(){
        return Persona.#contador
    }
}

/* para crear objeto y llamar los planos de la clase (YA ES UNA INSTANCIA) */
const persona1 = new Persona('Ricardo', 27,'r@g.c');
const persona2 = new Persona('Merari', 7,'ari@g.c');
const persona3 = new Persona('Itamar', 28, 'it@a.c');

/* uso como si fuera propiedad (setter) sin parentesis cambiar propiedad privada*/
//persona1.setNombre = 'Jose'

/* uso como metodo cambiar nombre*/
//persona1.cambiarNombre('Antonio')

/* imprimir propiedad privada con metodo */
//console.log(persona1.getNombre)


console.log(persona1)
console.log(persona2)
console.log(persona3)

console.log(persona1.mostrarSaludo())
console.log(persona2.mostrarSaludo())

console.log(Persona.mostrarContador())
