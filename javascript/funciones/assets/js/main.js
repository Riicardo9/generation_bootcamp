document.write('<h1>Este es un h1</h1>')
console.log('<h1>Este es un h1</h1>')
console.log(`<h1>Este es un h1</h1>`) //Plantilla literal


//Funcion para imprimir pero se queda hasta imprimir
function saludar (nombre="panchito", apellido="sanchez"){
    console.log('Hola mi nombre es: ', nombre, apellido)  //Imprimir en funcion
    console.log(`Hola mi nombre es: ${nombre?"Ricardo":"desconocido"}`) //otra forma de imprimir con backsticks
}

saludar("Ricardo", "Ortega");



// Funcion con return, sirve para seguir trabajando con el resultado (return) p ej, convertir a mayusculas
function saludarr (nombre="panchito", apellido="sanchez"){    
    return `Mi nombre es: ${nombre} ${apellido}`
}

let funcionSaludarr = saludarr("Ricardoo","Ortegaa")
console.log(funcionSaludarr.toLowerCase())   //NO queda el cambiona mayusculas???

console.log(saludarr("Ricardooo","Ortegaaa"))


/* funcion nombrada suma - Se puede llamar a la funcion desde lineas antes de que se declare la funcion (hoisting)*/
function suma(a,b){
    return a + b;
} 
console.log(suma(10,20))

/* funcion anonima / funcion expresada  - la llamada tiene que estar despues de la linea ser definida*/
const resta = function (a,b){
    return a - b
}
console.log(resta(30,10))

/* funcion flecha dentro de la categoria de funcion expresada - Si el contenido cabe en una linea se pueden eliminar corchetes y return p.ej.  */ 
const multiplicacion= (a,b)=>{
    return a*b;
}
console.log(multiplicacion(9,9))




