const db = [
    {
        url:'https://placeimg.com/200/200/animals', /* pagina gratuita para imagenes, sirve para preparar */
        title:'Animales',
        descripcion: 'Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!'
    },
    {
        url:'https://placeimg.com/200/200/tech', /* pagina gratuita para imagenes, sirve para preparar */
        title:'Tecnologia',
        descripcion: 'Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!'
    },
    {
        url:'https://placeimg.com/200/200/people', /* pagina gratuita para imagenes, sirve para preparar */
        title:'People',
        descripcion: 'Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!'
    },
    {
        url:'https://placeimg.com/200/200/nature', /* pagina gratuita para imagenes, sirve para preparar */
        title:'Naturaleza',
        descripcion: 'Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!'
    },
    {
        url:'https://placeimg.com/200/200/arch', /* pagina gratuita para imagenes, sirve para preparar */
        title:'Arquitectura',
        descripcion: 'Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!'
    },
    {
        url:'https://placeimg.com/200/200/animals', /* pagina gratuita para imagenes, sirve para preparar */
        title:'Animales',
        descripcion: 'Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!'
    }   
];

console.log(db[0].url); //prueba para obtener la propiedad url del objeto 0


$cards = document.getElementById('cards')
$cards.innerHTML = ''; //para evitar errores del navegador

db.forEach(objeto => {
    //console.log(objeto) // Prueba para imprimir el contenido que se recorre
    /* se imprime por dom el contenido del recorrido (interpolacion) */
    $cards.innerHTML += `
    
    <div class="col mb-4">
    <div class="card">
      <img src="${objeto.url}" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">${objeto.title}</h5>
        <p class="card-text">${objeto.descripcion}</p>
      </div>
    </div>
  </div>
  ` /* se sopia la segunda parte de la tarjeta (solo una ) primera linea se puso en html */
})




/* convertir el objeto JSON  arreglo en String*/
console.log(db)
const dbJSON = JSON.stringify(db);
console.log(dbJSON)


/* convertir string a json con impresion*/

console.log(JSON.parse(dbJSON))