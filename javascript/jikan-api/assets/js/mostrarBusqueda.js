/* se saca la informacion de la direccion web, se separa y pide la posicion 1   */
let busquedaInf = window.location.href.split('=')[1]

/* igual que arriba pero se usa metodo pop */
let busquedaInff = window.location.href.split('=').pop()
console.log(busquedaInff)

const busquedaAnimes = document.getElementById('busquedaAnimes')

/* se pone q porque en la documentacion dice que se usa para buscar por nombre, se  le pasa el valor a busar y se define que ordene*/
const urlParaBuscar = `https://api.jikan.moe/v4/anime?q=${busquedaInff}&order_by=popularity`

fetch(urlParaBuscar).then(resp => resp.json()).then(datos => {
    //console.log(datos.data)

    const resultadoBusqueda = datos.data;

    resultadoBusqueda.forEach(resultado =>{
        //console.log(resultado)
        const datosNecesarios = {
            nombre: resultado.title,
            imagen: resultado.images.jpg.image_url,
        }
    
        const template = `
                        <div class="col mb-4">
                            <div class="card" >
                            <img src="${datosNecesarios.imagen}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${datosNecesarios.nombre}</h5>
                                
                            </div>
                            </div>
                        </div>
                    `
                    busquedaAnimes.innerHTML += template
    })
    //console.log(resultadoBusqueda)      
})