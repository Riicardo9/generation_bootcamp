class Pokemon {
    //atributos
    #nombre = '';
    #edad = 0;
    #evolucion = '';
    

    constructor(nombre, edad, evolucion){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
        
    }

    /* para que una propiedad privada se pueda usar en otra clase, se usa getter */
    get getNombre(){
        return this.#nombre
    }

    atacar(){
        return console.log(`${this.#nombre} esta atacando`)
    }

    evolucionar(){
        let mensaje = ''

        if (this.#evolucion === ''){
            mensaje = 'no puedo evolucionar'
            console.log(mensaje)
        
        } else{
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`
            this.#nombre = this.#evolucion
            console.log(mensaje)
        }
    }
}


/* la palabra reservada new es usar directamente el constructor */
const pokemon1 = new Pokemon('Charmander', 2, 'Charmeleon')
const pokemon2 = new Pokemon('Bulbasaur',1, 'Ivisaur')

console.log(pokemon1)
console.log(pokemon2)

pokemon1.atacar();
pokemon2.atacar();
pokemon1.evolucionar();


//palabra extends indica que es clase hija, se indica tambien la clase de quien va a heredar 
class TipoFuego extends Pokemon{
    #tipo = '';
    constructor(nombre,edad, evolucion, tipo){

        /* se inicializan las propiedaddes del padre */
        super(nombre, edad, evolucion);
        
        this.#tipo = 'Fuego'
    }

    atacar(){
        return console.log(`${super.getNombre} esta lanzando un ataque de tipo ${this.#tipo}`)
    }

}

const pokemon3 = new TipoFuego('charmanderr',3,'charmanleonn')
console.log(pokemon3)

/* utiliza metodo heredado de la clase padre */
pokemon3.atacar();

