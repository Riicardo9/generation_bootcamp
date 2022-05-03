
//Agregar elementos de la forma mas correcta
const $padre = document.querySelector('.padre');
const $parrafo = document.createElement('p');
$parrafo.textContent = "Lorem ipsum";
$parrafo.textContent += "Lorem ipsum";
$parrafo.textContent += "Lorem ipsum";

$padre.appendChild($parrafo);


//Agregar elementos con innerHTML (no tan correcta pero mas común)
const $cuadro = document.querySelector('.cuadro');
$cuadro.innerHTML=''; //para evitar problemas se inicia como vacio

$cuadro.innerHTML = `
                    <a href='#'>Este es un enlace</a>
                    <ol>
                        <li>Elemento 1</li>
                        <li>Elemento 2</li>
                        <li>Elemento 3</li>                   
                    </ol>
                    `



//Explicacion del uso del ultimo metodo para agregar elementos
const estaciones = ['primavera', 'verano', 'otoño'] //suponiendo que recibimos datos de fuera
const $lista = document.createElement('ul') 

estaciones.forEach(estacion => {
    const $li = document.createElement('li')
    $li.textContent = estacion
    $lista.appendChild($li);
})
document.body.appendChild($lista) //Si no tenemos un padre, podemos usar el body


//Se vuelve a modificar el div con clase cuadro
const continentes = ['Africa', 'America', 'Asia']

const $ol = document.createElement('ol')
$cuadro.appendChild($ol)
continentes.forEach(continentes => {$ol.innerHTML += `<li>${continentes}</li>`})