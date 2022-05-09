const idInfo = window.location.href.split("=").pop()
console.log(idInfo);

const imgPortada = document.getElementById('imagenPortada')
const informacionAnime = document.getElementById('informacionAnime')

//se busco de la documentacion la forma de buscar mediente id
const urlIdInfo =  `https://api.jikan.moe/v4/anime/${idInfo}`

fetch(urlIdInfo).then(resp => resp.json()).then(datos => {
    //console.log(datos.data)

    const infNecesaria = {
        id: datos.data.mal_id,
        imagen: datos.data.images.jpg.large_image_url,
        sinopsis: datos.data.synopsis,
        nombre: datos.data.title
    }
    /* console.log(infNecesaria) */

    /* insertar imagen */
    const templateImg =  `<img src="${infNecesaria.imagen}" alt="" class="img-fluid">`
    imgPortada.innerHTML = templateImg

    /* insertar informacion */
    const templateInf = `<h1>${infNecesaria.nombre}</h1>
                        <p>${infNecesaria.sinopsis}</p>
                        <div>
                            <button id="agregarFavoritos" type="button" class="btn btn-dark">Agregar a favoritos</button>
                        </div>
                        `
    informacionAnime.innerHTML = templateInf;

    //se crea el codigo de boton dentro del fetch porque se crea dinamicamente, si esta afuera aun no existe
    const agregarFavorito = document.getElementById('agregarFavoritos');
    console.log(agregarFavorito)

    agregarFavorito.addEventListener('click',() => {
        /* console.log('Agregado') */

        /* localstorage */

        const datos = {
            id: infNecesaria.id,
            nombre: infNecesaria.nombre,
            imagen: infNecesaria.imagen,
        }

        /* se busca, si en local storage hay Element, cuando si se obtiene, se convierte a arreglo  y se vuuelve a agregar*/
        if (localStorage.getItem('favoritos')){
            console.log("Existe un elemento")
            const favoritos = JSON.parse(localStorage.getItem('favoritos'))
            favoritos.push(datos)
            console.log(favoritos)

            localStorage.setItem('favoritos', JSON.stringify(favoritos))


        } else /* si no hay lo agrega */{
            console.log('no tienes favoritos')

            const favoritos = []
            favoritos.push(datos)
            localStorage.setItem('favoritos', JSON.stringify(favoritos))
        }




        /* const favoritos = []
        favoritos.push(datos)
        JSON.parse(localStorage.getItem(favoritos)) //obtener lo que esta en local
 */
        /* se requieren dos parametros nombre del item y valor diferencias entre localstore y session*/
        /* localStorage.setItem('favoritos',datos)  *///guarda el objeto
       /*  localStorage.setItem('favoritos', JSON.stringify(favoritos)) */
        

    })

})

