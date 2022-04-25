/* selectores */

const $parrafo = document.getElementById('parrafo'); /* si hay varios elementos con el mismo id solo trae el primero que encuentra */
console.log($parrafo);

const $titulo = document.querySelector('.titulo');
console.log($titulo);

const $parrafos=document.querySelectorAll('p');
console.log($parrafos)
console.log($parrafos[1])
console.log($parrafos.length)


const $titulos = document.querySelectorAll('div h1')
console.log($titulos)
