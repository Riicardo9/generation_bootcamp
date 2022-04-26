/* Programa una función que invierta las palabras de una cadena de texto, pe. miFuncion("Hola Mundo") devolverá "odnuM aloH". */

let cadena = "Hola que tal"
const arreglo = cadena.split(" ")
console.log(arreglo.reverse)



function txtInvertido(texto){
    return texto.split('').reverse().join('');
}
console.log(txtInvertido('Hola Mundo'));


const invertir = (palabra="") => {

    if (palabra.length<=1) return console.warn('No ingresaste texto') //si solo hay una linea se puede omitir llaves, para que no se ejecute en caso de cimplir la condicion, se coloca un return para que termine la ejecucion
    if (typeof(palabra)!=='string') return console.error('El valor ingresado no es una palabra') //Se puede enviar una advertencia de errores al mismo tiempo de proteje la aplicacion para que no entren


    let arreglo = palabra.split("")  //convierte a arreglo, entre comillas el paramamtro que se usara para separar (separa todo)
    console.log(arreglo)

    let reverso=arreglo.reverse() // invierte el orden
    console.log(reverso)

    let unir= reverso.join("") //une la matriz
    console.log(unir)
}

invertir("Hola")

