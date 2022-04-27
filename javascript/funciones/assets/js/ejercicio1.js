/* Programa una función que invierta las palabras de una cadena de texto, pe. miFuncion("Hola Mundo") devolverá "odnuM aloH". */



function txtInvertido(texto){
    return texto.split('').reverse().join('');
}
console.log(txtInvertido('Hola Mundo'));



/* Las funciones antes aplicadas, se explican a continuacion y se agregan un par de validaciones */
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

invertir("Hola mundo")



/* Crea un archivo ejercicios.js        

1- Programa una función que valide si una palabra o frase dada, es un palíndromo (que se lee igual en un sentido que en otro), pe. mifuncion("Salas") devolverá true.
2- Programa una función que repita un texto X veces, pe. miFuncion('Hola Mundo', 3) devolverá Hola Mundo Hola Mundo Hola Mundo.
3- Programa una función que te devuelva el texto recortado según el número de caracteres indicados, pe. miFuncion("Hola Mundo", 4) devolverá "Hola".
4- Programa una función que calcule el factorial de un número (El factorial de un entero positivo n, se define como el producto de todos los números enteros positivos desde 1 hasta n), pe. miFuncion(5) devolverá 120. */


function txtInvertido2(texto =""){
    if (texto.length<=1) return console.warn('No ingresaste texto');
    if (typeof(texto)!=='string') return console.error('El valor ingresado no es una palabra');

     let txtInv = texto.split('').reverse().join('');
     if (texto===txtInv){
         console.log('la palabra' + texto + ' es un palíndromo' )
     } else{
        console.log('la palabra: ' + texto + ' no es un palíndromo' )
     }
}
txtInvertido2('amada la dama')



function repetirTxt(txt,veces){
    for(let i=0; i<veces;i++){
        console.log(txt)
    }
}
repetirTxt('Hola', 3)



function txtSustraer(cadena,numeroLetras){
    return cadena.substring(0, numeroLetras);
}
console.log(txtSustraer('Hola Mundo',3));



function fact(num) {
	var factorial = 1; 
	for (let i=1; i<=num; i++) {
		factorial = factorial * i; 
	}
	return factorial; 
}
console.log(fact(12))

     


