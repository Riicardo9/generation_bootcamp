const url = "https://dog.ceo/api/breeds/image/random"
const imagen = document.getElementById('imagenPerrito')
const imagen2 = document.getElementById('imagenPerrito2')


/* TRAER CON THEN
hace peticion (regresa como resultado una promesa).  .then para que haga algo cuando la promesa se cumpla la respuesta la convierte a json y una vez que se se tenga el formato json se ejecuta el codigo se puede revisar el tiempo de carga en network*/ 
fetch(url).then(respuesta => respuesta.json()).then(datos => {
    /* console.log(datos);
    console.log(datos.message); */
    imagen.src = datos.message /*datos.message se añade la fuente de la img en html */
})


/* TRAER CON AWAIT 
fetch y jason son procesos asincronos, por lo que se indica que sean esperados */
async function obtenerPerrito(){
    const infoPerritos = await fetch(url)
    /* console.log(infoPerritos)  // hasta este punto no se a convertido a json  */

    const perrito = await infoPerritos.json()
   /*  console.log(perrito) */
    imagen2.src = perrito.message
}
obtenerPerrito()


/*EJERCICIO GATO CON ACTUALIZACION https://docs.thecatapi.com/ */

const url2 = "https://api.thecatapi.com/v1/images/search"
const imagen3 = document.getElementById('imagenGati4')

async function fnAnotherGato(){
    const infGatos = await fetch(url2);
    const gato = await infGatos.json();
    imagen3.src=gato[0].url;
}
fnAnotherGato()




