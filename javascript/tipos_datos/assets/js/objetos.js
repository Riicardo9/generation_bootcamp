const nombre = "Ricardo"
const nombre2 = new String ('Ricardoo');
const fecha = new Date();

console.log(nombre)
console.log(nombre2)


const persona = new Object(); /*  forma general de crear objeto */
persona.nombre = "Ricardo"
persona.apellido = "Ortega"
persona.edad = "27"

console.log(persona)



const nuevaPersona = {
    /* atributos o propuedades (llave:valor)*/
    nombreCompleto: {nombre:"Ricardo", apellido:"Ortega"}, //se puede crear un objeto dentro de un objeto
    edad:"27",
    pasatiempos: ['familia', 'musica','desarrollo'], //se pueden crear una matriz dentro de un objeto
    hijos: true,
    /* Metodo (cuando hay funcion dentro de objeto)*/
    saludar: function(){console.log("Hola desde un metodo")},
    sumar: function(n1, n2){ console.log(`El resultado de la suma es: ${n1 + n2}`);} 

}
console.log(nuevaPersona); /* obtener el objeto */
nuevaPersona.saludar(); /* se ejecuta un metodo del objeto */
nuevaPersona.sumar(3,6);

"Hola".length /* atributo o propiedad */
"Hola".toLocaleLowerCase /* metodo */


/* acceder a los valores del objeto */
console.log(nuevaPersona.edad)
console.log(nuevaPersona.nombreCompleto.nombre)
console.log(nuevaPersona.pasatiempos[1])

/* modificar el valor */
nuevaPersona.edad=10;
console.log(nuevaPersona);

/* agregar nuevo atributo */
nuevaPersona.colorFavorito = "blanco";
console.log(nuevaPersona.colorFavorito)

/* un objeto basico ya tiene definido algunos metodos por default que se le pueden aplicar */
console.log(nuevaPersona.hasOwnProperty("Edades"))/* pregunta si existe edad */
console.log(Object.keys(nuevaPersona))/*  obtiene las llaves */
console.log(Object.values(nuevaPersona))



