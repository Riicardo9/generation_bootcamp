

/* const formul = document.querySelector("#formulNac") 
formul.addEventListener('submit', function(e){
    e.preventDefault()
    let fechNac = new Date();

    var fechNac = document.getElementById("fechaNacimiento").value;
    console.log(fechNac)
    
})
let calculo = new FormData(formulNac)
console.log(calculo.get("fechaNacimiento"))
 */


/* NIVEL 1. pedir con prompt el año en que nacio y regresar la edad de la persona */
/* NIVEL 2. pedir con un input y boton*/
/* NIVEL 3. adicional dia mes y año para saber si ya cumplio o no los años */

/* NIVEL 1 */
/* const anioNac = parseInt(prompt('Escribe tu año de nacimiento: '));
const anioAct = 2022;
console.log('Tienes '+(anioAct-anioNac)+ ' años'); */


/* NIVEL 2 */
const anioActt = 2022;

/* 2A - activado mediante onclick en la etiqueta html para invocar revisar etiquete html*/
function obtenerEdad(){
    const anioNacc = parseInt(document.getElementById('anio').value);
    console.log(anioNacc);
    console.log(`Tienes ${anioActt - anioNacc} años`);
}

/* 2B - sin poner nada en etiquetas, ejecuta mediante listener (con ID de etiqueta html)*/
const boton = document.getElementById('calcularr')
console.log(boton);
boton.addEventListener('click', ()=>{
    const anioNacc = parseInt(document.getElementById('anio').value);
    console.log(anioNacc);
    console.log(`Tieness ${anioActt - anioNacc} años`);
})



/* NIVEL 3 */
const fecha = new Date();

/*para no usar constantes y tener la fecha actual*/
const anioActtt=fecha.getFullYear()
console.log(anioActtt)

const mesActtt=fecha.getMonth() + 1 //se suma uno porque 0=enero y 11=diciembre
console.log(mesActtt)

const diaActtt=fecha.getDate()
console.log(diaActtt)

/* const anioActtt = 2022, mesActtt=4, diaActtt=27; */

function mostrarDatos(){
    const anioNaccc = document.getElementById('anioo').value; //se obtiene el valor del input tipo date
    console.log(anioNaccc);
    const nacDividido= anioNaccc.split("-") //se separa por - (convierte a arreglo)
    console.log(nacDividido)
    const anioCumple=parseInt(nacDividido[0]) // se recuperan las posiciones del arreglo y se convierten a entero
    const mesCumple=parseInt(nacDividido[1])
    const diaCumple=parseInt(nacDividido[2])
    console.log(anioCumple,mesCumple,diaCumple) //comprobacion de valores

    if(mesCumple<=mesActtt && diaCumple<=diaActtt){ /* comprueba que el mes y dia del cumpleaños aun no hayan pasado */
        console.log(`Tienesss ${anioActtt - aniodiv } años`);
    } else{
        console.log(`Tienesss ${anioActtt - aniodiv -1 } años`);
    }
}






