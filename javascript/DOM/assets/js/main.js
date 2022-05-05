/* seleccion de etiquetas o clases desde html */
const $titulo = document.querySelector('h1')
const $parr = document.querySelector('p')



/* nodename */
console.log($parr.nodeName) //devuelve el nombre de la etiqueta
console.log($titulo.nodeName)


/* textcontent */
$titulo.textContent = "Modificando elementos con JavaScript!" //reemplaza el contenido texto pero no añade etiquetas (las pone como contenido)

console.log($parr.textContent)
$parr.textContent += "Hola mundo!" //+= lo añade


/* innerText no usar */


/* innerHTML */
console.log($parr.innerHTML);
// $parr.innerHTML='<a href="#">Este es un enlace</a>' //reemplaza incluyendo etiquetas (no pone etiquetas como contenido)


/* outerHTML */
/* $parr.outerHTML = '<a href="#">Este es un enlace</a>' */


console.log(document)


/* crear elementos */

//Se selecciona el elemento padre
const $card = document.querySelector('.card')
function crearElemento(){
    const img = document.createElement('img'); //crea alemento img
    img.src = "https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/Que_debes_saber_antes_de_adoptar_un_gatito.jpg?itok=guFplHEU"; //se asigna la fuente al alemento creado
    $card.appendChild(img); //apeendchild para agregar elemento (porque no se agrega nada solo al llamar la funcion), se requiere vincular el elemento creado a otro elemento que lo contenga (padre) - se le pone el hijo al padre
}
crearElemento();