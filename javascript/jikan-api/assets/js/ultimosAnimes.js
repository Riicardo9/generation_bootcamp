const urlUltimosAnimes = "https://api.jikan.moe/v4/seasons/now"
const $ultimosAnimes = document.getElementById('UltAnimAgr') //se llama al padre

/* console.log(UltAnimAgr) //como ya se declaro el id en html se puede llamar directamente (mala practica NO HACER) */

fetch(urlUltimosAnimes).then(resp => resp.json().then(datos =>{
    const arrUltimosAnimes =  datos.data.slice(0,16) //se usa slice para delimitar solo a 16 elementos
    //console.log(arrUltimosAnimes)

    arrUltimosAnimes.forEach(anime => {
        //console.log(anime)

        //se declara un objeto que sera alimentado por la respuesta del fetch
        const datosNecesarios = {
            nombre: anime.title,
            imagen: anime.images.jpg.image_url,
            id: anime.mal_id,
            sinopsis: anime.synopsis,
        }

        /* se define la estructura a usar y se llena con el objeto, se agrega todo dentro de un enlace para que al darle click pueda mostrar mas info, para saber la iformacion espcifica del anime, se va a la pestaña de id */
        const template = `
                        <div class="col mb-4">
                            <a href="informacion.html?id=${datosNecesarios.id}">
                                <div class="card" >
                                <img src="${datosNecesarios.imagen}" class="card-img-top" alt="...">
                                    <div class="card-body">
                                        <h5 class="card-title">${datosNecesarios.nombre}</h5>
                                    </div>
                                </div>
                            </a>
                        </div>
                        `
        //Se anidan los elementos al padre
        $ultimosAnimes.innerHTML += template
    })
}))