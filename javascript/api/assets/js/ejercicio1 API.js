const url="https://jsonplaceholder.typicode.com/albums/1/photos"
const $cards = document.getElementById('cards')

$cards.innerHTML='';

fetch(url).then(resp => resp.json().then(datos => {
    console.log(datos)
    console.log(datos.url)
    datos.forEach(objeto => {
        const template =
        `
        <div class="col mb-5">
        <div class="card">
            <img src="${objeto.url}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${objeto.title}</h5>
                    <p class="card-text">Card description</p>
                </div>
            </div>
        </div>
        `;
        $cards.innerHTML += template
    });
}))

