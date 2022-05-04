const urlTop = "https://api.jikan.moe/v4/top/anime";
const $animesTop = document.getElementById('topAnime')


fetch(urlTop).then(resp => resp.json()).then(datos =>{
    //console.log(datos.data.slice(0,8));

    const animesTop = datos.data.slice(0,8)

    animesTop.forEach(animeTop => {
       //console.log(animeTop)

        const datosNecesarios = {
            nombre: animeTop.title
        }

        const template = `
                        <a href="#" class="list-group-item list-group-item-action">${datosNecesarios.nombre}</a>
                        `
        $animesTop.innerHTML += template

        //console.log(datosNecesarios)
    })

})