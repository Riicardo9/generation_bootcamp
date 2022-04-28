const $form = document.querySelector('form')
const $card = document.querySelector('.card')

$form.addEventListener('submit', (e)=>{
    e.preventDefault(); //Evita que se recargue la pagina (por el evento submit)

    //captura en automatico los valores del formulario y los asigna a la variable datos
    const datos = Object.fromEntries(new FormData(e.target)) 
    
    // llamada a la funcion que crea elemento html se le pasan los parametros del formulario que requiere para crear elemento
    crearElemento(datos.url, datos.texto); 

    //limpia el formulario
    $form.reset();
})


function crearElemento(url,texto){
    const img = document.createElement('img'); //crea objeto y lo asigna a variable, pero no lo agrega al html
    const txt = document.createElement('figcaption');

    //se asigna la direccion y testo alternativo al los elementos creados  (en este caso ya los toma del parametro)
    img.src = url; 
    img.alt = texto;

    txt.textContent = texto;

    //apeendchild agrega el elemento (porque no se agrega nada solo al llamar la funcion)
    $card.appendChild(img); 
    $card.appendChild(txt);
}
