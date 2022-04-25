addEventListener('load', function(){
    this.alert('Se ha terminado de cargar la pagina')
})



/* manejador de eventos separado */
function saludar(){
    alert('hola desde una manejador de eventos separado')
}


/* manejador de eventos semantico  Una sola funcion*/
const $botonSemantico = document.getElementById('evento-semantico')

$botonSemantico.onclick = saludar;/*  se escribe sin parentesis para que no se ejecute enseguida si no que hasta que el evento suceda (click) */

$botonSemantico.onclick = function (){
    alert('Hola desde una manejador semantico')
}

$botonSemantico.onclick = function (evento){
    /* alert('Hola desde una manejador semantico') */
    console.log(evento.target)
}


/* manejador de eventos multiple */

const $botonMultiple = document.getElementById('evento-multiple');

//PRIMER MANEJADOR DE EVENTOS
// una forma conla funcion dentro
/* $botonMultiple.addEventListener('click', function(){
    alert('Hola desde un manejador multiple');
    }); */

//segunda forma con funcion fuera 
$botonMultiple.addEventListener('click', saludarMultiple());

function saludarMultiple(){
    alert('Hola desde una manejador multiple');
}

//SEGUNDO MANEJADOR DE EVENTOS
$botonMultiple.addEventListener('click', function(e){
console.log(e.target);
});
